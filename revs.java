import java.util.Scanner;
class revs
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String str;
str=s.next();
int i;
char[] x=str.toCharArray();
for(i=x.length-1;i>=0;i--)
{
 System.out.print(x[i]);
}
}
}