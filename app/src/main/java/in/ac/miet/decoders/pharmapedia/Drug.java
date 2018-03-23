package in.ac.miet.decoders.pharmapedia;

import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by Rahul Gupta on 15-03-2018.
 */

public class Drug {

    private String bname;
    private String gname;
    private String mode;
    private String manufacturer;
    private String price;
    private String salts;


    public Drug(JSONArray drugDetails ) throws JSONException {
        this.bname = drugDetails.getString(0);
        this.gname = drugDetails.getString(1);
        this.mode = drugDetails.getString(2);
        this.manufacturer = drugDetails.getString(3);
        this.price = drugDetails.getString(4);
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSalts() {
        return salts;
    }

    public void setSalts(String salts){
        this.salts=salts;
    }




}
