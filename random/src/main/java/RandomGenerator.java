import java.security.SecureRandom;
import java.util.*;

public class RandomGenerator
{
    static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static SecureRandom rnd = new SecureRandom();

    public static String randomString( int len ){
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ )
            sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        return sb.toString();
    }

    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            System.out.println(randomString(35));
        }
    }

}