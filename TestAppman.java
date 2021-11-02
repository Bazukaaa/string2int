import java.util.ArrayList;
import java.util.Scanner;

public class TestAppman {
    public static void main(String[] args) {
        // receive input and access value to str.
        Scanner scan = new Scanner(System.in);
        System.out.println("Your String: ");
        String str = scan.nextLine();
        scan.close();

        // declare array number have value 0-9.
        int[] number = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        // declare ArrayList numOutPut for access number that equal.
        ArrayList<Integer> numOutPut = new ArrayList<Integer>();

        // this is variable result.
        int result = 0;

        // change string to array String.
        String[] strArray = str.split("");

        // Check number in input and add number that equal in numOutPut.
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if (strArray[i].equals("" + number[j])) {
                    numOutPut.add(number[j]);
                }
            }
        }

        // Convert numOutPut to one result that is a number.
        int power = numOutPut.size() - 1;
        for (int i = 0; i < numOutPut.size(); i++) {
            result += numOutPut.get(i) * (Math.pow(10, power));
            power--;
        }

        // output and show type of ....
        System.out.println(result + " Type of " + ((Object) result).getClass().getSimpleName());

    }
}