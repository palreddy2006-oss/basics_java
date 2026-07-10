

public class EVENNUMBERS {

    public class Even_number {
        public static void main(String[] args) {
            System.out.println(even());
            even();
        }


        public static int even() {
            System.out.println("enter any number");
            int number = 12;
            int n = 0;
            if (number % 2 == 0) {
                for (number = number; number <= 100; number++) {
                    n = number % 2;
                    if (n == 0) {
                        System.out.println(number);
                    }
                }
            }else {
                System.out.println("odd number");
            }
            return 0;
        }

    }
}
