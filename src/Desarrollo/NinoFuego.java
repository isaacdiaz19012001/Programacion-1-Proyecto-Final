package Desarrollo;

import java.applet.AudioClip;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class NinoFuego {
    public static int x=40;
    public static int y=440;
    
    private final int ancho=40;
    private final int alto=40;
    private final int movimiento=20;
    private int izquierda=0,derecha=0,bandera=1;
    AudioClip sonido=java.applet.Applet.newAudioClip(getClass().getResource("../sonidos/jump.wav"));
    AudioClip sonido2=java.applet.Applet.newAudioClip(getClass().getResource("../sonidos/distro.wav"));
    AudioClip sonido3=java.applet.Applet.newAudioClip(getClass().getResource("../sonidos/hurt.wav"));
    AudioClip sonido4=java.applet.Applet.newAudioClip(getClass().getResource("../sonidos/wonderful.wav"));
    Mapa mapa = new Mapa();
    
    public TableroJuego p;
    
    Area FuegoArea,pel;
    
    public NinoFuego(TableroJuego p2){
        this.p=p2;
    }
    public void paint(Graphics grafico){
      if(bandera==1){  
        if(izquierda%2==0){
        ImageIcon m1 = new ImageIcon(getClass().getResource("../images/player/playerF_left_1.png"));
        grafico.drawImage(m1.getImage(),x,y, ancho, alto,null);
        }
        
        if(izquierda%2!=0){
        ImageIcon m2 = new ImageIcon(getClass().getResource("../images/player/playerF_left_2.png"));
        grafico.drawImage(m2.getImage(),x,y, ancho, alto,null);    
        }
     } 
     if(bandera==2){ 
        if(derecha%2==0){
        ImageIcon m1 = new ImageIcon(getClass().getResource("../images/player/playerF_right_1.png"));
        grafico.drawImage(m1.getImage(),x,y, ancho, alto,null);
        }
        
        if(derecha%2!=0){
        ImageIcon m2 = new ImageIcon(getClass().getResource("../images/player/playerF_right_2.png"));
        grafico.drawImage(m2.getImage(),x,y, ancho, alto,null);    
        }
     }
       
    }
    
public void KeyPressed(KeyEvent e){
        int [][]map= mapa.obtieneMapa();

        //Izquierda
        if(e.getKeyCode()== 37){
             if(map[y/40][(x/40)-1]==0){
                x=x-movimiento;
                izquierda++;
                bandera=1;
             }
        }
        
        //Derecha
        if(e.getKeyCode()== 39){
             if(map[y/40][(x/40)+1]==0){
                x=x+movimiento;
                derecha++;
                bandera=2;
             }
        }
        
        //Arriba
        if(e.getKeyCode()== 38){
             if(map[(y/40)-1][x/40]==0){
                y=y-90;   
                 sonido.play();
             }
        }
        if(TableroJuego.obtieneNivel()==1){
            if(x==1200  && y==80|| x==1180 && y==80|| x==1180 && y==100 || x==1180 && y==100){
                TableroJuego.cambiaNivel();
                principal.Principal.resumen=true;
                x=40;
                y=440;
                sonido4.play();
            }
        }
        if(TableroJuego.obtieneNivel()==2){
            if(x==1200  && y==80 || x==1180 && y==80 || x==1180 && y==100 || x==1180 && y==100){
                TableroJuego.cambiaNivel();
                principal.Principal.resumen=true;
                x=40;
                y=440;
                sonido4.play();
            }
        }  
        if(TableroJuego.obtieneNivel()==3){
            if(x==1180 && y==640 || x==1200 && y==640 || x==1200 && y==660 || x==1200 && y==660){
                TableroJuego.cambiaNivel();
                principal.Principal.resumen=true;
                x=40;
                y=440;
                sonido4.play();
            }
        } 
        if(TableroJuego.obtieneNivel()==4){
            if(x==80  && y==80 || x==60  && y==80|| x==60  && y==100|| x==60  && y==100){
                TableroJuego.cambiaNivel();
                principal.Principal.resumen=true;
                sonido4.play();
            }
        }
        
        if(choqueD1()){
            DiamanteRojo.mo1=true; 
            TableroJuego.cantidadD++;
            sonido2.play();
        }if(choqueD2()){
            DiamanteRojo.mo2=true;  
            TableroJuego.cantidadD++;
            sonido2.play();
        }if(choqueD3()){
            DiamanteRojo.mo3=true;  
            TableroJuego.cantidadD++;
            sonido2.play();
        }if(choqueD4()){
            DiamanteRojo.mo4=true;  
            TableroJuego.cantidadD++;
            sonido2.play();
        }if(choqueD5()){
            DiamanteRojo.mo5=true;
            TableroJuego.cantidadD++;
            sonido2.play();
        }if(choqueD6()){
            DiamanteRojo.mo6=true; 
            TableroJuego.cantidadD++;
            sonido2.play();
        }if(choqueD7()){
            DiamanteRojo.mo7=true; 
            TableroJuego.cantidadD++;
            sonido2.play();
        }if(choqueD8()){
            DiamanteRojo.mo8=true;  
            TableroJuego.cantidadD++;
            sonido2.play();
        }if(choqueD9()){
            DiamanteRojo.mo9=true;  
            TableroJuego.cantidadD++;
            sonido2.play();
        }if(choqueD10()){
            DiamanteRojo.mo10=true;  
            TableroJuego.cantidadD++;
            sonido2.play();
        }
        if(choqueF1()){
            sonido3.play();
            JOptionPane.showMessageDialog(null,"Perdiste una vida!!!!!!!");
            TableroJuego.vidas--;
            x=40;
            y=440;
        }if(choqueF2()){ 
            sonido3.play();
            JOptionPane.showMessageDialog(null,"Perdiste una vida!!!!!!!");
            TableroJuego.vidas--;
            x=40;
            y=440;
        }if(choqueF3()){
            sonido3.play();
            JOptionPane.showMessageDialog(null,"Perdiste una vida!!!!!!!");
            TableroJuego.vidas--;
            x=40;
            y=440;
        }if(choqueF4()){
            sonido3.play();
            JOptionPane.showMessageDialog(null,"Perdiste una vida!!!!!!!");
            TableroJuego.vidas--;
            x=40;
            y=440;
        }if(choqueF5()){
            sonido3.play();
            JOptionPane.showMessageDialog(null,"Perdiste una vida!!!!!!!");
            TableroJuego.vidas--;
            x=40;
            y=440;
        }if(choqueF6()){
            sonido3.play();
            JOptionPane.showMessageDialog(null,"Perdiste una vida!!!!!!!");
            TableroJuego.vidas--;
            x=40;
            y=440;
        }if(choqueF7()){ 
            sonido3.play();
            JOptionPane.showMessageDialog(null,"Perdiste una vida!!!!!!!");
            TableroJuego.vidas--;
            x=40;
            y=440;
        }if(choqueF8()){ 
            sonido3.play();
            JOptionPane.showMessageDialog(null,"Perdiste una vida!!!!!!!");
            TableroJuego.vidas--;
            x=40;
            y=440;
        }if(choqueF9()){
            sonido3.play();
            JOptionPane.showMessageDialog(null,"Perdiste una vida!!!!!!!");
            TableroJuego.vidas--;
            x=40;
            y=440;
        }if(choqueF10()){
            sonido3.play();
            JOptionPane.showMessageDialog(null,"Perdiste una vida!!!!!!!");
            TableroJuego.vidas--;
            x=40;
            y=440;
        }
    
    }
    
    public void mover(){
        int [][]map= mapa.obtieneMapa();
        
        //Gravedad de salto
        if(map[(y/40)+1][x/40]==0){
                y=y+movimiento; 
        }
    }
    
    public void Salto(KeyEvent e){
        int [][]map= mapa.obtieneMapa();
        
         //Salto Izquierda
        if(e.getKeyCode()== 37){
             if(map[y/40][(x/40)-1]==0){
                x=x-movimiento;
             }
        }
        
        //Salto Derecha
        if(e.getKeyCode()== 39){
             if(map[y/40][(x/40)+1]==0){
                x=x+movimiento;
             }
        }
    }
    
     public Area getBoundsFuego(){
        Ellipse2D z,m;
        
        m = new Ellipse2D.Double(x,y,ancho,alto);
        pel = new Area(m);
        FuegoArea=pel;
        
        
        z= new Ellipse2D.Double(x, y,40,40);
        pel = new Area(z);
        FuegoArea.add(pel);
        
        return FuegoArea;   
    }
    
    public boolean choqueD1(){
        Area m1 = new Area(p.dr.getBoundsD1());
        m1.intersect(getBoundsFuego());
        return !m1.isEmpty();
    }
    
     public boolean choqueD2(){
        Area areaRaqueta1 = new Area(p.dr.getBoundsD2());
        areaRaqueta1.intersect(getBoundsFuego());
        return !areaRaqueta1.isEmpty();
    }
     
      public boolean choqueD3(){
        Area areaRaqueta1 = new Area(p.dr.getBoundsD3());
        areaRaqueta1.intersect(getBoundsFuego());
        return !areaRaqueta1.isEmpty();
    }
      
     public boolean choqueD4(){
        Area areaRaqueta1 = new Area(p.dr.getBoundsD4());
        areaRaqueta1.intersect(getBoundsFuego());
        return !areaRaqueta1.isEmpty();
    }
       
     public boolean choqueD5(){
        Area areaRaqueta1 = new Area(p.dr.getBoundsD5());
        areaRaqueta1.intersect(getBoundsFuego());
        return !areaRaqueta1.isEmpty();
    }
        
     public boolean choqueD6(){
        Area areaRaqueta1 = new Area(p.dr.getBoundsD6());
        areaRaqueta1.intersect(getBoundsFuego());
        return !areaRaqueta1.isEmpty();
    }
         
      public boolean choqueD7(){
        Area areaRaqueta1 = new Area(p.dr.getBoundsD7());
        areaRaqueta1.intersect(getBoundsFuego());
        return !areaRaqueta1.isEmpty();
    }
          
     public boolean choqueD8(){
        Area areaRaqueta1 = new Area(p.dr.getBoundsD8());
        areaRaqueta1.intersect(getBoundsFuego());
        return !areaRaqueta1.isEmpty();
    }
           
     public boolean choqueD9(){
        Area areaRaqueta1 = new Area(p.dr.getBoundsD9());
        areaRaqueta1.intersect(getBoundsFuego());
        return !areaRaqueta1.isEmpty();
    }
            
      public boolean choqueD10(){
        Area areaRaqueta1 = new Area(p.dr.getBoundsD10());
        areaRaqueta1.intersect(getBoundsFuego());
        return !areaRaqueta1.isEmpty();
    }
      public boolean choqueF1(){
        Area m1 = new Area(p.a.getBoundsF1());
        m1.intersect(getBoundsFuego());
        return !m1.isEmpty();
    }
    
     public boolean choqueF2(){
        Area areaRaqueta1 = new Area(p.a.getBoundsF2());
        areaRaqueta1.intersect(getBoundsFuego());
        return !areaRaqueta1.isEmpty();
    }
     
      public boolean choqueF3(){
        Area areaRaqueta1 = new Area(p.a.getBoundsF3());
        areaRaqueta1.intersect(getBoundsFuego());
        return !areaRaqueta1.isEmpty();
    }
      
       public boolean choqueF4(){
        Area areaRaqueta1 = new Area(p.a.getBoundsF4());
        areaRaqueta1.intersect(getBoundsFuego());
        return !areaRaqueta1.isEmpty();
    }
       
        public boolean choqueF5(){
        Area areaRaqueta1 = new Area(p.a.getBoundsF5());
        areaRaqueta1.intersect(getBoundsFuego());
        return !areaRaqueta1.isEmpty();
    }
        
         public boolean choqueF6(){
        Area areaRaqueta1 = new Area(p.a.getBoundsF6());
        areaRaqueta1.intersect(getBoundsFuego());
        return !areaRaqueta1.isEmpty();
    }
         
          public boolean choqueF7(){
        Area areaRaqueta1 = new Area(p.a.getBoundsF7());
        areaRaqueta1.intersect(getBoundsFuego());
        return !areaRaqueta1.isEmpty();
    }
          
      public boolean choqueF8(){
        Area areaRaqueta1 = new Area(p.a.getBoundsF8());
        areaRaqueta1.intersect(getBoundsFuego());
        return !areaRaqueta1.isEmpty();
    }
           
     public boolean choqueF9(){
        Area areaRaqueta1 = new Area(p.a.getBoundsF9());
        areaRaqueta1.intersect(getBoundsFuego());
        return !areaRaqueta1.isEmpty();
    }
            
     public boolean choqueF10(){
        Area areaRaqueta1 = new Area(p.a.getBoundsF10());
        areaRaqueta1.intersect(getBoundsFuego());
        return !areaRaqueta1.isEmpty();
    }
    
    
    
}

