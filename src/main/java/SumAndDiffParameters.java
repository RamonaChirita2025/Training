public class SumAndDiffParameters {
    public static void main(String[] args){
        sumDiff(args);
    }
        private static void sumDiff(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a + b;
        System.out.println(a + "+" + b + "=" + sum);
        int dif = a - b;
        System.out.println(a + "-" + b + "=" + dif);
        System.out.println(b);
     }
   }

