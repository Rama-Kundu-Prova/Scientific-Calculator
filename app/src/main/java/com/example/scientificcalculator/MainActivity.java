package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtInput,edtExp;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnAC,btnAns,btnLog10,btnLn,btnX1,
            btnPoint,btnPlus,btnMinus,btnDiv,btnMult,btnSin,btnCos,btnTan,btnSin1,btnExp,btnPi,
            btnCos1,btnTan1,btnFact,btnMod,btnEqual,btnSqRoot,btnXRoot,btnX2,btnXb;
    double res=0,input,ans=0,preInput;
    Boolean Add=false,Mult=false,Div=false,Sub=false,Mod=false,SqRoot=false,XRoot=false,X2=false,Xb=false,Sin=false,Cos=false,Tan=false,Sin1=false,Cos1=false,Tan1=false,Fact=false,Exp=false,Pi=false,Ln=false,Log10=false,X1=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtInput=findViewById(R.id.edtInput);
        edtExp=findViewById(R.id.edtExp);
        btnMult=findViewById(R.id.btnMult);
        btnSin=findViewById(R.id.btnSin);
        btnCos=findViewById(R.id.btnCos);
        btnTan=findViewById(R.id.btnTan);
        btnSin1=findViewById(R.id.btnSin1);
        btnCos1=findViewById(R.id.btnCos1);
        btnTan1=findViewById(R.id.btnTan1);
        btnExp=findViewById(R.id.btnExp);
        btnPi=findViewById(R.id.btnPi);
        btnFact=findViewById(R.id.btnFact);
        btnMod=findViewById(R.id.btnMod);
        btnEqual=findViewById(R.id.btnEqual);
        btnSqRoot=findViewById(R.id.btnSqRoot);
        btnXRoot=findViewById(R.id.btnXRoot);
        btnX2=findViewById(R.id.btnX2);
        btnXb=findViewById(R.id.btnXb);
        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnAC=findViewById(R.id.btnAC);
        btnAns=findViewById(R.id.btnAns);
        btnLog10=findViewById(R.id.btnLog10);
        btnLn=findViewById(R.id.btnLn);
        btnX1=findViewById(R.id.btnX1);
        btnPoint=findViewById(R.id.btnPoint);
        btnPlus=findViewById(R.id.btnPlus);
        btnMinus=findViewById(R.id.btnMinus);
        btnDiv=findViewById(R.id.btnDiv);

        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText()+".");
                edtExp.setText(edtExp.getText()+".");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText()+"0");
                edtExp.setText(edtExp.getText()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText()+"1");
                edtExp.setText(edtExp.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText()+"2");
                edtExp.setText(edtExp.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText()+"3");
                edtExp.setText(edtExp.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText()+"4");
                edtExp.setText(edtExp.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText()+"5");
                edtExp.setText(edtExp.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText()+"6");
                edtExp.setText(edtExp.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText()+"7");
                edtExp.setText(edtExp.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText()+"8");
                edtExp.setText(edtExp.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(edtInput.getText()+"9");
                edtExp.setText(edtExp.getText()+"9");
            }
        });
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(null);
                edtExp.setText(null);
                res=0;
                Add=false; Mult=false; Div=false; Sub=false;
            }
        });
        btnAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtInput.setText(ans+"");
                edtExp.setText(edtExp.getText()+"ans");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtExp.setText(edtExp.getText()+"+");
                input=Double.parseDouble(edtInput.getText()+"");


                if(Sin==true)
                {
                    input=Math.toRadians(input);
                    input=Math.sin(input);Sin=false;
                }
                else if(Cos==true)
                {
                    input=Math.toRadians(input);
                    input=Math.cos(input);Cos=false;
                }
                else if(Tan==true)
                {
                    input=Math.toRadians(input);
                    input=Math.tan(input);Tan=false;
                }
                else if(Sin1==true)
                {
                    input=Math.toRadians(input);
                    input=Math.asin(input);
                    Sin1=false;
                }
                else if(Cos1==true)
                {
                    input=Math.toRadians(input);
                    input=Math.acos(input);
                    Cos1=false;
                }
                else if(Tan1==true)
                {
                    input=Math.toRadians(input);
                    input=Math.atan(input);
                    Tan1=false;
                }
                if(X2==true)
                {
                    input*=input;X2=false;
                }
                else if(Xb==true)
                {
                    input=Math.pow(preInput,input);
                    Xb=false;
                }
                else if(SqRoot==true)
                {
                    input=Math.sqrt(input);
                    SqRoot=false;
                }
                else if(XRoot==true)
                {
                    input=Math.cbrt(input);
                    XRoot=false;
                }
                edtInput.setText(null);
                if(Add==true)
                {
                    res+=input;
                    Add=false;
                }
                else if(Sub==true)
                {
                    res-=input;
                    Sub=false;
                }
                else if(Mult==true)
                {
                    res*=input;
                    Mult=false;
                }
                else if(Div==true)
                {
                    res/=input;
                    Div=false;
                }
                else res=input;
                Add=true;

            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtExp.setText(edtExp.getText()+"-");
                input=Double.parseDouble(edtInput.getText()+"");

                if(Sin==true)
                {
                    input=Math.toRadians(input);
                    input=Math.sin(input);Sin=false;
                }
                else if(Cos==true)
                {
                    input=Math.toRadians(input);
                    input=Math.cos(input);Cos=false;
                }
                else if(Tan==true)
                {
                    input=Math.toRadians(input);
                    input=Math.tan(input);Tan=false;
                }
                else if(Sin1==true)
                {
                    input=Math.toRadians(input);
                    input=Math.asin(input);
                    Sin1=false;
                }
                else if(Cos1==true)
                {
                    input=Math.toRadians(input);
                    input=Math.acos(input);
                    Cos1=false;
                }
                else if(Tan1==true)
                {
                    input=Math.toRadians(input);
                    input=Math.atan(input);
                    Tan1=false;
                }
                if(X2==true)
                {
                    input*=input;X2=false;
                }
                else if(Xb==true)
                {
                    input=Math.pow(preInput,input);
                    Xb=false;
                }
                else if(SqRoot==true)
                {
                    input=Math.sqrt(input);
                    SqRoot=false;
                }
                else if(XRoot==true)
                {
                    input=Math.cbrt(input);
                    XRoot=false;
                }
                edtInput.setText(null);
                if(Add==true)
                {
                    res+=input;
                    Add=false;
                }
                else if(Sub==true)
                {
                    res-=input;
                    Sub=false;
                }
                else if(Mult==true)
                {
                    res*=input;
                    Mult=false;
                }
                else if(Div==true)
                {
                    res/=input;
                    Div=false;
                }
                else res=input;
                Sub=true;
            }
        });
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtExp.setText(edtExp.getText()+"*");
                input=Double.parseDouble(edtInput.getText()+"");

                if(Sin==true)
                {
                    input=Math.toRadians(input);
                    input=Math.sin(input);Sin=false;
                }
                else if(Cos==true)
                {
                    input=Math.toRadians(input);
                    input=Math.cos(input);Cos=false;
                }
                else if(Tan==true)
                {
                    input=Math.toRadians(input);
                    input=Math.tan(input);Tan=false;
                }
                else if(Sin1==true)
                {
                    input=Math.toRadians(input);
                    input=Math.asin(input);
                    Sin1=false;
                }
                else if(Cos1==true)
                {
                    input=Math.toRadians(input);
                    input=Math.acos(input);
                    Cos1=false;
                }
                else if(Tan1==true)
                {
                    input=Math.toRadians(input);
                    input=Math.atan(input);
                    Tan1=false;
                }
                if(X2==true)
                {
                    input*=input;X2=false;
                }
                else if(Xb==true)
                {
                    input=Math.pow(preInput,input);
                    Xb=false;
                }
                else if(SqRoot==true)
                {
                    input=Math.sqrt(input);
                    SqRoot=false;
                }
                else if(XRoot==true)
                {
                    input=Math.cbrt(input);
                    XRoot=false;
                }
                edtInput.setText(null);
                if(Add==true)
                {
                    res+=input;
                    Add=false;
                }
                else if(Sub==true)
                {
                    res-=input;
                    Sub=false;
                }
                else if(Mult==true)
                {
                    res*=input;
                    Mult=false;
                }
                else if(Div==true)
                {
                    res/=input;
                    Div=false;
                }
                else res=input;
                Mult=true;
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtExp.setText(edtExp.getText()+"/");
                input=Double.parseDouble(edtInput.getText()+"");

                if(Sin==true)
                {
                    input=Math.toRadians(input);
                    input=Math.sin(input);Sin=false;
                }
                else if(Cos==true)
                {
                    input=Math.toRadians(input);
                    input=Math.cos(input);Cos=false;
                }
                else if(Tan==true)
                {
                    input=Math.toRadians(input);
                    input=Math.tan(input);Tan=false;
                }
                else if(Sin1==true)
                {
                    input=Math.toRadians(input);
                    input=Math.asin(input);
                    Sin1=false;
                }
                else if(Cos1==true)
                {
                    input=Math.toRadians(input);
                    input=Math.acos(input);
                    Cos1=false;
                }
                else if(Tan1==true)
                {
                    input=Math.toRadians(input);
                    input=Math.atan(input);
                    Tan1=false;
                }
                if(X2==true)
                {
                    input*=input;X2=false;
                }
                else if(Xb==true)
                {
                    input=Math.pow(preInput,input);
                    Xb=false;
                }
                else if(SqRoot==true)
                {
                    input=Math.sqrt(input);
                    SqRoot=false;
                }
                else if(XRoot==true)
                {
                    input=Math.cbrt(input);
                    XRoot=false;
                }
                edtInput.setText(null);
                if(Add==true)
                {
                    res+=input;
                    Add=false;
                }
                else if(Sub==true)
                {
                    res-=input;
                    Sub=false;
                }
                else if(Mult==true)
                {
                    res*=input;
                    Mult=false;
                }
                else if(Div==true)
                {
                    res/=input;
                    Div=false;
                }
                else res=input;
                Div=true;
            }
        });
        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sin=true;
                edtExp.setText(edtExp.getText()+"sin");

            }
        });
        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cos=true;
                edtExp.setText(edtExp.getText()+"cos");

            }
        });
        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tan=true;
                edtExp.setText(edtExp.getText()+"tan");

            }
        });
        btnSin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sin1=true;
                edtExp.setText(edtExp.getText()+"sin⁻¹");

            }
        });
        btnCos1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cos1=true;
                edtExp.setText(edtExp.getText()+"cos⁻¹");

            }
        });
        btnTan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tan1=true;
                edtExp.setText(edtExp.getText()+"tan⁻¹");

            }
        });
        btnX2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                X2=true;
                edtExp.setText(edtExp.getText()+"²");
            }
        });
        btnXb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Xb=true;
                edtExp.setText(edtExp.getText()+"^");
                preInput=Double.parseDouble(edtInput.getText()+"");
                edtInput.setText(null);
            }
        });
        btnSqRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SqRoot=true;
                edtExp.setText(edtExp.getText()+"√");
                edtInput.setText(null);
            }
        });
        btnXRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XRoot=true;
                edtExp.setText(edtExp.getText()+"³√");
                edtInput.setText(null);
            }
        });
        btnFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fact=true;
                edtExp.setText(edtExp.getText()+"!");
                edtInput.setText(null);
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input=Double.parseDouble(edtInput.getText()+"");

                if(Sin==true)
                {
                    input=Math.toRadians(input);
                    input=Math.sin(input);Sin=false;
                }
                else if(Cos==true)
                {
                    input=Math.toRadians(input);
                    input=Math.cos(input);Cos=false;
                }
                else if(Tan==true)
                {
                    input=Math.toRadians(input);
                    input=Math.tan(input);Tan=false;
                }
                else if(Sin1==true)
                {
                    input=Math.toRadians(input);
                    input=Math.asin(input);
                    Sin1=false;
                }
                else if(Cos1==true)
                {
                    input=Math.toRadians(input);
                    input=Math.acos(input);
                    Cos1=false;
                }
                else if(Tan1==true)
                {
                    input=Math.toRadians(input);
                    input=Math.atan(input);
                    Tan1=false;
                }
                if(X2==true)
                {
                    input*=input;X2=false;
                }
                else if(Xb==true)
                {
                    input=Math.pow(preInput,input);
                    Xb=false;
                }
                else if(SqRoot==true)
                {
                    input=Math.sqrt(input);
                    SqRoot=false;
                }
                else if(XRoot==true)
                {
                    input=Math.cbrt(input);
                    XRoot=false;
                }
                edtInput.setText(null);
                if(Add==true)
                {
                    res+=input;
                    Add=false;
                }
                else if(Sub==true)
                {
                    res-=input;
                    Sub=false;
                }
                else if(Mult==true)
                {
                    res*=input;
                    Mult=false;
                }
                else if(Div==true)
                {
                    res/=input;
                    Div=false;
                }
                else res=input;

                edtExp.setText(res+"");
                edtInput.setText(res+"");
                ans=res;
            }
        });





    }
}