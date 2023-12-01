import java.util.Scanner;

public class DiceJack{
    public static void main(String[] args) {
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three numbers : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();


        if (isLessThan1(num1, num2, num3) || isHigherThan6(num1, num2, num3)){
            System.out.println("INVALID INPUTS");
            System.exit(0);
        }

        int sumOfNumbers = num1 + num2 + num3;
        int sumOfDiceRolls = roll1 + roll2 + roll3;

        System.out.println("Your sum: " + sumOfNumbers + " Dice sum: " +sumOfDiceRolls);

        if(userWon(sumOfNumbers, sumOfDiceRolls)){
            System.out.println("Congrats, you won");
        } else{
            System.out.println("Next time :)");
        }
    }
    public static boolean isLessThan1(int num1, int num2, int num3){
        return (num1<1 || num2<1 || num3<1);
    }
    public static boolean isHigherThan6(int num1, int num2, int num3){
        return (num1>6 || num2>6 || num3>6);
    }
    public static boolean userWon(int sumOfNumbers, int sumOfDiceRolls){
        return (sumOfNumbers>sumOfDiceRolls && (sumOfNumbers - sumOfDiceRolls)<3);
    }
    public static int rollDice(){
        int result = (int)(Math.random()*6+1);
        return result;
    }
}