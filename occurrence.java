import java.util.Scanner;
class occurrence {
static int isSubstring(String s1, String s2)
{
int x= s1.length();
int y= s2.length();
int i,j;
for(i=0;i<=x-y;i++)
{
for(j=0;j<x;j++)
if (s2.charAt(i + j) != s1.charAt(j))
break;
if(j==x)
return i;
}
return -1;
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String s1 = sc.nextLine();
String s2 = sc.nextLine();
int res = isSubstring(s1, s2);
if (res == -1)
System.out.println("Not present");
else
System.out.println("Present at index "+ res);
}
}