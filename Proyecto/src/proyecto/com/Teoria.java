package proyecto.com;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Teoria extends ListActivity{
	
	ArrayAdapter <String> adaptador;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.teoria);
        
        String [] items = {"UNIT 1: PRONOUNS", "UNIT 2: THE ARTICLE", "UNIT 3: PREPOSITIONS", "UNIT 4: NOUNS", "UNIT 5: ADJECTIVES", "UNIT 6: VERBS", "UNIT 7: SENTENCE STRUCTURE", "UNIT 8: VERB TENSES - PRESENT", "UNIT 9: NUMBER, DATES AND TIME"};
        
        adaptador = new ArrayAdapter <String> (this, R.layout.teoria, items);
        
        setListAdapter(adaptador);

	}
	
	@Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
      super.onListItemClick(l, v, position, id);
      
      Intent i = null;
      
      switch (position) {
      	case 0:
            i = new Intent(this, Unit1.class);
      		break;
      	case 1:
            i = new Intent(this, Unit2.class);
      		break;
      	case 2:
            i = new Intent(this, Unit3.class);
      		break;
      	case 3:
            i = new Intent(this, Unit4.class);
      		break;
      	case 4:
            i = new Intent(this, Unit5.class);
      		break;
      	case 5:
            i = new Intent(this, Unit6.class);
      		break;
      	case 6:
            i = new Intent(this, Unit7.class);
      		break;
      	case 7:
            i = new Intent(this, Unit8.class);
      		break;
      	case 8:
            i = new Intent(this, Unit9.class);
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
