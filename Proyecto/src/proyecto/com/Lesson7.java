package proyecto.com;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Lesson7 extends Activity{
	
	MediaPlayer mp;
    Button boton;
    int posicion = 0;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson7);
        

	}
	
	
	
	public void destruir() {
        if (mp != null)
            mp.release();
    }

    public void iniciar(View v) {
    	Button boton1 = (Button) findViewById(R.id.imagenBoton);
    	Button boton2 = (Button) findViewById(R.id.imagenBoton2);
    	Button boton3 = (Button) findViewById(R.id.imagenBoton3);
    	Button boton4 = (Button) findViewById(R.id.imagenBoton4);
    	Button boton5 = (Button) findViewById(R.id.imagenBoton5);
    	Button boton6 = (Button) findViewById(R.id.imagenBoton6);
    	Button boton7 = (Button) findViewById(R.id.imagenBoton7);
    	Button boton8 = (Button) findViewById(R.id.imagenBoton8);
    	Button boton9 = (Button) findViewById(R.id.imagenBoton9);
    	
        destruir();
        
        if (boton1.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido32);
		}
        if (boton2.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido33);
		}
        if (boton3.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido34);
		}
        if (boton4.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido35);
		}
        if (boton5.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido36);
		}
        if (boton6.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido37);
		}
        if (boton7.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido38);
		}
        if (boton8.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido39);
		}
        if (boton9.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido40);
		}
        mp.start();

    }

    public void pausar(View v) {
        if (mp != null && mp.isPlaying()) {
            posicion = mp.getCurrentPosition();
            mp.pause();
        }
    }

    public void continuar(View v) {
        if (mp != null && mp.isPlaying() == false) {
            mp.seekTo(posicion);
            mp.start();
        }
    }

    public void detener(View v) {
        if (mp != null) {
            mp.stop();
            posicion = 0;
        }
    }
	
    public void irTest(View v){
	    Intent i = new Intent(this, Test1.class);
	    
	    startActivity(i);
	    	
	    this.finish();
	}
    
	
    public void irMenu(View v){
	    Intent i = new Intent(this, ProyectoActivity.class);
	    
	    startActivity(i);
	    	
	    this.finish();
	}
    
    public void irLecciones(View v){
	    Intent i = new Intent(this, Unit2.class);
	    
	    startActivity(i);
	    	
	    this.finish();
	}
	
    public void irSiguiente(View v){
	    Intent i = new Intent(this, Lesson8.class);
	    
	    startActivity(i);
	    	
	    this.finish();
	}
	

}
