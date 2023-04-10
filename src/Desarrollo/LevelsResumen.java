package Desarrollo;

import static Desarrollo.TableroJuego.minutos;
import static Desarrollo.TableroJuego.segundos;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class LevelsResumen extends JPanel{
     private JButton b1;
     AudioClip boton=java.applet.Applet.newAudioClip(getClass().getResource("../sonidos/botones.wav"));
     
      public LevelsResumen(){
        iniciarComponentes();
        setLayout(null);
     } 
      
      @Override
     public void paint(Graphics g){
          
         
        if(TableroJuego.nivel==2){
            ImageIcon fondo1 = new ImageIcon(getClass().getResource("../images/mapas/ocean.png"));
            g.drawImage(fondo1.getImage(),0,0,2060,750,null);
            
            g.setColor(Color.white);
            g.setFont(new Font("Arial black",0,60));
            g.drawString("Resumen del Nivel 1: ",360,80);
            
            g.setColor(Color.white);
            g.setFont(new Font("Arial black",0,40));
            g.drawString("Diamantes Recogidos: "+TableroJuego.cantidadD,150,300);
            
            g.setColor(Color.white);
            g.setFont(new Font("Arial black",0,40));
            g.drawString("Tiempo  "+minutos+":"+segundos,150,450);
        }
        
         if(TableroJuego.nivel==3){
            ImageIcon fondo2 = new ImageIcon(getClass().getResource("../images/mapas/cave2.jpg"));
            g.drawImage(fondo2.getImage(),0,0,2060,750,null);
            
            g.setColor(Color.white);
            g.setFont(new Font("Arial black",0,60));
            g.drawString("Resumen del Nivel 2: ",360,100);
            
            g.setColor(Color.white);
            g.setFont(new Font("Arial black",0,40));
            g.drawString("Diamantes Recogidos: "+TableroJuego.cantidadD,150,300);
            
            g.setColor(Color.white);
            g.setFont(new Font("Arial black",0,40));
            g.drawString("Tiempo  "+minutos+":"+segundos,150,450);
        }
         
          if(TableroJuego.nivel==4){
            ImageIcon fondo3 = new ImageIcon(getClass().getResource("../images/mapas/artic.jpg"));
            g.drawImage(fondo3.getImage(),0,0,2060,750,null);
            
            g.setColor(Color.black);
            g.setFont(new Font("Arial black",0,60));
            g.drawString("Resumen del Nivel 3: ",360,100);
            
            g.setColor(Color.black);
            g.setFont(new Font("Arial black",0,40));
            g.drawString("Diamantes Recogidos: "+TableroJuego.cantidadD,150,300);
            
            g.setColor(Color.black);
            g.setFont(new Font("Arial black",0,40));
            g.drawString("Tiempo  "+minutos+":"+segundos,150,450);
        }
          
           if(TableroJuego.nivel==5){
            ImageIcon fondo4 = new ImageIcon(getClass().getResource("../images/mapas/artic_dark.jpg"));
            g.drawImage(fondo4.getImage(),0,0,2060,750,null);
            
            g.setColor(Color.white);
            g.setFont(new Font("Arial black",0,60));
            g.drawString("Resumen del Nivel 4: ",360,100);
            
            g.setColor(Color.white);
            g.setFont(new Font("Arial black",0,40));
            g.drawString("Diamantes Recogidos: "+TableroJuego.cantidadD,150,300);
            
            g.setColor(Color.white);
            g.setFont(new Font("Arial black",0,40));
            g.drawString("Tiempo  "+minutos+":"+segundos,150,450);
        }
           setOpaque(false);
           super.paint(g);
    }
     
     public void iniciarComponentes(){
         botones();
         mouselistener(); 
      }
      
     public void botones() {
        b1 = new JButton();
        b1.setBounds(500,650,300,50);
        b1.setText("Next -->");
        b1.setFont(new Font("arial black",0,25));
        
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        
        if(TableroJuego.nivel==1 || TableroJuego.nivel==3 || TableroJuego.nivel==5){
            b1.setBackground(Color.white);
            b1.setForeground(Color.black);
        }
      
       
     
        add(b1);
    }
     public void mouselistener() { 
        MouseListener ml = new MouseListener(){
              @Override
              public void mouseClicked(MouseEvent e) {
                  boton.play();
                  principal.Principal.worldmap=true;
                  TableroJuego.cantidadD=0;
                  principal.Principal.cambionivel=true; 
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
    }
      
}

