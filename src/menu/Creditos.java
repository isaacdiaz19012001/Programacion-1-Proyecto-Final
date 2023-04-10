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

public class Creditos extends JPanel{
     private JButton b;
     private int y1=900,y2=950,y3=1000,y4=1050,y5=1100,y6=1300,y7=1500,y8=1550,y9=1600,y10=1650;
     private int y11=1700,y12=700;
     AudioClip boton=java.applet.Applet.newAudioClip(getClass().getResource("../sonidos/botones.wav"));
            
    public Creditos(){
        iniciarComponentes();
        setLayout(null);
     }
      
   @Override
     public void paint(Graphics g){
        ImageIcon fondo = new ImageIcon(getClass().getResource("../images/menu/background.jpg"));
        g.drawImage(fondo.getImage(),0,0,2060,750,null); 
 //-----------------------------------------------------------------------------------------        
        ImageIcon logoUnet = new ImageIcon(getClass().getResource("../images/menu/unet.png"));
        g.drawImage(logoUnet.getImage(),700,y12,150,150,null); 
 //-----------------------------------------------------------------------------------------
        g.setColor(Color.black);
        g.setFont(new Font("Arial Black",0,30));
        g.drawString("UNIVERSIDAD NACIONAL EXPERIMENTAL DEL TÁCHIRA",300,y1);
//-----------------------------------------------------------------------------------------        
        g.setColor(Color.black);
        g.setFont(new Font("Arial Black",0,30));
        g.drawString("VICERRECTORADO ACADÉMICO",500,y2);
//-----------------------------------------------------------------------------------------        
        g.setColor(Color.black);
        g.setFont(new Font("Arial Black",0,30));
        g.drawString("DECANATO DE DOCENCIA",550,y3);
 //----------------------------------------------------------------------------------------- 
        g.setColor(Color.black);
        g.setFont(new Font("Arial Black",0,30));
        g.drawString("DEPARTAMENTO DE INGENIERÍA INFORMÁTICA",380,y4);
//-----------------------------------------------------------------------------------------        
        g.setColor(Color.black);
        g.setFont(new Font("Arial Black",0,30));
        g.drawString("Unidad Curricular 0416202T-Programación I",420,y5);
 //-----------------------------------------------------------------------------------------
        g.setColor(Color.black);
        g.setFont(new Font("Arial Black",0,80));
        g.drawString("Proyecto Final",460,y6);
//-----------------------------------------------------------------------------------------        
        g.setColor(Color.black);
        g.setFont(new Font("Arial Black",0,30));
        g.drawString("Autor: Díaz Mora Isaac",590,y7);
 //-----------------------------------------------------------------------------------------
        g.setColor(Color.black);
        g.setFont(new Font("Arial Black",0,30));
        g.drawString("Cedula: 29.699.350",600,y8);
//-----------------------------------------------------------------------------------------        
        g.setColor(Color.black);
        g.setFont(new Font("Arial Black",0,30));
        g.drawString("Sección: 3",680,y9);
 //-----------------------------------------------------------------------------------------
        g.setColor(Color.black);
        g.setFont(new Font("Arial Black",0,30));
        g.drawString("Profesora: Yeniffer Peña",580,y10);
 //-----------------------------------------------------------------------------------------
        g.setColor(Color.black);
        g.setFont(new Font("Arial Black",0,30));
        g.drawString("San Cristóbal,Abril de 2023",575,y11);
 //-----------------------------------------------------------------------------------------
        y1-=15;
        y2-=15;
        y3-=15;
        y4-=15;
        y5-=15;
        y6-=15;
        y7-=15;
        y8-=15;
        y9-=15;
        y10-=15;
        y11-=15;
        y12-=15;
        
        if(y11<0){
            y1=900;
            y2=950;
            y3=1000;
            y4=1050;
            y5=1100;
            y6=1300;
            y7=1500;
            y8=1550;
            y9=1600;
            y10=1650;
            y11=1700;
            y12=700;
        }
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
