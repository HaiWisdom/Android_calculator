package ca.uwaterloo.ms8lcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Double.parseDouble;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView display;
    private Button c, squareRoot, percent,backSpace, one, two, three, four, five, six, seven, eight;
    private Button nine, zero, point, equal, plus, minus, multiply, divide, mrc, mMinus, mPlus, ac;
    private double mStore;
    double num;
    boolean hasPointed;
    int operLabel;
    boolean isZeroBegin;
    boolean isOperator;

    private void initialize(){
        mStore = 0d;
        num = 0d;
        operLabel = 0;
        display.setText("0");
        initialize1();
    }

    private void initialize1() {
        hasPointed = false;
        isZeroBegin = true;
        isOperator = true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        display = (TextView) findViewById(R.id.display);

        initialize();

        c = (Button) findViewById(R.id.c);
        c.setOnClickListener(this);
        squareRoot = (Button) findViewById(R.id.squareRoot);
        squareRoot.setOnClickListener(this);
        percent = (Button) findViewById(R.id.percent);
        percent.setOnClickListener(this);
        backSpace = (Button) findViewById(R.id.backSpace);
        backSpace.setOnClickListener(this);
        one = (Button) findViewById(R.id.one);
        one.setOnClickListener(this);
        two = (Button) findViewById(R.id.two);
        two.setOnClickListener(this);
        three = (Button) findViewById(R.id.three);
        three.setOnClickListener(this);
        four = (Button) findViewById(R.id.four);
        four.setOnClickListener(this);
        five = (Button) findViewById(R.id.five);
        five.setOnClickListener(this);
        six = (Button) findViewById(R.id.six);
        six.setOnClickListener(this);
        seven = (Button) findViewById(R.id.seven);
        seven.setOnClickListener(this);
        eight = (Button) findViewById(R.id.eight);
        eight.setOnClickListener(this);
        nine = (Button) findViewById(R.id.nine);
        nine.setOnClickListener(this);
        zero = (Button) findViewById(R.id.zero);
        zero.setOnClickListener(this);
        point = (Button) findViewById(R.id.point);
        point.setOnClickListener(this);
        equal = (Button) findViewById(R.id.equal);
        equal.setOnClickListener(this);
        plus = (Button) findViewById(R.id.plus);
        plus.setOnClickListener(this);
        minus = (Button) findViewById(R.id.minus);
        minus.setOnClickListener(this);
        multiply = (Button) findViewById(R.id.multiply);
        multiply.setOnClickListener(this);
        divide = (Button) findViewById(R.id.divide);
        divide.setOnClickListener(this);
        mrc = (Button) findViewById(R.id.mrc);
        mrc.setOnClickListener(this);
        mMinus = (Button) findViewById(R.id.mminus);
        mMinus.setOnClickListener(this);
        mPlus = (Button) findViewById(R.id.mplus);
        mPlus.setOnClickListener(this);
        ac = (Button) findViewById(R.id.AC);
        ac.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.zero:
                 displayInput(0);
                break;
            case R.id.one:
                displayInput(1);
                break;
            case R.id.two:
                displayInput(2);
                break;
            case R.id.three:
                 displayInput(3);
                break;
            case R.id.four:
                displayInput(4);
                break;
            case R.id.five:
                 displayInput(5);
                break;
            case R.id.six:
                displayInput(6);
                break;
            case R.id.seven:
                displayInput(7);
                break;
            case R.id.eight:
                displayInput(8);
                break;
            case R.id.nine:
                displayInput(9);
                break;
            case R.id.point:
                if (display.getText().length() != 0 && !hasPointed) {
                    display.append(".");
                    hasPointed = true;
                }
                break;
            case R.id.backSpace:
                String disStr = display.getText().toString();
                int len = disStr.length();
                if (len > 0){
                    display.setText(disStr.substring(0, len - 1));
                }
                break;
            case R.id.plus:
                operatorBefore();
                operLabel = 1;
                operatorAfter();
                break;
            case R.id.minus:
                operatorBefore();
                operLabel = 4;
                operatorAfter();
                break;
            case R.id.multiply:
                operatorBefore();
                operLabel = 2;
                operatorAfter();
                break;
            case R.id.divide:
                operatorBefore();
                operLabel = 3;
                operatorAfter();
                break;
            case R.id.equal:
                if (operLabel != 0) {
                    equalOperation();
                }
                operLabel = 0;
                break;
            case R.id.c:
                display.setText("");
                initialize1();
                break;
            case R.id.AC:
                display.setText("");
                initialize();
                break;
            case R.id.squareRoot:
                String str = display.getText().toString();
                if (str.length() == 0) {
                    break;
                }
                double sr = parseDouble(display.getText().toString());
                if (sr < 0) {
                    display.setText(R.string.error);
                }
                else {
                    sr = Math.sqrt(sr);
                    displayResult(sr);
                }
                initialize1();
                break;
            case R.id.percent:
                str = display.getText().toString();
                if (str.length() == 0) {
                    break;
                }
                double percentV = parseDouble(display.getText().toString());
                percentV /= 100;
                displayResult(percentV);
                initialize1();
                break;
            case R.id.mplus:
            case R.id.mminus:
                double mNum = parseDouble(display.getText().toString());
                if (v.getId() == R.id.mplus){
                    mStore += mNum;
                }
                else {
                    mStore -= mNum;
                }
                break;
            case R.id.mrc:
                displayResult(mStore);
                break;
        }
    }

    private void equalOperation(){
        isOperator = true;
        String str = display.getText().toString();
        if (str.length() == 0){
            num = 0;
        }
        else {
            double temp = parseDouble(str);
            if (operLabel == 1) {
                num += temp;
            }
            else if (operLabel == 2) {
                num *= temp;
            }
            else if (operLabel == 3) {
                if (temp == 0d){
                    display.setText(getResources().getString(R.string.Infinity));
                    initialize1();
                    return;
                }
                else {
                    num /= temp;
                }
            }
            else if (operLabel == 4) {
                num -= temp;
            }
        }
        operatorAfter();
    }

    private void operatorBefore (){
        if (operLabel != 0) {
            equalOperation();
        }
        isOperator = true;
        String x = display.getText().toString();
        if (x.length() == 0){
            num = 0;
        }
        else {
            num = Double.parseDouble(display.getText().toString());
        }

    }

    private void operatorAfter(){
        initialize1();
        displayResult(num);
    }

    private void displayInput(int digit){
        if (isZeroBegin || isOperator) {
            display.setText(String.valueOf(digit));
            //display.setText(inputChar);
            isOperator = false;
        }
        else {
            display.append(String.valueOf(digit));
        }
        if (digit != 0) {
            isZeroBegin = false;
        }
    }

    private void displayResult(Double inputDouble){
        display.setText(fmt(inputDouble));
    }

    public String fmt(double d)
    {
        if(d == (long) d)
            return String.format("%d",(long)d);
        else
            return String.format("%s",d);
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
