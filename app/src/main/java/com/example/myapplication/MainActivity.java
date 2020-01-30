package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button num7 = findViewById(R.id.button231);
        Button num4 = findViewById(R.id.button232);
        Button num1 = findViewById(R.id.button233);

        Button num8 = findViewById(R.id.button331);
        Button num5 = findViewById(R.id.button332);
        Button num2 = findViewById(R.id.button333);

        Button num9 = findViewById(R.id.button431);
        Button num6 = findViewById(R.id.button432);
        Button num3 = findViewById(R.id.button433);

        Button numsum = findViewById(R.id.button534);


    }

    int i = 0;
    int j = 0;
    int[][] r = new int[20][20];

    int res=0;
    int r1;
    int r2;
    int g;



    public void n1(View view) {

        int num1 = 1;
        int temp = num1;
        Log.i("number", "" + temp);

        r[i][j] = (r[i][j] * 10) + temp;
          i = i + 1;
        TextView txt = findViewById(R.id.textView2);

        int a1=0;


        for (int q=0;q<i;q++){
            a1=a1*10+r[q][j];
            txt.setText("" + a1);

        }







    }

    public void n2(View view) {

        int num2 = 2;
        int temp = num2;
        Log.i("number", "" + temp);

        r[i][j] = (r[i][j] * 10) + temp;
          i = i + 1;
        TextView txt = findViewById(R.id.textView2);

        int a1=0;


        for (int q=0;q<i;q++){
            a1=a1*10+r[q][j];
            txt.setText("" + a1);

        }
    }

    public void n3(View view) {

        int num3 = 3;
        int temp = num3;
        Log.i("number", "" + temp);

        r[i][j] = (r[i][j] * 10) + temp;
          i = i + 1;
        TextView txt = findViewById(R.id.textView2);

        int a1=0;


        for (int q=0;q<i;q++){
            a1=a1*10+r[q][j];
            txt.setText("" + a1);

        }
    }

    public void n4(View view) {

        int num4 = 4;
        int temp = num4;
        Log.i("number", "" + temp);

        r[i][j] = (r[i][j] * 10) + temp;
          i = i + 1;
        TextView txt = findViewById(R.id.textView2);

        int a1=0;


        for (int q=0;q<i;q++){
            a1=a1*10+r[q][j];
            txt.setText("" + a1);

        }
    }


    public void n5(View view) {

        int num5 = 5;
        int temp = num5;
        Log.i("number", "" + temp);

        r[i][j] = (r[i][j] * 10) + temp;
          i = i + 1;
        TextView txt = findViewById(R.id.textView2);

        int a1=0;


        for (int q=0;q<i;q++){
            a1=a1*10+r[q][j];
            txt.setText("" + a1);

        }
    }

    public void n6(View view) {

        int num6 = 6;
        int temp = num6;
        Log.i("number", "" + temp);

        r[i][j] = (r[i][j] * 10) + temp;
          i = i + 1;
        TextView txt = findViewById(R.id.textView2);

        int a1=0;


        for (int q=0;q<i;q++){
            a1=a1*10+r[q][j];
            txt.setText("" + a1);

        }
    }

    public void n7(View view) {

        int num7 = 7;
        int temp = num7;
        Log.i("number", "" + temp);

        r[i][j] = (r[i][j] * 10) + temp;
          i = i + 1;
        TextView txt = findViewById(R.id.textView2);

        int a1=0;


        for (int q=0;q<i;q++){
            a1=a1*10+r[q][j];
            txt.setText("" + a1);

        }
    }

    public void n8(View view) {

        int num8 = 8;
        int temp = num8;
        Log.i("number", "" + temp);


        r[i][j] = (r[i][j] * 10) + temp;
          i = i + 1;
        TextView txt = findViewById(R.id.textView2);

        int a1=0;


        for (int q=0;q<i;q++){
            a1=a1*10+r[q][j];
            txt.setText("" + a1);

        }
    }

    public void n9(View view) {

        int num9 = 9;
        int temp = num9;
        Log.i("number", "" + temp);


        r[i][j] = (r[i][j] * 10) + temp;
          i = i + 1;
        TextView txt = findViewById(R.id.textView2);

        int a1=0;


        for (int q=0;q<i;q++){
            a1=a1*10+r[q][j];
            txt.setText("" + a1);

        }
    }

    public void n0(View view) {

        int num0 = 0;
        int temp = num0;
        Log.i("number", "" + temp);


        r[i][j] = (r[i][j] * 10) + temp;
          i = i + 1;
        TextView txt = findViewById(R.id.textView2);

        int a1=0;


        for (int q=0;q<i;q++){
            a1=a1*10+r[q][j];
            txt.setText("" + a1);

        }


    }



  /*   public void sum(int x,int y) {

         synchronized (a) {

             a.wait();

         }


         res = r1 + r2;

     }*/


   /* public void ndot(View view) {


        Log.i("number", r + "");

        TextView txt = findViewById(R.id.textView2);


        txt.setText("" + r);


    }*/


    public void summation(View view) {

        int z;

        g = 1;

        if (j == 0) {
            r1 = 0;
            for (int q = 0; q < i; q++) {
                r1 = r1 * 10 + r[q][j];
                Log.i("sss", "" + r1);

            }
        }
        if (j == 1) {
            r2 = 0;
            for (int q = 0; q < i; q++) {
                r2 = r2 * 10 + r[q][j];
                Log.i("ccc", "" + r2);

            }
        }
        j = j + 1;
        i = 0;


        res = (r1 + r2);
        TextView txt = findViewById(R.id.textView);
        txt.setText(String.valueOf(r1+r2));
    }
    public void subtraction(View view) {

        int z;

        g = 2;

        if (j == 0) {
            r1 = 0;
            for (int q = 0; q < i; q++) {
                r1 = r1 * 10 + r[q][j];
                Log.i("sss", "" + r1);

            }
        }
        if (j == 1) {
            r2 = 0;
            for (int q = 0; q < i; q++) {
                r2 = r2 * 10 + r[q][j];
                Log.i("ccc", "" + r2);

            }
        }
        j = j + 1;
        i = 0;


        res = (r1 - r2);
        TextView txt = findViewById(R.id.textView);
        txt.setText(String.valueOf(r1-r2));
    }

    public void mul(View view) {
        int z;

        g = 3;

        if (j==0) {
            r1=0;
            for (int q = 0; q < i; q++) {
                r1 = r1 * 10 + r[q][j];
                Log.i("sss", "" + r1);

            }
        }
        if (j==1) {
            r2=0;
            for (int q = 0; q < i; q++) {
                r2 = r2 * 10 + r[q][j];
                Log.i("ccc", "" + r2);

            }
        }
        j = j + 1;
        i = 0;


        res = (r2 * r1);
        Log.i("ddd", "" + res);
        TextView txt = findViewById(R.id.textView);
        txt.setText(String.valueOf(res));


    }
    public void div(View view) {
        int[] z=new int[50];


        g = 4;


            for (int q = 0; q < i; q++) {

                z[j]=z[j]*10+ r[q][j];


            }
            Log.i("ddd", "" + z[j]);
            if (j==0){
                res=1;
            }
            res = res*z[j];

            TextView txt = findViewById(R.id.textView);
            txt.setText(String.valueOf(res));



        j = j + 1;
        i = 0;







    }


    public void eq(View view) {


        switch (g) {


            case 1:
                Log.i("number", ""+res);
                summation(null);


                Log.i("number22222", ""+res);
                break;




            case 2:


                subtraction(null);


                Log.i("number", ""+(res));
                break;


           case 3:

                Log.i("number", ""+res);
                mul(null);


                Log.i("number", ""+res);
                break;

            case 4:

                div(null);



                break;







        }
    }
}