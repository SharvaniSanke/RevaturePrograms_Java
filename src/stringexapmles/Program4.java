package stringexapmles;

public class Program4 {
    public static void main(String[] args) {
        String str1="java";
        String str2="java";
        System.out.println("Str1==Str2:"+(str1==str2));
        String str3=new String("java");
        String str4=new String("java");
        System.out.println("str3==str4:"+(str3==str4));
        String str5=str3.intern();
        System.out.println("str1==str5:"+(str1==str5));
        String str6=new String("java").intern();
        System.out.println("str1==str6:"+(str1==str6));
        System.out.println("str2.=str6:"+(str3.equals(str6)));
    }
}
