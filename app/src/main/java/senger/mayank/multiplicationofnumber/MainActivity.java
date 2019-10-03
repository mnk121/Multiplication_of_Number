package senger.mayank.multiplicationofnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtNumber;
    private TextView txtMT;
    private String mtResult = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMT = findViewById(R.id.txtMT);
        edtNumber = findViewById(R.id.edtNumber);
    }

    public void btnMTClicked(View buttonView){

        mtResult = "";

        int enteredNumber = Integer.parseInt((edtNumber.getText().toString()));
        for( int counter = 0; counter<10 ; counter ++){

            mtResult  = mtResult + enteredNumber + " x " +
                    (counter + 1) + " = " +
                    (enteredNumber*(counter+1)) + "\n";
        }
        txtMT.setText(mtResult);
    }
}

