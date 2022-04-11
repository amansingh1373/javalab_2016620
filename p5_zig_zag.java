import java.util.Scanner;

public class p5_zig_zag
{
    public static void main(String args[])
    {
        int[] a=new int[]{4,3,7,8,6,2,1,2,8,9};
        // Scanner input=new Scanner(System.in);
        // for(int i=0;i<10;i++)
        // {
        //     System.out.print("enter element["+i+"]");
        //     a[i]=input.nextInt();
        // }
        for(int i=0;i<10-1;i++)
        {
            if(i%2==0)
            {   
                System.out.println(i+" ");
                if(a[i]<a[i+1])
                {
                    int temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
            else    
            {   
                System.out.println(i+" ");
                if(a[i]>a[i+1])
                {
                    int temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
            // for(int k=0;k<10;k++)
            // {
            //     System.out.print(a[k]+" ");
            // }
            // System.out.println(" ");
        }
        for(int i=0;i<10;i++)
        {
            System.out.println("enter element["+(i)+"]:"+a[i]);
        }
    }
}