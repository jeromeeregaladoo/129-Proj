package PresentationPanels;

import DataStructs.Buyer;
import DataStructs.Lot;
import Rows_and_UIs.LotRow;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;

public class RowPresentation extends PresentationPrototype {
    public RowFactory factory = new RowFactory();
    
        
    //private JPanel testy = new JPanel();
    //JTable table = new JTable();
    public RowPresentation() {
        super();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(Color.decode("#FFFFFF"));
        this.setBorder(BorderFactory.createLineBorder(Color.decode("#000000"), 2));/*
        this.setSize(new Dimension(604,604));
        this.setMaximumSize(new Dimension(604,604));
        this.setPreferredSize(new Dimension(604,604));*/
        //this.add(scroller, BorderLayout.WEST);\
       
    }
    
    public void AddRow(Object obj){
        this.add(factory.BuildRow(obj), BorderLayout.NORTH);
        this.revalidate();
        this.repaint();
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
