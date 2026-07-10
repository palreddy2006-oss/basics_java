public class Largest_Three_Number {
    public static void main(String[] args){
        int a = 1;
        int b = 20;
        int c = 3;
        if (a>b){
            if(a>c){
                System.out.println(a);
            }else {
                System.out.println(c);
            }
        }else{
          if(b>c){
              System.out.println(b);
          }else{
              System.out.println(c);
          }
        }
    }
}
