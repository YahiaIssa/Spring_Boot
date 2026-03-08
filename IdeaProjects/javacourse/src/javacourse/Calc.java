package javacourse;

public class Calc {
    public int Sum(int one, int two) {
        return one + two;
    }

    public int Min(int one, int two) {

        return one - two;
    }

    public int Mul(int one, int two) {
        return one * two;
    }

    public int Div(int one, int two) {
        if (two == 0)
            return 0;
        return one / two;
    }

    public void Dec(int value) {
        for (int i = value; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public int[] mulArray(int[] a, int[] b) {
        if (a.length != b.length)

            return null;

        int [] result = new int[b.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] * b[i];
        }
        return result;
    }
}






