
import java.util.logging.Level;
import java.util.logging.Logger;

public class hilos {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                // Cualquier tarea que se quiera ejecutar
                // No necesarimente de duración infinita
                for (int i = 0; i < 10; i++){
                System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(hilos.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
            }
            
        };
    
Thread thread = new Thread(runnable);
        thread.start();
        clasHilo miHilo = new clasHilo();
        miHilo.start();
    }
}
