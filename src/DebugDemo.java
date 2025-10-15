public class DebugDemo {
    public static void main(String[] args) {
        int[] numbers={10,20,30,40};
        int total=0;
        for(int i=0;i<numbers.length;i++)
        {
            total+=numbers[i];
        }
        System.out.println("Total:"+total);
    }
}
