import java.util.Scanner;

public class p3_friendly_pair
{
    double calcabunfreq(int num)
    {
        double sum=0;
        int i=1;
        while(i<=num)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
            i++;
        }
        return sum;
    }
    public static void main(String args[])
    {
        friendly_pair F=new friendly_pair();
        Scanner input=new Scanner(System.in);
        System.out.println("enter two numbers:");
        int num1=input.nextInt();
        int num2=input.nextInt();
        double a=F.calcabunfreq(num1);
        double b=F.calcabunfreq(num2);
        double x=a/num1;
        double y=b/num2;
        // System.out.println(a+" "+num1+" "+b+" "+num2);
        // System.out.print(x+" "+y);
        if(x==y)
        {
            System.out.print("\nit is a friendly pair.");
        }
        else
        {
            System.out.printf("\nnot a friendly pair.");
        }
    }
}