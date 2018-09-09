import java.util.Scanner;
class count
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String s;
s = sc.nextLine();
int c=1,i;
for(i=0;i<s.length()-1;i++)
{
if((s.charAt(i)==' ')&&(s.charAt(i+1)!= ' '))
{
c++;
}
}
System.out.println(c);
} 
}