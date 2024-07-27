public class E1Reverse
{
    public static void main(String args[])
    {
        String org="india";
        String rev="";
        int i;
        for(i=(org.length())-1;i>=0;i--)
        {
            rev=rev+org.charAt(i);
        }
        System.out.println("\norg is"+org);
        System.out.println("\nrev is"+rev);
    }
}