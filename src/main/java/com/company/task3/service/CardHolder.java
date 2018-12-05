package com.company.task3.service;

import com.company.task3.model.*;
import com.company.task3.model.utils.CountableClass10;
import com.company.task3.model.utils.CountableClass5;
import com.company.task3.model.utils.ExpirationClass10;
import com.company.task3.model.utils.ExpirationClass30;

import java.util.ArrayList;
import java.util.Arrays;

public class CardHolder {
    private ArrayList<Card> cards;

    public CardHolder() {
        cards = new ArrayList<>(Arrays.asList(new CountableChildCard(new CountableClass5(), 1),
                new CountableChildCard(new CountableClass5(), 2),
                new CountableChildCard(new CountableClass5(), 3),
                new CountableChildCard(new CountableClass5(), 4),
                new CountableStudentCard(new CountableClass5(), 5),
                new CountableStudentCard(new CountableClass5(), 6),
                new CountableStudentCard(new CountableClass10(), 7),
                new CountableStudentCard(new CountableClass10(), 8),
                new CountableDefaultCard(new CountableClass10(), 9),
                new ExpirationChildCard(new ExpirationClass10(), 10),
                new ExpirationStudentCard(new ExpirationClass10(), 11),
                new ExpirationStudentCard(new ExpirationClass30(), 12)
        ));
    }

    public void addCard(Card card) {
        for (Card card1 : cards) {
            if (card.getId() == card1.getId()) {
                System.out.println("Failed card with current id exist");
                return;
            }
        }
        cards.add(card);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public Card getCardById(int id) {
        for (Card card : cards) {
            if (card.getId() == id) {
                return card;
            }
        }
        return null;
    }
}
