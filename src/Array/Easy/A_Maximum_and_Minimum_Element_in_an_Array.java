//Question: find minimum and maximum value of an array
package Array.Easy;


//time complexity O(n)
public class A_Maximum_and_Minimum_Element_in_an_Array {
    private static int max(int arr[]){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(max,arr[i]);
        }



        return max;

    }

    private static int min(int arr[]){
        int min=arr[0];
        for (int i = 0; i <arr.length; i++){
            min=Math.min(min,arr[i]);
        }
        return min;
    }

    public static void main(String[] args) {
       int arr[]={12,7,4,9,2,7,0};
        System.out.println("max element in array is "+max(arr));

        System.out.println("min element in array is "+min(arr));
    }
}
