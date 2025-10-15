public class Inheritanceexample {
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();
        obj.add(2,3);
        //obj.sub(2,3) not possible to inherit superclass to subclass
        subclass obj1 = new subclass();
        obj1.add(5,3);//possible because sub class have features of superclass
        obj1.sub(5,3);
    }
}
class Arithmetic {
    void add(int a,int b){
        int sum=a+b;
        System.out.println(sum);
    }
}
class subclass extends Arithmetic {
    void sub(int a,int b){
        int sum=a-b;
        System.out.println(sum);
    }
}
