/* Age Group Classification
Write a java program that takes an age as input and prints the corresponding age group:
0-12: Child
13-19: Teenager
20-64: Adult
65 and above: Senior */

import java.util.Scanner;
public class AgeGroupClassification{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the age of the person: ");
int age=sc.nextInt();
sc.close();  
if(age>=0 && age<=12){
System.out.println("Child");
}
else if(age>=13 && age<=19){
System.out.println("Teenager");
}
else if(age>=20 && age<=64){
System.out.println("Adult");
}
else{
System.out.println("Senior");
}
} 
}