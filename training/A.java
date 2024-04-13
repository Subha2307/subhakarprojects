class A
{
void add(int[] arr)
{
int sum=0;
for (int a:arr)
{
sum=sum+a;
System.out.println(sum);
}
}
public static void main(String[] args){
int arr1[]={1,2,3,4};
A obj=new A();
obj.add(arr1);
System.out.println(arr1);
}} 