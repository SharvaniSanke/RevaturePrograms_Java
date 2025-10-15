public class Constructor {
    String name;
    static String college="revature";
    Constructor(String name){
        this.name=name;//represents global variable
    }
    void show(){
        int a=2,b=1;//cant be accesed outside the class
        int result=0;
        result=a-b;
        System.out.println("result:"+result);
        String s="sharvani";
        System.out.println("My namee is "+s+" Studying at"+college);

    }
    Constructor(Constructor e){//copy Constructor to copy same variable for other purpose
        this.name=e.name;

    }
    public static void main(String[] args) {
        Constructor obj = new Constructor("hello");
        Constructor obj2 = new Constructor(obj);
        System.out.println(obj.name);
        obj.show();
        Constructor.college="sharvani";
        obj2.show();//college sharvani

    }
}
