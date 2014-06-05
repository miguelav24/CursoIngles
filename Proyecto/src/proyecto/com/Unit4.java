package proyecto.com;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Unit4 extends ListActivity{
	
	ArrayAdapter <String> adaptador;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        String [] items = {"LESSON 1: NOUNS", "LESSON 2: PROPER NOUNS", "LESSON 3: COUNTABLE/UNCOUNTABLE", "LESSON 4: QUANTIFIERS"};
        
        adaptador = new ArrayAdapter <String> (this, R.layout.unit4, items);
        
        setListAdapter(adaptador);
	}
	
	@Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
      super.onListItemClick(l, v, position, id);
      
      Intent i = null;
      
      switch (position) {
      	case 0:
            i = new Intent(this, Lesson11.class);
      		break;
      	case 1:
            i = new Intent(this, Lesson12.class);
      		break;
      	case 2:
            i = new Intent(this, Lesson13.class);
      		break;
      	case 3:
            i = new Intent(this, Lesson14.class);
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