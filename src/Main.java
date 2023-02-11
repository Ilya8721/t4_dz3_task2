public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightInKilograms = 98;
        double heightInMeters = 1.87;
        int bodyMassIndex = service.calculate(weightInKilograms, heightInMeters); // должно получиться 28
        System.out.println(bodyMassIndex);
    }
}