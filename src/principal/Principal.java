package principal;

import Desarrollo.LevelsResumen;
import menu.Creditos;
import menu.Instrucciones;
import menu.Menu;
import world_map.Mundo;
import menu.Seleccion;
import Desarrollo.TableroJuego;
import static Desarrollo.TableroJuego.milisegundos;
import static Desarrollo.TableroJuego.minutos;
import static Desarrollo.TableroJuego.segundos;
import java.applet.AudioClip;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;

public class Principal{
    
    public static boolean menu=true,opcion1,opcion2,opcion3,opcion4;
    public static boolean worldmap,levels,startTime,resumen,cambionivel=false;
    public static boolean gameover=false,ganarjuego=false;
    static Principal p = new Principal();
    AudioClip sonidoB=java.applet.Applet.newAudioClip(getClass().getResource("../sonidos/menu.wav"));
    AudioClip sonidoW=java.applet.Applet.newAudioClip(getClass().getResource("../sonidos/welcome.wav"));
    AudioClip sonidoWM=java.applet.Applet.newAudioClip(getClass().getResource("../sonidos/worldMap.wav"));
    AudioClip sonidoL=java.applet.Applet.newAudioClip(getClass().getResource("../sonidos/levels.wav"));
    AudioClip sonidoCredits=java.applet.Applet.newAudioClip(getClass().getResource("../sonidos/creditos.wav"));
    AudioClip sonidoV=java.applet.Applet.newAudioClip(getClass().getResource("../sonidos/victorious.wav"));
    
    
    public static void main(String[] args) {
            p.SonidoWelcome();
            JOptionPane.showMessageDialog(null,"             ESTÁS LISTO");
        
            Menu portada = new Menu();
            JFrame ventana1 = new JFrame();
            ventana1.setSize(2060,750);
            ventana1.setLocationRelativeTo(null);
            ventana1.setTitle("Super Tux");
            ventana1.setDefaultCloseOperation(EXIT_ON_CLOSE);
            ventana1.setContentPane(portada);
         
            Seleccion elec = new Seleccion();
            JFrame ventana2 = new JFrame();
            ventana2.setSize(2060,750);
            ventana2.setLocationRelativeTo(null);
            ventana2.setTitle("Seleccionar Personaje");
            ventana2.setDefaultCloseOperation(EXIT_ON_CLOSE);
            ventana2.setContentPane(elec);
            
            Instrucciones instrucciones = new Instrucciones();
            JFrame ventana3 = new JFrame();
            ventana3.setSize(2060,750);
            ventana3.setLocationRelativeTo(null);
            ventana3.setTitle("Instrucciones");
            ventana3.setDefaultCloseOperation(EXIT_ON_CLOSE);
            ventana3.setContentPane(instrucciones);
            
            Creditos creditos = new Creditos();
            JFrame ventana4 = new JFrame();
            ventana4.setSize(2060,750);
            ventana4.setLocationRelativeTo(null);
            ventana4.setTitle("Créditos");
            ventana4.setDefaultCloseOperation(EXIT_ON_CLOSE);
            ventana4.setContentPane(creditos);
    
            JFrame mundo = new JFrame("World Map");
            Mundo mp = new Mundo();
            mundo.add(mp);
            mundo.setSize(2060,750);
            mundo.setLocationRelativeTo(null);
            mundo.setDefaultCloseOperation(EXIT_ON_CLOSE);
 
            JFrame niveles = new JFrame("Niño Fuego & Niña Agua");
            TableroJuego game = new TableroJuego();
            niveles.add(game);
            niveles.setSize(2060,750);
            niveles.setLocationRelativeTo(null);
            niveles.setDefaultCloseOperation(EXIT_ON_CLOSE);
            
            JFrame resumenes = new JFrame("Resumen");
            LevelsResumen r = new LevelsResumen();
            resumenes.add(r);
            resumenes.setSize(2060,750);
            resumenes.setLocationRelativeTo(null);
            resumenes.setDefaultCloseOperation(EXIT_ON_CLOSE);
            
            
            while(true){
                 if(menu==true){
                        p.detenerSonidoCredits();
                        p.sonidoMenu();  
                        gameover=false;
                        ventana1.setVisible(true);
                        ventana2.setVisible(false);
                        ventana3.setVisible(false);
                        ventana4.setVisible(false);
                        niveles.setVisible(false);
                        mundo.setVisible(false);
                        menu=false;
                  } 
                 
                  if(opcion1==true){
                    ventana2.setVisible(true);
                    ventana1.setVisible(false);
                    opcion1=false;
                 }
                 
                  if(opcion2==true){
                    ventana3.setVisible(true);
                    ventana1.setVisible(false);
                    opcion2=false;
                 }
                  if(opcion3==true){
                    p.detenerSonidoMenu();
                    p.detenerSonidoVictoria();
                    p.SonidoCredits();
                    ventana4.setVisible(true);
                    ventana1.setVisible(false);
                    opcion3=false;
                }
                  if(opcion4==true){
                    int salirJuego = JOptionPane.showConfirmDialog(null,"¿Estás seguro"
                    +" de querer salir del juego?","Salir del juego",JOptionPane.YES_NO_OPTION);
                    
                    if(salirJuego == 1){
                        opcion4=false;
                    }
                    else if(salirJuego == 0){
                            System.exit(0);
                    }
                }
                  
                  if(worldmap==true){
                      p.detenerSonidoMenu();
                      p.detenerSonidoLevels();
                      p.SonidoWorldMap();
                      mundo.setVisible(true);
                      ventana2.setVisible(false);
                      niveles.setVisible(false);
                      resumenes.setVisible(false);
                      worldmap=false;
                  }
                 
                 if(levels==true){
                     p.DetenerSonidoWorldMap();
                     p.SonidoLevels();
                     niveles.setVisible(true);
                     mundo.setVisible(false);
                     levels=false;
                 }
                 
                 if(resumen==true){
                     resumenes.setVisible(true);
                     niveles.setVisible(false);
                     resumen=false;
                 }
                 
                  if(ganarjuego==true){
                    p.DetenerSonidoWorldMap();
                    p.SonidoVictoria();
                    JOptionPane.showMessageDialog(null,"!!! FELICIDADES HAZ GANADO !!!");
                    ganarjuego=false;
                    opcion3=true;
                    gameover=false;
                    TableroJuego.cantidadD=0;
                    TableroJuego.vidas=3;
                    TableroJuego.nivel=1;
                    world_map.Personaje.x=280;
                    world_map.Personaje.y=200;
                    TableroJuego.minutos=0;
                    TableroJuego.segundos=0;
                    TableroJuego. milisegundos=0;  
                 }
                  if(gameover==true){
                      p.GameOverSound();
                      if(TableroJuego.vidas <0){
                        JOptionPane.showMessageDialog(null,"No te Quedan Vidas,Perdiste el juego");
                      }else{
                        JOptionPane.showMessageDialog(null,"se acabo el tiempo,Perdiste el juego");

                      } 
                      int salirJuego = JOptionPane.showConfirmDialog(null,"¿Quieres Regresar"
                    +" al menu principal","menu principal",JOptionPane.YES_NO_OPTION);
                    
                      if(salirJuego == 1){
                            int reiniciar = JOptionPane.showConfirmDialog(null,"¿Quieres Reiniciar"
                            +" el nivel?","Reinicio",JOptionPane.YES_NO_OPTION);
                    
                            if(reiniciar == 1){}
                            else if(reiniciar == 0){
                                p.SonidoLevels();
                                gameover=false;                     
                                TableroJuego.cantidadD=0;
                                TableroJuego.vidas=3; 
                                TableroJuego.minutos=0;
                                TableroJuego.segundos=0;
                                TableroJuego. milisegundos=0;
                                Desarrollo.NinaAgua.x=40;
                                Desarrollo.NinaAgua.y=440;
                                Desarrollo.NinoFuego.x=40;
                                Desarrollo.NinoFuego.y=440;
                            }
                      }
                      else if(salirJuego == 0){
                            gameover=false;
                            menu=true;
                            TableroJuego.cantidadD=0;
                            TableroJuego.vidas=3;
                            TableroJuego.nivel=1;
                            world_map.Personaje.x=280;
                            world_map.Personaje.y=200;
                            TableroJuego.minutos=0;
                            TableroJuego.segundos=0;
                            TableroJuego. milisegundos=0;  
                            Desarrollo.NinaAgua.x=40;
                            Desarrollo.NinaAgua.y=440;
                            Desarrollo.NinoFuego.x=40;
                            Desarrollo.NinoFuego.y=440;
                        } 
                  }
                if(startTime==true){
                    if(milisegundos==100){
                        segundos++;
                        milisegundos=0;
                        if(segundos==59){
                            minutos++;
                            segundos=0;
                            if(minutos==2){
                                gameover=true;
                            }
                        }
                    }
                    milisegundos+=25;
                } 
                  
                if(cambionivel==true){    
                    minutos=0;
                    segundos=0;
                    milisegundos=0;    
                    cambionivel=false;
                }  
               
                try {
                    Thread.sleep(250);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }

               game.repaint();
               mp.repaint();
               creditos.repaint();
            }
    }

    public void sonidoMenu() {
        sonidoB.play();
    }
    private void detenerSonidoMenu() {
        sonidoB.stop();
    }

    private void GameOverSound() {
       AudioClip sonido=java.applet.Applet.newAudioClip(getClass().getResource("../sonidos/gameover.wav"));
       sonido.play();
    }

    private void SonidoWorldMap() {
      sonidoWM.play();
    }
     private void DetenerSonidoWorldMap() {
      sonidoWM.stop();
    }

    private void SonidoLevels() {
      sonidoL.play();
    }

    private void detenerSonidoLevels() {
      sonidoL.stop();
    }

    private void SonidoWelcome() {
      sonidoW.play();
    }

    private void SonidoCredits() {
      sonidoCredits.play();
    }

    private void detenerSonidoCredits() {
       sonidoCredits.stop();
    }

    private void detenerSonidoVictoria() {
        sonidoV.stop();
    }

    private void SonidoVictoria() {
        sonidoV.play();
    }

}
