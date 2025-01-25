/* Write a program to check the given number divisible by both 3 and 4 ,if it is divisible print "Good Morning"
If a number is divisible only by 4 but not by 3 then print "Good Afternoon". 
If it is divisible only by 3 but not by 4 print "Good evening".
Otherwise, print "Good Night" */

import java.util.Scanner;
class Greetings{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number: ");
int n=sc.nextInt();
sc.close();
if(n%3==0 && n%4==0){
System.out.println("Good Morning");
}
else if(n%4==0){
System.out.println("Good Afternoon");
}
else if(n%3==0){
System.out.println("Good Evening");
}
else{
System.out.println("Good Night");
}
}
}