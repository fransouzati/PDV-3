package br.com.trainning.pdv.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import butterknife.Bind;
import trainning.com.br.pdv.R;

public class CadastroNovoActivity extends BaseActivity {

    @Bind(R.id.editTextDescricao)
    EditText editTextDescricao;
    @Bind(R.id.editTextUnidade)
    EditText editTextUnidade;
    @Bind(R.id.editTextPreco)
    EditText editTextPreco;
    @Bind(R.id.editTextCodigo)
    EditText editTextCodigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_novo3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Novo");
        setSupportActionBar(toolbar);

        /* -- Retirado para utilizar @Bind
        editTextDescricao = (EditText)findViewById(R.id.editTextDescricao);
        editTextUnidade = (EditText)findViewById(R.id.editTextUnidade);
        editTextPreco = (EditText)findViewById(R.id.editTextPreco);
        editTextCodigo = (EditText)findViewById(R.id.editTextCodigo);
        */

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Cadastro", editTextDescricao.getText().toString());
                Log.i("Cadastro", editTextUnidade.getText().toString());
                Log.i("Cadastro", editTextPreco.getText().toString());
                Log.i("Cadastro", editTextCodigo.getText().toString());
            }
        });
    }

}
