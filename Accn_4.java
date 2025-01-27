import java.util.*;
class Accn_4{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] jars=new int[n];

for(int i=0;i<n;i++)
{
jars[i]=sc.nextInt();
}

int AChoco=0;

for(int jar:jars){
int fullCyclesForA=jar/3;
int remainingChocolates=jar%3;

AChoco+=fullCyclesForA;

if(remainingChocolates>=1)
{
AChoco+=1;
}
}
System.out.println("total chocolates at A:"+AChoco);
}
}

