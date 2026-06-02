package Logical;

public class RemoveCon {
    public static void main (String args []){
        String str = "aaabbccddda";
        String  result="";
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                continue;
            }
            else{
                result+=str.charAt(i);
            }
        }
        result+=str.charAt(str.length()-1);
        System.out.println(result);
    }
}
