import java.util.Scanner;
public class E31MeanMeadianMode
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        int a[]={16,18,27,16,23,21,19};
        int len=a.length;
        int sum=0;
        for(int i=0;i<len;i++)
        {
            sum=sum+a[i];
        }
        int mean=sum/len;
        System.out.println("mean: "+mean);
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<len;i++)
        {
            if(len%2==0)
            {
                int mid=len/2;
                System.out.print("median: "+a[mid-1]);
                break;
            }
            else
            {
                int mid=(len+1)/2;
                System.out.print(mid);
                System.out.println("median: "+a[mid-1]);
                break;
            }
        }
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println("mode: "+a[i]);
                    break;
                }
            }
        }
    }
}