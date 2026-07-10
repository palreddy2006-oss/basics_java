public class Electricity_Bill {


        public static void main(String args) {
            double bill=0;
            System.out.println("Enter how many unit consumed");
            int totalUsageInUnit = 90;
            if(totalUsageInUnit < 100) {
                if(totalUsageInUnit <= 50) {
                    System.out.println("per uint price is 1.95 rupees");
                    double unit = 1.95;
                    bill = totalUsageInUnit*unit;
                    System.out.println(bill);
                }else {
                    System.out.println("per unit price is 3.10 rupees");
                    double unit = 3.10;
                    bill = totalUsageInUnit*unit;
                    System.out.println(bill);
                }
            }
        }

    }


