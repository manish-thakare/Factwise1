import java.util.*;

public class Question3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Anser:"+maxProfit(arr,n));
    }
    public static int maxProfit(int [] price,int n){
        int ans=0;
        int min=price[0];
        for(int i=0;i<n;i++){
            ans=Math.max(ans,price[i]-min);
            min=Math.min(price[i],min);
        }
        return ans;
    }
}