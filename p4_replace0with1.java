import java.util.Scanner;
import java.lang.Math;

public class p4_replace0with1
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int places=-1;
        int num=input.nextInt();
        int temp=num;
        System.out.println("before:"+num);
        while(temp!=0)
        {
            places++;
            int ele=temp%10;
            temp=temp/10;
            if(ele==0)
            {
                num=num+(int)Math.pow(10,places);
            }
        }
        System.out.println("after:"+num);
    }
}