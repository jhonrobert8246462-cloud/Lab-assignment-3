// Encryptable.java
interface Encryptable {
    String encrypt(String data);
    String decrypt(String encryptedData);
}

// AES.java
class AES implements Encryptable {
    private int key = 3; // Simple Caesar Cipher-like key for demonstration

    @Override
    public String encrypt(String data) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : data.toCharArray()) {
            encrypted.append((char)(c + key)); // Simple shift
        }
        return encrypted.toString();
    }

    @Override
    public String decrypt(String encryptedData) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : encryptedData.toCharArray()) {
            decrypted.append((char)(c - key)); // Reverse shift
        }
        return decrypted.toString();
    }
}

// RSA.java
class RSA implements Encryptable {
    private int key = 7; // Simple shift key for demonstration

    @Override
    public String encrypt(String data) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : data.toCharArray()) {
            encrypted.append((char)(c * key % 256)); // Simple modular multiplication
        }
        return encrypted.toString();
    }

    @Override
    public String decrypt(String encryptedData) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : encryptedData.toCharArray()) {
            // Reverse modular operation (for demonstration only, not real RSA)
            int original = 0;
            for (int i = 0; i < 256; i++) {
                if ((i * key) % 256 == (int)c) {
                    original = i;
                    break;
                }
            }
            decrypted.append((char)original);
        }
        return decrypted.toString();
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        String data = "HelloWorld";

        Encryptable aes = new AES();
        String aesEncrypted = aes.encrypt(data);
        String aesDecrypted = aes.decrypt(aesEncrypted);

        System.out.println("AES Encryption: " + aesEncrypted);
        System.out.println("AES Decryption: " + aesDecrypted);

        Encryptable rsa = new RSA();
        String rsaEncrypted = rsa.encrypt(data);
        String rsaDecrypted = rsa.decrypt(rsaEncrypted);

        System.out.println("RSA Encryption: " + rsaEncrypted);
        System.out.println("RSA Decryption: " + rsaDecrypted);
    }
}
