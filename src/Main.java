//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello from Main class! \n");

        // call static method Regards
        Regards();

        // create a new instance of the Main class to call non-static methods
        Main main = new Main();
        main.Goodbye();

        // custom message
        main.Message("Hello, this is a custom message");

    }

    public void Message(String message) {
        System.out.println(message);
    }

    // static method
    public static void Regards() {
        System.out.printf("Hello from method Regards! \n");
    }

    // non-static method
    public void Goodbye() {
        System.out.printf("Goodbye! Take care!\n");
    }
}