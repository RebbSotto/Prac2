package prac2.com.sotto.prac2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;


public class Prac2 extends AppCompatActivity implements View.OnClickListener {

    private Button btnave;
    private TextView txtans;
    private EditText txtexam1, txtexam2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prac2);
    }

    private void init() {
        btnave = (Button)findViewById(R.id.btnave);
        txtans = (TextView)findViewById(R.id.txtans);
        txtexam1 = (EditText)findViewById(R.id.txtexam1);
        txtexam2 = (EditText)findViewById(R.id.txtexam2);

        btnave.setOnClickListener(this);

    }

    @Override
    public void onClick (View view) {
        String num1 = txtexam1.getText().toString();
        String num2 = txtexam2.getText().toString();
        switch (view.getId()) {
            case R.id.btnave:
                int answer = (Integer.parseInt(num1) + Integer.parseInt(num2)) / 2;
                txtans.setText(String.valueOf(answer));
                break;


        }
    }
}
