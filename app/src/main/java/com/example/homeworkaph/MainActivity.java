package com.example.homeworkaph;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;

    //mensaje mediante clave-valor definida public para poder usarla también en la SecondActivity
    public static final String EXTRA_MESSAGE =
            "com.example.android.homeworkaph.extra.MESSAGE";

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //obteniendo el valor del textview y convirtitendolo a textView
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        //obteniendo el texto del textview//msj a mandar a la 3nda activity
        String message = mShowCount.getText().toString();

        //The Intent constructor takes two arguments for an explicit:
        // Here you should use this as the Context, and SecondActivity.class as the specific class
        Intent intent = new Intent(this, SecondActivity.class);
        //manda la clave de la primer activity y el msj que se encuentra en el string message
        intent.putExtra(EXTRA_MESSAGE, message);
        //Call the startActivity() method with the new Intent as the argument.
        startActivity(intent);
      //  Toast toast = Toast.makeText(this, R.string.toast_message,
        //        Toast.LENGTH_SHORT);
       // toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}