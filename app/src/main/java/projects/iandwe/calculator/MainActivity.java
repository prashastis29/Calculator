package projects.iandwe.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bplus,bminus,bmult,bdiv,bclear,bequal,bdecimal,bdel,bopenb,bcloseb,bpower,bsq,bcu,bpercent;
    EditText et;
    String exp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et=findViewById(R.id.editText);
        bpercent=findViewById(R.id.buttonpercent);
        bopenb=findViewById(R.id.buttonopenbracket);
        bcloseb=findViewById(R.id.buttonclosebracket);
        bsq=findViewById(R.id.buttonsqroot);
        bcu=findViewById(R.id.buttoncuroot);
        bpower=findViewById(R.id.buttonpower);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5= findViewById(R.id.button5);
        b6=findViewById(R.id.button6);
        b7=findViewById(R.id.button7);
        b8=findViewById(R.id.button8);
        b9=findViewById(R.id.button9);
        b0=findViewById(R.id.button0);
        bplus=findViewById(R.id.buttonplus);
        bminus=findViewById(R.id.buttonminus);
        bmult=findViewById(R.id.buttonmultiply);
        bdiv=findViewById(R.id.buttonDiv);
        bclear=findViewById(R.id.buttonClear);
        bequal=findViewById(R.id.buttonEqual);
        bdecimal=findViewById(R.id.buttondecimal);
        bdel=findViewById(R.id.buttondel);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"0");
            }
        });
        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText("");
            }
        });
        bdecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+".");
            }
        });
        bdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText().toString().substring(0,et.length()-1));
            }
        });

        bpower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+" ^ ");

            }
        });

        bpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float num = Float.parseFloat(et.getText().toString());
                    et.setText(num/100 +"");
                }catch(Exception e)
                {
                    et.setText("invalid");
                }
            }
        });

        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et==null) {
                    et.setText("");
                }
                else
                {
                    et.setText(et.getText()+" + ");
                }
            }
        });
        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et==null)
                    et.setText("");
                else
                {
                    et.setText(et.getText()+" - ");
                }
            }
        });
        bmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et==null)
                    et.setText("");
                else
                {
                    et.setText(et.getText()+" * ");
                }
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et==null)
                    et.setText("");
                else
                {
                    et.setText(et.getText()+" / ");
                }
            }
        });

        bopenb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+" ( ");
            }
        });

        bcloseb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+" ) ");
            }
        });

        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp = et.getText().toString();
                Calculation cln = new Calculation();
                if (cln.evaluate(exp) != -1)
                    et.setText(cln.evaluate(exp) + "");
                else et.setText("invalid");
            }
        });

        bsq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float num = Float.parseFloat(et.getText().toString());
                    float res = (float) Math.sqrt(num);
                    et.setText(res+"");
                }catch(Exception e)
                {
                    et.setText("invalid");
                }
            }
        });

        bcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float num = Float.parseFloat(et.getText().toString());
                    float res = (float) Math.cbrt(num);
                    et.setText(res+"");
                }catch(Exception e)
                {
                    et.setText("invalid");
                }
            }
        });

    }

}
