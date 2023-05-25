package com.example.marcosevivyan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Instaciando os objetos

        btn = (Button) findViewById(R.id.btnSoma);
        num1 = (EditText) findViewById(R.id.txt1);
        num2 = (EditText) findViewById(R.id.txt2);
        txt = (TextView) findViewById(R.id.txtresult);
        btnsub = (Button) findViewById(R.id.btnSubtracao);
        btnmulti = (Button) findViewById(R.id.btnMultiplicacao);
        btndivisao = (Button) findViewById(R.id.btnDivisao);

        // Definindo ações aos objetos

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Integer.parseInt(String.valueOf(num1.getText()));
                n2 = Integer.parseInt(String.valueOf(num2.getText()));
                soma(); // Utilizando o método de somar
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                n1 = Integer.parseInt(String.valueOf(num1.getText()));
                n2 = Integer.parseInt(String.valueOf(num2.getText()));
            }
        });

        btnmulti.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               n1 = Integer.parseInt(String.valueOf(num1.getText()));
               n2 = Integer.parseInt(String.valueOf(num2.getText()));
               multi(); // Utilizando o método de multiplicação
           }
        });

        btndivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Integer.parseInt(String.valueOf(num1.getText()));
                n2 = Integer.parseInt(String.valueOf(num2.getText()));
                divisao(); // Utilizando o método de divisão
                }
        });


    }

    // Definindo os métodos

    public void soma() {
        result = n1 + n2; //Cálculo
        txt.setText(Integer.toString(result)); //Apresentando a variável "result" na TextView
    }
    public void sub() {
        result = n1-n2;
        txt.setText(Integer.toString(result));
    }
    public void multi() {
        result = n1 * n2;
        txt.setText(Integer.toString(result));
    }
    public void divisao(){
        result = n1 / n2;
        txt.setText(Integer.toString(result));
    }

    // Declaração de Variáveis

    Button btn;
    EditText num1;
    EditText num2;
    TextView txt;
    Button btnsub;
    Button btnmulti;
    Button btndivisao;

    int n1, n2, result;
}
