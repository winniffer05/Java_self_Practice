package day06_practice_tasks;


    public class MaximumAndMinimum {
        public static void main(String[] args) {

            int maxInt = max(15, 24);
            System.out.println(maxInt);

            double maxDouble = max(5.5, 2.1);
            System.out.println(maxDouble);

            int minInt = min(7, 4);
            System.out.println(minInt);

            double minDouble = min(9.2, 8.7);
            System.out.println(minDouble);
        }
        public static int max (int num1, int num2){
            if (num1>num2){
                return num1;
            }else {
                return num2;
            }
        }
        public static double max (double num1, double num2) {
            if (num1 > num2) {
                return num1;
            } else {
                return num2;
            }
        }
        public static int min (int num1, int num2) {
            if (num1 < num2) {
                return num1;
            } else {
                return num2;
            }
        }
        public static double min (double num1, double num2) {
            if (num1 < num2) {
                return num1;
            } else {
                return num2;
            }
        }
    }


