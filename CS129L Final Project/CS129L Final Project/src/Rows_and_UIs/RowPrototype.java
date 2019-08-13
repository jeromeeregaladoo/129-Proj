
package Rows_and_UIs;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;

public class RowPrototype extends javax.swing.JPanel {
    final Color BASE = Color.decode("#E6E9F0");
    final Color HIGHLIGHTED = Color.decode("#DEF3FF");
    public RowPrototype() {
        initComponents();
        this.setBackground(BASE);
        this.setSize(new Dimension(600,24));
        this.setMaximumSize(new Dimension(600,24));
        this.setPreferredSize(new Dimension(600,24));
        this.setBorder(BorderFactory.createLineBorder(Color.decode("#C0C0C0"), 1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        this.setBackground(BASE);
    }//GEN-LAST:event_formMouseExited

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        this.setBackground(HIGHLIGHTED);
    }//GEN-LAST:event_formMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
