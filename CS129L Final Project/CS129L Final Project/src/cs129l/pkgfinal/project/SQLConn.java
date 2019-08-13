package cs129l.pkgfinal.project;
import DataStructs.Block;
import DataStructs.Buyer;
import DataStructs.Lot;
import java.sql.*;
import java.util.ArrayList;
public class SQLConn {
    private String user = "root";
    private String pass = "root";
    Connection c=null;
    public void getConnection()
    {
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/CS129_Lot_DB?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", user, pass);
        }catch(SQLException se)
	{
            System.out.println(se.getMessage());			
	}  
    }
    
    public ArrayList<Lot> LotSearch(String query){
        ArrayList<Lot> lots = new ArrayList();
        ResultSet t;
        Statement st;
        Lot temp = new Lot();
        getConnection();
        try{
            st=c.createStatement();
            t = st.executeQuery(query);
            while (t.next()){
            temp= new Lot();
            temp.setLotCode(t.getString(1));
            temp.setBlockCode(t.getString(2));
            temp.setBuyerCode(t.getString(3));
            temp.setLotName(t.getString(4));
            temp.setLotDesc(t.getString(5));
            temp.setSqm(t.getDouble(6));
            temp.setSqmCost(t.getDouble(7));
            temp.setTotalCost(t.getDouble(8));
            lots.add(temp);
            //System.out.println("lot added in SQLConn with code " + temp.getLotCode());
            //lots.get(lots.lastIndexOf(temp)).LotDebugPrint();
            }
            st.close(); t.close(); c.close();
	}
	catch(SQLException se)
	{
            System.out.println(se.getMessage());			
	}
        return lots;
    }
    public ArrayList<Block> getBlocks(String query){
        ArrayList<Block> blocks = new ArrayList();
        ResultSet t;
        Statement st;
        Block temp= new Block();
        getConnection();
        try{
            st=c.createStatement();
            t = st.executeQuery(query);
            while (t.next()){
            temp.setBlockCode(t.getString(1));
            temp.setBlockName(t.getString(2));
            temp.setBlockDesc(t.getString(3));
            blocks.add(temp);
            }
            st.close(); t.close(); c.close();
	}
	catch(SQLException se)
	{
            System.out.println(se.getMessage());			
	}
        return blocks;
    }
    public ArrayList<Buyer> getBuyer(String query){
        ArrayList<Buyer> buyers = new ArrayList();
        ResultSet t;
        Statement st;
        Buyer temp= new Buyer();
        
        getConnection();
        try{
            st=c.createStatement();
            t = st.executeQuery(query);
            while (t.next()){
            temp.setBuyerCode(t.getString(1));
            temp.setfName(t.getString(2));
            temp.setlName(t.getString(3));
            temp.setMidInit(t.getString(4));
            temp.setmName(t.getString(5));
            temp.setCpNum(t.getString(6));
            temp.setTelNum(t.getString(7));
            temp.setEmail(t.getString(8));
            temp.setAge(t.getInt(9));
            buyers.add(temp);
            }
            st.close(); t.close(); c.close();
	}
	catch(SQLException se)
	{
            System.out.println(se.getMessage());			
	}
        return buyers;
    }
    
    public void executeUpdate(String query){
            Statement st;
            getConnection();
            try{
            st=c.createStatement();
            st.executeQuery(query);
        }
	catch(SQLException se)
	{
            System.out.println(se.getMessage());			
	}
}
}
