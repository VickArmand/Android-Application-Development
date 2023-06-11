package com.example.southafricanidgenerator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * South African ID number has 13 numbers where
 * the first 6 constitute the date of birth
 * the next 4 integers determine the gender (< 5000 female else male)
 * the next digit determines the nationality (0 SA citizen else Permanent Resident)
 * the last 2 are just for validity
 */
public class MainActivity extends AppCompatActivity {
    EditText etID;
    Button btnSubmit;
    TextView tvResults;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        myToolbar.setTitle(getString(R.string.app_name));
        setSupportActionBar(myToolbar);
        // connecting variables to their respective activities
        etID = findViewById(R.id.txtIDnum);
        btnSubmit = findViewById(R.id.btnGenerate);
        tvResults = findViewById(R.id.tvResults);

        // clicking buttons
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String results;
                // hides the results textview
                tvResults.setVisibility(View.GONE);
                try {
                    String idNum = etID.getText().toString().trim();
                    String DoB = idNum.substring(0,6);
                    int gender = Integer.parseInt(Character.toString(idNum.charAt(6)));
                    int nationality = Integer.parseInt(Character.toString(idNum.charAt(10)));
                    String sGender = gender > 5 ? getString(R.string.male) : getString(R.string.female);
                    String sNationality = nationality == 0 ? getString(R.string.sa_citizen) : getString(R.string.permanent_resident);
                    results = getString(R.string.date_of_birth)+DoB+"\n"
                            +getString(R.string.gender)+sGender+"\n"
                            +getString(R.string.nationality)+sNationality;
                    tvResults.setText(results);
                    // show the results textview
                    tvResults.setVisibility(View.VISIBLE);
                } catch (Exception ex)
                {
                    Toast.makeText(getApplicationContext(), ex.getMessage(),Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}