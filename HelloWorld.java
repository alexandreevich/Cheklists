public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Привет из Java!");
        try {
            Thread.sleep(10000);  // Задержка на 10 секунд для теста памяти
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
