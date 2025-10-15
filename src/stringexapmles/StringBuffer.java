package stringexapmles;
import java.lang.String;
class string {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        sb.append("World");
        System.out.println(sb);
        sb.insert(5,"java");
        System.out.println(sb);
        sb.delete(5,10);
        System.out.println(sb);
    }
}
