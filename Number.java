import java.util.*;

public class Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        int randomNum=rd.nextInt(100)+1;
        int i=5;
        boolean number=false;
        System.out.println("Hey!! This is Number Game"+"\n"+"Guess a number between 1 to 100."+ "\n"+"Note: You have only 5 trails to guess the number");
        while(i>0){
            System.out.println("Enter the Number:");
            int num=in.nextInt();
            if(num==randomNum){
                System.out.println("You've guessed the correct number:"+randomNum);
                break;
            } else if (num>randomNum) {
                System.out.println("The number you guessed is too high");
                System.out.println("Number of trail left"+ (i-1));
                i--;
            }else {
                System.out.println("The number you guessed is too low");
                System.out.println("Number of trail left" +(i-1));
                i--;
            }
        }
        if(number==false){
            System.out.println("you're run out of trails");
        }
        System.out.println(randomNum+" is the correct answer");


    }
}
