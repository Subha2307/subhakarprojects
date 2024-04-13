interface Drawing
{
void draw();

}
public class LambdaEx{
public static void main(String[] args){
int paint=2;
Drawing d=new Drawing(){
public void draw(){

System.out.println("Drawn "+paint);

}
};
Drawing d1=()->{

System.out.println("succcess "+paint);

};

d.draw();
d1.draw();
}
}     