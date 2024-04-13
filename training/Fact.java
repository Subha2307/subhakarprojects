public class  Fact{
public static void main(String args[])
{
int n=5;
long fact=1;
for(int i=1;i<=n;i++)
{
fact*=i;
}
System.out.print("Factorial of %d=%d",n,fact);
}}