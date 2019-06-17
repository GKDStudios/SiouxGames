
package Jogao;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import java.awt.Robot;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Markinho
 */
public class Principal extends JFrame {
        /*para o background*/
        ImageIcon iconBackground = new ImageIcon(getClass().getResource("background.gif"));
        JLabel lBackground = new JLabel(iconBackground);
        
        /*Sprite inimigo*/
        ImageIcon iconMxini = new ImageIcon(getClass().getResource("Skeleton Walk.gif"));
        ImageIcon iconMxTras = new ImageIcon(getClass().getResource("Skeleton-Anda-para-tras.gif"));
        JLabel lParadinho = new JLabel(iconMxini);
       
        /*Sprite do Personagem*/
        ImageIcon iconMexe = new ImageIcon(getClass().getResource("correndo.gif"));
        ImageIcon iconParado = new ImageIcon(getClass().getResource("parado3.gif"));
        ImageIcon iconPula = new ImageIcon(getClass().getResource("pulo.gif"));
        ImageIcon iconTras = new ImageIcon(getClass().getResource("Correndoparatras.gif"));
        ImageIcon iconAgaixa = new ImageIcon(getClass().getResource("agaxado.gif"));
        ImageIcon iconTrasP = new ImageIcon(getClass().getResource("ParadoInvertido.gif"));
        JLabel lParado = new JLabel(iconParado);
        /*Posição personagem*/
        int posX = 0;
        int posY = 18;
        protected int posXini = 465; //Posição X do inimigo
        protected int posYini = 18;
        
        /*Metodo para gravidade*/
        Robot gravidade; 
        /*Aonde vai rodar tudo*/
        
        public class MovimentoInimigo extends Thread {
            public void run(){
                while(true){
                    try{sleep(200);}catch(Exception erro){}
                    lParadinho.setBounds(lParadinho.getX()+4, 18, 30, 444);
                    try{sleep(200);}catch(Exception erro){}
                    lParadinho.setBounds(lParadinho.getX()+4, 18, 30, 444);
                    try{sleep(200);}catch(Exception erro){}
                    lParadinho.setBounds(lParadinho.getX()+4, 18, 30, 444);
                    try{sleep(200);}catch(Exception erro){}
                    lParadinho.setBounds(lParadinho.getX()+4, 18, 30, 444);
                    try{sleep(200);}catch(Exception erro){}
                    lParadinho.setBounds(lParadinho.getX()+4, 18, 30, 444);
                    try{sleep(200);}catch(Exception erro){}
                    lParadinho.setBounds(lParadinho.getX()+4, 18, 30, 444);
                    try{sleep(200);}catch(Exception erro){}
                    lParadinho.setBounds(lParadinho.getX()+4, 18, 30, 444);
                    try{sleep(200);}catch(Exception erro){}
                    lParadinho.setBounds(lParadinho.getX()+4, 18, 30, 444);
                    try{sleep(200);}catch(Exception erro){}
                    lParadinho.setBounds(lParadinho.getX()+4, 18, 30, 444);
                    try{sleep(200);}catch(Exception erro){}
                    lParadinho.setBounds(lParadinho.getX()+4, 18, 30, 444);
                    try{sleep(200);}catch(Exception erro){}
                    lParadinho.setBounds(lParadinho.getX()+4, 18, 30, 444);
                    try{sleep(200);}catch(Exception erro){}
                    lParadinho.setBounds(lParadinho.getX()+4, 18, 30, 444);
                    try{sleep(200);}catch(Exception erro){}
                    lParadinho.setBounds(lParadinho.getX()+4, 18, 30, 444);
                    try{sleep(200);}catch(Exception erro){}
                    lParadinho.setIcon(iconMxTras);
                    lParadinho.setBounds(lParadinho.getX()-4, 18, 30, 444);
                    try{sleep(200);}catch(Exception erro){}
                    lParadinho.setBounds(lParadinho.getX()-4, 18, 30, 444);
                    try{sleep(200);}catch(Exception erro){}                
                    lParadinho.setBounds(lParadinho.getX()-4, 18, 30, 444);
                    try{sleep(200);}catch(Exception erro){}
                    lParadinho.setBounds(lParadinho.getX()-4, 18, 30, 444);
                    try{sleep(200);}catch(Exception erro){}
                    lParadinho.setBounds(lParadinho.getX()-4, 18, 30, 444);
                    try{sleep(200);}catch(Exception erro){}
                    lParadinho.setBounds(lParadinho.getX()-4, 18, 30, 444);
                      try{sleep(200);}catch(Exception erro){}
                    lParadinho.setBounds(lParadinho.getX()-4, 18, 30, 444);
                      try{sleep(200);}catch(Exception erro){}
                    lParadinho.setBounds(lParadinho.getX()-4, 18, 30, 444);
                      try{sleep(200);}catch(Exception erro){}
                    lParadinho.setBounds(lParadinho.getX()-4, 18, 30, 444);
                      try{sleep(200);}catch(Exception erro){}
                    lParadinho.setBounds(lParadinho.getX()-4, 18, 30, 444);
                      try{sleep(200);}catch(Exception erro){}
                    lParadinho.setBounds(lParadinho.getX()-4, 18, 30, 444);
                      try{sleep(200);}catch(Exception erro){}
                    lParadinho.setBounds(lParadinho.getX()-4, 18, 30, 444);
                      try{sleep(200);}catch(Exception erro){}
                    lParadinho.setBounds(lParadinho.getX()-4, 18, 30, 444);
                    lParadinho.setIcon(iconMxini);

                }
            }
                
        }
        
        
        
