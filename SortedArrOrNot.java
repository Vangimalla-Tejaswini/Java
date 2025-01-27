import java.util.*;
class SortedArrOrNot{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];

if(n==0 || n==1){
System.out.println("sorted");
}

for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}

for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(arr[i]<arr[j])
{
if(i==n-1){
System.out.println("Sorted");
}
}
else{
System.out.println("not sorted");
}


}

}
}
}