package sg.edu.rp.c346.id20025732.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class C346Activity extends AppCompatActivity {

    TextView c346;
    Button rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c346);

        c346 = findViewById(R.id.C346);
        Intent i = getIntent();
        String moduleCode = i.getStringExtra("Code");
        String modulename = i.getStringExtra("Name");
        int academicyear = i.getIntExtra("Year",2021);
        int semester = i.getIntExtra("Semester",1);
        int modulecredit = i.getIntExtra("Module Credit",4);
        String venue = i.getStringExtra("Venue");
        c346.setText("Module Code: " + moduleCode+ "\n Module Name: " + modulename + "\n Academic Year: " + academicyear + "\n Semester: " + semester + "\n Module Credit: " + modulecredit
                + "\n Venue: " + venue);

        rb = findViewById(R.id.button);
        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });





    }
}