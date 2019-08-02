/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs129l.pkgfinal.project.SearchFunctions;

import cs129l.pkgfinal.project.Lot;
import cs129l.pkgfinal.project.LotRow;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;
import cs129l.pkgfinal.project.*;

/**
 *
 * @author Reymuel
 */
public class BuyerSearch 
{
 private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) 
 {                                             
        String query ="SELECT * FROM BUYER WHERE";
        query += generateSubCond(query," BUYER_CODE LIKE",jTextField1);
        query += generateSubCond(query," F_NAME LIKE", jTextField2);
        query += generateSubCond(query," L_NAME LIKE", jTextField3);
        query += generateSubCond(query," MID_INIT LIKE", jTextField4);
        query += generateSubCond(query," M_NAME LIKE",jTextField5);
        query += generateSubCond(query," CP_NUM", jTextField6);
        query += generateSubCond(query," TEL_NUM", jTextField7);
        query += generateSubCond(query," EMAIL LIKE", jTextField8);
        
        if("AND".equals(query.substring(query.length()-3)))
        {query=query.substring(0, query.length()-3);}
        
        System.out.println(query);
        ArrayList<Lot> lots = c.BuyerSearch(query);
        Component[] components = jPanel1.getComponents();
        
        for (Component component : components) 
        {
            if(component instanceof BuyerSearch)
            jPanel1.remove(component);  
        }
        addToPanel(lots,jPanel1);
        jPanel1.revalidate();
        jPanel1.repaint();
    }                                            
    
    private void addToPanel(ArrayList<Lot> list, javax.swing.JPanel panel)
    {
        for (Lot item :list)
        {
            jPanel1.add(new LotRow(item));
        }
    }
    
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
        
        if(min.getText().isEmpty())
        {min.setText("0");}
        
        if(max.getText().isEmpty())
        {max.setText("999999999999");}
        
        if(Double.parseDouble(min.getText())<Double.parseDouble(max.getText()))
        {
        if(!query.contains("WHERE")){query+=" WHERE";}
            subcond+=cond +" >=" + min.getText() +" AND" + cond + " <=" + max.getText() +" AND";
        }
        
        else
        {
            subcond+=cond +" >=" + min.getText() +" AND";
        }
        return subcond;
    }   
}
