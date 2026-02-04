
import java.util.Scanner;

class BubbleSortUsingRecursion{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];
        
        System.out.print("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt();
        }

        bubbleSort(arr ,n);

        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void bubbleSort(int[] arr ,int n){
        if(n == 0) return;
        int didSwap = 0;
        for(int j = 0 ; j < n-2 ; j++){
            if(arr[j+1] < arr[j]){
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
                didSwap = 1;
            }
        }
        if(didSwap == 0) return;
        bubbleSort(arr, n-1);
    }
}