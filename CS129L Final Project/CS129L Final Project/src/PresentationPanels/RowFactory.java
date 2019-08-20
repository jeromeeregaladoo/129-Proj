package PresentationPanels;

import DataStructs.Buyer;
import Rows_and_UIs.LotRow;
import DataStructs.Lot;
import Rows_and_UIs.BuyerRow;
import javax.swing.JPanel;

public class RowFactory {
    


public JPanel BuildRow(Object obj){
        if( obj instanceof Lot){
            Lot lot = Lot.class.cast(obj);
            return (new LotRow(lot));
        }else if(obj instanceof Buyer){
            Buyer buyer = Buyer.class.cast(obj);
            System.out.println("BuyerRow created");
            return(new BuyerRow(buyer));
            
        }else{ return new JPanel(); } //fail condition
    }
}