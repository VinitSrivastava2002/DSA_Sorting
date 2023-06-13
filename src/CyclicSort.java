import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args) {
        int[] array={3,5,2,1,4};
        cyclicSort(array);
        System.out.println(Arrays.toString(array));

    }
    static void cyclicSort(int[] arr){
        int i=0;
       while(i<arr.length){
           int correct=arr[i]-1;
           if(arr[i]!=arr[correct]){
               swap(i,correct,arr);
           }
           else{
               i++;
           }
       }
    }
    static void swap(int a, int b, int[] arr){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
