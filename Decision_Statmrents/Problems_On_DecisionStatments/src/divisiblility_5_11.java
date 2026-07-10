public class divisiblility_5_11 {
    public static void main(String[] args){
        int number = 33;
        if(number % 5 == 0){
           System.out.println("Divisible by 5");
            if((number % 5 == 0) && (number % 11 == 0)){
                System.out.println("Divisible by both 5 and 11");
            }
        }else if(number % 11 == 0){
           System.out.println("Divisible by 11");
            if((number % 5 == 0) && (number % 11 == 0)){
             System.out.println("Divisible by both 5 and 11");}
        }
        else{
            System.out.println("not divisible by both the numbers");
        }
    }
}
