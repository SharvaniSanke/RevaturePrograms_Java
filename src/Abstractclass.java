public class Abstractclass {
    public static void main(String[] args) {
        demos obj=new demos();
        obj.disp();
        obj.m1();
    }
}
abstract class Abc{
    abstract void m1();
    void disp(){//concrete method
        System.out.println("Abc");
    }
}
class demos extends Abc{
    void m1(){
        System.out.println("demos");
    }

}
