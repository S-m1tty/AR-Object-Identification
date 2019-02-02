package Test.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ReverseSearch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse_search);


        if(getIntent().hasExtra("test.com.holder")) {
            TextView partNumTextView = (TextView) findViewById(R.id.partNumTextView);
            TextView partNameTextView = (TextView) findViewById(R.id.partNameTextView);
            TextView partInfoTextView = (TextView) findViewById(R.id.partInfoTextView);

            int partNumInt = getIntent().getExtras().getInt("test.com.holder");
            int numItems = 6; ///////////////////////////////////////////////////////////////////

            //Fixes nums = "" and ones that are to big



            if(partNumInt < numItems) {
                partNumTextView.setText("Part Number: " + partNumInt);

                partNameTextView.setText(Database.getName(partNumInt));
                partInfoTextView.setText(Database.getInfo(partNumInt));
            }
        }
    }
}
