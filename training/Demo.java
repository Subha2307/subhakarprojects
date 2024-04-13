import java.util.*;
class Demo{
public static void main(String args[]){
String s="aaabbbbccd";


for(int i=0;i<s.length();i++){
if(s[1].equals(s[0])){
int count=1;
count++;
}
else{
System.out.println(count);

}
}
}}