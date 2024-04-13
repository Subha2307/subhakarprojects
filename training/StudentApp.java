import java.util.*;
public class StudentApp {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter your name");
String name=s.nextLine();
System.out.println("Enter your branch");
String branch=s.nextLine();
System.out.println("Enter your rollNo");
int rollNo=s.nextInt();
System.out.println("Enter your year");
int year=s.nextInt();
switch(branch) {
case "CSE":
switch(year) {
case 1:
String[] arr= {"PYTHON","LICA","SQL"};
int total=0;
for(int i=0;i<arr.length;i++) 
{
System.out.println("Enter marks of "+arr[i]);
int sub=s.nextInt();
total=total+sub;
}
double percent=(double)total/5;
System.out.println("Name :"+name);
System.out.println("Branch :"+branch);
System.out.println("RollNo :"+rollNo);
System.out.println("Total percentage of first year "+percent);
break;
case 2:
String[] arr2= {"AP","EG","AWP"};
int total2=0;
for(int i=0;i<arr2.length;i++) {
System.out.println("Enter marks of "+arr2[i]);
int sub=s.nextInt();
total2=total2+sub;
}
double percent2=(double)total2/5;
System.out.println("Name :"+name);
System.out.println("Branch :"+branch);
System.out.println("RollNo :"+rollNo);
System.out.println("Total percentage of second year "+percent2);
break;
    	   
case 3:
String[] arr3= {"ADVANCEDPYTHON","DSP","DCNS"};
int total3=0;
for(int i=0;i<arr3.length;i++) {
System.out.println("Enter marks of "+arr3[i]);
int sub=s.nextInt();
total3=total3+sub;
}
double percent3=(double)total3/5;
System.out.println("Name :"+name);
System.out.println("Branch :"+branch);
System.out.println("RollNo :"+rollNo);
System.out.println("Total percentage of third year "+percent3);
break;
case 4:
String[] arr4= {"JAVA","DSP","COM"};
int total4=0;
for(int i=0;i<arr4.length;i++) {
System.out.println("Enter marks of "+arr4[i]);
int sub=s.nextInt();
total4=total4+sub;
}
double percent4=(double)total4/5;
System.out.println("Name :"+name);
System.out.println("Branch :"+branch);
System.out.println("RollNo :"+rollNo);
System.out.println("Total percentage of fourth year "+percent4);
break;
}
break;
    	  
case "ECE":
switch(year) {
case 1:
String[] arr= {"EDC1","LAAC","SS"};
int total=0;
for(int i=0;i<arr.length;i++) {
System.out.println("Enter marks of "+arr[i]);
int sub=s.nextInt();
total=total+sub;
}
double percent=(double)total/5;
System.out.println("Name :"+name);
System.out.println("Branch :"+branch);
System.out.println("RollNo :"+rollNo);
System.out.println("Total percentage of first year "+percent);
break;
case 2:
String[] arr2= {"C++","ENGLISH","NETWORKING"};
int total2=0;
for(int i=0;i<arr2.length;i++) {
System.out.println("Enter marks of "+arr2[i]);
int sub=s.nextInt();
total2=total2+sub;
}
double percent2=(double)total2/5;
System.out.println("Name :"+name);
System.out.println("Branch :"+branch);
System.out.println("RollNo :"+rollNo);
System.out.println("Total percentage of second year "+percent2);
break;
case 3:
String[] arr3= {"PYTHON","JAVA","C","ES"};
int total3=0;
for(int i=0;i<arr3.length;i++) {
System.out.println("Enter marks of "+arr3[i]);
int sub=s.nextInt();
total3=total3+sub;
}
double percent3=(double)total3/5;
System.out.println("Name :"+name);
System.out.println("Branch :"+branch);
System.out.println("RollNo :"+rollNo);
System.out.println("Total percentage of third year "+percent3);
break;
case 4:
String[] arr4= {"CSD","CS","LAAC"};
int total4=0;
for(int i=0;i<arr4.length;i++) {
System.out.println("Enter marks of "+arr4[i]);
int sub=s.nextInt();
total4=total4+sub;
}
double percent4=(double)total4/5;
System.out.println("Name :"+name);
System.out.println("RollNo :"+rollNo);
System.out.println("Total percentage of fourth year "+percent4);
break;
}
break;
case "EEE":
switch(year) {
case 1:
String[] arr= {"C++","EDC","Chem",};
int total=0;
for(int i=0;i<arr.length;i++) {
System.out.println("Enter marks of "+arr[i]);
int sub=s.nextInt();
total=total+sub;
}
double percent=(double)total/5;
System.out.println("Name :"+name);
System.out.println("Branch :"+branch);
System.out.println("RollNo :"+rollNo);
System.out.println("Total percentage of first year "+percent);
break;
case 2:
String[] arr2= {"EDC","BEE","CS"};
int total2=0;
for(int i=0;i<arr2.length;i++) {
System.out.println("Enter marks of "+arr2[i]);
int sub=s.nextInt();
total2=total2+sub;
}
double percent2=(double)total2/5;
System.out.println("Name :"+name);
System.out.println("Branch :"+branch);
System.out.println("RollNo :"+rollNo);
System.out.println("Total percentage of second year "+percent2);
break;
case 3:
String[] arr3= {"SSP","C","LICA","English"};
int total3=0;
for(int i=0;i<arr3.length;i++) {
System.out.println("Enter marks of "+arr3[i]);
int sub=s.nextInt();
total3=total3+sub;
}
double percent3=(double)total3/5;
System.out.println("Name :"+name);
System.out.println("Branch :"+branch);
System.out.println("RollNo :"+rollNo);
System.out.println("Total percentage of third year "+percent3);
break;
case 4:
String[] arr4= {"ASP","Python","ES"};
int total4=0;
for(int i=0;i<arr4.length;i++) {
System.out.println("Enter marks of "+arr4[i]);
int sub=s.nextInt();
 total4=total4+sub;
}
double percent4=(double)total4/5;
System.out.println("Name :"+name);
System.out.println("Branch :"+branch);
System.out.println("RollNo :"+rollNo);
System.out.println("Total percentage of fourth year "+percent4);
break;
}
break;
}
System.out.println("do you want total cgpa");
String YN=s.next();
double tpercent=0;
if(YN.equalsIgnoreCase("yes")) {
for(int k=1;k<=4;k++) {
System.out.println("enter percent of year "+k);
double percent=s.nextDouble();
tpercent=tpercent+percent;
}
System.out.println("Name :"+name);
System.out.println("Branch :"+branch);
System.out.println("RollNo :"+rollNo);
System.out.println("Overall percentage is "+tpercent/4);

}
} 
}