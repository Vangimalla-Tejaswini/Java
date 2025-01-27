//REVERSING A STRING

import java.util.Scanner;
class StringRev
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
StringBuilder s = new StringBuilder(str);
String rev;
rev=s.reverse().toString();
System.out.println(rev);
}
}