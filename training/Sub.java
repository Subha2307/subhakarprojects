class Sub{
int a=10;
public static int Main(){
int b=20;
return b;
}

public static void main(String[] args)
{
Sub s=new Sub();

//Main s1=new Main();
System.out.println(s.a);

System.out.println(Main());
}
}
