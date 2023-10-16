
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;




public class ventana extends javax.swing.JFrame {

private Runnable runnable;

    public ventana() {
        initComponents();
        
        runnable = new Runnable(){
            @Override
            public void run() {
                while(true){
                    try {
                        actualizarUI();
                        Thread.sleep(50);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ventana.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
            }
        };
        
        Thread thread = new Thread(runnable);
        thread.start();
        
    }
    
    private void actualizarUI(){
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                int contarespacios = 0;
                if (txtcua.getText().length() == 1)
                        lblcont.setText( (txtcua.getText().length() + " caracter"));
                    else
                       lblcont.setText( (txtcua.getText().length() + " caracteres")); 
                
                for (int i = 0; i < txtcua.getText().length();i++)
                    if(txtcua.getText().charAt(i) == ' '){
                        contarespacios +=1;
                        if (contarespacios == 1)
                            lblespa.setText(contarespacios + " espacio");
                        else
                            lblespa.setText(contarespacios + " espacios");
                     
                    }
                            
            }
            
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtcua = new javax.swing.JTextArea();
        lblcont = new javax.swing.JLabel();
        lblespa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtcua.setColumns(20);
        txtcua.setRows(5);
        jScrollPane1.setViewportView(txtcua);

        lblcont.setText("0 caracteres");

        lblespa.setText("0 espacios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblcont)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblespa)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcont)
                    .addComponent(lblespa))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcont;
    private javax.swing.JLabel lblespa;
    private javax.swing.JTextArea txtcua;
    // End of variables declaration//GEN-END:variables
}
