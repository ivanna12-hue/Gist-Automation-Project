package utils;

import java.util.Random;
import java.util.UUID;

public class Utils {

    public static String generateRandomTitle() {
        // Ambil 8 karakter pertama dari UUID
        return "Title-" + UUID.randomUUID().toString().substring(0, 8);
    }

    public static int getRandomTwoDigit() {
        return new Random().nextInt(90) + 10;  // 10–99
    }

    public static String getCategoryName() {
        return "category" + getRandomTwoDigit();
    }

    public int randomNum = new Random().nextInt(99999);
    String randomPassword = "wrongPass" + randomNum;
}
