package proyecto.com;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

public class SoundManager {

	private Context pContext;
	private SoundPool sPool;
	private float rate = 1.0f;
	private float leftVolume = 1.0f;
	private float rightVolume = 1.0f;
	
	public SoundManager(Context appContext){
		
		sPool = new SoundPool(16, AudioManager.STREAM_MUSIC, 100);
		pContext = appContext;
	}
	
	public int load(int idSonido){
		return sPool.load(pContext, idSonido, 1);
	}
	

}
