package menu;

import java.applet.AudioClip;
import principal.Principal;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Instrucciones extends JPanel {
    private JButton b;
     AudioClip boton=java.applet.Applet.newAudioClip(getClass().getResource("../sonidos/botones.wav"));
            
    public Instrucciones(){
        iniciarComponentes(); 
        setLayout(null);
     }
    
   @Override
     public void paint(Graphics g){
        ImageIcon fondo = new ImageIcon(getClass().getResource("../images/menu/background.jpg"));
        g.drawImage(fondo.getImage(),0,0,2060,750,null); 
         
        g.setColor(Color.black);
        g.setFont(new Font("Arial black",0,60));
        g.drawString("Instrucciones: ",450,100);
//-----------------------------------Instruccion 1--------------------------------------        
        g.setColor(Color.black);
        g.setFont(new Font("Arial black",0,25));
        g.drawString("1. Los personajes se mueven a la derecha, a la izquierda y saltar",10,160);
//-----------------------------------Instruccion 2--------------------------------------       
        g.setColor(Color.black);
        g.setFont(new Font("Arial black",0,25));
        g.drawString("2. Para mover al pinguino de fuego use las teclas direccionales",10,220);
//-----------------------------------Instruccion 3--------------------------------------         
        g.setColor(Color.black);
        g.setFont(new Font("Arial black",0,25));
        g.drawString("3. Para mover al pinguino de agua use las teclas A,D,W ",10,280);
//-----------------------------------Instruccion 4--------------------------------------         
        g.setColor(Color.black);
        g.setFont(new Font("Arial black",0,25));
        g.drawString("4. El juego consta de 4 niveles y ganarás cuando pases los 4 niveles llegando así al castillo",10,340);
//-----------------------------------Instruccion 5--------------------------------------         
        g.setColor(Color.black);
        g.setFont(new Font("Arial black",0,25));
        g.drawString("5. Tienes 2 minutos para pasar cada nivel o perderás",10,400);
//-----------------------------------Instruccion 6--------------------------------------         
        g.setColor(Color.black);
        g.setFont(new Font("Arial black",0,25));
        g.drawString("6. Tienes que conseguir los 10 diamantes de fuego o de agua dependiendo del personaje elegido",10,460);
//-----------------------------------Instruccion 7--------------------------------------         
        g.setColor(Color.black);
        g.setFont(new Font("Arial black",0,25));
        g.drawString("7. Una vez conseguido los 10 diamantes debes llegar a la casita de hielo para pasar de nivel",10,520);
//-----------------------------------Instruccion 8--------------------------------------        
        g.setColor(Color.black);
        g.setFont(new Font("Arial black",0,25));
        g.drawString("8. También posees 3 vidas para pasar todo el juego",10,580);
  
//-----------------------------------Instruccion 9--------------------------------------         
        g.setColor(Color.black);
        g.setFont(new Font("Arial black",0,25));
        g.drawString("9. El pinguino de agua es inmune al fuego y no puede tomar los diamantes de fuego",10,640);
//-----------------------------------Instruccion 10--------------------------------------         
        g.setColor(Color.black);
        g.setFont(new Font("Arial black",0,25));
        g.drawString("10.  El pinguino de fuego es inmune al agua y no puede tomar los diamantes de agua",10,700);
//----------------------------------------------------------------------------------------        
        setOpaque(false);
        super.paint(g);
     }
     
    public void iniciarComponentes(){
         boton();
         mouselistener();
     }

     public void boton() {
     
        b = new JButton();

        b.setBounds(0,0,200,50);
        b.setText("<-- Back");
        b.setBackground(Color.black);
        b.setForeground(Color.white);
        b.setFont(new Font("arial black",0,25));
    
        add(b);
    }
     
      public void mouselistener() {
          MouseListener ml = new MouseListener(){
              @Override
              public void mouseClicked(MouseEvent e) {
                  boton.play();
                  Principal.menu=true;
              }

              @Override
              public void mousePressed(MouseEvent e) {}

              @Override
              public void mouseReleased(MouseEvent e) {}

              @Override
              public void mouseEntered(MouseEvent e) {}

              @Override
              public void mouseExited(MouseEvent e) {}
          };
          
          b.addMouseListener(ml);
    }
}
