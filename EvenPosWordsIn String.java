//WRITE A JAVA PROGRAM TO CREATE AN ARRAY USING WORDS AT EVEN POSITIONS IN A STRING

import java.util.Scanner;
class EvenPosWordsIn String
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String[] arr=str.split(" ").toString();
List<String> output = new ArrayList<>();

for(int i=1;i<=arr.length;i++)
{
if(i%2==0)
{
output.append(arr[i]);
}
}

System.out.println(output);
}
}

