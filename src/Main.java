public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 71;
        double height = 1.71;
        double bodyMassIndex = service.calculate(weight, height);
        System.out.println("Ваш индекс массы тела:" + bodyMassIndex);
    }
}
