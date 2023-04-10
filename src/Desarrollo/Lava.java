package Desarrollo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import javax.swing.ImageIcon;

public class Lava {
    private static int x1=1040,x2=1080,x3=720,x4=1080,x5=1160,x6=600,x7=120,x8=440,x9=800,x10=180;
    private static int y1=640,y2=640,y3=120,y4=400,y5=360,y6=520,y7=240,y8=320,y9=680,y10=600;
     
    private static int ancho=40;
    private static int alto=40;

    public void paint(Graphics g){
         if(TableroJuego.obtieneNivel()==2){
            x1=920;
            y1=400;
            x2=800;
            y2=400;
            x5=280;
            y5=120;
         }
        if(TableroJuego.obtieneNivel()==3){
            x1=0;x2=0;x3=0;x4=0;x5=0;x6=0;x7=0;x8=0;x9=0;x10=0;
            y1=0;y2=0;y3=0;y4=0;y5=0;y6=0;y7=0;y8=0;y9=0;y10=0;
            ancho=0;
            alto=0;
         }
        
        if(TableroJuego.obtieneNivel()==4 || TableroJuego.obtieneNivel()==5 ){
            x1=1040;x2=1080;x3=720;x4=1080;x5=1160;x6=600;x7=120;x8=440;x9=800;x10=180;
            y1=640;y2=640;y3=120;y4=400;y5=360;y6=520;y7=240;y8=320;y9=680;y10=600;
            ancho=40;
            alto=40;
        }
        
        ImageIcon m1 = new ImageIcon(getClass().getResource("../images/mapas/fire.png"));
        g.drawImage(m1.getImage(),x1,y1, ancho, alto,null);
        
        ImageIcon m2 = new ImageIcon(getClass().getResource("../images/mapas/fire.png"));
        g.drawImage(m2.getImage(),x2,y2, ancho, alto,null);
        
        ImageIcon m3 = new ImageIcon(getClass().getResource("../images/mapas/fire.png"));
        g.drawImage(m3.getImage(),x3,y3, ancho, alto,null);
        
        ImageIcon m4 = new ImageIcon(getClass().getResource("../images/mapas/fire.png"));
        g.drawImage(m4.getImage(),x4,y4, ancho, alto,null);
        
        ImageIcon m5 = new ImageIcon(getClass().getResource("../images/mapas/fire.png"));
        g.drawImage(m5.getImage(),x5,y5, ancho, alto,null);
        
        ImageIcon m6 = new ImageIcon(getClass().getResource("../images/mapas/fire.png"));
        g.drawImage(m6.getImage(),x6,y6, ancho, alto,null);
        
        ImageIcon m7 = new ImageIcon(getClass().getResource("../images/mapas/fire.png"));
        g.drawImage(m7.getImage(),x7,y7, ancho, alto,null);
        
        ImageIcon m8 = new ImageIcon(getClass().getResource("../images/mapas/fire.png"));
        g.drawImage(m8.getImage(),x8,y8, ancho, alto,null);
        
        ImageIcon m9 = new ImageIcon(getClass().getResource("../images/mapas/fire.png"));
        g.drawImage(m9.getImage(),x9,y9, ancho, alto,null);
        
        ImageIcon m10 = new ImageIcon(getClass().getResource("../images/mapas/fire.png"));
        g.drawImage(m10.getImage(),x10,y10, ancho, alto,null);
       
    }
  public Ellipse2D getBoundsF1(){
        return new Ellipse2D.Double(x1, y1-5,ancho,alto+3);
    }
    public Ellipse2D getBoundsF2(){
        return new Ellipse2D.Double(x2, y2-5,ancho,alto+3);
    }
    public Ellipse2D getBoundsF3(){
        return new Ellipse2D.Double(x3, y3-5,ancho,alto+3);
    }
    public Ellipse2D getBoundsF4(){
        return new Ellipse2D.Double(x4, y4-5,ancho,alto+3);
    }
    public Ellipse2D getBoundsF5(){
        return new Ellipse2D.Double(x5, y5-5,ancho,alto+3);
    }  
    public Ellipse2D getBoundsF6(){
        return new Ellipse2D.Double(x6, y6-5,ancho,alto+3);
    }
    public Ellipse2D getBoundsF7(){
        return new Ellipse2D.Double(x7, y7-5,ancho,alto+3);
    }
    public Ellipse2D getBoundsF8(){
        return new Ellipse2D.Double(x8, y8-5,ancho,alto+3);
    }
    public Ellipse2D getBoundsF9(){
        return new Ellipse2D.Double(x9, y9-5,ancho,alto+3);
    }
    public Ellipse2D getBoundsF10(){
        return new Ellipse2D.Double(x10, y10-5,ancho,alto+3);
    }
}
