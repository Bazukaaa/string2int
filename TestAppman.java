import java.util.ArrayList;
import java.util.Scanner;

public class TestAppman {
    public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Your String: ");
        String str = scan.nextLine();
        scan.close();
        
        int[] number = {0,1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> numOutPut = new ArrayList<Integer>();
        
        int result = 0;
        
        String[] strArray = str.split("");
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if(strArray[i].equals(""+number[j])){
                    numOutPut.add(number[j]);
                }
            }
        }

        int power = numOutPut.size()-1;
        for (int i = 0; i < numOutPut.size(); i++) {
            result += numOutPut.get(i)*(Math.pow(10,power));
            power--;
        }
        System.out.println(result);
    }
}