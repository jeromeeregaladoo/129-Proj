package DataStructs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Buyer {
        private String buyerCode, fName, lName, midInit, mName, cpNum, telNum, email;
        private int age;
    
    public Buyer(){
        //yet again
    }    
        
    public Buyer(String rawData){
    List<String> dataList = new ArrayList<String>(Arrays.asList(rawData.split(",")));
    buyerCode=dataList.get(0);
    fName=dataList.get(1);
    lName=dataList.get(2);
    midInit=dataList.get(3);
    mName=dataList.get(4);
    cpNum=dataList.get(5);
    telNum=dataList.get(6);
    email=dataList.get(7);
    age=Integer.parseInt(dataList.get(8));
    }

    public String getBuyerCode() {
        return buyerCode;
    }

    public void setBuyerCode(String buyerCode) {
        this.buyerCode = buyerCode;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getMidInit() {
        return midInit;
    }

    public void setMidInit(String midInit) {
        this.midInit = midInit;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getCpNum() {
        return cpNum;
    }

    public void setCpNum(String cpNum) {
        this.cpNum = cpNum;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
