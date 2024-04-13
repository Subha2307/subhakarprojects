class Fibonacci{
public static void main(String [] args){
int n,n1,n2,n3;
n1=0;
n2=1;
for(n=1;n<=20;n++){
System.out.println(n1);
n3=n2+n1;
n1=n2;
n2=n3;
}
}}
