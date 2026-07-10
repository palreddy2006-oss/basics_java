public class Employee_Details {
    public static void main(String[] args){
        String Gender = "male";
        int Experience = 19;
        String Qualification = "Graduation";

        if(Gender == "male"){
            if(Experience >= 10)
            {
                if(Qualification == "Post Graduation")
                {
                    System.out.println("Salary is 15000");
                }
                else if(Qualification == "Graduation")
                {
                    System.out.println("salary is 10000");
                }
            }else if(Experience < 10)
                 {
                if(Qualification == "Post Graduation")
                {
                    System.out.println("Salary is 10000");
                }
                else if(Qualification == "Graduation")
                {
                    System.out.println("salary is 7000;");
                }
            }
        }else if(Gender == "female")
             {
            if(Experience>= 10)
            {
                if(Qualification == "Post Graduation")
                {
                    System.out.println("Salary is 12000");
                }
                else if(Qualification == "Graduation")
                {
                    System.out.println("salary is 9000");
                }
            }else if(Experience < 10)
            {
                if(Qualification == "Post Graduation")
                {
                    System.out.println("Salary is 8000");
                }
                else if(Qualification == "Graduation")
                {
                    System.out.println("salary is 6000");
                }
            }
        }
    }
}
