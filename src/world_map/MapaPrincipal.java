package world_map;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class MapaPrincipal{
    int map[][] = new int[18][34];
  
    private int fila=0;
    private int columna=0;
    
    private final int numeroFilas=18;
    private final int numeroColumnas=34;
    private final int anchoBloque=40;
    private final int altoBloque=40;
    
   public void paint(Graphics grafico){
        int [][]mapa = obtieneMapa();
     
        for(fila=0;fila<numeroFilas;fila++){
           for(columna=0;columna<numeroColumnas;columna++){
               
               if(mapa[fila][columna] == 0){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/water.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               }
               if(mapa[fila][columna] == 1){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/snow9.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               }
               if(mapa[fila][columna] == 2){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/snow8.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               }
               if(mapa[fila][columna] == 3){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/snow3.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               }
               if(mapa[fila][columna] == 4){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/snow7.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               }
               if(mapa[fila][columna] == 5){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/snow5.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               }
                if(mapa[fila][columna] == 6){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/snow6.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               }
                if(mapa[fila][columna] == 7){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/snow4.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               }
               if(mapa[fila][columna] == 8){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/snow1.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               }
                 if(mapa[fila][columna] == 9){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/snow12.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               }
                if(mapa[fila][columna] == 10){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/snow10.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               }
                if(mapa[fila][columna] == 11){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/snow11.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               }
                if(mapa[fila][columna] == 12){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/snow2.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               }
                if(mapa[fila][columna] == 13){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/snow13.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               }
                if(mapa[fila][columna] == 14){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/igloo1.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               }
                if(mapa[fila][columna] == 15){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/igloo2.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               }
                 if(mapa[fila][columna] == 16){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/road_ns.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               }
                  if(mapa[fila][columna] == 17){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/road_ne.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               }
                  if(mapa[fila][columna] == 18){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/road_we.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               }
                  if(mapa[fila][columna] == 19){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/road_nw.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               }
                  if(mapa[fila][columna] == 20){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/road_se.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               }
                  if(mapa[fila][columna] == 21){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/road_sw.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               }  
                  if(mapa[fila][columna] == 22){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/castle8.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               }  
                   if(mapa[fila][columna] == 23){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/castle9.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               } 
                   if(mapa[fila][columna] == 24){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/castle7.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               }  
                   if(mapa[fila][columna] == 25){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/castle5.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               }  
                  if(mapa[fila][columna] == 26){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/castle6.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               }  
                 if(mapa[fila][columna] == 27){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/castle4.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               }  
                 if(mapa[fila][columna] == 28){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/castle2.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               }  
                  if(mapa[fila][columna] == 29){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/castle1.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               }  
                 if(mapa[fila][columna] == 30){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/castle3.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               } 
                 if(mapa[fila][columna] == 31){
                    ImageIcon muro = new ImageIcon(getClass().getResource("../images/mapa-principal/snowman.png"));
                    grafico.drawImage(muro.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
               } 
                 if(mapa[fila][columna] == 32){
                     ImageIcon level = new ImageIcon(getClass().getResource("../images/mapa-principal/level_red.png"));
                     grafico.drawImage(level.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
                     
                     if(Desarrollo.TableroJuego.obtieneNivel()>=2){
                         ImageIcon leve = new ImageIcon(getClass().getResource("../images/mapa-principal/level_green.png"));
                         grafico.drawImage(leve.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
                     }
                } 
                  if(mapa[fila][columna] == 33){
                    ImageIcon level = new ImageIcon(getClass().getResource("../images/mapa-principal/level_red.png"));
                    grafico.drawImage(level.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
                   
                    if(Desarrollo.TableroJuego.obtieneNivel()>=3){
                         ImageIcon leve = new ImageIcon(getClass().getResource("../images/mapa-principal/level_green.png"));
                         grafico.drawImage(leve.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
                     }  
                 } 
                if(mapa[fila][columna] == 34){
                     ImageIcon level = new ImageIcon(getClass().getResource("../images/mapa-principal/level_red.png"));
                     grafico.drawImage(level.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
                      
                     if(Desarrollo.TableroJuego.obtieneNivel()>=4){
                         ImageIcon leve = new ImageIcon(getClass().getResource("../images/mapa-principal/level_green.png"));
                         grafico.drawImage(leve.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
                     }
                } 
                  if(mapa[fila][columna] == 35){
                    ImageIcon level = new ImageIcon(getClass().getResource("../images/mapa-principal/level_red.png"));
                     grafico.drawImage(level.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
                     
                     if(Desarrollo.TableroJuego.obtieneNivel()>=5){
                         ImageIcon leve = new ImageIcon(getClass().getResource("../images/mapa-principal/level_green.png"));
                         grafico.drawImage(leve.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
                     }
                  }   
                  
                  if(mapa[fila][columna] == 36){
                    ImageIcon level = new ImageIcon(getClass().getResource("../images/mapa-principal/flag.png"));
                     grafico.drawImage(level.getImage(),columna*40, fila*40, anchoBloque, altoBloque,null);
                }   
           }
           
      }  
        
    }
    
    public int[][] obtieneMapa(){
  
            int mapa [][]=
            {
{ 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
{ 0,0,0,0,0,0,0,0,0,0,0,8,6,12,0,0,0,8,6,6,6,6,12,0,0,0,0,0,0,0,0,0,0,0 },
{ 0,0,0,0,0,8,6,6,6,6,6,9,1,4,0,0,0,5,1,1,1,1,1,13,12,0,0,0,0,0,0,0,0,0 },
{ 0,0,0,8,6,9,1,1,1,1,1,10,2,3,0,0,8,9,1,1,1,1,1,1,13,12,0,0,0,0,0,0,0,0 },
{ 0,0,0,5,1,1,1,14,1,1,10,3,0,0,0,0,5,1,29,28,30,1,1,1,1,1,13,6,6,12,0,0,0,0 },
{ 0,0,0,5,1,1,1,15,1,1,4,0,0,0,0,8,9,1,27,25,26,1,1,36,1,1,1,1,1,13,6,12,0,0 },
{ 0,0,0,5,1,1,1,16,1,1,4,0,0,0,8,9,1,1,24,22,23,18,35,18,18,18,18,18,21,1,1,4,0,0 },
{ 0,0,0,5,1,1,1,16,1,1,13,6,6,6,9,1,1,1,1,1,1,1,1,1,1,1,1,1,16,1,1,13,12,0 },
{ 0,0,0,5,1,1,1,16,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,16,1,1,1,4,0 },
{ 0,0,0,7,2,11,1,16,36,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,36,1,1,16,1,1,1,4,0 },
{ 0,0,0,0,0,5,1,32,1,1,1,1,1,1,1,1,1,1,20,18,18,18,18,18,18,18,34,18,19,1,1,1,4,0 },
{ 0,0,0,0,0,5,1,16,1,1,1,1,31,1,1,1,1,1,16,1,1,1,1,1,1,1,1,1,1,1,1,10,3,0 },
{ 0,0,0,0,0,5,1,16,1,1,1,1,1,1,36,1,1,1,16,1,1,1,1,1,1,1,1,1,1,1,10,3,0,0 },
{ 0,0,0,0,0,5,1,17,18,18,18,18,18,18,18,33,18,18,19,1,1,1,1,1,1,1,1,10,2,2,3,0,0,0 },
{ 0,0,0,0,0,7,2,11,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,4,0,0,0,0,0,0 },
{ 0,0,0,0,0,0,0,7,2,11,1,1,1,1,1,1,1,1,1,1,1,1,1,1,10,2,2,3,0,0,0,0,0,0 },
{ 0,0,0,0,0,0,0,0,0,7,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,0,0,0,0,0,0,0,0,0 },
{ 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 }
            };
          map = mapa;   
          return map;
     }
}
