//u are given  queries in the form of a,b, and n . For each query, print the series corresponding to the given a,b, and n  values as a single line of  space-separated integers.
input:
2
0 2 10
5 3 5
//
import java.util.Scanner;

public class Series{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int q = scanner.nextInt();  
        
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            
            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += (int)(Math.pow(2, j) * b);  
                System.out.print(sum + " ");  
            }
            System.out.println();  
        }
        
        scanner.close();
    }
}
//tput:
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
//