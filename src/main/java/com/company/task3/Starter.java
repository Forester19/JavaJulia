package com.company.task3;

import com.company.task3.model.*;
import com.company.task3.model.intefraces.countable.Countable;
import com.company.task3.model.intefraces.countable.IsCountable;
import com.company.task3.model.intefraces.expiration.Expiration;
import com.company.task3.model.intefraces.expiration.IsExpiration;
import com.company.task3.model.utils.CountableClass5;
import com.company.task3.model.utils.CountableClass10;
import com.company.task3.model.utils.ExpirationClass10;
import com.company.task3.model.utils.ExpirationClass30;
import com.company.task3.service.CardHolder;
import com.company.task3.view.ConsoleHelper;

import java.util.Optional;
import java.util.Random;

public class Starter {
    static CardHolder cardHolder = new CardHolder();

    public static void main(String[] args) {

        ConsoleHelper consoleHelper = new ConsoleHelper();
        Card card = cardHandler(consoleHelper, consoleHelper.secondPart(consoleHelper.welcome()));
        if (card != null) {
            System.out.println("Created card " + card.getId());
            cardHolder.addCard(card);
        }


    }

    private static Card cardHandler(ConsoleHelper consoleHelper, int typeCard) {
        if (typeCard == 0) {
            consoleHelper.showAllCards(cardHolder.getCards());
            return null;
        }
        if (typeCard == 3) {
            int cardId = consoleHelper.checkMyCard();
            Card card = cardHolder.getCardById(cardId);

            if (checkValidationCard(card)) {
                System.out.println("successful defined card!");
            }

        }
        Random random = new Random();
        switch (typeCard) {
            case 11: {
                return createCouuntableChildCard(consoleHelper, random);
            }
            case 12: {
                return createCouuntableStudentCard(consoleHelper, random);
            }
            case 13: {
                return createCouuntableDefaultCard(consoleHelper, random);
            }
            case 14: {
                return createExpirationDefaultCard(consoleHelper, random);
            }
            case 15: {
                return createExpirationStudentCard(consoleHelper, random);
            }
            case 16: {
                return createExpirationChildCard(consoleHelper, random);
            }
            default: {

            }
        }
        return null;
    }

    private static boolean checkValidationCard(Card card) {
        Countable countable = Countable.getCountable(card);
        Expiration expiration = Expiration.getExpiration(card);
        if (countable != null) {
            if (countable.getCount() > 0) {
                System.out.println("Your card " + countable.toString());
                countable.decrement();
                System.out.println("count decremented " + countable.getCount());
                return true;
            } else {
                System.out.println("Your card is not valid.");
                return false;
            }
        } else if (expiration != null) {
            if (expiration.getExpiration() > expiration.gatDateOfCreation().getTime()) {
                System.out.println("Your card " + expiration.toString());
                return true;
            } else {
                System.out.println("Your card is not valid.");
                return false;
            }
        }
        System.out.println("Type card is not defined.");
        return false;
    }






    private static Card createCouuntableChildCard(ConsoleHelper consoleHelper, Random random) {
        int specCard = consoleHelper.specifyCountableCard();
        if (specCard == 21) {
            return new CountableChildCard(new CountableClass5(), random.nextInt(100));
        } else if (specCard == 22) {
            return new CountableChildCard(new CountableClass10(), random.nextInt(100));
        }
        return null;
    }

    private static Card createCouuntableStudentCard(ConsoleHelper consoleHelper, Random random) {
        int specCard = consoleHelper.specifyCountableCard();
        if (specCard == 21) {
            return new CountableStudentCard(new CountableClass5(), random.nextInt(100));
        } else if (specCard == 22) {
            return new CountableStudentCard(new CountableClass10(), random.nextInt(100));
        }
        return null;
    }

    private static Card createCouuntableDefaultCard(ConsoleHelper consoleHelper, Random random) {
        int specCard = consoleHelper.specifyCountableCard();
        if (specCard == 21) {
            return new CountableDefaultCard(new CountableClass5(), random.nextInt(100));
        } else if (specCard == 22) {
            return new CountableDefaultCard(new CountableClass10(), random.nextInt(100));
        }
        return null;
    }

    private static Card createExpirationDefaultCard(ConsoleHelper consoleHelper, Random random) {
        int specCard = consoleHelper.specifyExpirationCard();
        if (specCard == 31) {
            return new ExpirationDefaultCard(new ExpirationClass10(), random.nextInt(100));
        } else if (specCard == 32) {
            return new ExpirationDefaultCard(new ExpirationClass30(), random.nextInt(100));
        }
        return null;
    }

    private static Card createExpirationStudentCard(ConsoleHelper consoleHelper, Random random) {
        int specCard = consoleHelper.specifyExpirationCard();
        if (specCard == 31) {
            return new ExpirationStudentCard(new ExpirationClass10(), random.nextInt(100));
        } else if (specCard == 32) {
            return new ExpirationStudentCard(new ExpirationClass30(), random.nextInt(100));
        }
        return null;
    }

    private static Card createExpirationChildCard(ConsoleHelper consoleHelper, Random random) {
        int specCard = consoleHelper.specifyExpirationCard();
        if (specCard == 31) {
            return new ExpirationChildCard(new ExpirationClass10(), random.nextInt(100));
        } else if (specCard == 32) {
            return new ExpirationChildCard(new ExpirationClass30(), random.nextInt(100));
        }
        return null;
    }
}
