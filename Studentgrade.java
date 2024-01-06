//import the scanner
import java.util.Scanner;

public class Studentgrade {
    public static void main(String arg[])
        {
            //scanner declration
            Scanner input = new Scanner(System.in);

            //enter the name
            System.out.println("Enter the Student Name : ");

            //input the name
            String name=input.next();

            //input the  subjects marks
            System.out.println("Enter The Eight Subject Marks : ");

            int m1 = input.nextInt();
            int m2 = input.nextInt();
            int m3 = input.nextInt();
            int m4 = input.nextInt();
            int m5 = input.nextInt();
            int m6 = input.nextInt();
            int m7 = input.nextInt();
            int m8 = input.nextInt();

            //add the all subject marks
            int tot = m1+m2+m3+m4+m5+m6+m7+m8;

            //calculate percentege
            float per = tot/8;

           //Display the student details
            System.out.println("*****  STUDENT DETAILS ARE  *****");
            System.out.println("The Student name is : "+name);
            System.out.println("The Total marks are: "+tot);
            System.out.println("The Percentage is: "+ per);

            //conditions and display the grades
            if(per>=90)
                System.out.println("The Grade is : 'A' ");
            else if(per>=80)
                System.out.println("The Grade is : 'B' ");
            else if(per>=70)
                System.out.println("The Grade is : 'C' ");
            else if(per>=60)
                System.out.println("The Grade is : 'D' ");
            else if(per>=40)
                System.out.println("The Grade is : 'E' ");
            else
                System.out.println("The Grade is : 'F' ");

            System.out.println("*****  THANK YOU  *****");
        }
    }







