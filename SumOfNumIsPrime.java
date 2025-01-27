import java.util.*;
class SumOfNumIsPrime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
Integer[] arr=new Integer[n.length()];
int sum=0;

for(int i=0;i<n.length();i++)
{
 sum+=arr[i];
}

for(int i=0;i<Math.sqrt(sum);i++)
{
if(sum%i ==0)
{
System.out.println("Prime");
}
else{
System.out.println("no");
}
}
}
}
}