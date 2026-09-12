public class prime2 {
        public static void main(String[] args) {
            int start = 1;
            int end = 20;

            for (int n = start; n <= end; n++) {
                boolean prime = true;

                if (n <= 1) {
                    prime = false;
                }

                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        prime = false;
                        break;
                    }
                }

                if (prime) {
                    System.out.println(n);
                }
            }
        }
    }

