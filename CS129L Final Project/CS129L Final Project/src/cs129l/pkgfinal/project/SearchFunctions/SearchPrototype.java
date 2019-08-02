package cs129l.pkgfinal.project.SearchFunctions;

import PresentationPanels.RowPresentation;
import cs129l.pkgfinal.project.SQLConn;
import java.util.ArrayList;

public class SearchPrototype extends javax.swing.JPanel {
    
    SQLConn c;
    RowPresentation Panel;
    public SearchPrototype() {
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
    public String generateSubCond(String query, String cond, javax.swing.JTextField a)
    {
        String text = a.getText(); //paramter passing unmodified to retain compatibility, refactor too expensive
        String subcond="";
        
        if(!text.isEmpty())
        {
        if(!query.contains(" WHERE"))
        {query+=" WHERE";}
        
        subcond+=cond + text +" AND";
        }
        return subcond;
    }
    
    public String generateSubCond(String query, String cond, javax.swing.JTextField min, javax.swing.JTextField max)
    {
        String subcond="";
        String minT = min.getText(); //paramter passing unmodified to retain compatibility, refactor too expensive
        String maxT = max.getText(); //paramter passing unmodified to retain compatibility, refactor too expensive
        if(minT.isEmpty()){minT="999999999999999";}
        if(maxT.isEmpty()){maxT="999999999999999";}
        
        if(Double.parseDouble(minT)<Double.parseDouble(maxT))
        {if(!query.contains("WHERE")){query+=" WHERE";}
            subcond+=cond +" >=" + minT +" AND" + cond + " <=" + maxT +" AND";
        }else{
            subcond+=cond +" >=" + minT +" AND";
        }
        return subcond;
    }   
    
    private void addToPanel(ArrayList<Object> list){
        for (Object item :list){
            Panel.BuildRow(item);
        }
        Panel.revalidate();
        Panel.repaint();
    }
}
