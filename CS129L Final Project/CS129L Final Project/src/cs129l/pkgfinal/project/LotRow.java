package cs129l.pkgfinal.project;
import java.awt.Color;
import java.awt.Dimension;
public class LotRow extends javax.swing.JPanel {
        Lot lot = new Lot();
    public LotRow() {
        initComponents();
        this.setVisible(true);
        this.setSize(50, 20);
        this.setMaximumSize(new Dimension(50,20));
    }
    public LotRow(Lot lot) {
        this.lot = lot;
        initComponents();
        this.setVisible(true);
        this.setSize(50, 20);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText(lot.getLotCode());
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 46, 25));

        jLabel2.setText(lot.getBlockCode());
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 5, -1, -1));

        jLabel3.setText(lot.getLotName());
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 5, -1, -1));

        jLabel4.setText(Double.toString(lot.getSqm()));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 5, -1, -1));

        jLabel5.setText(Double.toString(lot.getTotalCost()));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 5, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        this.setBackground(Color.cyan);
    }//GEN-LAST:event_formMouseMoved

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        this.setBackground(Color.gray);
    }//GEN-LAST:event_formMouseExited

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        javax.swing.JFrame extensible = new javax.swing.JFrame();
        extensible.setVisible(true);
        extensible.setSize(600, 450);
        extensible.add(new LotUI(lot));
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
