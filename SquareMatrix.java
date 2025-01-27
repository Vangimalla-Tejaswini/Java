import java.util.*;

class SquareMatrix
{
public static void main(String args[])
{
int arr1[][]=new int[2][];
arr1[0]=new int[2];
arr1[1]=new int[3];

Scanner sc=new Scanner(System.in);

for(int i=0;i<arr1.length;i++)
{
for(int j=0;j<arr1[i].length;j++)
{
arr1[i][j]=sc.nextInt();
}
System.out.println();
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        

for(int i=0;i<arr1.length;i++)
{
for(int j=0;j<arr1[i].length;j++)
{
arr1[i][j]=(int) Math.pow(arr1[i][j],2);
System.out.printf("%3d", arr1[i][j]); // Format output with a fixed width

}
System.out.println();
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        

}
}
                                                  