package jackie.game.pop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class splash extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		
		Thread timer = new Thread(){
				public void run(){
					try{
						sleep(3000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}finally{						
						Intent startGame = new Intent("jackie.game.pop.GAMEACTIVITY");						
						startActivity(startGame);
						finish();
					}
				}
		};
		timer.start();
	}
}
