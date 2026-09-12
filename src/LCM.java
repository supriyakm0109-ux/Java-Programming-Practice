public class LCM {
        public static void main(String[] args) {
            int a = 10;
            int b = 15;

            int max = Math.max(a, b);

            while (true) {
                if (max % a == 0 && max % b == 0) {
                    System.out.println("LCM = " + max);
                    break;
                }
                max++;
            }
        }
    }

