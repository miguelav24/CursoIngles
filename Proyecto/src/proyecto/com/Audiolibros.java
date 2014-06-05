package proyecto.com;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class Audiolibros extends ListActivity {

	
	
	ArrayAdapter <String> adaptador;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.teoria);
        
        String [] items = {"AUDIO 1: HISTORIA AMERICANA", "AUDIO 2: THE ARTICLE", "AUDIO 3: PREPOSITIONS", "AUDIO 4: NOUNS", "AUDIO 5: ADJECTIVES", "AUDIO 6: VERBS", "AUDIO 7: SENTENCE STRUCTURE", "AUDIO 8: VERB TENSES - PRESENT", "AUDIO 9: NUMBER, DATES AND TIME"};
        
        adaptador = new ArrayAdapter <String> (this, R.layout.audiolibros, items);
        
        setListAdapter(adaptador);

	}
	
	@Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
      super.onListItemClick(l, v, position, id);
      
      Intent i = new Intent(this, Reproductor.class);
      
      String au1 = null;
      
      switch (position) {
      	case 0:
            i.putExtra(au1, "audiolibro1");
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