        public Principal(){
            
            try {
                this.gravidade = new Robot();//gravidade
            } catch (AWTException ex) {//gravidade
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);//gravidade
            }
         editarComponentes();//Componentes
         editarJanela();//JFrame do app
         adcMovimento(); //Adc movimentos do personagem
         new MovimentoInimigo().start();
        }
        
        
        public void editarJanela(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);//fecha a tela
        setSize(560, 300);//tamanho da tela
        setLocationRelativeTo(null);//local na tela vulgo meio
        setLayout(null);//não sei pra que serve
        setResizable(false);//deixa a tela sem aumentar o tamanho
        setTitle("Sioux");//titulo
        add(lParado);//personagem
        add(lParadinho);
        add(lBackground);//background
        setVisible(true);//visivel ou não
        setIconImage(new ImageIcon(getClass().getResource("IconJFrame.png")).getImage());//Icone da Janela
        VaiJogo tocar = new VaiJogo();//metodo que chama a musica
        tocar.som1.play();//toca a musica
        }
        
        public void editarComponentes(){
        lBackground.setBounds(0, 0, 560, 274);//localização do background
        lParado.setBounds(posX, posY, 10, 444);//Localização do personagem
        lParadinho.setBounds(posXini, posYini, 30, 444);//Localização do inimigo
        }
            
           
            public void adcMovimento(){//Adicionando o Movimento
                
                
                
             addKeyListener(new KeyListener(){
                 public void keyTyped(KeyEvent e){}
                 public void keyReleased(KeyEvent e) {
                     lParado.setIcon(iconParado);//Quando parado fica parado
                 }
                 
                 public void keyPressed(KeyEvent e) {
                     lParado.setIcon(iconMexe);//Quando está andando
                     /*Metodo para fazer o personagem andar pelo mapa*/
                     if (e.getKeyCode()==38){
                     lParado.setIcon(iconPula);//Quando pula
                        posY -=8;// pula
                        gravidade.delay(30);//gravidade
                        posY +=8;//volta para o local do pulo
                     }
                     if (e.getKeyCode()==40){
                     lParado.setIcon(iconAgaixa);//agaixa
                        posY +=4;
                        gravidade.delay(30);//gravidade quando agaixa
                        posY -=4;
                     }
                     if (e.getKeyCode()==37){
                     lParado.setIcon(iconTras);    
                        posX -=4;
                     } 
                     if (e.getKeyCode()==39){
                        posX +=4;//direita
                     } 
                     lParado.setBounds(posX, posY, 20, 444);
                 }
                        /*Fim do metodo para mexer o personagem*/
                 
                 
                 
   
             });  
            
        }

 
    

}