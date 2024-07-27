public class E1StrToInt
{
    public static void main(String[] args)
    {
        String numstr="12a34";
        int num;
        try
        {
            num=Integer.parseInt(numstr);
            System.out.println("\n num str is"+numstr );
            System.out.println("\n num is\n"+num );
        }
        catch(NumberFormatException e)
        {
            System.out.println(numstr+ "is not a valid str");
        }
    }
}