class A extends Thread{
public void run(){
System.out.println("get-out");
}
public static void main(String[] args){
A obj=new A();
obj.start();
}}

    
