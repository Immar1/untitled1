import java.net.http.HttpResponse;
import java.util.Arrays;

public class MessageCipher {
    Character[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q',
            'R','S','T','U','V','W','X','Y','Z',};

//    BOY
//    DQA

    public Character cipherLetter(char Letter){
        int position = Arrays.asList(alphabet).indexOf(Letter);
        if (position+2>=alphabet.length){
            position = Math.abs(alphabet.length-position-2);
//               26-25+2
        }else {
            position = position+2;
        }

        return alphabet[position];

    }

    public String cipherWord(String word){
        char[] wordCharacterArray = word.toCharArray();
        String cipherWord ="";

        for (int i=0;i<wordCharacterArray.length;i++) {
            cipherWord+=cipherLetter(wordCharacterArray[i]);
        }

        return cipherWord;

    }
}

