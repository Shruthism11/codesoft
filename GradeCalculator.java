import java.util.Scanner;
public class GradeCalculator {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int sum=0;
            float avgPercentage;
            System.out.println("Enter number of subjects :");
            int num = in.nextInt();
            int[] arr = new int[num];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter the marks obtained in each Subject" + (i+1) +" out of 100");
                arr[i] = in.nextInt();
                sum += arr[i];
            }
            System.out.println("The Total Marks is "+sum);
            avgPercentage=sum/num;
            System.out.println("The Average percentage is "+avgPercentage);
            if(avgPercentage>90 && avgPercentage <=100){
                System.out.println("your grade is S");
            }
            else if(avgPercentage>80 && avgPercentage <=90){
                System.out.println("your grade is A");
            }
            else if(avgPercentage>70 && avgPercentage<=80){
                System.out.println("your grade is B");
            }
            else if(avgPercentage>60 && avgPercentage<=70){
                System.out.println("your grade is C");
            }
            else if(avgPercentage>50 && avgPercentage<=60){
                System.out.println("your grade is D");
            }
            else if(avgPercentage>40 && avgPercentage<=50){
                System.out.println("your grade is E");
            }
            else {
                System.out.println(" Sorry your marks is too low for grading ");
            }

        }
    }

