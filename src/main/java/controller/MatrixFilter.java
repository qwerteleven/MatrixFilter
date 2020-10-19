package controller;

import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import view.MavenView;

/**
 *
 * @author Mario
 */
public class MatrixFilter {
    private final int size;
    private final Map<String, Locale> locale = new TreeMap<>();

    public MatrixFilter(int size) {
        this.size = size;
        
        Locale[] loc = {
            new Locale("es", "ES"),
            new Locale("en", "US")
        };
        for (int i = 0; i < loc.length; i++) {
            locale.put(loc[i].getDisplayName(), loc[i]);
        }
    }
    
    public void execute() {
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
            java.util.logging.Logger.getLogger(MavenView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MavenView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MavenView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MavenView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MavenView(size, locale).setVisible(true);
            }
        });
    }
}
