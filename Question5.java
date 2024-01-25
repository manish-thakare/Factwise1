import java.util.*;

public class Question5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n= sc.nextInt();
        int gas[]=new int[n];
        int[] cost=new int[n];
        System.out.println("Enter gas element");
        for(int i=0;i<n;i++){
            gas[i]=sc.nextInt();
        }
        System.out.println("Enter costs");
        for(int i=0;i<n;i++){
            cost[i]=sc.nextInt();
        }
        System.out.println("");
    }
    public static int Sol(int[]gas, int[] cost, int n){
        int temp[]=new int[n];
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++){
            temp[i]=gas[i]-cost[i];
            max=Math.max(max,temp[i]);
            sum+=temp[i];
        }
        if(sum<0) return -1;
        int x=0;
        int y=0;
        int sum1=0;
        for(int i=0;i<n;i++){
            if(sum1+temp[x]<0){
                x++;
                sum1=0;
                y=x;
            }
            else{
                x++;
                sum1+=temp[i];
            }
        }
        return y;
    }
}