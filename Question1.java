import java.util.*;

public class Question1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("")
    }
    public static int rmvDup(int[] num,int n){
        int i=0;
        int x=0;
        while(i<n){
            num[x]=num[i];
            x++;
            int j=i;
            while(i<n && num[i]==num[j])i++;
        }
        return x;
    }
}
