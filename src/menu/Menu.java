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

public class Menu extends JPanel {
     private JButton b1,b2,b3,b4;
     AudioClip boton=java.applet.Applet.newAudioClip(getClass().getResource("../sonidos/botones.wav"));
     
     public Menu(){
        iniciarComponentes();
        setLayout(null);
     }
     
      @Override
     public void paint(Graphics g){
        ImageIcon fondo = new ImageIcon(getClass().getResource("../images/menu/background.jpg"));
        g.drawImage(fondo.getImage(),0,0,2060,750,null);
        
        ImageIcon titulo = new ImageIcon(getClass().getResource("../images/menu/logo.png"));
        g.drawImage(titulo.getImage(),315,40,700,350,null);
        
        setOpaque(false);
        super.paint(g);
        
     }
     
     public void iniciarComponentes(){
         opciones();
         mouselistener();
     }

    public void opciones() {
        //------------opcion 1: Iniciar---------------------   
        b1 = new JButton();

        b1.setBounds(415, 400, 500, 70);
        b1.setText("Start Game");
        b1.setForeground(Color.black);
        b1.setFont(new Font("cooper black",Font.ITALIC,40));
    
        add(b1);
        
         //------------opcion 2: Instrucciones---------------------   
        b2 = new JButton();
        
        b2.setBounds(415, 470, 500, 70);
        b2.setText("Instructions");
        b2.setForeground(Color.black);
        b2.setFont(new Font("cooper black",Font.ITALIC,40));
    
        add(b2);
        
         //------------opcion 3: Creditos---------------------   
        b3 = new JButton();
    
        b3.setBounds(415, 540, 500, 70);
        b3.setText("Credits");
        b3.setForeground(Color.black);
        b3.setFont(new Font("cooper black",Font.ITALIC,40));
    
        add(b3);
        
         //------------opcion 4: Salir---------------------   
        b4 = new JButton();
      
        b4.setBounds(415, 610, 500, 70);
        b4.setText("Exit");
        b4.setForeground(Color.black);
        b4.setFont(new Font("cooper black",Font.ITALIC,40));

        add(b4); 
    }
   
    public void mouselistener() {
        MouseListener m1 = new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                boton.play();
                Principal.opcion1=true;
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
        
        b1.addMouseListener(m1);
        
        MouseListener m2 = new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                boton.play();
                Principal.opcion2=true;
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
        
        b2.addMouseListener(m2);
        
         MouseListener m3 = new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                boton.play();
                Principal.opcion3=true;
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
        
        b3.addMouseListener(m3);
        
        MouseListener m4=new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                boton.play();
                Principal.opcion4=true;
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
        b4.addMouseListener(m4);
    }
    
}
