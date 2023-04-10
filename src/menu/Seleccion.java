package menu;

import java.applet.AudioClip;
import principal.Principal;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Seleccion extends JPanel {
    
     private JButton b1,b2;
     public static JTextField c1= new JTextField();
     public static JRadioButton rb1 = new JRadioButton("Opcion 1",true);
     public static JRadioButton rb2 = new JRadioButton("Opcion 2",false);
     AudioClip sonido1=java.applet.Applet.newAudioClip(getClass().getResource("../sonidos/personaje1.wav"));
     AudioClip sonido2=java.applet.Applet.newAudioClip(getClass().getResource("../sonidos/personaje2.wav"));
     AudioClip boton=java.applet.Applet.newAudioClip(getClass().getResource("../sonidos/botones.wav"));

     public Seleccion(){
        iniciarComponentes();
        setLayout(null);
        
     }
     
      @Override
     public void paint(Graphics g){
        ImageIcon fondo = new ImageIcon(getClass().getResource("../images/menu/background.jpg"));
        g.drawImage(fondo.getImage(),0,0,2060,750,null);
        
        ImageIcon Pagua = new ImageIcon(getClass().getResource("../images/menu/tux.png"));
        g.drawImage(Pagua.getImage(),400,300,200,200,null);
        
        ImageIcon Pfuego = new ImageIcon(getClass().getResource("../images/menu/firetux.png"));
        g.drawImage(Pfuego.getImage(),750,300,200,200,null);
        
        g.setColor(Color.black);
        g.setFont(new Font("Arial black",0,40));
        g.drawString("Ingrese su nombre: ",100,107);
        
        g.setColor(Color.black);
        g.setFont(new Font("Arial black",0,40));
        g.drawString("Seleccione su personaje: ",400,200);
        
        g.setColor(Color.black);
        g.setFont(new Font("Arial black",0,25));
        g.drawString("Pinguino de Agua: ",395,285);
        
        g.setColor(Color.black);
        g.setFont(new Font("Arial black",0,25));
        g.drawString("Pinguino de Fuego: ",745,285);
        
          setOpaque(false);
          super.paint(g);
        
     }
     
     public void iniciarComponentes(){
         seleccionarP();
         botones();
         ingresarNom();
         mouselistener(); 
     }

  
    public void seleccionarP() {
        
        rb1.setBounds(400, 500, 200, 50);
        rb1.setBackground(Color.black);
        rb1.setForeground(Color.white);
        rb1.setFont(new Font("arial black",0,25));
        add(rb1);
        
        
        rb2.setBounds(750, 500, 200, 50);
        rb2.setBackground(Color.black);
        rb2.setForeground(Color.white);
        rb2.setFont(new Font("arial black",0,25));
        add(rb2);
        
        ButtonGroup grb1 = new ButtonGroup();
        grb1.add(rb1);
        grb1.add(rb2);
    }
    
    
    public void ingresarNom() {

        c1.setBounds(530,80,800,30);
        c1.setBackground(Color.LIGHT_GRAY);
        c1.setFont(new Font("Arial black",0,25));
        add(c1);
   
    }
    
     public void botones() {
     
        b1 = new JButton();
        b1.setBounds(0,0,200,50);
        b1.setText("<-- Back");
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setFont(new Font("arial black",0,25));
        add(b1);
        
        b2 = new JButton();
        b2.setBounds(500,650,300,50);
        b2.setText("Next -->");
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setFont(new Font("arial black",0,25));
        add(b2);
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
          
          b1.addMouseListener(ml);
          
           MouseListener m2 = new MouseListener(){
              @Override
              public void mouseClicked(MouseEvent e){
                 boton.play();
                 Principal.worldmap=true; 
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
                  sonido1.play();
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
          
          rb1.addMouseListener(m3);
          
           MouseListener m4 = new MouseListener(){
              @Override
              public void mouseClicked(MouseEvent e){
                 sonido2.play();
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
          
          rb2.addMouseListener(m4);
    }
     
}
