package in.ac.miet.decoders.pharmapedia;

/**
 * Created by Rahul Gupta on 15-03-2018.
 */

public class Drug {

    private String drugId;
    private String drugName;
    private double drugPrice;
    private String manufacturerName;
    private int drugQuantity;
    private boolean isBlackListed = false;
    private String[] drugSalts;
    private String drugClass;
    private String drugMode;
    private boolean isOTC = false;

    public String getDrugId() {
        return drugId;
    }

    public void setDrugId(String drugId) {
        this.drugId = drugId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public double getDrugPrice() {
        return drugPrice;
    }

    public void setDrugPrice(double drugPrice) {
        this.drugPrice = drugPrice;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getDrugQuantity() {
        return drugQuantity;
    }

    public void setDrugQuantity(int drugQuantity) {
        this.drugQuantity = drugQuantity;
    }

    public boolean isBlackListed() {
        return isBlackListed;
    }

    public void setBlackListed(boolean blackListed) {
        isBlackListed = blackListed;
    }

    public String[] getDrugSalts() {
        return drugSalts;
    }

    public void setDrugSalts(String[] drugSalts) {
        this.drugSalts = drugSalts;
    }

    public String getDrugClass() {
        return drugClass;
    }

    public void setDrugClass(String drugClass) {
        this.drugClass = drugClass;
    }

    public String getDrugMode() {
        return drugMode;
    }

    public void setDrugMode(String drugMode) {
        this.drugMode = drugMode;
    }

    public boolean isOTC() {
        return isOTC;
    }

    public void setOTC(boolean OTC) {
        isOTC = OTC;
    }
}
