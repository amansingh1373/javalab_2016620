import java.util.Scanner;

public class p6_negativepositiveseparation
{
    public static void main(String args[])
    {
        int[] a=new int[]{-1,-2,-3,4,-5,-6,-7,8,-9,-10};
        int negative=-1,positive=-1,flag=0;
        // Scanner input=new Scanner(System.in);
        // for(int i=0;i<10;i++)
        // {
        //     System.out.print("enter element["+i+"]");
        //     a[i]=input.nextInt();
        // }
        for(int i=0;i<10;i++)
        {
            
            if(flag==0&&a[i]>0)
            {
                positive=i;
                flag=1;
            }
            if(a[i]<0&&flag==1)
            {
                negative=i;
                int temp=a[negative];
                a[negative]=a[positive];
                a[positive]=temp;
                positive++;
            }
            for(int k=0;k<10;k++)
            {
                System.out.print(a[k]+" ");
            }
            System.out.println(" ");
        }
        for(int i=0;i<10;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}