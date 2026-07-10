public class Triangle {
    public static void main(String[] args){
        int side1 = 10;
        int side2 = 20;
        int side3 = 10;

     //              /\
     //   side1     /  \    side3
     //            /____\
    //              side2
        if(side1 == side3){
            System.out.println("triangle");
        }
        else{
            System.out.println("not a trianlge");
        }

    }
}
