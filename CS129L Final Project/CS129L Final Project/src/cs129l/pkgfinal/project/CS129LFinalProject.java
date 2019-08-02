package cs129l.pkgfinal.project;
import java.sql.*;
import javax.swing.*;
import java.util.ArrayList;
public class CS129LFinalProject {
    
    public static void main(String[] args) {/*
        SQLConn connectyboi = new SQLConn();
        connectyboi.getConnection();
        ArrayList<Lot> lots= new ArrayList();
        try{
        connectyboi.c.createStatement();
        connectyboi.rs = connectyboi.s.executeQuery("Select * from LOT");
        while(connectyboi.rs.next()){
            lots.add(connectyboi.getLot(connectyboi.rs));
            System.out.print(lots.get(lots.size()-1).getLotCode()+"\t");
        }
        connectyboi.c.close();
        connectyboi.s.close();
        }catch(SQLException se)
	{
            System.out.println(se.getMessage());
	}
        *//*
        SQLConn connectyboi = new SQLConn();
        ArrayList<Lot> lots = connectyboi.LotSearch("select * from LOT");
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(1000, 1000);
        LotUI lotty = new LotUI(lots.get(0));
        lotty.setVisible(true);
        frame.add(lotty);*/
        /*SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame.add(LotUI(lots.get(0)));
            }
        });*/
        MainFrame main = new MainFrame();
        SQLConn connectyboi = new SQLConn();
        connectyboi.getConnection();
        main.c = connectyboi;
    }
    
}
