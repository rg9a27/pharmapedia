package in.ac.miet.decoders.pharmapedia;

import android.Manifest;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Build;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class DrugDetailsActivity extends AppCompatActivity{

    private String JSONString;
    private String json_string;
    private Button getJsonButton;
    private Button parseJsonButton;
    private TextView mLatitude;
    private TextView mLongitude;
    private Button currentLocation;
    private Button availabilityButton;

    CurrentLocation cLocation;
    private TextView drugName;
    private String searchDrug;
    private String drug;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drug_detail);

        searchDrug=getIntent().getExtras().getString("json_object");
        drug = searchDrug;

      /*  getJsonButton = (Button)findViewById(R.id.get_json);
        getJsonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getJson();
            }
        });

        parseJsonButton=(Button)findViewById(R.id.parse_json);
        parseJsonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parseJSON();
            }
        });
        */
        mLatitude=(TextView)findViewById(R.id.latitude);
        mLongitude=(TextView)findViewById(R.id.longitude);

     /*   currentLocation=(Button)findViewById(R.id.current_location);
        currentLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                locationManager = (LocationManager)getSystemService((Context.LOCATION_SERVICE));
                getLocation();
            }
        });  */

        availabilityButton=(Button)findViewById(R.id.availability_button);
        availabilityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            //    Intent i = new Intent(DrugDetailsActivity.this,FiltersActivity.class);
            //    i.putExtra("latitude",cLocation.getLattitude());
             //   i.putExtra("longitude",cLocation.getLongitude());
            //    i.putExtra("drugname",searchDrug);
            //    startActivity(i);
            }
        });
        drugName = (TextView)findViewById(R.id.textView);
        drugName.setText(searchDrug);


    }
   /* public void getJson(){
        new BackgroundTask().execute();
    }

    class BackgroundTask extends AsyncTask<Void, Void, String> {

        String json_url;

        @Override
        protected  void onPreExecute(){
            json_url= "https://api.fda.gov/drug/label.json?count=openfda.product_type.exact";
        }

        @Override
        protected  String doInBackground(Void... voids){
            try {
                URL url = new URL(json_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder stringBuilder = new StringBuilder();
                while((JSONString = bufferedReader.readLine())!=null){
                    stringBuilder.append(JSONString+"\n");
                }
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                String json = stringBuilder.toString().trim();
                return  json;

            }catch(MalformedURLException e){
                e.printStackTrace();

            }catch (IOException e){

                e.printStackTrace();
            }
            return  null;
        }

        @Override
        protected  void onProgressUpdate(Void... values){
            super.onProgressUpdate(values);
        }

        @Override
        protected  void onPostExecute(String result){
        //    TextView textView=(TextView)findViewById(R.id.textview);
       //     textView.setText(result);
            json_string=result;
        }
    }

    public void parseJSON(){

        if(json_string == null){
            Toast.makeText(getApplicationContext(),"First get json",Toast.LENGTH_LONG).show();
        }
        else{
            Intent intent = new Intent(this,DisplayListView.class);
            intent.putExtra("json_data",json_string);
            startActivity(intent);
        }
    }
      */

   /* void getLocation(){
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)!= PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this,Manifest.permission.ACCESS_COARSE_LOCATION)!=PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION},1);
        }
        else{
            Location location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);

            if(location != null){
                cLocation = new CurrentLocation();
                cLocation.setLattitude(location.getLatitude()+"");
                cLocation.setLongitude(location.getLongitude()+"");
                mLatitude.setText("Lattitude: "+cLocation.getLattitude());
                mLongitude.setText("Longitude: "+cLocation.getLongitude()+"");
            }

            else{
                Toast.makeText(DrugDetailsActivity.this,"Unable to find current location",Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults){
        super.onRequestPermissionsResult(requestCode,permissions,grantResults);

        switch (requestCode){
            case 1 : getLocation();
                break;
        }
    } */



}
