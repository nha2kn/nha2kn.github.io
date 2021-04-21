
package alphabeticalcipher;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import org.apache.commons.lang3.RandomStringUtils;

public class AlphabeticalCipher {

public static char normalChar[]
        = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
            's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };   
    public static String generate = new String();
   public static String randomAlphaNumeric() {
        String r = RandomStringUtils.random(26, normalChar);
        return r;
    }
       
public static String enCrypt(String s){
    String result = "";
    for (int i = 0; i < s.length(); i++) {
        for (int j = 0; j <s.length() ; j++) {
            if(s.charAt(i)==s.charAt(j)){
                result += generate.charAt(j);
                break;
            }
            if(s.charAt(i)<'a'||s.charAt(i)>'z'){
                result += s.charAt(i);
                break;
            }
    }
    }
    return result;
}

    public static void main(String[] args) {
        
        generate = randomAlphaNumeric();
        System.out.println(generate);
        
        String s1="Live the moment";
        String re = enCrypt(s1);
        System.out.println(re);
}
}