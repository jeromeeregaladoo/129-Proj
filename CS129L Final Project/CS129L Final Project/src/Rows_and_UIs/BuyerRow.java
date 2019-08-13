package Rows_and_UIs;
import DataStructs.Buyer;
import java.awt.Dimension;
public class BuyerRow extends RowPrototype {
        Buyer b;
    public BuyerRow(Buyer b) {
        super();
        this.b = b;
        initComponents();
        this.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Code = new javax.swing.JLabel();
        ContactDetails = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Code.setText(b.getBuyerCode());
        add(Code, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 20));

        ContactDetails.setText(b.getTelNum()+"   "+b.getEmail());
        add(ContactDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 200, 20));

        Name.setText(b.getfName()+" "+b.getmName()+" "+b.getlName());
        add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 300, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        javax.swing.JFrame extensible = new javax.swing.JFrame();
        extensible.setVisible(true);
        extensible.setSize(600, 450);
        extensible.add(new BuyerUI(b));
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Code;
    private javax.swing.JLabel ContactDetails;
    private javax.swing.JLabel Name;
    // End of variables declaration//GEN-END:variables
}
