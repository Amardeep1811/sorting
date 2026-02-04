
import java.util.Scanner;

class SelectionSort{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements of the array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        
        System.out.print("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt();
        }

        selectionSort(arr , n);
    }

    static void selectionSort(int[] arr ,int n){
        for(int i = 0 ; i <= n-2 ; i++ ){
            int min = i;
            for(int j = i+1 ; j <= n-1; j++){
                if (arr[j] < arr[min]) min = j;
            }
            // System.out.print("Min element : " + arr[min]);
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}