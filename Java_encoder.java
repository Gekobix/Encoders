// Libreria di terze parti importata da Apache
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Java_encoder {

    /**Converte una hex string in Base 64
     * @param args Hex String da convertire
     */
    public static void main(String[] args) {

        try {
            byte[] hex = Hex.decodeHex(args[0]); //Converte la hex string in un array di bytes
            byte[] encodedBytes = Base64.getEncoder().encode(hex); //Codifica l'array di bytes in Base64
            System.out.println(new String(encodedBytes, "UTF-8")); //Stampa l'array come una nuova stringa con lo standard UTF-8
        } catch (DecoderException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}
