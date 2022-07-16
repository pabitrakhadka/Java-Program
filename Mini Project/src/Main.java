import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int myNumber,userNumber=0;
        myNumber=(int)(Math.random()*100);
        do{
            System.out.println("Guss(Enter)My Number:(1 to 100");
            userNumber=sc.nextInt();
            if (myNumber == userNumber) {
                System.out.println("wow !!! Correct Number");
                break;
            }

            else if(userNumber>myNumber)
            {
                System.out.println("Your Number is Too Large:");
            }
            else
            {
                System.out.println("Your Number is small");
            }
        }
        while(userNumber>=0);
        System.out.println("My Number was " );
        System.out.println(myNumber);
    }
}
