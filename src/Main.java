import Lesson_6.CreditCard;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        Card card1 = new Card(17303323, 737);
        Card card2 = new Card(33424323, 27);
        Card card3 = new Card(12344423, 71);

        card3.showInfoOfCard();
    }
}

class Card{
        int userNumber;
        int userSum;

        public Card(int numOfCard, int sumOfCard){
            userNumber = numOfCard;
            userSum = sumOfCard;
        }

        public void showInfoOfCard(){
            System.out.println("Currency sum - " + userSum);
            System.out.println("Number of the card - " + userNumber);
        }
}