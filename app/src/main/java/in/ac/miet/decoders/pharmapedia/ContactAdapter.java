package in.ac.miet.decoders.pharmapedia;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rahul Gupta on 16-03-2018.
 */

public class ContactAdapter extends ArrayAdapter {
    List list = new ArrayList();
    public ContactAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }


    public void add(Drug object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row;
        row = convertView;
        ContactHolder contactHolder;
        if(row == null){
            LayoutInflater layoutInflater = (LayoutInflater)this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = layoutInflater.inflate(R.layout.raw_layout,parent,false);
            contactHolder = new ContactHolder();
            contactHolder.brand=(TextView)row.findViewById(R.id.brand);
            contactHolder.generic=(TextView)row.findViewById(R.id.generic);
            contactHolder.manufactuer=(TextView)row.findViewById(R.id.manufacturer);
            contactHolder.salts=(TextView)row.findViewById(R.id.salts);
            contactHolder.mode=(TextView)row.findViewById(R.id.mode);
            contactHolder.price=(TextView)row.findViewById(R.id.price);
            row.setTag(contactHolder);
        }
        else {
            contactHolder = (ContactHolder)row.getTag();
        }
        Drug drug = (Drug) this.getItem(position);
        contactHolder.brand.setText(drug.getBname());
        contactHolder.generic.setText(drug.getGname());
        contactHolder.manufactuer.setText(drug.getManufacturer());
        contactHolder.salts.setText(drug.getSalts());
        contactHolder.mode.setText(drug.getMode());
        contactHolder.price.setText(drug.getPrice());
        return row;
    }

    static class ContactHolder{
        TextView brand,generic,manufactuer,salts,mode,price;
    }
}
