package com.example.taller_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private double num1 = 0;
    private double num2 = 0;
    private String operacion = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton1 = findViewById(R.id.boton1);
        Button boton2 = findViewById(R.id.boton2);
        Button boton3 = findViewById(R.id.boton3);
        Button boton4 = findViewById(R.id.boton4);
        Button boton5 = findViewById(R.id.boton5);
        Button boton6 = findViewById(R.id.boton6);
        Button boton7 = findViewById(R.id.boton7);
        Button boton8 = findViewById(R.id.boton8);
        Button boton9 = findViewById(R.id.boton9);
        Button boton0 = findViewById(R.id.boton0);
        Button botonS = findViewById(R.id.botonS);
        Button botonM = findViewById(R.id.botonM);
        Button botonX = findViewById(R.id.botonX);
        Button botonD = findViewById(R.id.botonD);
        TextView campoNumeros = findViewById(R.id.campoNumeros);
        Button botonI = findViewById(R.id.botonI);
        Button botonDel = findViewById(R.id.botonDel);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                campoNumeros.setText(campoNumeros.getText()+"1");
            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                campoNumeros.setText(campoNumeros.getText()+"2");
            }
        });
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                campoNumeros.setText(campoNumeros.getText()+"3");
            }
        });
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                campoNumeros.setText(campoNumeros.getText()+"4");
            }
        });
        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                campoNumeros.setText(campoNumeros.getText()+"5");
            }
        });
        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                campoNumeros.setText(campoNumeros.getText()+"6");
            }
        });
        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                campoNumeros.setText(campoNumeros.getText()+"7");
            }
        });
        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                campoNumeros.setText(campoNumeros.getText()+"8");
            }
        });
        boton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                campoNumeros.setText(campoNumeros.getText()+"9");
            }
        });
        boton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                campoNumeros.setText(campoNumeros.getText()+"0");
            }
        });

        botonS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(campoNumeros.getText().toString());
                operacion = "+";
                campoNumeros.append("+");
            }
        });

        botonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(campoNumeros.getText().toString());
                operacion = "-";
                campoNumeros.append("-");
            }
        });

        botonX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(campoNumeros.getText().toString());
                operacion = "*";
                campoNumeros.append("*");
            }
        });

        botonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(campoNumeros.getText().toString());
                operacion = "/";
                campoNumeros.append("/");
            }
        });

        botonI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valoresIngresados = campoNumeros.getText().toString();
                String[] valoresPartidos = valoresIngresados.split("\\Q" + operacion + "\\E");
                if (valoresPartidos.length == 2) {
                    num2 = Double.parseDouble(valoresPartidos[1]);
                    double total = 0;
                    if (operacion.equals("+")) {
                        total = num1 + num2;
                        campoNumeros.append("="+total);
                    } else if (operacion.equals("-")) {
                        total = num1 - num2;
                        campoNumeros.append("="+total);
                    } else if (operacion.equals("*")) {
                        total = num1 * num2;
                        campoNumeros.append("="+total);
                    } else if (operacion.equals("/")) {
                        if (num2 != 0) {
                            total = num1 / num2;
                            campoNumeros.append("="+total);
                        } else {
                            campoNumeros.setText("Error");
                            return;
                        }
                    }
                }
            }
        });

        botonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                campoNumeros.setText("");
            }
        });



    }
}