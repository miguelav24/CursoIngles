package proyecto.com;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Lesson8 extends Activity{
	
	MediaPlayer mp;
    Button boton;
    int posicion = 0;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson8);
        

	}
	
	
	
	public void destruir() {
        if (mp != null)
            mp.release();
    }

    public void iniciar8(View v) {
    	Button boton1 = (Button) findViewById(R.id.imagenBoton);
    	Button boton2 = (Button) findViewById(R.id.imagenBoton2);
    	Button boton3 = (Button) findViewById(R.id.imagenBoton3);
    	Button boton4 = (Button) findViewById(R.id.imagenBoton4);
    	Button boton5 = (Button) findViewById(R.id.imagenBoton5);
    	Button boton6 = (Button) findViewById(R.id.imagenBoton6);
    	Button boton7 = (Button) findViewById(R.id.imagenBoton7);
    	Button boton8 = (Button) findViewById(R.id.imagenBoton8);
    	Button boton9 = (Button) findViewById(R.id.imagenBoton9);
    	Button boton10 = (Button) findViewById(R.id.imagenBoton10);
    	Button boton11 = (Button) findViewById(R.id.imagenBoton11);
    	Button boton12 = (Button) findViewById(R.id.imagenBoton12);
    	Button boton13 = (Button) findViewById(R.id.imagenBoton13);
    	Button boton14 = (Button) findViewById(R.id.imagenBoton14);
    	Button boton15 = (Button) findViewById(R.id.imagenBoton15);
    	Button boton16 = (Button) findViewById(R.id.imagenBoton16);

    	
        destruir();
        
        if (boton1.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido41);
		}
        if (boton2.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido42);
		}
        if (boton3.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido43);
		}
        if (boton4.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido44);
		}
        if (boton5.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido45);
		}
        if (boton6.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido46);
		}
        if (boton7.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido47);
		}
        if (boton8.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido48);
		}
        if (boton9.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido49);
		}
        if (boton10.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido50);
		}
        if (boton11.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido51);
		}
        if (boton12.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido52);
		}
        if (boton13.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido53);
		}
        if (boton14.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido54);
		}
        if (boton15.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido55);
		}
        if (boton16.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido56);
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
	    Intent i = new Intent(this, Unit3.class);
	    
	    startActivity(i);
	    	
	    this.finish();
	}
	
    public void irSiguiente(View v){
	    Intent i = new Intent(this, Lesson9.class);
	    
	    startActivity(i);
	    	
	    this.finish();
	}
	

}
