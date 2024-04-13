interface A
{
int a=12;
void show();
}
class Main implements A
{
int b=22;
public void show()
{
System.out.println("show()method");
}
void print()
{
System.out.println("print()method");
}
public static void main(String[] args)
Main obj=new Main();
obj.show();
obj.print();
System.out.println(A.a);
System.out.println(obj.b);
}
}