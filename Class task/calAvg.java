public class calAvg {
    public static void main(String[] args) {
        int arr[]={75,80,65,90,85};
        int sum=0;
        int ansMin=arr[0];
        int ansMax=arr[0];
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(arr[i]>ansMax){
             ansMax=arr[i];
            }
            if(arr[i]<ansMin){
             ansMin=arr[i];
            }
        }
        System.out.println("sum"+sum);
        int avg=sum/arr.length;
        System.out.println(ansMax);
        System.out.println(ansMin);

    }
}
