package strategy;

import java.util.Arrays;

/**
 * 使用手写快排
 * @author 张志伟
 * @version v1.0
 */
public class Sorter {
    public void sort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >= 1 ; j--) {
                if (arr[j] < arr[j - 1]){
                    swap(arr,j, j - 1);
                }else {
                    break;
                }
            }
        }
        // partition(arr,0, arr.length - 1);
    }

    public void partition(int[] arr, int L, int R){
        if (L == R|| L > R || L < 0 || R < 0){
            return;
        }
        int less = L - 1;
        int more = R;
        int index = L;
        while (index < more){
            if (arr[index] == arr[R]){
                index++;
            }else if (arr[index] < arr[R]){
                swap(arr,index++,++less);
            }else {
                swap(arr,index,--more);
            }
        }
        swap(arr, more, R);
        partition(arr, L, less + 1);
        partition(arr, more + 1, R);
    }
    public void swap(int[] arr, int i, int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }


    public static void main(String[] args) {
        int[] arr = {9,2,3,5,7,1,4};
        Sorter sorter = new Sorter();
        sorter.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
