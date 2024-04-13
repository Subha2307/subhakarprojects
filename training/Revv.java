class Revv
{
public static void main(String []  args){
String str="iamstudent";
String word="";
String seq="";
int a=str.length();
for(int i=0;i<str.length();i++){
String b=Character.toString(str.charAt(i));
if(b.equals(" ")){
seq=word+" "+seq;
word="";
}
else{
word=word+b;
}
}
seq=word+" "+seq;
System.out.println(seq);
}
}
