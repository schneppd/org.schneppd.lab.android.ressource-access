package org.schneppd.lab.advancedfileaccess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // logic to test
    public void TestFeature(View view) {
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
        t.setText("Feature tested");
    }


}
