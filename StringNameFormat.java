// GIVEN THE FIRST NAME AND LAST NAME ,PRINT THE LAST NAME FIRST THEN FOLLOWED BY "," AND FIRST CHARACTER OF THE FIRST NAME

import java.util.Scanner;
class StringNameFormat
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str1=sc.nextLine();
String str2=sc.nextLine();
StringBuilder s1=new StringBuilder(str1);
System.out.println(str2+","+s1.charAt(0));
}
}