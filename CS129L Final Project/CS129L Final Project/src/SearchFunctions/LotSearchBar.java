
package SearchFunctions;

import PresentationPanels.RowPresentation;
import DataStructs.Lot;
import cs129l.pkgfinal.project.SQLConn;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.Box;

public class LotSearchBar extends SearchPrototype {
    
    public LotSearchBar() {
        super(new RowPresentation(), new SQLConn());
        initComponents();
    }  

    public LotSearchBar(RowPresentation Panel, SQLConn c) {
        super(Panel,c);
        initComponents();
    }                                     
 
 private void SearchButtonActionPerformed(java.awt.event.MouseEvent evt) 
 {                                             
        String query ="SELECT * FROM LOT WHERE";
        query += generateSubCond(query," LOT_CODE LIKE",LotCode);
        query += generateSubCond(query," BLOCK_CODE LIKE", BlockCode);
        query += generateSubCond(query," BUYER_CODE LIKE", BuyerCode);
        query += generateSubCond(query," BUYER_NAME LIKE", BuyerName);
        query += generateSubCond(query," LOT_NAME LIKE", LotName);
        query += generateSubCond(query," LOT_DESC LIKE",LotDesc);
        query += generateSubCond(query," SQM", SQMLowerBound, SQMUpperBound);
        query += generateSubCond(query," SQM_COST", SQMCostLowerBound, SQMCostUpperBound);
        query += generateSubCond(query," TOTAL_COST", TotalCostLowerBound, TotalCostUpperBound);
        
        if("AND".equals(query.substring(query.length()-3)))
        {query=query.substring(0, query.length()-3);}
        System.out.println(query);
        addToPanel(c.LotSearch(query));
    }
    
    private void addToPanel(ArrayList<Lot> list){
        
        /*
        Panel.Clear();
        for (int n=0; n<list.size(); n++)
        {
            Panel.add(Panel.factory.BuildRow(list.get(n)));
            System.out.println("BuildRow proc firing on lot code "+ list.get(n).getLotCode());
        }
        
        Panel.add(Box.createVerticalStrut(100));
        
        
        Panel.revalidate();
        Panel.repaint();
        */
        
        Panel.Clear();
        int m=0;
        for (int n=0; n<list.size(); n++){
            //System.out.println(Panel.factory.BuildRow(list.get(n)));
            Panel.AddRow(list.get(n));
            
            //System.out.println("BuildRow proc firing on lot code "+ list.get(n).getLotCode());
            
        }
        /*
        Component[] components = Panel.getComponents();
        
        for (Component component : components) {
            m++;
        }
        System.out.println("m="+m);*/
        Panel.revalidate();
        Panel.repaint();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        LotCode = new javax.swing.JTextField();
        BuyerCode = new javax.swing.JTextField();
        BuyerName = new javax.swing.JTextField();
        LotName = new javax.swing.JTextField();
        LotDesc = new javax.swing.JTextField();
        SQMUpperBound = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        SQMLowerBound = new javax.swing.JTextField();
        SQMCostLowerBound = new javax.swing.JTextField();
        SQMCostUpperBound = new javax.swing.JTextField();
        TotalCostUpperBound = new javax.swing.JTextField();
        TotalCostLowerBound = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        BlockCode = new javax.swing.JTextField();

        jTextField3.setText("jTextField3");

        jTextField13.setText("jTextField7");

        jTextField14.setText("jTextField7");

        SearchButton.setText("Search");
        SearchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchButtonMouseClicked(evt);
            }
        });

        SQMUpperBound.setText("1000000");

        jLabel1.setText("Lot Code");

        jLabel2.setText("Buyer Code");

        jLabel3.setText("Buyer Name");

        jLabel4.setText("Description");

        jLabel5.setText("SQM");

        jLabel6.setText("Lot Name");

        jLabel7.setText("SQM Cost");

        jLabel9.setText("Total Cost");

        SQMLowerBound.setText("0");

        SQMCostLowerBound.setText("0");

        SQMCostUpperBound.setText("1000000");

        TotalCostUpperBound.setText("100000000");

        TotalCostLowerBound.setText("0");

        jLabel8.setText("-");

        jLabel10.setText("-");

        jLabel11.setText("-");

        jLabel12.setText("Block Code");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SQMCostLowerBound, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SQMCostUpperBound, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SQMLowerBound, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SQMUpperBound, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LotDesc)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TotalCostLowerBound, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TotalCostUpperBound, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BuyerCode, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LotName)
                            .addComponent(BuyerName)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(LotCode))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(BlockCode)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(LotCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(BlockCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(BuyerCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(BuyerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(LotName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(LotDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(SQMUpperBound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SQMLowerBound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(SQMCostUpperBound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SQMCostLowerBound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TotalCostUpperBound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TotalCostLowerBound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addComponent(SearchButton)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SearchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchButtonMouseClicked
        SearchButtonActionPerformed(evt);
    }//GEN-LAST:event_SearchButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BlockCode;
    private javax.swing.JTextField BuyerCode;
    private javax.swing.JTextField BuyerName;
    private javax.swing.JTextField LotCode;
    private javax.swing.JTextField LotDesc;
    private javax.swing.JTextField LotName;
    private javax.swing.JTextField SQMCostLowerBound;
    private javax.swing.JTextField SQMCostUpperBound;
    private javax.swing.JTextField SQMLowerBound;
    private javax.swing.JTextField SQMUpperBound;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField TotalCostLowerBound;
    private javax.swing.JTextField TotalCostUpperBound;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
