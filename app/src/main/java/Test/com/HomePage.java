package Test.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
                Intent startIntent = new Intent(getApplicationContext(), ReverseSearch.class);
                startIntent.putExtra("test.com.holder", ""+ partNumEditText.getText().toString());
                startActivity(startIntent);

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
