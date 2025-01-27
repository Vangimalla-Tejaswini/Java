// Find the second Largest and second Smallest element in an array

import java.util.*;
class Array3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];

for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}

Arrays.sort(arr);


System.out.println(arr[1]);
System.out.println(arr[n-2]);
}
}