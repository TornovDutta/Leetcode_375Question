//Question:Given an array of N integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that:
//
//Each student gets one packet.
//The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates given to the students is minimum.
package Array.Easy;

import java.util.Arrays;

//time complexity O(n)

public class E_Chocolate_Distribution_Problem {
    static int mindiff(int a[],int m){
        Arrays.sort(a);
        int n=Integer.MAX_VALUE;
        for (int i = 0; i < a.length-m; i++) {
            n=Math.min(n,a[i + m - 1] - a[i]);
        }
        return n;
    }
    public static void main(String[] args) {
        int arr[]={7, 3, 2, 4, 9, 12, 56};
        int m=3;
        System.out.println("minimum different is : "+mindiff(arr,m));
    }
}
