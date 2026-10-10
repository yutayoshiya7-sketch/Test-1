import java.util.Random;

public class WAR {
     public static void main(String[] args){

        //gen a random num for cards
        Random randNum = new Random();

        int computerCard = randNum.nextInt(52) +1;
        int userCard =  randNum.nextInt(52) +1;

        //set the suit of the card S D H C
        char computerCardSuit;
        char userCardSuit;

        if(computerCard <= 13){
            computerCardSuit = 'Club';
        }
        else if (computerCard <=26){
            computerCardSuit = 'Diamond';
        }
        else if (computerCard <=39){
            computerCardSuit = 'Heart';
        }
        else {
            computerCardSuit = 'Spade';
        }
         if(userCard <= 13){
            userCardSuit = 'Club';
        }
        else if (userCard <=26){
            userCardSuit = 'Diamond';
        }
        else if (userCard <=39){
            userCardSuit = 'Heart';
        }
        else {
            userCardSuit = 'Spade';
        }

        //determine the value of the card
        int computerCardValue;
        int userCardValue;

        if(computerCard <= 13){
            computerCardValue = computerCard;
        }
        else if (computerCard <=26){
            computerCardValue = computerCard -13;
        }
        else if (computerCard <=39){
            computerCardValue = computerCard -26;
        }
        else{
            computerCardValue = computerCard -39;
        }
        //usercard
         if(userCard <= 13){
            userCardValue = userCard;
        }
        else if (userCard <=26){
            userCardValue = userCard -13;
        }
        else if (userCard <=39){
            userCardValue = userCard -26;
        }
        else{
            userCardValue = userCard -39;
        }

        //combine the suit of the card with the value,example: H6 or S9
        String computerFinalCard = Character.toString(computerCardSuit) + String.valueOf(computerCardValue);
        String userFinalCard = Character.toString(userCardSuit) + String.valueOf(userCardValue);

        printAsciiEval(computerFinalCard, userFinalCard);

        if(userCardValue > computerCardValue){
            System.out.println("User Wins");
        }else if (computerCardValue > userCardValue){
            System.out.println("Computer Wins");
        }else{
            System.out.println("WAR");
        }
        

     }

     public static void printAsciiEval(String computerCard, String userCard) {

        if(computerCard.length() == 2){
            printAscii_2Char_card(computerCard);
        }else {
            printAscii_3Char_card(computerCard);
        }

        System.out.println("------------");
        System.out.println("--COMPUTER--");
        System.out.println("-----VS-----");
        System.out.println("----USER----");
        System.out.println("------------");

        if(userCard.length() == 2){
            printAscii_2Char_card(userCard);
        }else {
            printAscii_3Char_card(userCard);
        }
    }

    public static void printAscii_2Char_card(String card){
        // Top of the computer card
        System.out.println("___________");
        // Upper part of the card with the character
        System.out.println("|" + card + "       |"); // top-left corner of the card
        System.out.println("|             |");
        System.out.println("|                   |");
        System.out.println("|   " + card + "    |"); // middle of the card
        System.out.println("|                   |");
        System.out.println("|                   |");
        // Bottom part of the card with the character mirrored
        System.out.println("|      " + card + " |"); // bottom-right corner of the card
        // Bottom of the card
        System.out.println("___________");
    }

    public static void printAscii_3Char_card(String card){
        // Top of the computer card
        System.out.println("___________");
        // Upper part of the card with the character
        System.out.println("│" + card + "       │"); // top-left corner of the card
        System.out.println("│          │");
        System.out.println("│          │");
        System.out.println("│    " + card + "   │"); // middle of the card
        System.out.println("│          │");
        System.out.println("│          │");
        // Bottom part of the card with the character mirrored
        System.out.println("|      " + card + "|"); // bottom-right corner of the card
        // Bottom of the card
        System.out.println("___________");
    }
}
