import java.util.*;
public class ArrayMinLenWord
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("ENter length of an array: ");
int n=sc.nextInt();
System.out.println("Enter elements: ");
String[] arr=new String[n];

for(int i=0;i<n;i++)
{
arr[i]=sc.next();
}

String minLenWord = arr[0];
int minlen = minLenWord.length();
int minlenwordIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() < minlen)
            {
                minLenWord = arr[i];
                minlen=arr[i].length();
                minlenwordIndex = i;
            }
                  }


System.out.println("minLenWord is: "+minLenWord);
System.out.println("its  index is: "+minlenwordIndex);

}
}
