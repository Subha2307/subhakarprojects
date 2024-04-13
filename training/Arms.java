class Arms{
public static void main(String[] args){
int a=153,b,c;
int res=0;
b=a;
while(b!=0){
c=b%10;
res+=Math.pow(c,3);
b=b/10;
}
if(res==a){
System.out.println("the given number is Armstrong number");
}
else{
System.out.println("given number is not Armstrong number");
}
}}


