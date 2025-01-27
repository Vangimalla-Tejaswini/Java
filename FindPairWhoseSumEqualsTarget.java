import java.util.*;

public class FindPairWhoseSumEqualsTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result=sc.nextInt();

int maxProduct=Integer.MIN_VALUE;
int[] bestPair=new int[2];

for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(arr[i]+arr[j]==result)
{
if(arr[i]>arr[j])
{
int currentProduct=arr[i]*arr[j];
if(currentProduct>maxProduct)
{
maxProduct=currentProduct;
bestPair[0]=arr[i];
bestPair[1]=arr[j];
}
}
else if(arr[j]>arr[i])
{
int currentProduct=arr[i]*arr[j];
if(currentProduct>maxProduct)
{
maxProduct=currentProduct;
bestPair[0]=arr[j];
bestPair[1]=arr[i];
}
}
}
}
}

if(maxProduct==Integer.MIN_VALUE){
System.out.println("NOthing found");
}
else{
System.out.println("{"+bestPair[0]+" "+bestPair[1]+"}");
}
}
}
