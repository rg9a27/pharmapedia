package in.ac.miet.decoders.pharmapedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DisplayListView extends AppCompatActivity {

    String json_string;
    JSONObject jsonObject;
    JSONArray jsonArray;
    ContactAdapter contactAdapter;
    ListView listView;
    JSONArray jsonHeader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_list_view_layout);
        listView = (ListView)findViewById(R.id.listview);
        contactAdapter = new ContactAdapter(this,R.layout.raw_layout);
        listView.setAdapter(contactAdapter);
        json_string=getIntent().getExtras().getString("json_object");


        try{
            jsonObject = new JSONObject(json_string);
            jsonArray = jsonObject. getJSONArray("result");
            jsonHeader = jsonObject.getJSONArray("header");
            int counts = 0;
            String term,count;

            while(counts<jsonHeader.getInt(0)){

                JSONArray JA = jsonArray.getJSONArray(counts);

                Drug drug = new Drug(JA);
                    String salts="";
                    int countss=0;
                    while(countss<JA.getJSONArray(5).length()){
                        JSONArray onesalt=JA.getJSONArray(5).getJSONArray(countss);
                        int count2=0;
                        while (count2<onesalt.length()){
                            salts=salts+onesalt.getString(count2);
                            count2++;
                        }
                        salts=salts+'\n';
                        countss++;
                    }
                    drug.setSalts(salts);


             //  Contacts contacts = new Contacts(term,count);
                contactAdapter.add(drug);
                counts++;
            }
        }catch (JSONException e){
            e.printStackTrace();
        }
    }
}
