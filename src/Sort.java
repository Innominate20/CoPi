package src;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {



    }

    public static void bubbleSort(int [] ar){
        int out, in;
        for (out = ar.length-1; out>1;out--){
            for (in =0;in<out;in++){
                if(ar[in] > ar[in+1]){
                    int tem = ar[in];
                    ar[in] =ar[in+1];
                    ar[in+1] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(ar));
    }

    public static void selectionSort(int [] arr){
        int out, in , min;
        for(out=0; out<arr.length-1;out++){
            min = out;
            for(in=out+1; in<arr.length;in++){
                if(arr[in] < arr[min]){
                    min = in;
                }
            }
            int tem = arr[out];
            arr[out] =arr[min];
            arr[min] = tem;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int [] arr){
        int in , out;
        for(out =1;out<arr.length;out++){
            int tmp = arr[out];
            in = out;
            while (in >0 && arr[in-1] >= tmp){
                arr[in] = arr[in-1];
                in--;

            }
            arr[in]= tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
