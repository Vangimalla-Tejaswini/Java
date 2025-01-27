import java.util.*;

class CommonElementsInArrayPlaceAs1
{
public static void main(String args[])
{
int arr[][]=new int[3][3];
int arr1[][]=new int[3][3];

Scanner sc=new Scanner(System.in);

for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
arr[i][j]=sc.nextInt();
}
System.out.println();
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        

for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
arr1[i][j]=sc.nextInt();
}
System.out.println();
}            

for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
if(arr[i][j]==arr1[i][j])
{
arr[i][j]=1;
}
else{
arr[i][j]=0;
}
}
}

System.out.println("Matrix after comparison:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%5d",arr[i][j]); // Print with a width of 5 for alignment
            }
            System.out.println(); // Move to the next line after each row
        }
}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           