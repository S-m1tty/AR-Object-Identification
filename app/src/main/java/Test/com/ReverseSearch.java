package Test.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ReverseSearch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse_search);

        Resources res = getResources();
        int totItems = res.getInteger(R.integer.totalItems);
        ImageView itemImageImageView = (ImageView) findViewById(R.id.itemImageImageView);


        if(getIntent().hasExtra("test.com.holder")) {
            TextView partNumTextView = (TextView) findViewById(R.id.partNumTextView);
            TextView partNameTextView = (TextView) findViewById(R.id.partNameTextView);
            TextView partInfoTextView = (TextView) findViewById(R.id.partInfoTextView);

            int partNumInt = getIntent().getExtras().getInt("test.com.holder");
            int numItems = totItems;


            if(partNumInt < numItems) {
                partNumTextView.setText("Part Number: " + partNumInt);

                partNameTextView.setText(Database.getName(partNumInt));
                partInfoTextView.setText(Database.getInfo(partNumInt));

                itemImageImageView.setImageResource(Database.getImg(partNumInt));
            }
        }
    }
}
