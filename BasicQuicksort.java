import java.util.Arrays;
public class BasicQuicksort {
    public static void main (String [] args){
        // Array declaration
        int[] arr={100,50,30,10,40};

        // Before sorting
        System.out.println(Arrays.toString(arr));

        //After sorting
        quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quicksort(int[] arr, int l, int r){
        if (l<r){
            int pivotIndex = partition(arr,l,r);
            quicksort(arr,l,pivotIndex-1);
            quicksort(arr,pivotIndex+1,r);
        }
    }

    static int partition(int[] arr, int l, int r){
        int pivot = arr[r];
        int i = l -1;
        int j;
        for (j=l; j<r; j++){
            if (arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, r);
        return i+1;
    }

    // Helper
    static void swap (int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
