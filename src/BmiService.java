public class BmiService {
    public double calculate(int weight, double height) {
        double doubleHeight = height * height;
        double bodyMassIndex = weight / doubleHeight;
        return bodyMassIndex;
    }
}
