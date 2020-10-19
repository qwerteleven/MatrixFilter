package view;

import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Matrix;


/**
 *
 * @author Mario
 */
public class MavenView extends javax.swing.JFrame {
    private final int size;
    private Matrix matrix = null;
    ResourceBundle bundle = ResourceBundle.getBundle("resources/Bundle");
    private final Map<String, Locale> locale;
    
    /**
     * Creates new form MavenView
     */
    public MavenView(int size, Map<String, Locale> locale) {
        this.size = size;
        this.locale = locale;
        
        initComponents();
        initLang();
        
        try {
            matrix = new Matrix(size, Integer.parseInt(minField.getText()), Integer.parseInt(maxField.getText()));
        } catch (Exception ex) {
            Logger.getLogger(MavenView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTextArea1.setEditable(false);
        jTextArea1.setTabSize(2);
        jTextArea1.setText(matrix.toString());
        
        
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        settingsDialog = new javax.swing.JDialog();
        langLabel = new javax.swing.JLabel();
        langCombo = new javax.swing.JComboBox<>();
        saveSettings = new javax.swing.JButton();
        cancelSettings = new javax.swing.JButton();
        propertiesPanel = new javax.swing.JPanel();
        minLabel = new javax.swing.JLabel();
        minField = new javax.swing.JTextField();
        maxLabel = new javax.swing.JLabel();
        maxField = new javax.swing.JTextField();
        generateButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        matrixPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        thresholdPanel = new javax.swing.JPanel();
        thresholdSlider = new javax.swing.JSlider();
        menu = new javax.swing.JMenuBar();
        menuWindow = new javax.swing.JMenu();
        menuShortcuts = new javax.swing.JMenuItem();
        menuSettings = new javax.swing.JMenuItem();

        settingsDialog.setTitle("Settings");
        settingsDialog.setResizable(false);

        langLabel.setText("Language");

        langCombo.setModel(new javax.swing.DefaultComboBoxModel<>(locale.keySet().toArray(new String[locale.size()])));

        saveSettings.setText("Save");
        saveSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveSettingsActionPerformed(evt);
            }
        });

