package proyecto.com;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Lesson14 extends Activity{
	
	MediaPlayer mp;
    Button boton;
    int posicion = 0;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson14);
        

	}
	
	
	
	public void destruir() {
        if (mp != null)
            mp.release();
    }

    public void iniciar14(View v) {
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
        	mp = MediaPlayer.create(this, R.raw.sonido138);
		}
        if (boton2.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido139);
		}
        if (boton3.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido140);
		}
        if (boton4.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido141);
		}
        if (boton5.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido142);
		}
        if (boton6.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido143);
		}
        if (boton7.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido144);
		}
        if (boton8.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido145);
		}
        if (boton9.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido146);
		}
        if (boton10.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido147);
		}
        if (boton11.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido148);
		}
        if (boton12.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido149);
		}
        if (boton13.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido150);
		}
        if (boton14.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido151);
		}
        if (boton15.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido152);
		}
        if (boton16.isPressed()) {
        	mp = MediaPlayer.create(this, R.raw.sonido153);
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
	    Intent i = new Intent(this, Unit4.class);
	    
	    startActivity(i);
	    	
	    this.finish();
	}
	

}
