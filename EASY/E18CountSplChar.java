import java.util.Scanner;
public class E18CountSplChar
{
    public static void main (String args[])
    {
        String s1,s2;
        int i,c=0;
        char ch;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the string:");
        s1=input.nextLine();
        s2="";
        int len=s1.length();
        for (i=0; i<len ;i++)
        {
            ch=s1.charAt(i);
            if (!Character.isLetterOrDigit(ch))
            {
                s2=s2+ch;
                c++;
            }
        }
        System.out.println("special characters are:"+s2);
        System.out.println("count of special characters is:"+c);
    }
}