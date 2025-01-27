import java.util.*;
class Stabilize
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String str=Integer.toString(n);
StringBuilder result=new StringBuilder(str);

for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '0') {
                result.setCharAt(i, '5');
            }
        }

        System.out.println(result.toString());
    }
}