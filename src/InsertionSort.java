//break into samll array like 0 to 1,2,3,4,----,n and then sort

import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {
        int[] array={6,8,4,9,1,3};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
    static void insertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    swap(j-1,j,arr);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int a, int b, int[] arr){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
