package PresentationPanels;

import cs129l.pkgfinal.project.SQLConn;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;

public class PresentationPrototype extends javax.swing.JPanel {
    SQLConn c;
    
    public PresentationPrototype() {
        this.c=null;
        initComponents();
        this.setVisible(true);
    }
    public PresentationPrototype(SQLConn c) {
        this.c=c;
        initComponents();
        this.setVisible(true);
    }
    
    public void Clear(){
        Component[] components = this.getComponents();
        for (Component component : components) {
            this.remove(component);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
