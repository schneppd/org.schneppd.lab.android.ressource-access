package org.schneppd.lab.advancedfileaccess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // logic to test
    public void TestFeature(View view) {
        String message = "";

        InputStream inputStream = getResources().openRawResource(R.raw.custom_values);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));



        try{
            String line = reader.readLine();
            while (line != null) {

                if(!line.contains("start") && !line.contains("end"))
                    message += line;
                line = reader.readLine();
            }
            inputStream.close();

        } catch(IOException e) {
            message += "error " + e.getMessage();
        }

        /*
        LineIterator it = FileUtils.lineIterator(file, "UTF-8");
        try {
            while (it.hasNext()) {
                String line = it.nextLine();
                /// do something with line
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }
        */
        TextView t =(TextView)findViewById(R.id.txtTest);
        t.setText(message);
    }


}
