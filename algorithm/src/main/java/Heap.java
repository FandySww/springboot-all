import java.util.ArrayList;
import java.util.Arrays;
public class Heap {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        // 构建大顶堆
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void sort(int[] arr){
        for(int i=arr.length/2-1;i>=0;i--) adjust(arr, i, arr.length);
        for(int j=arr.length-1;j>0;j--){
            swap(arr,0,j);
            adjust(arr,0,j);
        }
    }
    private static void adjust(int[] arr,int i,int length){
        int temp = arr[i];
        for(int k=i*2+1;k<length;k=k*2+1){
            if(k+1<length&&arr[k]<arr[k+1]){
                k++;
            }
            if(temp<arr[k]){
                arr[i] = arr[k];
                i = k;// 下次
            }else{
                break;
            }
            arr[k] = temp;
        }
    }
    private static void swap(int []arr,int a ,int b){
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
