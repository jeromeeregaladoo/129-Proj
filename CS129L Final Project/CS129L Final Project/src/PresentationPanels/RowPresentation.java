package PresentationPanels;

import cs129l.pkgfinal.project.Buyer;
import cs129l.pkgfinal.project.Lot;
import cs129l.pkgfinal.project.LotRow;

public class RowPresentation extends PresentationPrototype {

    public RowPresentation() {
        initComponents();
    }

    public void BuildRow(Object obj){
        if( obj instanceof Lot){
            Lot lot = Lot.class.cast(obj);
            this.add(new LotRow(lot));
        }/*else if(obj instanceof Buyer){
            Buyer buyer = Buyer.class.cast(obj);
            this.add(new LotRow(lot));                                  //implement BuyerRow, BlockRow first
        }else if(obj instanceof Lot){
            Lot lot = Lot.class.cast(obj);
            this.add(new LotRow(lot));
        }else if(){
            
        }*/
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
