package Desarrollo;

import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Mapa {
    int map[][] = new int[18][34];
    
    private int fila=0;
    private int columna=0;
    
    private final int numeroFilas=18;
    private final int numeroColumnas=34;
    private final int anchoBloque=40;
    private final int altoBloque=40;
    
    public void paint(Graphics grafico){
        int [][]mapa = obtieneMapa();
        int c=0;

        if(TableroJuego.obtieneNivel()==1){ 
            for(fila=0;fila<numeroFilas;fila++){
                for(columna=0;columna<numeroColumnas;columna++){
               
                    if(mapa[fila][columna] == 1){
                        ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapas/snow8.png"));
                        grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
                    }
                    if(mapa[fila][columna] == 2){
                        ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapas/snow5.png"));
                        grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
                    }
                    if(mapa[fila][columna] == 3){
                        ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapas/exitbg.png"));
                        grafico.drawImage(muro.getImage(),columna*40, fila*40,80,80,null);
                    }
                    if(mapa[fila][columna] == 4){
                        ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapas/exitfg.png"));
                        grafico.drawImage(muro.getImage(),columna*40, fila*40,80,80,null);
                    }
                    c++;
                    if(c==1){
                        ImageIcon fondo = new ImageIcon(getClass().getResource("../images/mapas/ocean.png"));
                        grafico.drawImage(fondo.getImage(),40,40,2060,740,null);
                    }
                }
            }
      }   
        
        
         
        if(TableroJuego.obtieneNivel()==2){ 
            for(fila=0;fila<numeroFilas;fila++){
                for(columna=0;columna<numeroColumnas;columna++){
                     if(mapa[fila][columna] == 1){
                        ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapas/darksnow15.png"));
                        grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
                    }
                    if(mapa[fila][columna] == 2){
                        ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapas/darksnow5.png"));
                        grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
                    }
                    if(mapa[fila][columna] == 3){
                        ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapas/exitbg.png"));
                        grafico.drawImage(muro.getImage(),columna*40, fila*40,80,80,null);
                    }
                    if(mapa[fila][columna] == 4){
                        ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapas/exitfg.png"));
                        grafico.drawImage(muro.getImage(),columna*40, fila*40,80,80,null);
                    }
                    c++;
                    if(c==1){
                        ImageIcon fondo = new ImageIcon(getClass().getResource("../images/mapas/cave2.jpg"));
                        grafico.drawImage(fondo.getImage(),40,40,2060,740,null);
                    }
               
                }
            }
        }   
        
         
        if(TableroJuego.obtieneNivel()==3){ 
            for(fila=0;fila<numeroFilas;fila++){
                for(columna=0;columna<numeroColumnas;columna++){
                     if(mapa[fila][columna] == 1){
                        ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapas/block4.png"));
                        grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
                    }
                    if(mapa[fila][columna] == 2){
                        ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapas/block4.png"));
                        grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
                    }
                    if(mapa[fila][columna] == 3){
                        ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapas/exitbg.png"));
                        grafico.drawImage(muro.getImage(),columna*40, fila*40,80,80,null);
                    }
                    if(mapa[fila][columna] == 4){
                        ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapas/exitfg.png"));
                        grafico.drawImage(muro.getImage(),columna*40, fila*40,80,80,null);
                    }
                    c++;
                    if(c==1){
                        ImageIcon fondo = new ImageIcon(getClass().getResource("../images/mapas/artic.jpg"));
                        grafico.drawImage(fondo.getImage(),40,40,2060,740,null);
                    }
              
                }
            }
        }   
        
         
        if(TableroJuego.obtieneNivel()==4){ 
            for(fila=0;fila<numeroFilas;fila++){
                for(columna=0;columna<numeroColumnas;columna++){
                     if(mapa[fila][columna] == 1){
                        ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapas/grey.png"));
                        grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
                    }
                    if(mapa[fila][columna] == 2){
                        ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapas/grey.png"));
                        grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
                    }
                    if(mapa[fila][columna] == 3){
                        ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapas/exitbg.png"));
                        grafico.drawImage(muro.getImage(),columna*40, fila*40,80,80,null);
                    }
                    if(mapa[fila][columna] == 4){
                        ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapas/exitfg.png"));
                        grafico.drawImage(muro.getImage(),columna*40, fila*40,80,80,null);
                    }
                    c++;
                    if(c==1){
                        ImageIcon fondo = new ImageIcon(getClass().getResource("../images/mapas/artic_dark.jpg"));
                        grafico.drawImage(fondo.getImage(),40,40,2060,740,null);
                    }
               
                }
            }
        } 
        
    }
    
    public int[][] obtieneMapa(){
       if(TableroJuego.obtieneNivel()==1){ 
        
            int mapa [][]=
            {
{ 2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2 },
{ 2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3,0,4,0,2 },
{ 2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2 },
{ 2,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,0,1,1,0,1,1,0,0,1,1,1,1,1,1,1,1,1,2 },
{ 2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2 },
{ 2,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,2 },
{ 2,1,0,1,1,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1,1,1,1,1,1,0,0,0,2 },
{ 2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,2 },
{ 2,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,2 },
{ 2,1,1,1,1,0,0,0,0,0,0,0,0,2,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,2 },
{ 2,0,0,2,2,1,1,1,0,0,0,0,0,0,2,1,0,0,0,0,1,1,1,1,1,0,0,1,1,2,0,0,0,2 },
{ 2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2 },
{ 2,1,1,1,0,0,1,1,1,1,0,0,0,0,0,0,0,1,2,0,0,0,0,1,1,1,1,1,1,1,1,1,1,2 },
{ 2,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,2 },
{ 2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,0,0,0,0,0,0,0,0,0,0,0,2 },
{ 2,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2 },
{ 2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,2,0,0,0,0,2 },
{ 2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2 }
            };
          map = mapa;    
        }
       
       if(TableroJuego.obtieneNivel()==2){
       int mapa[][]=
{
{ 2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2 },
{ 2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,3,0,4,0,2 },
{ 2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,2 },
{ 2,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,0,1,1,0,1,1,0,0,1,1,2,0,1,1,1,1,1,2 },
{ 2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,2 },
{ 2,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,2,1,1,1,0,0,0,2 },
{ 2,1,1,1,1,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1,1,2,0,0,0,0,0,0,2 },
{ 2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,2,0,0,0,1,1,1,2 },
{ 2,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,2,0,0,0,0,0,0,2 },
{ 2,1,1,1,1,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,2,1,1,1,0,0,0,2 },
{ 2,0,0,1,1,1,1,1,0,0,0,0,0,0,1,1,0,0,0,0,1,1,1,1,1,0,2,0,0,0,0,0,0,2 },
{ 2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,2,0,0,0,1,1,1,2 },
{ 2,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,0,0,0,0,1,1,1,2,0,0,0,0,0,0,2 },
{ 2,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,1,0,0,0,0,2,1,1,1,0,0,0,2 },
{ 2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,2,0,0,0,0,0,0,2 },
{ 2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,2,0,0,0,1,1,1,2 },
{ 2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2 },
{ 2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2 }
            };
       map = mapa;  
       
       
       }
       
        if(TableroJuego.obtieneNivel()==3){
       int mapa[][]=
{
{ 2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2 },
{ 2,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,2 },
{ 2,0,0,0,0,0,0,2,0,0,0,0,0,0,2,0,0,0,0,0,2,0,0,0,0,0,2,0,0,0,0,0,0,2 },
{ 2,1,1,1,0,0,0,2,1,1,1,1,1,0,2,1,1,1,1,0,2,0,0,1,1,1,2,1,1,1,1,1,0,2 },
{ 2,0,0,0,0,0,0,2,0,0,0,0,0,0,2,0,0,0,0,0,2,0,0,0,0,0,2,0,0,0,0,0,0,2 },
{ 2,0,0,0,1,1,1,2,0,0,0,1,1,1,2,0,1,1,1,1,2,1,1,1,0,0,2,0,1,1,1,1,1,2 },
{ 2,0,0,0,0,0,0,2,0,0,0,0,0,0,2,0,0,0,0,0,2,0,0,0,0,0,2,0,0,0,0,0,0,2 },
{ 2,1,1,1,0,0,0,2,1,1,1,0,0,0,2,1,1,1,1,0,2,0,0,1,1,1,2,1,1,1,1,1,0,2 },
{ 2,0,0,0,0,0,0,2,0,0,0,0,0,0,2,0,0,0,0,0,2,0,0,0,0,0,2,0,0,0,0,0,0,2 },
{ 2,0,0,0,1,1,1,2,0,0,0,1,1,1,2,0,1,1,1,1,2,1,1,1,0,0,2,0,1,1,1,1,1,2 },
{ 2,0,0,0,0,0,0,2,0,0,0,0,0,0,2,0,0,0,0,0,2,0,0,0,0,0,2,0,0,0,0,0,0,2 },
{ 2,1,1,1,0,0,0,2,1,1,1,0,0,0,2,1,1,1,1,0,2,0,0,1,1,1,2,1,1,1,1,1,0,2 },
{ 2,0,0,0,0,0,0,2,0,0,0,0,0,0,2,0,0,0,0,0,2,0,0,0,0,0,2,0,0,0,0,0,0,2 },
{ 2,0,1,1,1,1,1,2,0,0,0,1,1,1,2,0,1,1,1,1,2,1,1,1,0,0,2,0,1,1,1,1,1,2 },
{ 2,0,0,0,0,0,0,2,0,0,0,0,0,0,2,0,0,0,0,0,2,2,0,0,0,0,2,0,0,0,0,0,0,2 },
{ 2,1,1,1,1,1,0,2,1,1,1,0,0,0,2,1,1,1,1,0,2,0,0,1,1,1,2,0,0,3,0,4,0,2 },
{ 2,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,2 },
{ 2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2 }
            };
       
       
        map = mapa;  
       
       }
        
         if(TableroJuego.obtieneNivel()==4){
       int mapa [][]=
{
{ 2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2 },
{ 2,3,0,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2 },
{ 2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2 },
{ 2,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,0,1,1,0,1,1,0,0,1,1,1,1,1,1,1,1,1,2 },
{ 2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2 },
{ 2,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,2 },
{ 2,1,1,1,1,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1,1,1,1,1,1,0,0,0,2 },
{ 2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,2 },
{ 2,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,2 },
{ 2,1,1,1,1,0,0,0,0,0,0,0,0,2,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,2 },
{ 2,0,0,2,2,1,1,1,0,0,0,0,0,0,2,1,0,0,0,0,1,1,1,1,1,0,0,1,1,2,0,0,0,2 },
{ 2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2 },
{ 2,1,1,0,0,0,0,1,1,1,1,0,0,0,0,0,0,1,2,0,0,0,0,1,1,1,1,1,1,1,1,1,1,2 },
{ 2,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,2 },
{ 2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,0,0,0,0,0,0,0,0,0,0,0,2 },
{ 2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2 },
{ 2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2 },
{ 2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2 }
            };
       
       map = mapa;  
       
       
       }
        
      return map;  
    }
}

