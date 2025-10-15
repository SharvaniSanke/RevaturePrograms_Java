class Dog{
    String name;
    Dog(String name){
        this.name=name;
    }
    public String toString(){
        return "Dog name="+name;
    }
    public boolean equals(Object obj){
        if(obj instanceof Dog){
            Dog d=(Dog)obj;
            return this.name.equals(d.name);
        }
        return false;
    }
}
public class ObjectClassProgram {
    public static void main(String[] args) {
        Dog dog1=new Dog("Puppy");
        Dog dog2=new Dog("Puppy");
        System.out.println(dog1);//calls to tostring
        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.hashCode());

    }
}
