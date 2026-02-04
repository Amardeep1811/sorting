
import java.util.Scanner;

class InsertionSortUsingRecursion{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements of the array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        
        System.out.print("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt();
        }

        insertionSort(arr ,n);

        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void insertionSort(int[] arr ,int i){
        if(i >= arr.length -1) return;

        int j = i;

        while(j > 0 && arr[j-1] > arr[j]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }

        insertionSort(arr, i+1);

    }
}