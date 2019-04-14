package Test.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        //Creates the buttons in code
        Button pictureSearchBtn = (Button)findViewById(R.id.pictureSearchBtn);
        Button reverseSearchBtn = (Button)findViewById(R.id.reverseSearchBtn);
        final TextView partNumEditText = (TextView)findViewById(R.id.partNumEditText);

        reverseSearchBtn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                String partNumString = partNumEditText.getText().toString();
                int partNumInt;

                Resources res = getResources();
                int totItems = res.getInteger(R.integer.totalItems);

                //Prevents and invalid number from being used ie "" and "Int overflows"
                try {
                    partNumInt = Integer.parseInt(partNumString);
                    if(partNumInt < totItems )
                    {
                        Intent startIntent = new Intent(getApplicationContext(), ReverseSearch.class);
                        startIntent.putExtra("test.com.holder",  + partNumInt);
                        startActivity(startIntent);
                    }
                    else
                    {
                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Current Number Does Not Have Item In Database",
                                Toast.LENGTH_SHORT);

                        toast.setGravity(Gravity.CENTER, 0, 20);
                        toast.show();
                    }

                }catch (Exception e) {
                    if (partNumString.equals("")) {
                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Please Enter a Number",
                                Toast.LENGTH_SHORT);

                        toast.setGravity(Gravity.CENTER, 0, 20);
                        toast.show();
                    }
                    else
                    {
                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Please Enter a Smaller Number",
                                Toast.LENGTH_SHORT);

                        toast.setGravity(Gravity.CENTER, 0, 20);
                        toast.show();
                    }
                }



            }
        });

        pictureSearchBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //com.example.android.tflitecamerademo //APK
                //android.example.com.tflitecamerademo //TFLite Source Code

                //Opens TFLite Application [Make sure to have it installed]
                Intent tfLiteOpener = getPackageManager().getLaunchIntentForPackage("android.example.com.tflitecamerademo");
                startActivity(tfLiteOpener);

                //Intent startIntent = new Intent(getApplicationContext(), CameraSearch.class);
                //startActivity(startIntent);
            }
        });

    }
}
