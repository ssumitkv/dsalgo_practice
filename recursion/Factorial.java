public class Factorial{
    public static void main(String[] args) {
        Factorial f = new Factorial();
        int n = Integer.parseInt( args[0]);

        System.out.println(f.calcFactorial(n));

        System.out.println(f.calcFactorialWithTernary(n));
    }

    int calcFactorial(int n) {
        if(n <= 1) {
            return n;
        }
        return n * calcFactorial(n-1);

    }

    int calcFactorialWithTernary(int n) {
        return (n <= 1) ? n : n * calcFactorialWithTernary(n-1);
    }
}