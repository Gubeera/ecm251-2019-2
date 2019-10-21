package com.example.meusegundoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.ExecutionException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    private EditText etNum1,etNum2;
    private TextView resultados;
    private Button btnSomar;
    @BindView(R.id.btmSubtrair)
    protected Button btnSubtrair;


    @OnClick(R.id.btmSubtrair)
    void subtrair(){}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        etNum1 = (EditText)findViewById(R.id.etPrimeiroNumero);
        etNum2 = (EditText)findViewById(R.id.etSegundoNumero);
        resultados = (TextView)findViewById(R.id.tvResultado);
        btnSomar = (Button)findViewById(R.id.btmSomar);
        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1, n2;
                try {
                    n1 = Double.parseDouble(etNum1.getText().toString());
                    n2 = Double.parseDouble(etNum2.getText().toString());
                    resultados.setText("Resultado: " + (n1 + n2));
                }
                catch (ExecutionException e){
                    Toast.makeText(getApplicationContext(),"Inserir os Operandos",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
