package PresentationPanels;

import DataStructs.Buyer;
import DataStructs.Lot;
import Rows_and_UIs.LotRow;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTable;

public class RowPresentation extends PresentationPrototype {
    public RowFactory factory = new RowFactory();
    
        
    //private JPanel testy = new JPanel();
    //JTable table = new JTable();
    public RowPresentation() {
        super();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(Color.decode("#FFFFFF"));
        this.setBorder(BorderFactory.createLineBorder(Color.decode("#000000"), 2));
        this.setSize(new Dimension(604,604));
        this.setMaximumSize(new Dimension(604,604));
        this.setPreferredSize(new Dimension(604,604));
        //testy.setSize(1080, 720);
        //testy.setVisible(true);
        //testy.setLayout(new BoxLayout(testy, BoxLayout.Y_AXIS));
        //Lot temp = new Lot("A,B,C,D,1,2");
        //table.add(new LotRow(temp));
        //this.add(new LotRow(temp));
        //this.add(testy);
        //table.setVisible(true);
        //table.setSize(600,600);
        //table.setRowHeight(60);
        //this.add(table);
    }
    
    public void AddRow(Object obj){
        this.add(factory.BuildRow(obj), BorderLayout.NORTH);
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
