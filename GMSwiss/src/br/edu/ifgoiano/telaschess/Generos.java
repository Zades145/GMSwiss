package br.edu.ifgoiano.telaschess;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import br.edu.ifgoiano.informatica2015.gmswiss.R;

public class Generos extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_generos);
	}
	public void competidores(View view){
		Intent i = new Intent(this, Adicionar.class);
		startActivity(i);
		
	}
}
