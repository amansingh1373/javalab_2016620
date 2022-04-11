public class p1_takeinputCMDarg
{
    public static void main(String args[])
    {
        String name=args[0];
        String course=args[1];
        String u_rollno=args[2];
        int sem=Integer.parseInt(args[3]);
        System.out.println(name+" "+course+" "+u_rollno+" "+sem);
    }
}