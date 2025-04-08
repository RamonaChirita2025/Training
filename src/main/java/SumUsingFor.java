public class SumUsingFor {

    public static void main(String [] args) {
        calculateSum();
    }

        private static void calculateSum() {
            int sum = 0;
            {
                for (int i = 0; i <= 100; i++)
                    sum = sum + i;
            }
            System.out.println(sum);
        }
}
