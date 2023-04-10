package Desarrollo;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import static principal.Principal.gameover;

public class TableroJuego extends JPanel{
    
    private Mapa mapa = new Mapa();
    private NinoFuego niñofuego = new NinoFuego(this);
    private NinaAgua niñaagua = new NinaAgua(this);
        
    DiamanteRojo dr = new DiamanteRojo();
    DiamanteAzul da = new DiamanteAzul();
    Agua a = new Agua();
    Lava l = new Lava();
    
    public static int cantidadD=0;
    public static int nivel=1;
    public static int vidas=3;
    public static int minutos=0;
    public static int segundos=0;
    public static int milisegundos=0;
    
    public TableroJuego(){
        addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {}
            @Override
            public void keyPressed(KeyEvent e) {
                niñofuego.Salto(e);
                niñaagua.Salto(e);
            }
            @Override
            public void keyReleased(KeyEvent e) {}
        });
        setFocusable(true);
        
        addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {}
            @Override
            public void keyPressed(KeyEvent e) {
                niñaagua.KeyPressed(e);
                niñofuego.KeyPressed(e);
            }
            @Override
            public void keyReleased(KeyEvent e) {}
        });
        setFocusable(true);
    }
    
     public static int cambiaNivel(){
        principal.Principal.startTime=false;  
        return nivel++;
    }
    
     public static int obtieneNivel(){
        return nivel;
    }
     
    @Override
    public void paint(Graphics grafico){
        mapa.paint(grafico);
        
        if(menu.Seleccion.rb1.isSelected()){niñaagua.paint(grafico);}
        
        if(menu.Seleccion.rb2.isSelected()){niñofuego.paint(grafico);}
        
        a.paint(grafico);
        l.paint(grafico);
        
        niñofuego.mover();
        niñaagua.mover();
        
        dr.paint(grafico);
        da.paint(grafico);
        
        grafico.setColor(Color.black);
        grafico.setFont(new Font("Arial black",0,35));
        grafico.drawString("Diamantes: "+cantidadD,40,35);
        
        if(vidas>=0){
            grafico.setColor(Color.black);
            grafico.setFont(new Font("Arial black",0,35));
            grafico.drawString("Vidas: "+vidas,375,35);
        }else{
            grafico.setColor(Color.black);
            grafico.setFont(new Font("Arial black",0,35));
            grafico.drawString("Vidas: "+(vidas+1),375,35);
        }
        
        grafico.setColor(Color.black);
        grafico.setFont(new Font("Arial black",0,35));
        grafico.drawString("Nombre: "+menu.Seleccion.c1.getText(),610,35);
        
        grafico.setFont(new Font("Arial black",0,30));
        grafico.setColor(Color.black);
        grafico.drawString("Tiempo  "+minutos+":"+segundos,1100, 35);
        
        if(nivel==3||nivel==4){
            grafico.setColor(Color.white);
            grafico.setFont(new Font("Arial black",0,35));
            grafico.drawString("Diamantes: "+cantidadD,40,35);
        
        if(vidas>=0){
                grafico.setColor(Color.white);
                grafico.setFont(new Font("Arial black",0,35));
                grafico.drawString("Vidas: "+vidas,375,35);
         }else{
                grafico.setColor(Color.white);
                grafico.setFont(new Font("Arial black",0,35));
                grafico.drawString("Vidas: "+(vidas+1),375,35);
            }
            grafico.setColor(Color.white);
            grafico.setFont(new Font("Arial black",0,35));
            grafico.drawString("Nombre: "+menu.Seleccion.c1.getText(),610,35);
        
            grafico.setFont(new Font("Arial black",0,30));
            grafico.setColor(Color.white);
            grafico.drawString("Tiempo  "+minutos+":"+segundos,1100, 35);
        }

        
        if(vidas<0){
            principal.Principal.gameover=true;
        }
 
        grafico.dispose();
    }
}
