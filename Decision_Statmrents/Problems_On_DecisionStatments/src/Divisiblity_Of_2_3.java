public class Divisiblity_Of_2_3 {

        public static void main(String[] args){
            int number = 12;
            if(number % 2 == 0){
                System.out.println("Divisible by 2");
                if((number % 2 == 0) && (number % 3 == 0)){
                    System.out.println("Divisible by both 2 and 3");
                }
            }else if(number % 3 == 0){
                System.out.println("Divisible by 3");
                if((number % 2 == 0) && (number % 3 == 0)){
                    System.out.println("Divisible by both 2 and 3");}
            }
            else{
                System.out.println("not divisible by both the numbers");
            }
        }
    }

