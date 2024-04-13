import java.util.*;
class Alter2 {
public static void main( String args[] ) 
{
int[] arr = {-11,-12, 13,32,65, 14, -15, 2, 43};
ArrayList p=new ArrayList();
ArrayList n=new ArrayList();
ArrayList t=new ArrayList();
int m = arr.length;
int pc=0;
int nc=0;

for(int i:arr){
if(i>0)
{
p.add(i);
pc=pc+1;
}
else
{
n.add(i);
nc=nc+1;
}}
System.out.println(p);
System.out.println(n);
if(pc>=nc)
{
for(int k=0;k<nc;k++){
t.add(p.get(k));
t.add(n.get(k));
}
for(int z=nc;z<pc;z++){
t.add(p.get(z));
}
}
if(nc>pc)
{
for(int k=0;k<pc;k++){
t.add(p.get(k));
t.add(n.get(k));
}
for(int z=pc;z<nc;z++){
t.add(n.get(z));
}
}
System.out.println(t);
}
}
