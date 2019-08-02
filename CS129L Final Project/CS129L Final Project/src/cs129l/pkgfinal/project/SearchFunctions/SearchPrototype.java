
package cs129l.pkgfinal.project.SearchFunctions;

public class SearchPrototype extends javax.swing.JPanel {

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
 public String generateSubCond(String query, String cond, javax.swing.JTextField a)
    {
        String subcond="";
        
        if(!a.getText().isEmpty())
        {
        if(!query.contains(" WHERE"))
        {query+=" WHERE";}
        
        subcond+=cond + a.getText() +" AND";
        }
        return subcond;
    }
    
    public String generateSubCond(String query, String cond, javax.swing.JTextField min, javax.swing.JTextField max)
    {
        String subcond="";
        String maxT = max.getText();
        String minT = min.getText();
        if(minT.isEmpty())
        {minT="0";}
        
        if(maxT.isEmpty())
        {maxT="999999999999";}
        
        if(Double.parseDouble(minT)<Double.parseDouble(maxT))
        {
        if(!query.contains("WHERE")){query+=" WHERE";}
            subcond+=cond +" >=" + minT +" AND" + cond + " <=" + maxT +" AND";
        }
        
        else
        {
            subcond+=cond +" >=" + min.getText() +" AND";
        }
        return subcond;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
