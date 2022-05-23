package url_encorder;

import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.util.Base64; 
import java.util.Base64.Decoder; 
import java.util.Base64.Encoder;


public class Main {
    
    public static void main(String[] args) throws Exception  {
        SHA256 sha256 = new SHA256();
        
		
		  String password = "1234"; 
		  String cryptogram = sha256.encrypt(password);
//		  System.out.println(cryptogram.equals(sha256.encrypt(password)));
		 
        
        AES256 aes256 = new AES256();
       // String text = "!! Hello World !!";
        String cipherText = aes256.encrypt(cryptogram);
       System.out.println(cryptogram);
        System.out.println(cipherText);
       // System.out.println(aes256.decrypt(cipherText));
        
        String encodedString = Base64.getEncoder().encodeToString(cipherText.getBytes());
        System.out.println(encodedString);
    }
    
}