public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                temp[j] = arr[i];
                j++;
            }
        }
        System.out.print("Unique elements: ");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}

