//select max element and place in a last position
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array={6,8,4,9,1,3};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxIndex=getManIndex(arr,0,last);
            swap(maxIndex,last,arr);
        }
    }

    static int getManIndex(int[] arr, int start, int end) {
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    static void swap(int a, int b, int[] arr){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
