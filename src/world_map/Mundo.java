package world_map;

import world_map.MapaPrincipal;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

public class Mundo extends JPanel{
    private MapaPrincipal m = new MapaPrincipal();
    private Personaje p = new Personaje();
    
    public Mundo(){     
         addKeyListener(new KeyListener(){
             @Override
             public void keyTyped(KeyEvent e) {}

             @Override
             public void keyPressed(KeyEvent e) {
              p.KeyPressed(e);
             }

             @Override
             public void keyReleased(KeyEvent e) {}
         });
         setFocusable(true);
    }
    
    @Override
    public void paint(Graphics grafico){
        m.paint(grafico);
        p.paint(grafico);
        
    }
    
}
