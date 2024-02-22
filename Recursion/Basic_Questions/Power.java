class Power {

    public static void main(String[] args) {
        double result = myPow(2,10);
        System.out.println(result);
    }
    public static double myPow(double x, int n) {
        if (n <= 1) {
            return n;
        }

        return x * myPow(x, n - 1);
    }
}