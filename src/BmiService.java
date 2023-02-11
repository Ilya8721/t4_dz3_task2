public class BmiService {

    public int calculate(double weightInKilograms, double heightInMeters) {
        double result = weightInKilograms > 0 && heightInMeters > 0 ? weightInKilograms / (heightInMeters * heightInMeters) : 0;
        return (int)result;
    }
}
