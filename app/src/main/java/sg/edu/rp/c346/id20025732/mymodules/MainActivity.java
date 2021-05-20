package sg.edu.rp.c346.id20025732.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView C346;
    TextView C218;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        C346 = findViewById(R.id.C346textView);
        C218 = findViewById(R.id.C218textView);

        C346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,C346Activity.class);
                i.putExtra("Code","C346");
                i.putExtra("Name","Android Programming");
                i.putExtra("Academic Year","2021");
                i.putExtra("Semester","1");
                i.putExtra("Module Credit","4");
                i.putExtra("Venue","E26E");
                startActivity(i);
            }
        });

        C218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent i = new Intent(MainActivity.this ,C346Activity.class);
                i.putExtra("Code","C218");
                i.putExtra("Name","UI/UX Design");
                i.putExtra("Academic Year","2021");
                i.putExtra("Semester","1");
                i.putExtra("Module Credit","4");
                i.putExtra("Venue","W64M");
                startActivity(i);
            }
        });




    }
}