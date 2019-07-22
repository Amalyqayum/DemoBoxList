package sg.edu.rp.c346.demoboxlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;



public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Color> contactsList;

    public CustomAdapter(Context context, int resource, ArrayList<Color> objects){
        super(context,resource,objects);
        parent_context=context;
        layout_id=resource;
        contactsList=objects;
    }public View getView (int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView=inflater.inflate(layout_id,parent,false);

        ImageView ivBox=rowView.findViewById(R.id.imageViewBox);

        Color currentItem = contactsList.get(position);
        if(currentItem.getColor()=="blue") {
            ivBox.setImageResource(R.drawable.blue_box);
        }else if(currentItem.getColor()=="orange"){
            ivBox.setImageResource(R.drawable.orange_box);
        }else{
            ivBox.setImageResource(R.drawable.brown_box);
        }
        return rowView;

    }
}
