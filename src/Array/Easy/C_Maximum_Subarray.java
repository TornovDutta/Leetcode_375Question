//Question: Given an integer array nums, find the
//subarray
// with the largest sum, and return its sum.
package Array.Easy;


//time complexity O(n)
public class C_Maximum_Subarray {
    private static int maxsub(int arr[]){
        int max=arr[0];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            max=Math.max(max,sum);


            if(sum<0){
                sum=0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum subarray is:  "+maxsub(arr));
    }
}


