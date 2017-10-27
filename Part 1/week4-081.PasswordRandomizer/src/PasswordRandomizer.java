import java.util.Random;

public class PasswordRandomizer {
    private int lenght;
    private Random stats = new Random();

    public PasswordRandomizer(int length) {
        this.lenght = length;
    }

    public String createPassword() {
        String password = "";
        String alphabet = "qwertyuiopsdfghjklzxcvbnm";
        for (int i = 0 ; i < this.lenght ; i++){
            password += alphabet.charAt(stats.nextInt(alphabet.length()));
        }
        return password;
    }
}
