public class Sumarray {
        public static void main(String[] args) {
            int[] numbers = {10, 20, 30, 40};

            int sum = 0;

            for (int number : numbers) {
                sum = sum + number;
            }

            System.out.println("Sum = " + sum);
        }
    }

