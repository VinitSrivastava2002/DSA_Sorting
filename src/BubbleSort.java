// It is also known as comparision sort.
// swap or comparision from next element.
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] array={6,8,4,9,1,3};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
     static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap( j,j+1, arr);
                }
            }
        }
     }
     static void swap(int a , int b, int[] arr){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
     }
}
