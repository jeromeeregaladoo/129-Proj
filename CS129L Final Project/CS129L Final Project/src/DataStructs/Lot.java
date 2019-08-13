package DataStructs;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Lot {
    private String lotCode, blockCode, buyerCode, lotName, lotDesc;
    private double sqm, sqmCost, totalCost;
    //ArrayList<String> utilsCode; This will only bring suffering when implemented. Great idea, but terrible in practice
    
    public Lot(String rawData){
    List<String> dataList = new ArrayList<String>(Arrays.asList(rawData.split(",")));
    lotCode=dataList.get(0);
    blockCode=dataList.get(1);
    lotName=dataList.get(2);    //probably deprecate this
    lotDesc=dataList.get(3);
    sqm=Double.parseDouble(dataList.get(4));
    sqmCost=Double.parseDouble(dataList.get(5));
    totalCost= sqm*sqmCost; //make a taxrate for lots
    }
    
    public Lot(){
        
    }

    public void LotDebugPrint(){
        System.out.println("Lot Code = "+lotCode+"\tBlock Code="+blockCode+"\tbuyerCode="+buyerCode+"\tlotName"+lotName);
    }
    
    public String getLotCode() {
        return lotCode;
    }

    public void setLotCode(String lotCode) {
        this.lotCode = lotCode;
    }

    public String getBlockCode() {
        return blockCode;
    }

    public void setBlockCode(String blockCode) {
        this.blockCode = blockCode;
    }

    public String getLotName() {
        return lotName;
    }

    public void setLotName(String lotName) {
        this.lotName = lotName;
    }

    public String getLotDesc() {
        return lotDesc;
    }

    public void setLotDesc(String lotDesc) {
        this.lotDesc = lotDesc;
    }

    public double getSqm() {
        return sqm;
    }

    public void setSqm(double sqm) {
        this.sqm = sqm;
    }

    public double getSqmCost() {
        return sqmCost;
    }

    public void setSqmCost(double sqmCost) {
        this.sqmCost = sqmCost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public String getBuyerCode() {
        return buyerCode;
    }

    public void setBuyerCode(String buyerCode) {
        this.buyerCode = buyerCode;
    }
}
