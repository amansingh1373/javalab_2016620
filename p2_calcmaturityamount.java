import java.util.Scanner;
import java.lang.Math;

public class p2_calcmaturityamount
{
    public static void main(String args[])
    {
        int choice,num;
        Scanner input=new Scanner(System.in);
        do
        {
            System.out.println("choose from the following option");
            System.out.println("1.term deposit");
            System.out.println("2.recurring deposit");
            num=input.nextInt();
            switch(num)
            {
                case 1: double p,r,t,res;
                        System.out.println("enter the value of principle,rate of interest and time period");
                        p=input.nextDouble();
                        r=input.nextDouble();
                        t=input.nextDouble();
                        res=(p*(Math.pow((1+(r/100)),t)));
                        System.out.println(res);
                        break;
                case 2: double mi,rate,n,ans;
                        System.out.println("enter the value of monthly installment,rate of interest and time period");
                        mi=input.nextDouble();
                        rate=input.nextDouble();
                        n=input.nextDouble();
                        ans=(mi*n)+(mi*n)*((n+1)/2)*(rate/100)*(1/2);
                        System.out.println(ans);
                        break;
                default:System.out.println("enter a correct data.");
            }
            System.out.println("press 1 to continue and 0 to exit.");
            choice=input.nextInt();
        }while(choice!=0);
    }
}