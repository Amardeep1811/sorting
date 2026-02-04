
import java.util.Scanner;

class QuickSort{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements of the array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        
        System.out.print("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt();
        }

        quickSort(arr ,0,n-1);

        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void quickSort(int[] arr ,int low , int high){
        if(low < high){
            int partion = sort(arr , low , high);
            quickSort(arr, low, partion-1);
            quickSort(arr, partion+1, high);
        }
    }

    static int sort(int arr[] , int low , int high){
        int i = low;
        int j = high;
        int pivot = arr[low];

        //to make sure that they are in boundaries of low and high
        while(i < j){
            while(pivot >= arr[i] && i <= high-1){
                i++;
            }

            while(arr[j] > pivot && j >= low+1){
                j--;
            }

            //only if the j hasnt crossed the i only then we will swap elements 
            if(i<j){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp; 
            }
        }

        //if i has crossed j then we will swap the pivot element with the jth index element
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;

    }
}