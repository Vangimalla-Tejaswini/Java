import java.util.*;
class VowelorCons{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String c=sc.nextLine();
if(c.charAt(0)=='a' || c.charAt(0)=='e' || c.charAt(0)=='i' || c.charAt(0)=='o' ||c.charAt(0)=='u')
{
System.out.println("vowel");
}
else
{
System.out.println("Consonant");
}

}
}