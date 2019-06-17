
package Jogao;

import TelaLogin.TelaLogin;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
/**
 *
 * @author Markinho
 */
public class VaiJogo {
      
        /*Metodo de tocar musica*/
        public URL som = VaiJogo.class.getResource("BOTW.wav");//caminho pra pegar a musica        
        public AudioClip som1 = Applet.newAudioClip(som);//Metodo que chama
        /*----FIM MEOTODO----*/
        
        
   public static void main (String[]Args){
       TelaLogin vai = new TelaLogin();//chama a janela
       vai.setVisible(true);//mostra a janela
       vai.setLocationRelativeTo(null);
   }
}
