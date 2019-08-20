package PresentationPanels;

import cs129l.pkgfinal.project.SQLConn;
import java.awt.Component;
import javax.swing.BoxLayout;

public class PresentationPrototype extends javax.swing.JPanel {
    SQLConn c;
    
    public PresentationPrototype() {
        this.c=null;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        initComponents();
        this.setVisible(true);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        //System.out.println("Presentation Prototype layout manager "+this.getLayout().toString());
    }
    public PresentationPrototype(SQLConn c) {
        this.c=c;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
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
