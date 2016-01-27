package com.example.anuroop.mycal;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
//additional imports
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String sign = "";
    public String total = "";
    public Double temp1,temp2;
    boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button0 = (Button) findViewById(R.id.button10);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);

        Button buttonC = (Button) findViewById(R.id.buttonC);
        Button buttonE = (Button) findViewById(R.id.buttonE);
        Button buttonA = (Button) findViewById(R.id.buttonA);
        Button buttonS = (Button) findViewById(R.id.buttonS);
        Button buttonM = (Button) findViewById(R.id.buttonM);
        Button buttonD = (Button) findViewById(R.id.buttonD);
        //Button buttonlb = (Button) findViewById(R.id.buttonlb);
        //Button buttonrb = (Button) findViewById(R.id.buttonrb);
        Button buttond = (Button) findViewById(R.id.buttond);

    //bitton0 evenhandler
        button0.setOnClickListener(
                //interface

                new Button.OnClickListener()
                {
                    //button0 data
                    public void onClick(View view){
                        TextView output = (TextView) findViewById(R.id.editText);
                        if(!flag){ flag = true;
                            output.setText("");
                        }
                        output.append("0");
                    }
                }
        );
        button1.setOnClickListener(
                //interface

                new Button.OnClickListener()
                {
                    //button0 data
                    public void onClick(View view){
                        TextView output = (TextView) findViewById(R.id.editText);
                        if(!flag){ flag = true;
                            output.setText("");
                        }
                        output.append("1");
                    }
                }
        );
        button2.setOnClickListener(
                //interface

                new Button.OnClickListener()
                {
                    //button0 data
                    public void onClick(View view){
                        TextView output = (TextView) findViewById(R.id.editText);
                        if(!flag){ flag = true;
                            output.setText("");
                        }
                        output.append("2");
                    }
                }
        );
        button3.setOnClickListener(
                //interface

                new Button.OnClickListener()
                {
                    //button0 data
                    public void onClick(View view){
                        TextView output = (TextView) findViewById(R.id.editText);
                        if(!flag){ flag = true;
                            output.setText("");
                        }
                        output.append("3");
                    }
                }
        );
        button4.setOnClickListener(
                //interface

                new Button.OnClickListener()
                {
                    //button0 data
                    public void onClick(View view){
                        TextView output = (TextView) findViewById(R.id.editText);
                        if(!flag){ flag = true;
                            output.setText("");
                        }
                        output.append("4");
                    }
                }
        );
        button5.setOnClickListener(
                //interface

                new Button.OnClickListener()
                {
                    //button0 data
                    public void onClick(View view){
                        TextView output = (TextView) findViewById(R.id.editText);
                        if(!flag){ flag = true;
                            output.setText("");
                        }
                        output.append("5");
                    }
                }
        );
        button6.setOnClickListener(
                //interface

                new Button.OnClickListener()
                {
                    //button0 data
                    public void onClick(View view){
                        TextView output = (TextView) findViewById(R.id.editText);
                        if(!flag){ flag = true;
                            output.setText("");
                        }
                        output.append("6");
                    }
                }
        );
        button7.setOnClickListener(
                //interface

                new Button.OnClickListener()
                {
                    //button0 data
                    public void onClick(View view){
                        TextView output = (TextView) findViewById(R.id.editText);
                        if(!flag){ flag = true;
                            output.setText("");
                        }
                        output.append("7");
                    }
                }
        );
        button8.setOnClickListener(
                //interface

                new Button.OnClickListener()
                {
                    //button0 data
                    public void onClick(View view){
                        TextView output = (TextView) findViewById(R.id.editText);
                        if(!flag){ flag = true;
                            output.setText("");
                        }
                        output.append("8");
                    }
                }
        );
        button9.setOnClickListener(
                //interface

                new Button.OnClickListener()
                {
                    //button0 data
                    public void onClick(View view){
                        TextView output = (TextView) findViewById(R.id.editText);
                        if(!flag){ flag = true;
                            output.setText("");
                        }
                        output.append("9");
                    }
                }
        );

        //clear
        buttonC.setOnClickListener(
                //interface

                new Button.OnClickListener()
                {
                    //button0 data
                    public void onClick(View view){
                        TextView output = (TextView) findViewById(R.id.editText);
                        output.setText("");
                    }
                }
        );

        //for addition
        buttonA.setOnClickListener(
                //interface

                new Button.OnClickListener()
                {
                    //button0 data
                    public void onClick(View view){
                        TextView output = (TextView) findViewById(R.id.editText);
                        if(!flag) flag = true;
                        output.append("+");
                    }
                }
        );
        //for subtraction
        buttonS.setOnClickListener(
                //interface

                new Button.OnClickListener()
                {
                    //button0 data
                    public void onClick(View view){
                        TextView output = (TextView) findViewById(R.id.editText);
                        if(!flag) flag = true;
                        output.append("-");
                    }
                }
        );
        //for multiplivation
        buttonM.setOnClickListener(
                //interface

                new Button.OnClickListener()
                {
                    //button0 data
                    public void onClick(View view){
                        TextView output = (TextView) findViewById(R.id.editText);
                        if(!flag) flag = true;
                        output.append("*");
                    }
                }
        );
        //for division
        buttonD.setOnClickListener(
                //interface

                new Button.OnClickListener()
                {
                    //button0 data
                    public void onClick(View view){
                        TextView output = (TextView) findViewById(R.id.editText);
                        if(!flag) flag = true;
                        output.append("/");
                    }
                }
        );
       /* //for leftbrace
        buttonlb.setOnClickListener(
                //interface

                new Button.OnClickListener()
                {
                    //button0 data
                    public void onClick(View view){
                        TextView output = (TextView) findViewById(R.id.editText);
                        if(!flag) flag = true;
                        output.append("(");
                    }
                }
        );
        //for rightbrace
        buttonrb.setOnClickListener(
                //interface

                new Button.OnClickListener()
                {
                    //button0 data
                    public void onClick(View view){
                        TextView output = (TextView) findViewById(R.id.editText);
                        if(!flag) flag = true;
                        output.append(")");
                    }
                }
        );*/
        //for decimalinput
        buttond.setOnClickListener(
                //interface

                new Button.OnClickListener()
                {
                    //button0 data
                    public void onClick(View view){
                        TextView output = (TextView) findViewById(R.id.editText);
                        if(!flag) flag = true;
                        output.append(".");
                    }
                }
        );
        //for equal
        buttonE.setOnClickListener(
                //interface

                new Button.OnClickListener()
                {
                    //button0 data
                    public void onClick(View view){
                        TextView output = (TextView) findViewById(R.id.editText);
                        String input = output.getText().toString();
                        /*int x = EvaluateString.evaluate(output.getText().toString());
                        System.out.println(output.getText().toString()+"="+x);
                        output.setText(String.valueOf(x));*/
                        flag = false;
                        String result = EvaluateExpressionUsingStacks.getResult(input);
                        ;
                        if(result.charAt(result.lastIndexOf('.')+1) == '0'){
                            result = result.substring(0,result.lastIndexOf('.'));
                        }
                        output.setText(result);
                    }
                }
        );



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

