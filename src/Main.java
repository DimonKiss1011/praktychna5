public class Main {
    public static void main(String[] args) {
        // Константи
        double a = 4.5 * Math.pow(10, 4); // 4.5 * 10^4
        double b = -2 * Math.pow(10, 5);  // -2 * 10^5
        double c = 25;

        // Розрахунок x
        double x = (1 + Math.pow(Math.tan(a / 2), 2)) * Math.sqrt(Math.abs(b) + c);

        // Розрахунок y
        double y = 2 * (1 / Math.tan(a / Math.abs(b)));

        // Вивід результатів
        System.out.println("Значення x: " + x);
        System.out.println("Значення y: " + y);
    }
}