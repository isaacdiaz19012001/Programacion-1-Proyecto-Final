package Desarrollo;

import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import javax.swing.ImageIcon;

public class DiamanteRojo{
    private static int x1=40,x2=720,x3=40,x4=1280,x5=1280,x6=600,x7=40,x8=960,x9=1080,x10=960;
    private static int y1=640,y2=400,y3=80,y4=640,y5=440,y6=240,y7=320,y8=200,y9=80,y10=640;
    
    public static boolean mo1=false,mo2=false,mo3=false,mo4=false,mo5=false;
    public static boolean mo6=false,mo7=false,mo8=false,mo9=false,mo10=false;
    
    private static int ancho=40;
    private static int alto=40;
    
     public void paint(Graphics grafico){
         
        if(TableroJuego.obtieneNivel()==1){
            
            if(mo1==false){
                ImageIcon m1 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m1.getImage(),x1,y1, ancho, alto,null);
                
            }if(mo1==true){
                x1=0;
                y1=0;
            }
            
            if(mo2==false){
                ImageIcon m2 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m2.getImage(),x2,y2, ancho, alto,null);
            }if(mo2==true){
                x2=0;
                y2=0;
            }    
            
            if(mo3==false){
                ImageIcon m3 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m3.getImage(),x3,y3, ancho, alto,null);
            }if(mo3==true){
                x3=0;
                y3=0;
            }
            
            if(mo4==false){
                ImageIcon m4 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m4.getImage(),x4,y4, ancho, alto,null);
            }if(mo4==true){
                x4=0;
                y4=0;
            }
            
            if(mo5==false){
                ImageIcon m5 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m5.getImage(),x5,y5, ancho, alto,null);
            }if(mo5==true){
               x5=0;
               y5=0;
            }  
            
            if(mo6==false){
                ImageIcon m6 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m6.getImage(),x6,y6, ancho, alto,null);
            }if(mo6==true){
               x6=0;
               y6=0;
            }    
            
            if(mo7==false){
                ImageIcon m7 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m7.getImage(),x7,y7, ancho, alto,null);
            }if(mo7==true){
               x7=0;
               y7=0;
            }    
            
            if(mo8==false){
                ImageIcon m8 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m8.getImage(),x8,y8, ancho, alto,null);
            }if(mo8==true){
               x8=0;
               y8=0;
            }    
            
            if(mo9==false){
                ImageIcon m9 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m9.getImage(),x9,y9, ancho, alto,null);
            }if(mo9==true){
               x9=0;
               y9=0;
            }    
            
            if(mo10==false){
                ImageIcon m10 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m10.getImage(),x10,y10, ancho, alto,null);
            }if(mo10==true){
               x10=0;
               y10=0;
            }
        }
        if(TableroJuego.obtieneNivel()==2){
           y5=400;
            
            if(mo1==false){
                ImageIcon m1 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m1.getImage(),x1,y1, ancho, alto,null);
            }if(mo1==true){
                x1=0;
                y1=0;
            }
            
            if(mo2==false){
                ImageIcon m2 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m2.getImage(),x2,y2, ancho, alto,null);
            }if(mo2==true){
                x2=0;
                y2=0;
            }    
            
            if(mo3==false){  
                ImageIcon m3 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m3.getImage(),x3,y3, ancho, alto,null);
            }if(mo3==true){
                x3=0;
                y3=0;
            }
            
            if(mo4==false){
                ImageIcon m4 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m4.getImage(),x4,y4, ancho, alto,null);
            }if(mo4==true){
                x4=0;
                y4=0;
            }
            
            if(mo5==false){
                ImageIcon m5 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m5.getImage(),x5,y5, ancho, alto,null);
            }if(mo5==true){
               x5=0;
               y5=0;
            }  
            
            if(mo6==false){
                ImageIcon m6 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m6.getImage(),x6,y6, ancho, alto,null);
            }if(mo6==true){
               x6=0;
               y6=0;
            }    
            
            if(mo7==false){
                ImageIcon m7 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m7.getImage(),x7,y7, ancho, alto,null);
            }if(mo7==true){
               x7=0;
               y7=0;
            }    
            
            if(mo8==false){
                ImageIcon m8 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m8.getImage(),x8,y8, ancho, alto,null);
            }if(mo8==true){
               x8=0;
               y8=0;
            }    
            
            if(mo9==false){
                ImageIcon m9 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m9.getImage(),x9,y9, ancho, alto,null);
            }if(mo9==true){
               x9=0;
               y9=0;
            }    
            
            if(mo10==false){
                ImageIcon m10 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m10.getImage(),x10,y10, ancho, alto,null);
            }if(mo10==true){
               x10=0;
               y10=0;
            }
        }  
        if(TableroJuego.obtieneNivel()==3){
              if(mo1==false){
                ImageIcon m1 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m1.getImage(),x1,y1, ancho, alto,null);
            }if(mo1==true){
                x1=0;
                y1=0;
            }
            
            if(mo2==false){
                ImageIcon m2 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m2.getImage(),x2,y2, ancho, alto,null);
            }if(mo2==true){
                x2=0;
                y2=0;
            }    
            
            if(mo3==false){
                ImageIcon m3 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m3.getImage(),x3,y3, ancho, alto,null);
            }if(mo3==true){
                x3=0;
                y3=0;
            }
            
            if(mo4==false){
                ImageIcon m4 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m4.getImage(),x4,y4, ancho, alto,null);
            }if(mo4==true){
                x4=0;
                y4=0;
            }
            
            if(mo5==false){
                ImageIcon m5 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m5.getImage(),x5,y5, ancho, alto,null);
            }if(mo5==true){
               x5=0;
               y5=0;
            }  
            
            if(mo6==false){
                ImageIcon m6 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m6.getImage(),x6,y6, ancho, alto,null);
            }if(mo6==true){
               x6=0;
               y6=0;
            }    
            
            if(mo7==false){
                ImageIcon m7 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m7.getImage(),x7,y7, ancho, alto,null);
            }if(mo7==true){
               x7=0;
               y7=0;
            }    
            
            if(mo8==false){
                ImageIcon m8 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m8.getImage(),x8,y8, ancho, alto,null);
            }if(mo8==true){
               x8=0;
               y8=0;
            }    
            
            if(mo9==false){
                ImageIcon m9 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m9.getImage(),x9,y9, ancho, alto,null);
            }if(mo9==true){
               x9=0;
               y9=0;
            }    
            
            if(mo10==false){
                ImageIcon m10 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m10.getImage(),x10,y10, ancho, alto,null);
            }if(mo10==true){
               x10=0;
               y10=0;
            }
        } 
        if(TableroJuego.obtieneNivel()==4){
                x3=320;
              if(mo1==false){
                ImageIcon m1 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m1.getImage(),x1,y1, ancho, alto,null);
            }if(mo1==true){
                x1=0;
                y1=0;
            }
            
            if(mo2==false){
                ImageIcon m2 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m2.getImage(),x2,y2, ancho, alto,null);
            }if(mo2==true){
                x2=0;
                y2=0;
            }    
            
            if(mo3==false){
                ImageIcon m3 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m3.getImage(),x3,y3, ancho, alto,null);
            }if(mo3==true){
                x3=0;
                y3=0;
            }
            
            if(mo4==false){
                ImageIcon m4 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m4.getImage(),x4,y4, ancho, alto,null);
            }if(mo4==true){
                x4=0;
                y4=0;
            }
            
            if(mo5==false){
                ImageIcon m5 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m5.getImage(),x5,y5, ancho, alto,null);
            }if(mo5==true){
               x5=0;
               y5=0;
            }  
            
            if(mo6==false){
                ImageIcon m6 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m6.getImage(),x6,y6, ancho, alto,null);
            }if(mo6==true){
               x6=0;
               y6=0;
            }    
            
            if(mo7==false){
                ImageIcon m7 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m7.getImage(),x7,y7, ancho, alto,null);
            }if(mo7==true){
               x7=0;
               y7=0;
            }    
            
            if(mo8==false){
                ImageIcon m8 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m8.getImage(),x8,y8, ancho, alto,null);
            }if(mo8==true){
               x8=0;
               y8=0;
            }    
            
            if(mo9==false){
                ImageIcon m9 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m9.getImage(),x9,y9, ancho, alto,null);
            }if(mo9==true){
               x9=0;
               y9=0;
            }    
            
            if(mo10==false){
                ImageIcon m10 = new ImageIcon(getClass().getResource("../images/mapas/diamond_red.png"));
                grafico.drawImage(m10.getImage(),x10,y10, ancho, alto,null);
            }if(mo10==true){
               x10=0;
               y10=0;
            }
        }
        
        
     }
     
    public Ellipse2D getBoundsD1(){
        return new Ellipse2D.Double(x1, y1,ancho,alto);
    }
    public Ellipse2D getBoundsD2(){
        return new Ellipse2D.Double(x2, y2,ancho,alto);
    }
    public Ellipse2D getBoundsD3(){
        return new Ellipse2D.Double(x3, y3,ancho,alto);
    }
    public Ellipse2D getBoundsD4(){
        return new Ellipse2D.Double(x4, y4,ancho,alto);
    }
    public Ellipse2D getBoundsD5(){
        return new Ellipse2D.Double(x5, y5,ancho,alto);
    }  
    public Ellipse2D getBoundsD6(){
        return new Ellipse2D.Double(x6, y6,ancho,alto);
    }
    public Ellipse2D getBoundsD7(){
        return new Ellipse2D.Double(x7, y7,ancho,alto);
    }
    public Ellipse2D getBoundsD8(){
        return new Ellipse2D.Double(x8, y8,ancho,alto);
    }
    public Ellipse2D getBoundsD9(){
        return new Ellipse2D.Double(x9, y9,ancho,alto);
    }
    public Ellipse2D getBoundsD10(){
        return new Ellipse2D.Double(x10, y10,ancho,alto);
    }
}
