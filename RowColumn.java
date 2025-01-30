//The first column contains the String and is left justified using exactly 15 characters.
The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
input:
java 100
cpp 65
python 50
//
import java.util.Scanner;

public class RowColumn {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
            System.out.printf("%-15s%03d%n", s1, x);
            }
            System.out.println("================================");

    }
}
//output:
================================
java           100 
cpp            065 
python         050 
================================
//