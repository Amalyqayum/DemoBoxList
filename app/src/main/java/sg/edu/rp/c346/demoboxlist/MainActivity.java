package sg.edu.rp.c346.demoboxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvContact;
    ArrayList<Color> alContactList;
    CustomAdapter caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact=findViewById(R.id.ListView);
        alContactList= new ArrayList<>();
        Color item1 = new Color("blue");
        Color item2 = new Color("orange");
        Color item3 = new Color("brown");
        alContactList.add(item1);
        alContactList.add(item2);
        alContactList.add(item3);
        caContact=new CustomAdapter(this,R.layout.boxes,alContactList);
        lvContact.setAdapter(caContact);
    }
}
