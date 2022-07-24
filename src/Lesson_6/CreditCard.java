package Lesson_6;

import java.util.Scanner;

public class CreditCard {
    public int number;
    public int currencySum;

    Scanner sc = new Scanner(System.in);

    public void withdrawMoney(){
        System.out.println("What's sum do you want to withdraw?");
        int sumWhatYouWantToWithdraw = sc.nextInt();
        int sumAfterTheWithdraw = currencySum - sumWhatYouWantToWithdraw;
        System.out.println("What's sum do you want to withdraw? - " + sumAfterTheWithdraw);
    }

    public void addToCreditCard(){
        System.out.println("What's sum do you want to add?");
        int SumWhatYouWantToAdd = sc.nextInt();
        int addToCard = currencySum + SumWhatYouWantToAdd;
        System.out.println("What's sum do you want to add?" + addToCard);
    }

    public void showInfo(){
        System.out.println("Currency sum - " + currencySum);
        System.out.println("Number of the card - " + number);
    }
}
