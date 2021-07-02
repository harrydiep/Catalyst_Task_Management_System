import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;

        System.out.println(Arrays.toString(arr));

        arr[0] = 5;

        int[] temp = new int[20];

        for (int i = 0; i<arr.length;i++){
            temp[i] = arr[i];
            arr = temp;
        }


    }
}
