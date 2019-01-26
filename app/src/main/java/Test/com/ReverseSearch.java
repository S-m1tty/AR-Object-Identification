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

            String partNum = getIntent().getExtras().getString("test.com.holder");
            int partNumInt = Integer.parseInt(partNum);
            int numItems = 6; ///////////////////////////////////////////////////////////////////


            if(partNumInt < numItems) {
                partNumTextView.setText("Part Number: " + partNum);

                partNameTextView.setText(Database.getName(partNumInt));
                partInfoTextView.setText(Database.getInfo(partNumInt));
            }
        }
    }
}
