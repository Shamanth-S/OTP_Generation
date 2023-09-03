import java.util.Random;

public class OTP_Generation {
    public static void main(String[] args) {
        String otp = generate();

        System.out.println("Generated OTP: " + otp);
    }

    static String generate() {
        Random random = new Random();
        StringBuilder otp = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            otp.append(random.nextInt(10));
        }

        return otp.toString();
    }
}
