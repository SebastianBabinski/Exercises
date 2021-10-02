// RPG dice roller

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class Cwiczenie12 {

    public static void main(String[] args) {
        System.out.println("Enter the the throw according to code 'xDy+z' or 'xDy-z'.");
        System.out.println("Where x is the number of throws, y is type of dice and z is modifier");
        DiceRoller();
    }

    static void DiceRoller() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String rolledDice = scanner.nextLine();

        //splitting the string with D, -, +
        String numberOfThrowsString = rolledDice.split("d|\\-|\\+")[0];
        String typeOfDiceString = rolledDice.split("d|\\-|\\+")[1];
        String modifierString;
        int modifier = 0;
        int numberOfThrows;
        int typeOfDice;
        int resultOfThrows = 0;
        int finalResult;

        //checking if there is any - or + in the string
        for (int i = 0; i < rolledDice.length(); i++) {
            if (rolledDice.charAt(i) == '+' || rolledDice.charAt(i) == '-') {
                modifierString = rolledDice.split("d|\\-|\\+")[2];
                modifier = Integer.parseInt(modifierString);
                if (rolledDice.charAt(i) == '-') {
                    modifier = modifier * -1;
                }
                break;
            }
        }
        // parsing Strings to integer
        numberOfThrows = Integer.parseInt(numberOfThrowsString);
        typeOfDice = Integer.parseInt(typeOfDiceString);

        // rolling the dice given number of times
        for (int i = 0; i < numberOfThrows; i++) {
            resultOfThrows = resultOfThrows + random.nextInt(typeOfDice);
        }

        // calculating final result
        finalResult = resultOfThrows + modifier;
        System.out.println(finalResult);
    }
}

