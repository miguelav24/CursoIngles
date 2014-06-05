package proyecto.com;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Unit2 extends ListActivity{
	
	ArrayAdapter <String> adaptador;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        String [] items = {"LESSON 1: THE DEFINITE ARTICLE", "LESSON 2: THE INDEFINITE ARTICLE"};
        
        adaptador = new ArrayAdapter <String> (this, R.layout.unit2, items);
        
        setListAdapter(adaptador);
	}
	
	@Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
      super.onListItemClick(l, v, position, id);
      
      Intent i = null;
      
      switch (position) {
      	case 0:
            i = new Intent(this, Lesson5.class);
      		break;
      	case 1:
            i = new Intent(this, Lesson6.class);
      		break;
      	
      		
      	default:
      		
      		break;
      }
      
      startActivity(i);
      this.finish();
 
 
      
    }

	
	public void atras(View v){
	    Intent i = new Intent(this, ProyectoActivity.class);
	    
	    startActivity(i);
	    	
	    this.finish();
	}
}