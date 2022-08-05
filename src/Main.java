import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz : ");
        int size = input.nextInt();
        int[] arr = new int[size];

        System.out.println("Dizinin elemanlarını giriniz : ");
        for(int i = 1; i <= size; i++){
            System.out.print(i + ". Elemanı : ");
            arr[i-1] = input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sıralama : " + Arrays.toString(arr));
    }
}