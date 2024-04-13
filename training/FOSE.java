import java.io.FileOutputstream;
public class Us{
public static void main(String[] args){
String s="hello subhakar";
try{
FileOutputStream fout=new FileOutputStream();
byte[] b=s.getBytes();
fout.write(b);
fout.flush();
fout.close();
System.out.println("SUCCESS.....");
}
catch(Exception e){
System.out.println(e);
}
}}
