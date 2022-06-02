/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ColorPicker;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatDraculaIJTheme;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author mear
 */
public class Main extends javax.swing.JFrame {

    Picker picker = new Picker();

    /**
     * Creates new form ColorChooser
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        blueColor = new java.awt.Scrollbar();
        greenColor = new java.awt.Scrollbar();
        redColor = new java.awt.Scrollbar();
        jLabel3 = new javax.swing.JLabel();
        selectedColor = new javax.swing.JPanel();
        selectedColorRGBValue = new javax.swing.JLabel();
        selectedColorHEXValue = new javax.swing.JLabel();
        copyHEXvalue = new javax.swing.JButton();
        copyRGBvalue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Color Picker");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Red");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Green");

        blueColor.setBackground(new java.awt.Color(19, 161, 255));
        blueColor.setMaximum(256);
        blueColor.setOrientation(java.awt.Scrollbar.HORIZONTAL);
        blueColor.setValue(127);
        blueColor.setVisibleAmount(1);
        blueColor.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                blueColorAdjustmentValueChanged(evt);
            }
        });

        greenColor.setBackground(new java.awt.Color(37, 254, 89));
        greenColor.setMaximum(256);
        greenColor.setOrientation(java.awt.Scrollbar.HORIZONTAL);
        greenColor.setValue(127);
        greenColor.setVisibleAmount(1);
        greenColor.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                greenColorAdjustmentValueChanged(evt);
            }
        });

        redColor.setBackground(new java.awt.Color(255, 42, 42));
        redColor.setMaximum(256);
        redColor.setOrientation(java.awt.Scrollbar.HORIZONTAL);
        redColor.setValue(127);
        redColor.setVisibleAmount(1);
        redColor.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                redColorAdjustmentValueChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Blue");

        selectedColor.setBackground(new java.awt.Color(127, 127, 127));

        javax.swing.GroupLayout selectedColorLayout = new javax.swing.GroupLayout(selectedColor);
        selectedColor.setLayout(selectedColorLayout);
        selectedColorLayout.setHorizontalGroup(
            selectedColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );
        selectedColorLayout.setVerticalGroup(
            selectedColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
        );

        selectedColorRGBValue.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        selectedColorRGBValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectedColorRGBValue.setText("RGB : [127, 127, 127]");

        selectedColorHEXValue.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        selectedColorHEXValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectedColorHEXValue.setText("HEX : #7F7F7F");

        copyHEXvalue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/colorPicker/icons/contentCopy.png"))); // NOI18N
        copyHEXvalue.setBorder(null);
        copyHEXvalue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyHEXvalueActionPerformed(evt);
            }
        });

        copyRGBvalue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/colorPicker/icons/contentCopy.png"))); // NOI18N
        copyRGBvalue.setBorder(null);
        copyRGBvalue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyRGBvalueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(greenColor, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(blueColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(redColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectedColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(selectedColorHEXValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectedColorRGBValue, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(copyHEXvalue)
                            .addComponent(copyRGBvalue))))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(redColor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(greenColor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(blueColor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(selectedColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(copyRGBvalue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectedColorRGBValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectedColorHEXValue)
                            .addComponent(copyHEXvalue))))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void redColorAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_redColorAdjustmentValueChanged
        picker.setRedColor(redColor.getValue());
        setLabelText();
    }//GEN-LAST:event_redColorAdjustmentValueChanged

    private void greenColorAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_greenColorAdjustmentValueChanged
        picker.setGreenColor(greenColor.getValue());
        setLabelText();
    }//GEN-LAST:event_greenColorAdjustmentValueChanged

    private void blueColorAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_blueColorAdjustmentValueChanged
        picker.setBlueColor(blueColor.getValue());
        setLabelText();
    }//GEN-LAST:event_blueColorAdjustmentValueChanged

    private void copyHEXvalueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyHEXvalueActionPerformed
        picker.copyValue(picker.getColorHEXValue());
    }//GEN-LAST:event_copyHEXvalueActionPerformed

    private void copyRGBvalueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyRGBvalueActionPerformed
        picker.copyValue(picker.getColorRGBValue());
    }//GEN-LAST:event_copyRGBvalueActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });

    }

    public void setLabelText() {
        //set/get color value
        picker.setSelectedColor(new Color(picker.getRedColor(), picker.getGreenColor(), picker.getBlueColor()));
        selectedColor.setBackground(picker.getSelectedColor());
        //set/get RGB value
        picker.setColorRGBValue("[" + picker.getRedColor() + "," + picker.getGreenColor() + "," + picker.getBlueColor() + "]");
        selectedColorRGBValue.setText("RGB : " + picker.getColorRGBValue());
        //set/get HEX value
        picker.setColorHEXValue("#" + Integer.toHexString(picker.getSelectedColor().getRGB()).substring(2));
        selectedColorHEXValue.setText("HEX : " + picker.getColorHEXValue().toUpperCase());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Scrollbar blueColor;
    private javax.swing.JButton copyHEXvalue;
    private javax.swing.JButton copyRGBvalue;
    private java.awt.Scrollbar greenColor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.Scrollbar redColor;
    private javax.swing.JPanel selectedColor;
    private javax.swing.JLabel selectedColorHEXValue;
    private javax.swing.JLabel selectedColorRGBValue;
    // End of variables declaration//GEN-END:variables
}
