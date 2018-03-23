package in.ac.miet.decoders.pharmapedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FiltersActivity extends AppCompatActivity {

    private CurrentLocation currentLocation;
    private String drugName;
    private Button goButton;
    private Spinner spinnerPrice;
    private Spinner spinnerMg;
    private Spinner spinnerBrand;
    private SeekBar distanceSeekBar;
    private TextView distanceValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.filters);

      //  currentLocation = new CurrentLocation();
      //  currentLocation.setLongitude(getIntent().getExtras().getString("latitude"));
      //  currentLocation.setLongitude(getIntent().getExtras().getString("longitude"));
      //  drugName=getIntent().getExtras().getString("drugname");

        goButton=(Button)findViewById(R.id.button);
        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FiltersActivity.this,SearchResultActivity.class);
                startActivity(i);
            }
        });

        spinnerPrice=(Spinner)findViewById(R.id.spinner);
        spinnerPrice.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(adapterView.getContext(), "Selected: "+item, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinnerMg=(Spinner)findViewById(R.id.spinner2);
        spinnerMg.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(adapterView.getContext(), "Selected: "+item, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        distanceValue=(TextView)findViewById(R.id.textView6);

        spinnerBrand=(Spinner)findViewById(R.id.spinner3);
        spinnerBrand.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(adapterView.getContext(), "Selected: "+item, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        List<String> categories = new ArrayList<>();
        categories.add("0 - 10");
        categories.add("10 - 20");
        categories.add("20 - 50");
        categories.add("50 - 100");
        categories.add("100 - 200");
        categories.add("200 - 500");
        categories.add("500 - 1000");
        categories.add("1000 - 2000");

        List<String> brandCategories = new ArrayList<>();
        brandCategories.add("Ranbaxy");
        brandCategories.add("Cipla");
        brandCategories.add("Mankind");

        ArrayAdapter<String> brandAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,brandCategories);
        brandAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerBrand.setAdapter(brandAdapter);

        ArrayAdapter<String> dataPriceAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,categories);
        dataPriceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPrice.setAdapter(dataPriceAdapter);

        ArrayAdapter<String> dataMgAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,categories);
        dataMgAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMg.setAdapter(dataMgAdapter);

        distanceSeekBar = (SeekBar)findViewById(R.id.seekBar);
        distanceSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
               distanceValue.setText(i+"");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
