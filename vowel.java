import java.util.Scanner;
class vowels
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String  str=s.next();
String x=str.replaceAll("[AEIOUaeiou]","");
System.out.println(x);
}
}