package com.facci.calculadoraac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivityAC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_ac);
    }
    //@Override
    //public boolean onCreateOptionsMenu(Menu menu){
      //  getMenuInflater().inflate(R.menu.main, menu);
        //return true;
    //}
    Double numero1,numero2,resultado;
    String operador;

    public void onClickIgual(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.txtresultado) ;
        numero2 = Double.parseDouble(tv.getText().toString());

        if(operador.equals("+"))
        {
            resultado= numero1+numero2;
        }
        else if(operador.equals("-"))
        {
            resultado= numero1-numero2;
        }
        else if(operador.equals("*"))
        {
            resultado= numero1*numero2;
        }
        else if(operador.equals("/"))
        {
            resultado= numero1/numero2;
        }
        tv.setText(resultado.toString());
    }
    public void onClickSuma(View miView)
    {
        operador="+";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickResta(View miView)
    {
        operador="-";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickMultiplicacion(View miView)
    {
        operador="*";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickDivision(View miView)
    {
        operador="/";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickOperacionCapturaNumero1(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.txtresultado) ;
        numero1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }
    public void onClickLimpia(View miView)
    {
        numero1=0.0;
        numero2=0.0;
        TextView tv = (TextView) findViewById(R.id.txtresultado) ;
        tv.setText("");
    }
    public void onClickbtn1(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.txtresultado) ;
        tv.setText(tv.getText() + "1");
    }
    public void onClickbtn2(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.txtresultado) ;
        tv.setText(tv.getText() + "2");
    }
    public void onClickbtn3(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.txtresultado) ;
        tv.setText(tv.getText() + "3");
    }
    public void onClickbtn4(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.txtresultado) ;
        tv.setText(tv.getText() + "4");
    }
    public void onClickbtn5(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.txtresultado) ;
        tv.setText(tv.getText() + "5");
    }
    public void onClickbtn6(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.txtresultado) ;
        tv.setText(tv.getText() + "6");
    }
    public void onClickbtn7(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.txtresultado) ;
        tv.setText(tv.getText() + "7");
    }
    public void onClickbtn8(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.txtresultado) ;
        tv.setText(tv.getText() + "8");
    }
    public void onClickbtn9(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.txtresultado) ;
        tv.setText(tv.getText() + "9");
    }
    public void onClickbtn0(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.txtresultado) ;
        tv.setText(tv.getText() + "0");
    }
}
