package br.com.fiap.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("FIAP","Passei pelo onCreate!");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("FIAP", "Passei pelo onStart!");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("FIAP","Passei pelo on Resume!");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("FIAP","Passei pelo onRestart!");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("FIAP","Passei pelo onPause!");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("FIAP","Passei pelo onStop!");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("FIAP","Passei pelo onDestroy!");
    }
}
