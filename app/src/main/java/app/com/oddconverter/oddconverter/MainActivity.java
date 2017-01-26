package app.com.oddconverter.oddconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double fTeam1,fTeam2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText team1 = (EditText) findViewById(R.id.team1);
       // final EditText team2 = (EditText) findViewById(R.id.team2);
        Button bDone = (Button) findViewById(R.id.bDone);

        bDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fTeam1 = 1/Double.parseDouble(team1.getText().toString());
                //fTeam2 = 1/Double.parseDouble(team2.getText().toString());

                fTeam1 = fTeam1 * 100;
                //fTeam2 = fTeam2 * 100;

                fTeam1 = Math.floor(fTeam1)-1;
               // fTeam2 = Math.floor(fTeam2);
                fTeam2 = 100-fTeam1;

               // Log.d("LUL",fTeam1 + "-" + fTeam2);

                Toast.makeText(getApplicationContext(),"Odds are " + fTeam1 + " - " + fTeam2,Toast.LENGTH_LONG).show();

            }
        });



    }
}
