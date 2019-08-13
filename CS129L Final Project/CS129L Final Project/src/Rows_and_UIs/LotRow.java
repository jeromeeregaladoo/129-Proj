package Rows_and_UIs;
import DataStructs.Lot;
import java.awt.Dimension;
public class LotRow extends RowPrototype {
        Lot lot;
    public LotRow(Lot lot) {
        super();
        this.lot = lot;
        initComponents();
        this.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
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
