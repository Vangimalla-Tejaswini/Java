import java.util.*;
class EvenOdd{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
String s="";
StringBuilder str=new StringBuilder(s);

for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}

for(int i=0;i<n;i++)
{
if(arr[i]%2==0)
{
str.append("Even");
}
else{
str.append("Odd");
}
}

System.out.println(str);
}
}