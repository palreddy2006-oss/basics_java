public class Driving_Licence {
    public static void main(String[] args){
        int age =19;
        boolean Driving = false;
        if(age >= 18){
           if(Driving == true){
               System.out.println("eligible for drivers licence");
           }if(Driving == false){
                System.out.println("Not eligible for drivers licence");
            }
        }else {
            System.out.println("not eligible for drivers licence");
        }
    }
}
