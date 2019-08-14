/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationPanels;

import Rows_and_UIs.LotRow;
import DataStructs.Lot;
import javax.swing.JPanel;

/**
 *
 * @author nicht
 */
public class RowFactory {
    


public JPanel BuildRow(Object obj){
        if( obj instanceof Lot){
            Lot lot = Lot.class.cast(obj);
            return (new LotRow(lot));
        }/*else if(obj instanceof Buyer){
            Buyer buyer = Buyer.class.cast(obj);
            this.add(new LotRow(lot));                                  //implement BuyerRow, BlockRow first
        }else if(obj instanceof Lot){
            Lot lot = Lot.class.cast(obj);
            this.add(new LotRow(lot));
        }else if(){
            
        }*/
        return new JPanel(); //fail condition
    }
}