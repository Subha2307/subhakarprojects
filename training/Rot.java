import java.util.Arrays;
class Rot{
public static void main(String args[]){

int num[]={1,2,3,4,5};
int n=num.length-1;
for(int i=0;i<num.length;i++){
int temp=num[i];
num[i]=num[n];
num[n]=temp;
}

System.out.println(Arrays.toString(num));
}}