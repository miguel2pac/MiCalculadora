package com.miguel2pac.micalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity {

    private String texto = "";
    private TextView editorTexto;
    private String prevDigit="";
    private Double oper1=0.0;
    private Double oper2=0.0;
    private Double result=0.0;
    private String acumul="";
    private String operation="";
    private Boolean flagDot=false;
    private Boolean flagEqual=false;
    private Boolean flagError=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mi_calculadora);
        editorTexto = (TextView) findViewById(R.id.editorTexto);
    }

    public void writeB7(View view) {
        if(prevDigit.equals("=")){
            texto="";
            acumul="";
            oper1 = 0.0;
            oper2 = 0.0;
            result = 0.0;
            flagError=false;
        }
        texto += "7";
        prevDigit="7";
        acumul+="7";
        editorTexto.setText(texto);
    }

    public void writeB8(View view) {
        if(prevDigit.equals("=")){
            texto="";
            acumul="";
            oper1 = 0.0;
            oper2 = 0.0;
            result = 0.0;
            flagError=false;
        }
        texto += "8";
        prevDigit="8";
        acumul+="8";
        editorTexto.setText(texto);
    }

    public void writeB9(View view) {
        if(prevDigit.equals("=")){
            texto="";
            acumul="";
            oper1 = 0.0;
            oper2 = 0.0;
            result = 0.0;
            flagError=false;
        }
        texto += "9";
        prevDigit="9";
        acumul+="9";
        editorTexto.setText(texto);
    }

    public void writeBplus(View view) {
        if (!(texto.equals(""))&&!(prevDigit.equals("+"))&&!(prevDigit.equals("-"))&&!(prevDigit.equals("*"))&&!(prevDigit.equals("/"))&&!(prevDigit.equals("."))&&!flagError){
            texto += "+";
            prevDigit="+";
            flagDot=false;
            operation="sum";
            if(flagEqual) {
                oper2=Double.parseDouble(acumul);
                result=oper1+oper2;
                texto=Double.toString(result);
                texto+="+";
                oper1=result;
            }
            else{
                oper1 = Double.parseDouble(acumul);
            }
            editorTexto.setText(texto);
            flagEqual=true;
            acumul="";
        }
    }

    public void writeB4(View view) {
        if(prevDigit.equals("=")){
            texto="";
            acumul="";
            oper1 = 0.0;
            oper2 = 0.0;
            result = 0.0;
            flagError=false;
        }
        texto += "4";
        prevDigit="4";
        acumul+="4";
        editorTexto.setText(texto);
    }

    public void writeB5(View view) {
        if(prevDigit.equals("=")){
            texto="";
            acumul="";
            oper1 = 0.0;
            oper2 = 0.0;
            result = 0.0;
            flagError=false;
        }
        texto += "5";
        prevDigit="5";
        acumul+="5";
        editorTexto.setText(texto);
    }

    public void writeB6(View view) {
        if(prevDigit.equals("=")){
            texto="";
            acumul="";
            oper1 = 0.0;
            oper2 = 0.0;
            result = 0.0;
            flagError=false;
        }
        texto += "6";
        prevDigit="6";
        acumul+="6";
        editorTexto.setText(texto);
    }

    public void writeBsustract(View view) {
            if (!(texto.equals(""))&&!(prevDigit.equals("+"))&&!(prevDigit.equals("-"))&&!(prevDigit.equals("*"))&&!(prevDigit.equals("/"))&&!(prevDigit.equals("."))&&!flagError) {
            texto += "-";
            prevDigit="-";
            flagDot=false;
            operation="sus";
            if(flagEqual) {
                oper2=Double.parseDouble(acumul);
                result=oper1-oper2;
                texto=Double.toString(result);
                texto+="-";
                oper1=result;
            }
            else{
                oper1 = Double.parseDouble(acumul);
            }
            editorTexto.setText(texto);
            flagEqual=true;
            acumul="";
        }
    }

    public void writeB1(View view) {
        if(prevDigit.equals("=")){
            texto="";
            acumul="";
            oper1 = 0.0;
            oper2 = 0.0;
            result = 0.0;
            flagError=false;
        }
        texto += "1";
        prevDigit="1";
        acumul+="1";
        editorTexto.setText(texto);
    }

    public void writeB2(View view) {
        if(prevDigit.equals("=")){
            texto="";
            acumul="";
            oper1 = 0.0;
            oper2 = 0.0;
            result = 0.0;
            flagError=false;
        }
        texto += "2";
        prevDigit="2";
        acumul += "2";
        editorTexto.setText(texto);


    }

    public void writeB3(View view) {
        if(prevDigit.equals("=")){
            texto="";
            acumul="";
            oper1 = 0.0;
            oper2 = 0.0;
            result = 0.0;
            flagError=false;
        }
        texto += "3";
        prevDigit="3";
        acumul+="3";
        editorTexto.setText(texto);
    }

    public void writeBmulti(View view) {
        if (!(texto.equals(""))&&!(prevDigit.equals("+"))&&!(prevDigit.equals("-"))&&!(prevDigit.equals("*"))&&!(prevDigit.equals("/"))&&!(prevDigit.equals("."))&&!flagError) {
            texto += "*";
            prevDigit="*";
            flagDot=false;
            operation="mul";
            if(flagEqual) {
                oper2=Double.parseDouble(acumul);
                result=oper1*oper2;
                texto=Double.toString(result);
                texto+="*";
                oper1=result;
            }
            else{
                oper1 = Double.parseDouble(acumul);
            }
            editorTexto.setText(texto);
            flagEqual=true;
            acumul="";
        }
    }

    public void writeBdot(View view) {
        if(!(prevDigit.equals("."))&&!flagDot&&!flagError) {
            texto += ".";
            prevDigit = ".";
            acumul += ".";
            editorTexto.setText(texto);
            flagDot=true;
        }
    }

    public void writeB0(View view) {
        if(prevDigit.equals("=")){
            texto="";
            acumul="";
            oper1 = 0.0;
            oper2 = 0.0;
            result = 0.0;
            flagError=false;
        }
        texto += "0";
        prevDigit = "0";
        acumul += "0";
        editorTexto.setText(texto);
    }

    public void writeBC(View view) {
        texto = "";
        prevDigit = "";
        oper1 = 0.0;
        oper2 = 0.0;
        result = 0.0;
        acumul = "";
        flagEqual = false;
        flagDot=false;
        flagError=false;
        editorTexto.setText(texto);
    }

    public void writeBdivide(View view) {
        if (!(texto.equals(""))&&!(prevDigit.equals("+"))&&!(prevDigit.equals("-"))&&!(prevDigit.equals("*"))&&!(prevDigit.equals("/"))&&!(prevDigit.equals("."))&&!flagError){
            texto += "/";
            prevDigit="/";
            flagDot=false;
            operation="div";
            if(flagEqual) {
                oper2=Double.parseDouble(acumul);
                result=oper1/oper2;
                texto=Double.toString(result);
                texto+="/";
                oper1=result;
            }
            else{
                oper1 = Double.parseDouble(acumul);
            }
            editorTexto.setText(texto);
            flagEqual=true;
            acumul="";
        }
    }

    public void writeBequal(View view) {
        if (!(texto.equals(""))&&!(prevDigit.equals("+"))&&!(prevDigit.equals("-"))&&!(prevDigit.equals("*"))&&!(prevDigit.equals("/"))&&!(prevDigit.equals("."))&&!(prevDigit.equals("="))&&!flagError) {
            prevDigit="=";
            oper2=Double.parseDouble(acumul);
            if(operation.equals("sum")){
                result=oper1+oper2;
                texto=Double.toString(result);
                acumul = texto;
            }
            else if(operation.equals("sus")){
                result=oper1-oper2;
                texto=Double.toString(result);
                acumul = texto;
            }
            else if(operation.equals("mul")){
                result=oper1*oper2;
                texto=Double.toString(result);
                acumul = texto;
            }
            else if(operation.equals("div")) {
                if (oper2 == 0.0) {
                    texto = "Error";
                    acumul = "0";
                    flagError=true;
                }else{
                    result = oper1 / oper2;
                    texto = Double.toString(result);
                    acumul = texto;
                }
            }
            editorTexto.setText(texto);
            flagEqual=false;
            flagDot=false;
            operation="";
        }
    }
}
