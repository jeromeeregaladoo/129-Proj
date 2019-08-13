package PresentationPanels;

import DataStructs.Buyer;
import DataStructs.Lot;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;

public class RowPresentation extends PresentationPrototype {
    public RowFactory factory = new RowFactory();
    public RowPresentation() {
        super();
        this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        initComponents();
        this.setBackground(Color.decode("#FFFFFF"));
        this.setBorder(BorderFactory.createLineBorder(Color.decode("#000000"), 2));
        this.setSize(new Dimension(604,604));
        this.setMaximumSize(new Dimension(604,604));
        this.setPreferredSize(new Dimension(604,604));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
