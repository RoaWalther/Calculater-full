package com.example.walther.myapplication2;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText pant,vt1;
    private TextView vt;
    private double nun1, nun2, signo = 0, panta1 = 0, panta2 = 0, respuesta = 0, resultado;
    private String cadena = "", cadena2 = "", cadena3 = "", cade = "", selec = "", tipo = "";
    private boolean ope1, ope2, inicio = true;
    boolean igual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        pant = (EditText) findViewById(R.id.pantalla1);
        vt1 = (EditText) findViewById(R.id.pantalla2);
    }

    public static void forma(int tamaño_normal){

    }
    public void uno (View view){
        cadena = pant.getText().toString();
        cadena = cadena + "1";
        pant.setText(cadena);
        /* pant.setText(pant.getText() + "1");*/
        if (cadena.length()>15)
            Toast.makeText(this,"Se ha superado el número máximo de dígitos (15)",Toast.LENGTH_SHORT).show();
    }
    public void dos (View view){
        cadena = pant.getText().toString();
        cadena = cadena + "2";
        pant.setText(cadena);
        /*  pant.setText(pant.getText() + "2");*/
        if (cadena.length()>15)
            Toast.makeText(this,"Se ha superado el número máximo de dígitos (15)",Toast.LENGTH_SHORT).show();
    }
    public void tres (View view){
        cadena = pant.getText().toString();
        cadena = cadena + "3";
        pant.setText(cadena);
        /*pant.setText(pant.getText() + "3");*/
        if (cadena.length()>15)
            Toast.makeText(this,"Se ha superado el número máximo de dígitos (15)",Toast.LENGTH_SHORT).show();
    }
    public void cuatro (View view){
        cadena = pant.getText().toString();
        cadena = cadena + "4";
        pant.setText(cadena);
        /* pant.setText(pant.getText() + "4");*/
        if (cadena.length()>15)
            Toast.makeText(this,"Se ha superado el número máximo de dígitos (15)",Toast.LENGTH_SHORT).show();
    }
    public void cinco (View view){
        //cadena = pant.getText().toString();
        //  cadena = cadena + "5";
        //pant.setText(cadena);
        //pant.setText(pant.getText() + "5");
        if (cadena.length()<12) {
            cadena=pant.getText().toString();
            cadena = cadena + "5";
            pant.setText(cadena);
        }else if (cadena.length()>= 12){

            cadena=pant.getText().toString();
            cadena = cadena + "5";
            pant.setText(cadena);
        }if (cadena.length()>15)
            Toast.makeText(this,"Se ha superado el número máximo de dígitos (15)",Toast.LENGTH_SHORT).show();
    }
    public void seis (View view){
        cadena = pant.getText().toString();
        cadena = cadena + "6";
        pant.setText(cadena);
        /* pant.setText(pant.getText() + "6");*/
        if (cadena.length()>15)
            Toast.makeText(this,"Se ha superado el número máximo de dígitos (15)",Toast.LENGTH_SHORT).show();
    }
    public void siete (View view){
        cadena = pant.getText().toString();
        cadena = cadena + "7";
        pant.setText(cadena);
        /* pant.setText(pant.getText() + "7");*/
        if (cadena.length()>15)
            Toast.makeText(this,"Se ha superado el número máximo de dígitos (15)",Toast.LENGTH_SHORT).show();
    }
    public void ocho (View view){
        cadena = pant.getText().toString();
        cadena = cadena + "8";
        pant.setText(cadena);
        /*pant.setText(pant.getText() + "8");*/
        if (cadena.length()>15)
            Toast.makeText(this,"Se ha superado el número máximo de dígitos (15)",Toast.LENGTH_SHORT).show();
    }
    public void nueve (View view){
        cadena = pant.getText().toString();
        cadena = cadena + "9";
        pant.setText(cadena);
        /*  pant.setText(pant.getText()+"9");*/
        if (cadena.length()>15)
            Toast.makeText(this,"Se ha superado el número máximo de dígitos (15)",Toast.LENGTH_SHORT).show();
    }
    public void cero (View view){
        cadena = pant.getText().toString();
        cadena = cadena + "0";
        pant.setText(cadena);
        /*pant.setText(pant.getText()+ "0");*/
        if (cadena.length()>15)
            Toast.makeText(this,"Se ha superado el número máximo de dígitos (15)",Toast.LENGTH_SHORT).show();
    }
    public void punto (View view){
       /* cadena = pant.getText().toString();
        cadena = cadena + ".";
        pant.setText(cadena);*/
        cadena = pant.getText().toString();
        if (cadena.length()<=0){
            pant.setText("");
        }else if (!existepunto(pant.getText().toString())){
            pant.setText(pant.getText() + ".");
        }
    }
    public static boolean existepunto(String cadena){
        boolean res;
        res = false;
        for (int i= 0; i < cadena.length();i++){
            if (cadena.substring(i,i+1).equals(".")){
                res= true;
                break;
            }
        }
        return res;
    }
    public void suma (View view){
        try{
            cadena2= pant.getText().toString();
            nun1 = Double.parseDouble(cadena2);
        }catch (NumberFormatException nfe){}
        pant.setText("");
        panta1 = 1;

    }
    public void resta (View view){
        try{
            cadena2= pant.getText().toString();
            nun1 = Double.parseDouble(cadena2);
        }catch (NumberFormatException nfe){}
        pant.setText("");
        panta1 = 2;
    }
    public void multiplicacion (View view){
        try{
            cadena2= pant.getText().toString();
            nun1 = Double.parseDouble(cadena2);
        }catch (NumberFormatException nfe){}
        pant.setText("");
        panta1 = 3;
    }
    public void division (View view){
        try{
            cadena2= pant.getText().toString();
            nun1 = Double.parseDouble(cadena2);
        }catch (NumberFormatException nfe){}
        pant.setText("");
        panta1 = 4;
    }

    public void potencia  (View view){
        try{
            cadena2= pant.getText().toString();
            nun1 = Double.parseDouble(cadena2);
        }catch (NumberFormatException nfe){}
        pant.setText("");
        panta1 = 5;
    }

    public void horizontal (View view){
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

    }

    public  void  vertical (View view){
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void porcentage (View view){
        try{
            cadena2= pant.getText().toString();
            nun1 = Double.parseDouble(cadena2);
        }catch (NumberFormatException nfe){}
        pant.setText("");
        panta1 = 6;
    }
    public void raiz (View view){
        try{
            cadena2= pant.getText().toString();
            nun1 = Double.parseDouble(cadena2);
        }catch (NumberFormatException nfe){}
        pant.setText("√(" + nun1 + ")");
        panta1 = 7;
    }
    public void sin (View view){
        try{
            cadena2= pant.getText().toString();
            nun1 = Double.parseDouble(cadena2);
        }catch (NumberFormatException nfe){}
        pant.setText("Sin(" + nun1 + ")");
        panta1 = 8;
    }
    public void cos (View view){
        try{
            cadena2= pant.getText().toString();
            nun1 = Double.parseDouble(cadena2);
        }catch (NumberFormatException nfe){}
        pant.setText("Cos(" + nun1 + ")");
        panta1 = 9;
    }

    public void tan (View view){
        try{
            cadena2= pant.getText().toString();
            nun1 = Double.parseDouble(cadena2);
        }catch (NumberFormatException nfe){}
        pant.setText("Tan(" + nun1 + ")");
        panta1 = 10;
    }
    public void csc (View view){
        try{
            cadena2= pant.getText().toString();
            nun1 = Double.parseDouble(cadena2);
        }catch (NumberFormatException nfe){}
        pant.setText("Csc(" + nun1 + ")");
        panta1 = 11;
    }
    public void sec (View view){
        try{
            cadena2= pant.getText().toString();
            nun1 = Double.parseDouble(cadena2);
        }catch (NumberFormatException nfe){}
        pant.setText("Sec(" + nun1 + ")");
        panta1 = 12;
    }
    public void ctg (View view){
        try{
            cadena2= pant.getText().toString();
            nun1 = Double.parseDouble(cadena2);
        }catch (NumberFormatException nfe){}
        pant.setText("Ctg(" + nun1 + ")");
        panta1 = 13;
    }

    public void factorial (View view){
        try{
            cadena2= pant.getText().toString();
            nun1 = Double.parseDouble(cadena2);
        }catch (NumberFormatException nfe){}
        pant.setText("");
        panta1 = 14;
    }
    public void logaritmo (View view){
        try{
            cadena2= pant.getText().toString();
            nun1 = Double.parseDouble(cadena2);
        }catch (NumberFormatException nfe){}
        pant.setText("Log(" + nun1 + ")");
        panta1 = 15;
    }
    public void numeroPi (View view){
        try{
            cadena2= pant.getText().toString();
            nun1 = Double.parseDouble(cadena2);
        }catch (NumberFormatException nfe){}
        pant.setText("PI(" + nun1 + ")");
        panta1 = 16;
    }
    public void elevar_x (View view){
        try{
            cadena2= pant.getText().toString();
            nun1 = Double.parseDouble(cadena2);
        }catch (NumberFormatException nfe){}
        pant.setText( nun1 + " ˄ -1");
        panta1 = 17;
    }
    public void expo (View view){
        try{
            cadena2= pant.getText().toString();
            nun1 = Double.parseDouble(cadena2);
        }catch (NumberFormatException nfe){}
        pant.setText( "exp ("+ nun1 + ")");
        panta1 = 18;
    }

    public void inversa (View view){
        try{
            String res;
            cadena2= pant.getText().toString();

            if (cadena2.length()>0){
                nun1= (1)/(Double.parseDouble(cadena2));
                res= ""+ nun1;
                vt1.setText(res);
                tipo= vt1.getText().toString();
                nun1 = Double.parseDouble(tipo);
                pant.setText(String.valueOf(nun1));
            }if (cadena2.length()<0){
                Toast.makeText(this,"error",Toast.LENGTH_SHORT).show();
            }
        }catch (NumberFormatException nfe){}
        //pant.setText("");
    }
    public void menos_mas ( View view){
        try{
            cadena2= pant.getText().toString();
            if (cadena2.length()>0)
                nun1 =(-1)* Double.parseDouble(cadena2);
            vt1.setText(String.valueOf(nun1));
            cade = vt1.getText().toString();
            nun1= Double.parseDouble(cade);
            pant.setText(String.valueOf(nun1));
        }catch (NumberFormatException nfe){}
    }

    public void igual (View view){
        try{
            cadena3= pant.getText().toString();
            nun2 = Double.parseDouble(cadena3);
        }catch (NumberFormatException nfe){}
        pant.setText("");
        //suma
        if (panta1 == 1){
            respuesta = nun1 + nun2;
            selec = String.format("%.0f",respuesta);
            pant.setText(selec);
            vt1.setText(selec);
        }
        //resta
        else if (panta1 == 2){
            respuesta = nun1- nun2;
            selec = String.format("%.0f",respuesta);
            //
            vt1.setText(selec);
            pant.setText(selec);
        }
        //multiplicacion
        else if (panta1 == 3){
            respuesta = nun1* nun2;
            selec = String.format("%.0f",respuesta);
            //
            vt1.setText(selec);
            pant.setText(selec);
                /*   esta es otra forma de la respuesta  pero sin el --String.format();--
                vt1.setText(String.valueOf(respuesta));
                cade = vt1.getText().toString();
                nun1= Double.parseDouble(cade);
                pant.setText(String.valueOf(nun1));*/
        }
        //division
        else if (panta1 == 4){
            if (nun2== 0){
                Toast.makeText(this,"error no se puede dividir entre 0.",Toast.LENGTH_LONG).show();
                pant.setError("error / entre 0.");
                vt1.setText("error / entre 0.");
            }else{
                respuesta = nun1/nun2;
                // selec = String.format("%.1f",respuesta);
                vt1.setText(String.valueOf(  respuesta));
                pant.setText(String.valueOf( respuesta));
                //castear un valor pant.setText(String.valueOF( (long) respuesta);
            }
        }
        // potencia
        else if (panta1 == 5){
            respuesta = Math.pow(nun1,nun2);
            //
            vt1.setText(String.valueOf(respuesta));
            cade = vt1.getText().toString();
            nun1= Double.parseDouble(cade);
            pant.setText(String.valueOf(nun1));
        }
        //porcentage
        else if (panta1==6){
            respuesta = nun2 * (nun1/100);
            //
            vt1.setText(String.valueOf(respuesta));
            cade = vt1.getText().toString();
            nun1= Double.parseDouble(cade);
            pant.setText(String.valueOf(nun1));
        }
        // raiz cuadrada
        else if (panta1==7){
            if (nun1 < 0){
                Toast.makeText(this,"No se ha podido calcular el resultado de la √.",Toast.LENGTH_LONG).show();
                pant.setText("√("+ nun1+")");
                vt1.setText("Error");
            }else {
                respuesta = Math.sqrt(nun1);
                cade = String.valueOf(respuesta);
                vt1.setText(cade);
                pant.setText(cade);
            }
        }
        //seno
        else if (panta1==8){
            double rad = Math.toRadians(nun1);
            respuesta = (Math.sin(rad));
            //
            vt1.setText(String.valueOf(respuesta));
            cade = vt1.getText().toString();
            nun1= Double.parseDouble(cade);
            pant.setText(String.valueOf(nun1));
        }
        //coseno
        else if (panta1==9){
            double rad = Math.toRadians(nun1);
            respuesta = (Math.cos(rad));
            //
            vt1.setText(String.valueOf(respuesta));
            cade = vt1.getText().toString();
            nun1= Double.parseDouble(cade);
            pant.setText(String.valueOf(nun1));
        }
        //tangente
        else if (panta1==10){
            double rad = Math.toRadians(nun1);
            respuesta = (Math.tan(rad));
            //
            vt1.setText(String.valueOf(respuesta));
            cade = vt1.getText().toString();
            nun1= Double.parseDouble(cade);
            pant.setText(String.valueOf(nun1));
        }
        //secante
        else if (panta1==11){
            double angulo = (Math.asin(nun1));
            respuesta = (Math.toDegrees(angulo));
            //
            vt1.setText(String.valueOf(respuesta));
            cade = vt1.getText().toString();
            nun1= Double.parseDouble(cade);
            pant.setText(String.valueOf(nun1));
        }
        //cosecante
        else if (panta1==12){
            double angulo = (Math.acos(nun1));
            respuesta = (Math.toDegrees(angulo));
            //
            vt1.setText(String.valueOf(respuesta));
            cade = vt1.getText().toString();
            nun1= Double.parseDouble(cade);
            pant.setText(String.valueOf(nun1));
        }
        //cotangente
        else if (panta1==13){
            double angulo = (Math.atan(nun1));
            respuesta = (Math.toDegrees(angulo));
            //
            vt1.setText(String.valueOf(respuesta));
            cade = vt1.getText().toString();
            nun1= Double.parseDouble(cade);
            pant.setText(String.valueOf(nun1));
        }
        //factorial
        else if (panta1==14){
            respuesta = 1;
            for (double i = nun1; i > 1; i--){
                respuesta = respuesta * i;
            }//
            vt1.setText(String.valueOf(respuesta));
            cade = vt1.getText().toString();
            nun1= Double.parseDouble(cade);
            pant.setText(String.valueOf(nun1));
        }//logaritmo
        else if (panta1==15){
            if (nun1 < 0){
                Toast.makeText(this,"No se ha podido calcular el resultado.",Toast.LENGTH_LONG).show();
                pant.setText("log("+ nun1 + ")");
                vt1.setText("");
            }else {
                respuesta = Math.log(nun1);
                vt1.setText(String.valueOf(respuesta));
                cade = vt1.getText().toString();
                nun1 = Double.parseDouble(cade);
                pant.setText(String.valueOf(nun1));
            }
        }//numero pi
        else  if (panta1==16){
            respuesta = Math.PI*(nun1);
            vt1.setText(String.valueOf(respuesta));
            cade = vt1.getText().toString();
            nun1= Double.parseDouble(cade);
            pant.setText(String.valueOf(nun1));
        }//elevar_x
        else if (panta1==17){
            respuesta= Math.pow(nun1,-1);
            vt1.setText(String.valueOf(respuesta));
            cade = vt1.getText().toString();
            nun1= Double.parseDouble(cade);
            pant.setText(String.valueOf(nun1));
        }//exponente
        else if(panta1==18){
            respuesta = Math.exp(nun1);
            vt1.setText(String.valueOf(respuesta));
            cade = vt1.getText().toString();
            nun1= Double.parseDouble(cade);
            pant.setText(String.valueOf(nun1));
        }
    }
    public void borrartodo (View view){
        pant.setText("");
        vt1.setText("");
        nun1=0;
        nun2 = 0;
        respuesta = 0;
    }
    public void  borrarultimo(View view){
        if(!pant.getText().toString().equals("")){
            pant.setText(pant.getText().subSequence(0,pant.getText().length()-1)+"");
        }else if (!vt1.getText().toString().equals("")){
            vt1.setText(vt1.getText().subSequence(0,vt1.getText().length()-1)+"");

        }
    }
    public void off(View view){
        finish();;

    }
}