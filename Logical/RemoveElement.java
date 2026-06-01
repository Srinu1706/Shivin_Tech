package Logical;
public class RemoveElement {
    public static void main(String[] args) {
        int arr []= {1,2,3,4,5,88,6,7};

        int NewArray []= new int [arr.length-1];

       

        int NewArray_Position=0;
 
        for(int i=0;i< arr.length;i++){
            if(arr[i]==88){
                continue;
            }
            NewArray[NewArray_Position++]=arr[i];
            
        }
        for (int i : NewArray) {
            System.out.println(i);
        }
    }
}
