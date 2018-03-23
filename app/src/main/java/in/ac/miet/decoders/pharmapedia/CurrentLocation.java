package in.ac.miet.decoders.pharmapedia;

import android.Manifest;
import android.content.Context;
import android.support.v4.app.ActivityCompat;

/**
 * Created by Rahul Gupta on 18-03-2018.
 */

public class CurrentLocation {
    private String latitude;
    private String longitude;

    public String getLattitude() {
        return latitude;
    }

    public void setLattitude(String lattitude) {
        this.latitude = lattitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

}
