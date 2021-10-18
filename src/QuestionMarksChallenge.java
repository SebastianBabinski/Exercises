//Have the function QuestionsMarks(str) take the str string parameter, which will contain single digit numbers, letters, and question marks, and check if there are exactly 3 question marks between every pair of two numbers that add up to 10. If so, then your program should return the string true, otherwise it should return the string false. If there aren't any two numbers that add up to 10 in the string, then your program should return false as well.
//
//For example: if str is "arrb6???4xxbl5???eee5" then your program should return true because there are exactly 3 question marks between 6 and 4, and 3 question marks between 5 and 5 at the end of the string.

public class QuestionMarksChallenge {

    public static void main(String[] args) {
        isQuestionMarks("acc?7??sss?3rr1??????5");
    }

    static void isQuestionMarks(String str) {
        char[] chars = str.toCharArray();
        boolean isNumberOne = false;
        boolean isNumberTwo = false;
        boolean valid = false;
        int sum = 0;
        int questionMarks = 0;

        for (int i = 0; i < chars.length; i++) {
            if (Character.getNumericValue(chars[i]) > 0 && Character.getNumericValue(chars[i]) < 9) {
                sum = sum + Character.getNumericValue(chars[i]);

                if (!isNumberOne) {
                    isNumberOne = true;
                } else {
                    isNumberTwo = true;
                }
            }

            if (chars[i] == '?' && (isNumberOne || isNumberTwo)) {
                questionMarks++;
            }

            if (isNumberOne && isNumberTwo) {
                if(sum == 10 && questionMarks == 3) {
                    valid = true;
                } else if (sum == 10 && questionMarks != 3) {
                    valid = false;
                    isNumberOne = false;
                    isNumberTwo = false;
                    questionMarks = 0;
                    sum = 0;
                }
            }
        }

        if(valid) {
            System.out.println("true " + sum + " " + questionMarks);
        } else {
            System.out.println("false "+ sum + " " + questionMarks);
        }
    }
}
