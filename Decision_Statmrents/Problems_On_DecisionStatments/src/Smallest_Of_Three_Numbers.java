public class Smallest_Of_Three_Numbers {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int c = 3;
        if(a<b){
            if(a<c){
                System.out.println("smallest number is a");
            }else {
                System.out.println("Samllest is c");
            }
        }else{
            if(b<c){
                System.out.println("samllest is b");
            }else{
                System.out.println("Samllest is c");
            }
        }
    }
}
