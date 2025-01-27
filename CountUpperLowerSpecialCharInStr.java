// Write A JAVA PROGRAM TO FIND THE COUNT OF UPPERCASE LETTERS,LOWERCASE LETTERS,DIGITS AND SPEACIAL CHARACTERS IN A GIVEN STRING

import java.util.*;
class CountUpperLowerSpecialCharInStr
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();

int upperCount=0;
int lowerCount=0;
int digitCount=0;
int SpecialCharCount=0;

for(int i=0;i<str.length();i++)
{
char ch = str.charAt(i);

if(Character.isUpperCase(ch))
{
upperCount+=1;
}

else if(Character.isLowerCase(ch))
{
lowerCount+=1;
}

else if(Character.isDigit(ch))
{
digitCount+=1;
}

else
{
SpecialCharCount+=1;
}

}
System.out.println(upperCount);
System.out.println(lowerCount);
System.out.println(digitCount);
System.out.println(SpecialCharCount);
}
}