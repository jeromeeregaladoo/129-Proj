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

public class RowPresentation extends PresentationPrototype {
    public RowFactory factory = new RowFactory();
    
        JPanel testy = new JPanel();
    public RowPresentation() {
        //Did you set the area which is the container? 6:45 
        //I don't think it's the Layout Manager 6:57
        super();
        //this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setLayout(new FlowLayout());
        this.setBackground(Color.decode("#FFFFFF"));
        this.setBorder(BorderFactory.createLineBorder(Color.decode("#000000"), 2));
        this.setSize(new Dimension(604,604));
        this.setMaximumSize(new Dimension(604,604));
        this.setPreferredSize(new Dimension(604,604));
        testy.setSize(1080, 720);
        testy.setVisible(true);
        testy.setLayout(new BoxLayout(testy, BoxLayout.Y_AXIS));
        Lot temp = new Lot("A,B,C,D,1,2");
        testy.add(new LotRow(temp));
        //this.add(new LotRow(temp));
        this.add(testy);
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
