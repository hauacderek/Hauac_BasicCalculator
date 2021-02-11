package mcm.edu.ph.hauac_basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonadd, buttonsub, buttondiv, buttonmul, buttonmod;
        buttonadd = findViewById(R.id.buttonadd);
        buttonsub = findViewById(R.id.buttonsub);
        buttondiv = findViewById(R.id.buttondiv);
        buttonmul = findViewById(R.id.buttonmul);
        buttonmod = findViewById(R.id.buttonmod);
        buttonadd.setOnClickListener(this);
        buttonsub.setOnClickListener(this);
        buttondiv.setOnClickListener(this);
        buttonmul.setOnClickListener(this);
        buttonmod.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        EditText editoperand1, editoperand2;
        TextView showresult;
        editoperand1 = findViewById(R.id.editoperand1);
        editoperand2 = findViewById(R.id.editoperand2);
        showresult = findViewById(R.id.showresult);
        Double operand1 = 0.0;
        Double operand2 = 0.0;
        Double result = 0.0;
        operand1 = Double.parseDouble(editoperand1.getText().toString());
        operand2 = Double.parseDouble(editoperand2.getText().toString());
        switch (v.getId()){
            case R.id.buttonadd:
                result = operand1 + operand2;
                showresult.setText(Double.toString(result));
                break;
        }
        switch (v.getId()){
            case R.id.buttonsub:
                result = operand1 - operand2;
                showresult.setText(Double.toString(result));
                break;
        }
        switch (v.getId()){
            case R.id.buttondiv:
                result = operand1 / operand2;
                showresult.setText(Double.toString(result));
                break;
        }
        switch (v.getId()){
            case R.id.buttonmul:
                result = operand1 * operand2;
                showresult.setText(Double.toString(result));
                break;
        }
        switch (v.getId()){
            case(R.id.buttonmod):
                result = operand1 % operand2;
                showresult.setText(Double.toString(result));
                break;
        }
    }
}