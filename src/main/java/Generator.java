import java.util.Locale;
import java.util.Random;

public class Generator {
    public static void main(String[] args) {
        Random r = new Random();
        Random y = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        final int N = 10;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();


        for (int i = 0; i < N; i++) {

            sb2.append(alphabet.charAt(y.nextInt(alphabet.length())));
        }
        String randomName = sb2.toString();

       String randomName2 =sb.append(alphabet.charAt(r.nextInt(alphabet.length()))).toString();


        System.out.println(randomName2.toUpperCase() +
                 randomName);



    }
}
