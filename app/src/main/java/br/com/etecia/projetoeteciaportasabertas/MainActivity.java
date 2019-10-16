package br.com.etecia.projetoeteciaportasabertas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtPessoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtPessoa = findViewById(R.id.txtPeople);

    }

    public void clicarImagem(View view) {

        String strPessoa = "João";

        txtPessoa.setText(strPessoa);

        Toast.makeText(getApplicationContext(),"Cliquei na imagem",Toast.LENGTH_SHORT).show();
    }
}
