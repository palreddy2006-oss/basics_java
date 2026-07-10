public class Logical_Operator_And {
    public static void main(String[] args){
        int Student1,Student2,Student3;
        int Experience = 2;
        int Experience1 = 1;
        int Experience2 = 3;
        int Experience3 = 5;
        boolean DegreeStatus = true;
        boolean DegreeStatus1 = true;
        boolean DegreeStatus2 = false;
        boolean DegreeStatus3 = true;

        if((DegreeStatus == DegreeStatus1) && (Experience <= Experience1))
        {
            System.out.println( "Student1 "+"Eligible for interview");
        }else if ((DegreeStatus == DegreeStatus2) && (Experience <= Experience2))
        {
            System.out.println("Student2 "+"Eligible for interview");
        }else if ((DegreeStatus == DegreeStatus3) && (Experience <= Experience3))
        {
            System.out.println("Student3 "+"Eligible for interview");
        }else
        {
            System.out.println("Not eligible for interview");
        }


    }
}
