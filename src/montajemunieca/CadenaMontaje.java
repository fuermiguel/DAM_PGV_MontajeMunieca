/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montajemunieca;

import java.util.logging.Level;
import java.util.logging.Logger;
import static montajemunieca.MontajeMunieca.semaforoProceso1;
import static montajemunieca.MontajeMunieca.semaforoProceso2;
import static montajemunieca.MontajeMunieca.semaforoProceso3;

/**
 *
 * @author fuerm
 */
public class CadenaMontaje extends Thread {

    public void run() {
        try {
            for(int i=1;i<4;i++){
                semaforoProceso1.acquire();
                System.out.println("Comienzo de montaje de muñeca " + i );
                System.out.println(i + " -- Cuerpo montado");
                semaforoProceso2.release();
                semaforoProceso2.acquire();
                System.out.println(i + " -- Cabeza montada");
                semaforoProceso3.release();
                semaforoProceso3.acquire();
                System.out.println(i + " -- Extremidades montadas");
                System.out.println("finalización de montaje de muñeca " + i );
                semaforoProceso1.release();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(CadenaMontaje.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
