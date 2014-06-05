package proyecto.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProyectoActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }
    
    
    public void mAudiolibros(View v){
    	Intent i = new Intent(this, Audiolibros.class);
    	
    	startActivity(i);
    	
    	this.finish();
    }
    
    public void mLibros(View v){
    	Intent i= new Intent(this, Libros.class);
    	
    	startActivity(i);
    	
    	this.finish();
    }
    
    public void mTeoria(View v){
    	Intent i = new Intent(this, Teoria.class);
    	
    	startActivity(i);
    	
    	this.finish();
    }
    
    public void salir(View v){
    	this.finish();
    }
}