        cancelSettings.setText("Cancel");
        cancelSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelSettingsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout settingsDialogLayout = new javax.swing.GroupLayout(settingsDialog.getContentPane());
        settingsDialog.getContentPane().setLayout(settingsDialogLayout);
        settingsDialogLayout.setHorizontalGroup(
            settingsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(settingsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingsDialogLayout.createSequentialGroup()
                        .addComponent(langLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(langCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(settingsDialogLayout.createSequentialGroup()
                        .addComponent(saveSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        settingsDialogLayout.setVerticalGroup(
            settingsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(settingsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(langLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(langCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(settingsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelSettings)
                    .addComponent(saveSettings))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Matrix Filter");
        setResizable(false);

        propertiesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Matrix Properties"));

        minLabel.setText("Min value");

        minField.setText("10");

        maxLabel.setText("Max value");

        maxField.setText("20");

        generateButton.setText("Generate");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        errorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout propertiesPanelLayout = new javax.swing.GroupLayout(propertiesPanel);
        propertiesPanel.setLayout(propertiesPanelLayout);
        propertiesPanelLayout.setHorizontalGroup(
            propertiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(propertiesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(propertiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(propertiesPanelLayout.createSequentialGroup()
                        .addGroup(propertiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maxLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(minLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(propertiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(minField)
                            .addComponent(maxField)))
                    .addGroup(propertiesPanelLayout.createSequentialGroup()
                        .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(propertiesPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(generateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );
        propertiesPanelLayout.setVerticalGroup(
            propertiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(propertiesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(propertiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(propertiesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(maxField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(generateButton)
                .addGap(18, 18, 18)
                .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        matrixPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Matrix"));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setColumns(10);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout matrixPanelLayout = new javax.swing.GroupLayout(matrixPanel);
        matrixPanel.setLayout(matrixPanelLayout);
        matrixPanelLayout.setHorizontalGroup(
            matrixPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matrixPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        matrixPanelLayout.setVerticalGroup(
            matrixPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matrixPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        thresholdPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Threshold"));

        thresholdSlider.setMajorTickSpacing(5);
        thresholdSlider.setMaximum(20);
        thresholdSlider.setMinimum(10);
        thresholdSlider.setMinorTickSpacing(1);
        thresholdSlider.setPaintLabels(true);
        thresholdSlider.setPaintTicks(true);
        thresholdSlider.setValue(10);
        thresholdSlider.setPreferredSize(new java.awt.Dimension(100, 11));
        thresholdSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                thresholdSliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout thresholdPanelLayout = new javax.swing.GroupLayout(thresholdPanel);
        thresholdPanel.setLayout(thresholdPanelLayout);
        thresholdPanelLayout.setHorizontalGroup(
            thresholdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, thresholdPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thresholdSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        thresholdPanelLayout.setVerticalGroup(
            thresholdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(thresholdSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        menuWindow.setText("Window");

        menuShortcuts.setText("Shortcuts");
        menuWindow.add(menuShortcuts);

        menuSettings.setText("Settings");
        menuSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSettingsActionPerformed(evt);
            }
        });
        menuWindow.add(menuSettings);

        menu.add(menuWindow);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(thresholdPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(propertiesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(matrixPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(matrixPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(propertiesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thresholdPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        try {
            int min = Integer.parseInt(minField.getText());
            int max = Integer.parseInt(maxField.getText());
            
            if (min > 99 || max > 99) { // "<html>" + _ + "</html>"
                errorLabel.setText("<html>" + bundle.getString("numberError") + "</html>");
                return;
            }
            if (min >= max) {
                errorLabel.setText("<html>" + bundle.getString("minMaxError") + "</html>");
                return;
            }
            errorLabel.setText("");
            
            matrix = new Matrix(size, min, max);
            jTextArea1.setText(matrix.toString());
            
            thresholdSlider.setMaximum(max);
            thresholdSlider.setMinimum(min);
            thresholdSlider.setValue(min);
        } catch (Exception ex) {
            Logger.getLogger(MavenView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_generateButtonActionPerformed

    private void thresholdSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_thresholdSliderStateChanged
        matrix.setThreshold(thresholdSlider.getValue());
        jTextArea1.setText(matrix.toString());
    }//GEN-LAST:event_thresholdSliderStateChanged

    private void menuSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSettingsActionPerformed
        settingsDialog.pack();
        
        settingsDialog.setModal(true);
        settingsDialog.setLocationRelativeTo(null);
        
        settingsDialog.setVisible(true);
    }//GEN-LAST:event_menuSettingsActionPerformed

    private void saveSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveSettingsActionPerformed
        Locale local = locale.get((String) langCombo.getSelectedItem());
        bundle = ResourceBundle.getBundle("resources/Bundle", local);
        settingsDialog.setVisible(false);
        initLang();
    }//GEN-LAST:event_saveSettingsActionPerformed

    private void cancelSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelSettingsActionPerformed
        settingsDialog.setVisible(false);
    }//GEN-LAST:event_cancelSettingsActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelSettings;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JButton generateButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> langCombo;
    private javax.swing.JLabel langLabel;
    private javax.swing.JPanel matrixPanel;
    private javax.swing.JTextField maxField;
    private javax.swing.JLabel maxLabel;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem menuSettings;
    private javax.swing.JMenuItem menuShortcuts;
    private javax.swing.JMenu menuWindow;
    private javax.swing.JTextField minField;
    private javax.swing.JLabel minLabel;
    private javax.swing.JPanel propertiesPanel;
    private javax.swing.JButton saveSettings;
    private javax.swing.JDialog settingsDialog;
    private javax.swing.JPanel thresholdPanel;
    private javax.swing.JSlider thresholdSlider;
    // End of variables declaration//GEN-END:variables

    private void initLang() {
        
        // --- App ---
        setTitle(bundle.getString("title"));
        
        propertiesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("matrixProperties")));
        minLabel.setText(bundle.getString("minimum"));
        maxLabel.setText(bundle.getString("maximum"));
        generateButton.setText(bundle.getString("generate"));
        
        matrixPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("matrix")));
        
        thresholdPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("threshold")));
        
        menuWindow.setText(bundle.getString("window"));
        menuSettings.setText(bundle.getString("settings"));
        menuShortcuts.setText(bundle.getString("shortcuts"));
        
        // Errors
        errorLabel.setText("");
        
        
        
        // --- Settings ---
        settingsDialog.setTitle(bundle.getString("settings"));
        langLabel.setText(bundle.getString("language"));
        saveSettings.setText(bundle.getString("save"));
        cancelSettings.setText(bundle.getString("cancel"));
    }
}
