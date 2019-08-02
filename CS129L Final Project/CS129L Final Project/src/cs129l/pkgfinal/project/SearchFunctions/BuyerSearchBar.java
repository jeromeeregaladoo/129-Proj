/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs129l.pkgfinal.project.SearchFunctions;

/**
 *String query ="SELECT * FROM BUYER WHERE";
        query += generateSubCond(query," BUYER_CODE LIKE",jTextField1);
        query += generateSubCond(query," F_NAME LIKE", jTextField2);
        query += generateSubCond(query," L_NAME LIKE", jTextField3);
        query += generateSubCond(query," MID_INIT LIKE", jTextField4);
        query += generateSubCond(query," M_NAME LIKE",jTextField5);
        query += generateSubCond(query," CP_NUM", jTextField6);
        query += generateSubCond(query," TEL_NUM", jTextField7);
        query += generateSubCond(query," EMAIL LIKE", jTextField8);
 * @author nicht
 */
public class BuyerSearchBar extends SearchPrototype {

    /**
     * Creates new form BuyerSearchBar
     */
    public BuyerSearchBar() {
        initComponents();
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
