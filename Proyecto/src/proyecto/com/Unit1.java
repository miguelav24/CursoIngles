package proyecto.com;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Unit1 extends ListActivity{
	
	ArrayAdapter <String> adaptador;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        String [] items = {"LESSON 1: PERSONAL PRONOUNS", "LESSON 2: POSESSIVE PRONOUNS", "LESSON 3: DEMONSTRATIVE PRONOUNS", "LESSON 4: REFLEXIVE PRONOUNS"};
        
        adaptador = new ArrayAdapter <String> (this, R.layout.unit1, items);
        
        setListAdapter(adaptador);
	}
	
	@Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
      super.onListItemClick(l, v, position, id);
      
      Intent i = null;
      
      switch (position) {
      	case 0:
            i = new Intent(this, Lesson1.class);
      		break;
      	case 1:
            i = new Intent(this, Lesson2.class);
      		break;
      	case 2:
            i = new Intent(this, Lesson3.class);
      		break;
      	case 3:
            i = new Intent(this, Lesson4.class);
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
