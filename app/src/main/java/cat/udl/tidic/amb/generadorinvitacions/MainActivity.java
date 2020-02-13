package cat.udl.tidic.amb.generadorinvitacions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity","Hola estic entrant al oncreate...");

        final EditText editText_nom = (EditText) findViewById(R.id.editText_nom);
        final EditText editText_any = (EditText) findViewById(R.id.editText_any);
        final EditText editText_mes = (EditText) findViewById(R.id.editText_mes);
        final EditText editText_dia = (EditText) findViewById(R.id.editText_dia);
        final Button buidar_button = (Button) findViewById(R.id.buidar_button);
        final Button enviar_button = (Button) findViewById(R.id.enviar_button);
        final TextView editText_bio = (TextView) findViewById(R.id.tv_resposta);
        final EditText editText_lloc = (EditText) findViewById(R.id.editTextlloc);
        final EditText editText_hora = (EditText) findViewById(R.id.editTexthora);



        enviar_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String fullName = editText_nom.getText().toString();
                String nomConvidat = editText_any.getText().toString();
                String month = editText_mes.getText().toString();
                int day = Integer.parseInt(editText_dia.getText().toString());
                String lloc = editText_lloc.getText().toString();
                String hora = editText_hora.getText().toString();



                String bio = "Hola " + nomConvidat + "! Em complau convidar-te a la meva festa " +
                        "d'aniversari el dia " + day + " de " + month + ". L'event será a " + lloc +
                        " a les " + hora + ". Moltes gràcies, " + fullName;

                editText_bio.setText(bio);
            }
        });




        buidar_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                editText_nom.setText("");
                editText_bio.setText("");
                editText_any.setText("");
                editText_mes.setText("");
                editText_dia.setText("");
                editText_lloc.setText("");
                editText_hora.setText("");
            }
        });

    }

}
