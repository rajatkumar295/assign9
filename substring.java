class substring
{
public static void main(String[] args)
{
String s="rajat";
int i,j;
String sub;
for(i=0;i<s.length();i++)
{
 for(j=1;j<=s.length()-i;j++)
{
  sub=s.substring(i,i+j);
System.out.println(sub);
}
}
}
}