package Easy;

import java.util.Arrays;

public class B_Reverse_the_Array {
    private static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    private static void reverse(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        reverse(arr);

        System.out.println(Arrays.toString(arr));
    }
}
