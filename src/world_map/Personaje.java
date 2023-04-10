package world_map;

import world_map.MapaPrincipal;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Personaje {
    public static int x=280;
    public static int y=200;
    
    private final int ancho=40;
    private final int alto=40;
    private final int movimiento=40;

    MapaPrincipal mapa = new MapaPrincipal();

    public void paint(Graphics grafico){
        if(menu.Seleccion.rb1.isSelected()==true){
            ImageIcon m1 = new ImageIcon(getClass().getResource("../images/mapa-principal/player/tux.png"));
            grafico.drawImage(m1.getImage(),x,y, ancho, alto,null);
        }
        if(menu.Seleccion.rb2.isSelected()==true){
            ImageIcon m1 = new ImageIcon(getClass().getResource("../images/mapa-principal/player/firetux.png"));
            grafico.drawImage(m1.getImage(),x,y, ancho, alto,null);
        }
    }
    
    public void KeyPressed(KeyEvent e){
        int [][]map= mapa.obtieneMapa();
 
        //Izquierda
        if(e.getKeyCode()== 37){
             if(Desarrollo.TableroJuego.obtieneNivel()>4){
                if(map[y/40][(x/40)-1]==16 || map[y/40][(x/40)-1]==17 || map[y/40][(x/40)-1]==18 || map[y/40][(x/40)-1]==19 || map[y/40][(x/40)-1]==20 || map[y/40][(x/40)-1]==21 || map[y/40][(x/40)-1]==35|| map[y/40][(x/40)-1]==35|| map[y/40][(x/40)-1]==23|| map[y/40][(x/40)-1]==22){
                    x=x-movimiento;
                }
             }
             if(map[y/40][(x/40)-1]==16 || map[y/40][(x/40)-1]==17 || map[y/40][(x/40)-1]==18 || map[y/40][(x/40)-1]==19 || map[y/40][(x/40)-1]==20 || map[y/40][(x/40)-1]==21){
                x=x-movimiento;
             }
        }
        
        //Derecha
        if(e.getKeyCode()== 39){
            if(Desarrollo.TableroJuego.obtieneNivel()==4){
                if(map[y/40][(x/40)+1]==16 || map[y/40][(x/40)+1]==17 || map[y/40][(x/40)+1]==18 || map[y/40][(x/40)+1]==19 || map[y/40][(x/40)+1]==20 || map[y/40][(x/40)+1]==21 || map[y/40][(x/40)+1]==33|| map[y/40][(x/40)+1]==34){
                    x=x+movimiento;
                }
             }
             if(Desarrollo.TableroJuego.obtieneNivel()==3){
                if(map[y/40][(x/40)+1]==16 || map[y/40][(x/40)+1]==17 || map[y/40][(x/40)+1]==18 || map[y/40][(x/40)+1]==19 || map[y/40][(x/40)+1]==20 || map[y/40][(x/40)+1]==21 || map[y/40][(x/40)+1]==33){
                    x=x+movimiento;
                }
             }
             if(Desarrollo.TableroJuego.obtieneNivel()==2){
                if(map[y/40][(x/40)+1]==16 || map[y/40][(x/40)+1]==17 || map[y/40][(x/40)+1]==18 || map[y/40][(x/40)+1]==19 || map[y/40][(x/40)+1]==20 || map[y/40][(x/40)+1]==21){
                    x=x+movimiento;
                }
             }
        }
        
        //Arriba
        if(e.getKeyCode()== 38){
             if(map[(y/40)-1][x/40]==16 || map[(y/40)-1][x/40]==17 || map[(y/40)-1][x/40]==18 || map[(y/40)-1][x/40]==19 || map[(y/40)-1][x/40]==20 || map[(y/40)-1][x/40]==21){
                y=y-movimiento;
             }
        }
         //Abajo
        if(e.getKeyCode()== 40){
            if(Desarrollo.TableroJuego.obtieneNivel()>=2){
                 if(map[(y/40)+1][x/40]==16 || map[(y/40)+1][x/40]==17 || map[(y/40)+1][x/40]==18 || map[(y/40)+1][x/40]==19 || map[(y/40)+1][x/40]==20 || map[(y/40)+1][x/40]==21|| map[(y/40)+1][x/40]==32){
                    y=y+movimiento;
                }
            }     
            if(Desarrollo.TableroJuego.obtieneNivel()==1){
                if(map[(y/40)+1][x/40]==16 || map[(y/40)+1][x/40]==17 || map[(y/40)+1][x/40]==18 || map[(y/40)+1][x/40]==19 || map[(y/40)+1][x/40]==20 || map[(y/40)+1][x/40]==21){
                    y=y+movimiento;
                }
            }
        }
        if(e.getKeyChar()=='\n'){
            principal.Principal.startTime=true;
            principal.Principal.levels=true;
        } 
          if(x==760 && y==240){
              principal.Principal.ganarjuego=true;
          }
        
    }
   
}
