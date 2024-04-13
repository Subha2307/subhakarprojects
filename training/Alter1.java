import java.util.*;
class Alter1 {
public static void main( String args[] ) 
{
int[] arr = {-11,-12, 13, 14, -15};
ArrayList p=new ArrayList();
ArrayList n=new ArrayList();
int m = arr.length;

for(int i:arr){
if(i>0)
{
p.add(i);
}
else
{
n.add(i);

}}
System.out.println(p);
System.out.println(n);
try{

for(int j=0;j<m;j++)
{
System.out.println(p.get(j));
System.out.println(n.get(j));
}
}
catch(Exception e){
System.out.println("sucess");
}
}
}