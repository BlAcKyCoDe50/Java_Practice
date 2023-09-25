public class Hello {
    public static void main(String[] args) throws InterruptedException {
        String text = "Welcome To Courier Management System";
        int delay = 500; // Delay between each character (in milliseconds)
        
        for (int i = 0; i < text.length(); i++) {
            Thread.sleep(delay);
            System.out.print("\r" + text.substring(0, i+1));
        }
    }
}
