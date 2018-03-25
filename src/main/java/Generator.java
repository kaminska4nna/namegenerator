import java.util.Locale;
import java.util.Random;

public class Generator {
    public static void main(String[] args) {
        Random y = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String vowles ="eyuioa";
        String consonant = "qwrtpsdfghjklzxcvbnm";
        String randomLetter;

        final int N = 10;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String randomName2 =sb.append(alphabet.charAt(y.nextInt(alphabet.length()))).toString();

        String randomName = sb2.toString();
        if (randomName2.matches(vowles)){
          randomLetter =  sb2.append(consonant.charAt(y.nextInt(consonant.length()))).toString();

       }else {
           randomLetter= sb2.append(vowles.charAt(y.nextInt(vowles.length()))).toString();


        }



        System.out.println(randomName2.toUpperCase() +
                 randomLetter);



    }
}
