public class classobjexample {
    int age;
    int display(int  a,int b){

        int result=a+b;
        System.out.println("result:"+result);
        return result;
    }

    public static void main(String[] args) {
        classobjexample obj = new classobjexample();
        obj.display(10,20);
        obj.age=10;
    }
}
