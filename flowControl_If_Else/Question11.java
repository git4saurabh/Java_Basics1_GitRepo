package flowControl_If_Else;

import java.util.Scanner;

// Write a program to input week number and print week day
public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weekNum;
        System.out.println("Enter the week number ");
        weekNum=sc.nextInt();

        if(weekNum==1){
            System.out.println("Monday");
        }else if (weekNum==2){
            System.out.println("Tuesday");
        } else if (weekNum == 3) {
            System.out.println("Wednesday");
        }else if(weekNum==4){
            System.out.println("Thursday");
        }else if (weekNum==5){
            System.out.println("Friday");
        }else if (weekNum==6){
            System.out.println("Saturday");
        }else if(weekNum==7){
            System.out.println("Sunday");
        }else{
            System.out.println("No Week Day");
        }
    }
}
