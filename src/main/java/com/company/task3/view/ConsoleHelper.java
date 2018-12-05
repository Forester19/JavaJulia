package com.company.task3.view;

import com.company.task3.model.Card;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleHelper {
    private Scanner scanner = new Scanner(System.in);
    public int welcome(){
        System.out.println("Welcome. Your choice:  1 - create new card; 2- show all cards; 3 - check my card.");
        return scanner.nextInt();
    }
    public int secondPart(int resFromWelcome){
        if(resFromWelcome == 1){
             return choiceCard();
        }else if(resFromWelcome == 2){
            return 0;
        }else if(resFromWelcome == 3){
            return 3;
        }
        return -1;
    }

    public int checkMyCard() {
        System.out.println("Please, enter your card id:");
        return scanner.nextInt();
    }
    private int choiceCard() {
        System.out.println("Please, enter: 11 - countable child card; 12 - countable student card; 13 - countable default card;" +
                " 14 - expiration default card; 15 - expiration student card; 16 - expiration child card;");
        return scanner.nextInt();
    }
    public int specifyCountableCard(){
        System.out.println("21 - on 5 trips; 22 - on 10 trips");
        return scanner.nextInt();
    }

    public int specifyExpirationCard(){
        System.out.println("31 - on 10 days; 32 - on 30 days");
        return scanner.nextInt();
    }

    public void showAllCards(ArrayList<Card> list){
        for (int i=0; i< list.size(); i++){
            System.out.println(list.get(i).toString());
        }
    }

}
