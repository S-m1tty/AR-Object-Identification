package Test.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ReverseSearch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse_search);

        Resources res = getResources();
        int totItems = res.getInteger(R.integer.totalItems);
        ImageView itemImageImageView = (ImageView) findViewById(R.id.itemImageImageView);


        //Sets up extra info buttons
        Button itemType1Btn = (Button)findViewById(R.id.itemType1Btn);
        Button itemType2Btn = (Button)findViewById(R.id.itemType2Btn);
        Button itemType3Btn = (Button)findViewById(R.id.itemType3Btn);

        //turns extra info buttons invisable
        itemType1Btn.setVisibility (View.GONE);
        itemType2Btn.setVisibility (View.GONE);
        itemType3Btn.setVisibility (View.GONE);

        //sets up item info

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

            if(!(Database.sp(partNumInt).get(0).equals("null")))
            {

                Button btnList[] = {itemType1Btn,itemType2Btn,itemType3Btn};
                ArrayList<String> jeff = Database.sp(partNumInt);

                for(int i = 0; i < jeff.size(); i++)
                {
                    btnList[i].setVisibility(View.VISIBLE);
                    btnList[i].setText(jeff.get(i));
                }
            }
        }


        //Special Info Buttons Click Listener
        itemType1Btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                int btnNum = 0;

                TextView partNumTextView = (TextView) findViewById(R.id.partNumTextView);
                TextView partNameTextView = (TextView) findViewById(R.id.partNameTextView);
                TextView partInfoTextView = (TextView) findViewById(R.id.partInfoTextView);

                int partNumInt = getIntent().getExtras().getInt("test.com.holder");

                partNumTextView.setText("Part Number: " + partNumInt);
                partNameTextView.setText(Database.sp(partNumInt).get(btnNum));
                partInfoTextView.setText(Database.spInfo(partNumInt).get(btnNum));


                ImageView itemImageImageView = (ImageView) findViewById(R.id.itemImageImageView);

                itemImageImageView.setImageResource(Database.spImg(partNumInt).get(btnNum));
                //Intent tfLiteOpener = getPackageManager().getLaunchIntentForPackage("android.example.com.tflitecamerademo");
                //startActivity(tfLiteOpener);


                Button itemType1Btn = (Button)findViewById(R.id.itemType1Btn);
                Button itemType2Btn = (Button)findViewById(R.id.itemType2Btn);
                Button itemType3Btn = (Button)findViewById(R.id.itemType3Btn);

                itemType1Btn.setVisibility (View.GONE);
                itemType2Btn.setVisibility (View.GONE);
                itemType3Btn.setVisibility (View.GONE);
            }
        });

        itemType2Btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                int btnNum = 1;

                TextView partNumTextView = (TextView) findViewById(R.id.partNumTextView);
                TextView partNameTextView = (TextView) findViewById(R.id.partNameTextView);
                TextView partInfoTextView = (TextView) findViewById(R.id.partInfoTextView);

                int partNumInt = getIntent().getExtras().getInt("test.com.holder");

                partNumTextView.setText("Part Number: " + partNumInt);
                partNameTextView.setText(Database.sp(partNumInt).get(btnNum));
                partInfoTextView.setText(Database.spInfo(partNumInt).get(btnNum));


                ImageView itemImageImageView = (ImageView) findViewById(R.id.itemImageImageView);

                itemImageImageView.setImageResource(Database.spImg(partNumInt).get(btnNum));
                //Intent tfLiteOpener = getPackageManager().getLaunchIntentForPackage("android.example.com.tflitecamerademo");
                //startActivity(tfLiteOpener);


                Button itemType1Btn = (Button)findViewById(R.id.itemType1Btn);
                Button itemType2Btn = (Button)findViewById(R.id.itemType2Btn);
                Button itemType3Btn = (Button)findViewById(R.id.itemType3Btn);

                itemType1Btn.setVisibility (View.GONE);
                itemType2Btn.setVisibility (View.GONE);
                itemType3Btn.setVisibility (View.GONE);
            }
        });

        itemType3Btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                int btnNum = 2;

                TextView partNumTextView = (TextView) findViewById(R.id.partNumTextView);
                TextView partNameTextView = (TextView) findViewById(R.id.partNameTextView);
                TextView partInfoTextView = (TextView) findViewById(R.id.partInfoTextView);

                int partNumInt = getIntent().getExtras().getInt("test.com.holder");

                partNumTextView.setText("Part Number: " + partNumInt);
                partNameTextView.setText(Database.sp(partNumInt).get(btnNum));
                partInfoTextView.setText(Database.spInfo(partNumInt).get(btnNum));


                ImageView itemImageImageView = (ImageView) findViewById(R.id.itemImageImageView);

                itemImageImageView.setImageResource(Database.spImg(partNumInt).get(btnNum));
                //Intent tfLiteOpener = getPackageManager().getLaunchIntentForPackage("android.example.com.tflitecamerademo");
                //startActivity(tfLiteOpener);


                Button itemType1Btn = (Button)findViewById(R.id.itemType1Btn);
                Button itemType2Btn = (Button)findViewById(R.id.itemType2Btn);
                Button itemType3Btn = (Button)findViewById(R.id.itemType3Btn);

                itemType1Btn.setVisibility (View.GONE);
                itemType2Btn.setVisibility (View.GONE);
                itemType3Btn.setVisibility (View.GONE);
            }
        });
    }
}
