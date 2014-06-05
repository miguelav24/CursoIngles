package proyecto.com;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class Libros extends ListActivity {

	
	
	ArrayAdapter <String> adaptador;
	String nombre;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.teoria);
        
        String [] items = {"LIBRO 1: HISTORIA AMERICANA", "LIBRO 2: THE ARTICLE", "LIBRO 3: PREPOSITIONS", "LIBRO 4: NOUNS", "LIBRO 5: ADJECTIVES", "LIBRO 6: VERBS", "LIBRO 7: SENTENCE STRUCTURE", "LIBRO 8: VERB TENSES - PRESENT", "LIBRO 9: NUMBER, DATES AND TIME"};
        
        adaptador = new ArrayAdapter <String> (this, R.layout.libros, items);
        
        setListAdapter(adaptador);
        
        InputStream flujoEntrada = getResources().openRawResource(R.raw.elreyleon);
        
        Scanner entrada = new Scanner(flujoEntrada);
        
        while (entrada.hasNextLine()) {
			nombre = entrada.nextLine();

			
		}

	}
	
	@Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
      super.onListItemClick(l, v, position, id);
      
      Intent i = new Intent(this, Lector.class);
      
      String l1 = null;
      
      switch (position) {
      	case 0:
          //  i.putExtra("nombre", nombre);
      		break;
      	/*case 1:
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
      		break;*/
      		

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