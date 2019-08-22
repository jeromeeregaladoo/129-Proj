package DataStructs;
import java.util.ArrayList;
import java.util.Arrays;
public class Block {
    private String blockCode, blockName, blockDesc;

    public Block(String rawData){
    ArrayList<String> dataList = (ArrayList<String>)Arrays.asList(rawData.split(","));
    blockCode=dataList.get(0);
    blockName=dataList.get(1); 
    blockDesc=dataList.get(2);
    }
    
    public Block(){
        //lel
    }
    
    public String getBlockCode() {
        return blockCode;
    }

    public void setBlockCode(String blockCode) {
        this.blockCode = blockCode;
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public String getBlockDesc() {
        return blockDesc;
    }

    public void setBlockDesc(String blockDesc) {
        this.blockDesc = blockDesc;
    }
    /*Only re-add this if you're going to build a lot cache, which you probably don't need to do.
    public ArrayList<Lot> getLots() {
        return lots;
    }

    public void setLots(ArrayList<Lot> lots) {
        this.lots = lots;
    }*/
    
    
}
