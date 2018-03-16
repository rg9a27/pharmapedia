package in.ac.miet.decoders.pharmapedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DisplayListView extends AppCompatActivity {

    String json_string;
    JSONObject jsonObject;
    JSONArray jsonArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_list_view_layout);

        json_string=getIntent().getExtras().getString("json_data");

        try{
            jsonObject = new JSONObject(json_string);
            jsonArray = jsonObject.getJSONArray()

            int count = 0;

            while(count<jsonObject.length()){

            }
        }catch (JSONException e){
            e.printStackTrace();
        }
    }
}
