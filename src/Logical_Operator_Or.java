public class Logical_Operator_Or {
    public static void main(String[] args){
        int Maths = 50;
        int Science = 50;
        int Student1,Student2,Student3,Student4;

        int Maths1 = 60 ,Science1 = 40;
        int Maths2 = 30 ,Science2 = 70;
        int Maths3 = 45 ,Science3 = 35;
        int Maths4 = 80 ,Science4 = 90;
        if((Maths <= Maths1) || (Science <= Science1))
        {
            System.out.println("Student1 "+ "pass");
        }  if((Maths <= Maths2) || (Science <= Science2))
        {
            System.out.println("Student2 "+ "pass");
        } if((Maths <= Maths3) || (Science <= Science3))
        {
            System.out.println("Student3 "+ "pass");
        }if((Maths <= Maths4) || (Science <= Science4))
        {
            System.out.println("Student4 "+ "pass");
        }else {
            System.out.println("All are fail");
        }
    }
}
