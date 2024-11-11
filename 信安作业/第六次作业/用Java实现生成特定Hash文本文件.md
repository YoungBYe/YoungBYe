package HashGenerator;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashGenerator {
    public static void main(String[] args) {
        int leadingZeros = 1; //以1开始
        String content = generateContentWithLeadingZeros(leadingZeros);
        System.out.println("Content: " + content);
        System.out.println("Hash: " + calculateSHA256(content));
    }

    private static String generateContentWithLeadingZeros(int leadingZeros) {
        int count = 0;
        String prefix = "";
        for (int i = 0; i < leadingZeros; i++) {
            prefix += "0";
        }
        while (true) {
            String content = prefix + count;
            String hash = calculateSHA256(content);
            if (hash.startsWith(prefix)) {
                return content;
            }
            count++;
        }
    }

    private static String calculateSHA256(String content) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(content.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
