class A
{
  int Rollno=460;
  String Name="Subhakar";
  String Address="gmdl";
  
}

class B extends A
{
int Phoneno=123456;
String EmailId="subhakar23";
public String toString(){
return "welcome";
}
public static void main(String[] args){
B n=new B();
System.out.println(n);
}
}