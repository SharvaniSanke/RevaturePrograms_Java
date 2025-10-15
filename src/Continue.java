public class Continue {
    public static void main(String[] args){
        int n=1;
        while(n<=5){
            if(n==2) {
                break;
            }
            System.out.println(n);
            n++;
        }
        System.out.println("\n");
        for(int i = 1; i <= 5; i++){
            if(i == 2){
                continue;
            }
            System.out.println(i);
        }

    }
}
