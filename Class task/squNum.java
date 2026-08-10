import java.util.*;
public class squNum{
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
          ans[i]=arr[i]*arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}