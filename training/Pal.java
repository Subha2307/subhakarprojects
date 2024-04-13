class Pal
{
 static String st="mom";

public static void main(String[] args){
StringBuffer s=new StringBuffer("mom");
s.reverse();
if(st.equals(s.reverse()))
{
System.out.println("yes");
}
else{
System.out.println("no");

}

}
}