package Logical;
public class Move0toEnd {
    public static void main(String[] args) {
        int arr []={1,2,0,3,4,0,5,0};  

        int index=0;

        for(int i=0;i<=arr.length-1;i++){
            if (arr[i]!=0) {
                arr[index++]=arr[i];
            }
        }

        while(index<arr.length){
            arr[index++]=0;
        }
        // System.out.println(arr.toString());
        for(int num:arr){
            System.out.println(num+" ");
        }
    }
}
