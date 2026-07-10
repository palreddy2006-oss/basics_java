public class Palindrom_for_3_Numbers {
    public static void main(String[] args){
        int n = 121;
        int s = 0;
        int s2 = 0;
        int s3 = 0;
        int Ones_Place = 0;
        int Tens_Place = 0;
        int Thousands_Place = 0;

        if(n > 9){
            Ones_Place = n % 10 ;
           s =  n / 10 ;
        }
        if(s > 9){
            Tens_Place = s % 10 ;
            s2 = s / 10 ;
        }
        if(s2 > 9){

            s3 = s2 / 10 ;
             Thousands_Place = s2 % 10 ;
        }else {
            Thousands_Place = s2 ;
        }
        if(Thousands_Place == Ones_Place){
            System.out.println("it is palindrom number");
        }else {
            System.out.println("it is not a palindrom number");
        }
    }

}
