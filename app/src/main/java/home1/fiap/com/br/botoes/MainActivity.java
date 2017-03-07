package home1.fiap.com.br.botoes;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int n = 0;
    TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Button incrementar = (Button)findViewById(R.id.button1);
        Button decrementar = (Button)findViewById(R.id.button2);*/

        resultado = (TextView)findViewById(R.id.textView);

    }

    public void incrementar(View v){

        if(n < 10 ){
            n++;
        }else {
            Toast.makeText(this, "Contador só pode incrementa até 10 ", Toast.LENGTH_SHORT).show();
        }

        resultado.setText("" + n);

    }

    public void decrementar(View v){

        if(n > 0 ){
            n--;
        }else {
            Toast.makeText(this, "Contador só pode decrementar até 0 ", Toast.LENGTH_SHORT).show();
        }

        resultado.setText("" + n);


    }



}
