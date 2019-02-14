package Test.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;

public class CameraSearch extends AppCompatActivity {

    TextView eggTextView;
    TextView breadTextView;
    Button   startProcessBtn;
    Bitmap bitmp = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_search);

        bitmp = BitmapFactory.decodeResource(getResources(), R.drawable.kirbster);

        eggTextView = (TextView) findViewById(R.id.eggTextView);
        breadTextView = (TextView) findViewById(R.id.breadTextView);
        startProcessBtn = (Button)findViewById(R.id.startProcessBtn);

    }












    public void process(View v) {
        if (bitmp == null) {
            Toast.makeText(this, "no bitmap", Toast.LENGTH_SHORT).show();
            return;
        }
        Toast.makeText(this, Integer.toString(bitmp.getByteCount()), Toast.LENGTH_SHORT).show();

        ImageClassifier imgclass = null;
        try {
            imgclass = new ImageClassifier(this);
        } catch (IOException e) {
            Toast.makeText(this, "failed to make classifier", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
        if (imgclass == null) {
            Toast.makeText(this, "classifier is null!", Toast.LENGTH_SHORT).show();
            return;
        }

        ArrayList<NNOutput> array = imgclass.classifyFrame(bitmp);

        NNOutput egg = array.get(0);
        NNOutput bread = array.get(1);
        //setBreadMulti((int) Math.round(bread.getValue()*100));
        //setEggMulti((int) Math.round(egg.getValue()*100));

        //TextView output = findViewById(R.id.output);
        //output.setText(array.get(0).toString()+"\n"+array.get(1).toString());
        eggTextView.setText(array.get(0).toString());
        breadTextView.setText(array.get(1).toString());

    }

}
