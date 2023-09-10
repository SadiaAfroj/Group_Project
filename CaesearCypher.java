

public class CaesearCypher {
    private static final int ALPHABET_SIZE = 26;

    // Method to encrypt a message using the Caesar cipher
    public static String encrypt(String message, int key) {
        StringBuilder encryptedMessage = new StringBuilder();
    
        for (char character : message.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isUpperCase(character) ? 'A' : 'a';
                char shiftedChar = (char) ((character - base + key + ALPHABET_SIZE) % ALPHABET_SIZE + base);
                encryptedMessage.append(shiftedChar);
            } else {
                encryptedMessage.append(character);
            }
        }
    
        return encryptedMessage.toString();
    }

    // Method to decrypt a message encrypted with the Caesar cipher
    public static String decrypt(String encryptedMessage, int key) {
        return encrypt(encryptedMessage, -key);
    }

    
}
