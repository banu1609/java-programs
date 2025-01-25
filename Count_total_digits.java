//To count the total number of digits in a given number using while loop

import java.util.Scanner;
class Count_total_digits{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number: ");
int a=sc.nextInt();
sc.close();  
int count=0;

//If a is greater than 0
while(a>0){
a=a/10; //it reduces the digit for each iteration eg -> 153/10 (count = 1), 15 (count = 2), 1 (count = 3), 0 (condition fails)
count++;
}
System.out.println("Number of digits in an integer is: "+ count);
}
}
/*First, a = 12345, count = 0
After the first division (a = a / 10), a = 1234, count = 1
After the second division (a = a / 10), a = 123, count = 2
After the third division (a = a / 10), a = 12, count = 3
After the fourth division (a = a / 10), a = 1, count = 4
After the fifth division (a = a / 10), a = 0, count = 5
Output: "Number of digits in an integer is: 5" */