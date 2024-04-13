class Alter {
public static void main( String args[] ) 
{
int[] arr = {11, 12, 13, 14, 15};
int n = arr.length;
for(int i=0; i<n; i = i+2){
System.out.println(arr[i]);

}
for(int j=1;j<n;j=j+2){
System.out.println(arr[j]);
}
}
}