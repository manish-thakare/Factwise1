import java.util.*;

public class Question4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target value.");
        int target=nextInt();
        System.out.println("Answer"+ search(arr,n,target));
        sc.close();
    }
    public static search(int[] arr,int target,int n){
        int left=0;
        int right=n;
        while(left<right){
            int mid=(left+right)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) left=mid+1;
            else right=mid;
        }
        return left;
    }
}