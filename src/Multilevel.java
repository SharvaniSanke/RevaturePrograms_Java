public class Multilevel {
    public static void main(String[] args) {
        A obj=new A();
        obj.add(1,2);
        B obj2=new B();
        obj2.add(1,2);
        obj2.sub(3,4);
        C obj3=new C();
        obj3.mul(1,2);
        obj3.add(1,2);
        obj3.sub(3,4);
    }
}
class A{
    void add(int a,int b){
        int sum=a+b;
        System.out.println(sum);
    }
}
class B extends A{
    void sub(int a,int b){
        int res=a-b;
        System.out.println(res);
    }
}

class C extends B{
    void mul(int a,int b){
        int res=a*b;
        System.out.println(res);
    }
}