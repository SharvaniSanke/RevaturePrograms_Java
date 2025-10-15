public class interfaces {
    public static void main(String[] args)
    {
        Z obj1=new Z();
        obj1.add();
        obj1.sub();
    }
}
interface X{
    public void add();
    public static final String str="Sharvani";
}
interface Y{
    public void sub();
}
class Z implements X,Y{
    public void add(){
        int a=10;
        int b=20;
        System.out.println("Addition="+(a+b));
    }
    public void sub(){
        int x=20;
        int y=10;
        System.out.println("Subtraction="+(x-y));
    }
}
