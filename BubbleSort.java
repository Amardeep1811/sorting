
import java.util.Scanner;

class BubbleSort{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements of the array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        
        System.out.print("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt();
        }

        bubbleSort(arr , n);
    }

    static void bubbleSort(int[] arr ,int n){
        int breakpoint = 0;
        for(int i = n-1 ; i >= 0; i-- ){
            for(int j = 0 ; j < n-1; j++){
                if (arr[j+1] < arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                    // System.out.println("1 time");
                    breakpoint = 1;
                }
            }
            
            if(breakpoint == 0 ){
                break;
            }
        }

        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}