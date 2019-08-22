package SearchFunctions;

import PresentationPanels.RowPresentation;
import cs129l.pkgfinal.project.SQLConn;
import java.util.ArrayList;

public class SearchPrototype extends javax.swing.JPanel {
    
    SQLConn c;
    RowPresentation Panel;
    public SearchPrototype(RowPresentation Panel, SQLConn c) {
        this.Panel = Panel;
        this.c = c;
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
        
        if(!text.isEmpty())
        {
        if(!query.contains(" WHERE"))
        {query+=" WHERE";}
        
        return cond + " '%"+ text +"%'" +" AND";
        }
        return "";
    }
    
    public String generateSubCond(String query, String cond, javax.swing.JTextField min, javax.swing.JTextField max)
    {
        String subcond="";
        String minT = min.getText(); //paramter passing unmodified to retain compatibility, refactor too expensive
        String maxT = max.getText(); //paramter passing unmodified to retain compatibility, refactor too expensive
        //System.out.println("test"+ maxT.length());
        //System.out.println("0 value \t"+minT+"\t1:\t"+minT.isEmpty()+"\t2:\t"+minT==null+"\t3:\t"+minT.equals("")+"\t4:\t"+minT.equals(" "));
        //System.out.println("0:\t"+minT+"\t1:\t"+maxT.isEmpty()+"\t2:\t"+maxT==null+"\t3:\t"+maxT.equals("")+"\t4:\t"+maxT.equals(" "));
        if(minT.isEmpty()||minT==null||minT.equals("")||minT.equals(" ")){minT="0";}
        if(maxT.isEmpty()||maxT==null||maxT.equals("")||maxT.equals(" ")){maxT="999999999999999999999";}
        
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
            Panel.factory.BuildRow(item);
        }
        Panel.revalidate();
        Panel.repaint();
    }
}
