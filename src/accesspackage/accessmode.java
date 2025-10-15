package accesspackage;
import newpackage.hello;
public class accessmode extends hello {

//        public void show(){
//            System.out.println(add(1,2));
//            //System.out.println(sub(2,1));
//            System.out.println(mul(3,2));
//        }
    public static void main(String[] args) {
        accessmode obj=new accessmode();
        //obj.show();
        //System.out.println(obj.sub(2,1));not accesed because default
        System.out.println(obj.mul(3,2));
    }
}
