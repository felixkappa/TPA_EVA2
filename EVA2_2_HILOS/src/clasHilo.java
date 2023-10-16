
import java.util.logging.Level;
import java.util.logging.Logger;



class clasHilo extends Thread{
    
    @Override
    public void run() {
        super.run(); 
        for(int i = 0; i < 10; i++){
            try {
                Thread.sleep(2000);
                System.out.println("Clase Thread" + i);
            } catch (InterruptedException ex) {
                Logger.getLogger(clasHilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}


