package Test.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

                //Prevents and invalid number from being used ie "" and "Int overflows"
                try {
                    partNumInt = Integer.parseInt(partNumString);
                    Intent startIntent = new Intent(getApplicationContext(), ReverseSearch.class);
                    startIntent.putExtra("test.com.holder", "" + partNumInt);
                    startActivity(startIntent);
                }catch (Exception e) {
                    partNumInt = -1;
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
                Intent startIntent = new Intent(getApplicationContext(), CameraSearch.class);
                startActivity(startIntent);
            }
        });

    }
}
