package ph.edu.ust.npsalba.labactonetwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonCalculate = (Button) findViewById(R.id.buttonCalculate);
        buttonCalculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                final EditText editTextNo1 = (EditText) findViewById(R.id.editTextNo1);
                EditText editTextNo2 = (EditText) findViewById(R.id.editTextNo2);
                final TextView textViewResult = (TextView) findViewById(R.id.textViewResult);

                int fNo = Integer.parseInt(editTextNo1.getText().toString());
                int sNo = Integer.parseInt(editTextNo2.getText().toString());
                int result;

                if(fNo > sNo){
                    result = fNo;
                    textViewResult.setText("The larger number is " + result);
                }
                else if(sNo > fNo){
                    result = sNo;
                    textViewResult.setText("The larger number is " + result);
                }
            }
        });
    }
}
