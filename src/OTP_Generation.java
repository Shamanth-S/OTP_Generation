import java.util.Random;

public class OTP_Generation {
    public static void main(String[] args) {
        String OTP = generate();

        System.out.println("Generated OTP: " + OTP);
    }

    static String generate() {
        Random random = new Random();
        StringBuilder OTP = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            OTP.append(random.nextInt(10));
        }

        return OTP.toString();
    }
}
