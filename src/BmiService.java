public class BmiService {

    public int calculate(double a, double b) {
        double result = a > 0 && b > 0 ? a / (b * b) : 0;
        return (int)result;
    }
}
