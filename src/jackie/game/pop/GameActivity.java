package jackie.game.pop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameActivity extends Activity implements View.OnClickListener{
    /** Called when the activity is first created. */
	
	Button start, highScore, help, quit;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        start = (Button) findViewById(R.id.btnStart);
        highScore = (Button) findViewById(R.id.btnHighScore);
        help = (Button) findViewById(R.id.btnInstruction);
        quit = (Button) findViewById(R.id.btnQuit);
        
        start.setOnClickListener(this);
        highScore.setOnClickListener(this);
        help.setOnClickListener(this);
        quit.setOnClickListener(this);
        
    }
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btnStart:
			Intent playGame = new Intent("jackie.game.pop.PLAY");
			startActivity(playGame);
			break;
		case R.id.btnHighScore:
			Intent highscore = new Intent("jackie.game.pop.HIGHSCORE");
			startActivity(highscore);
			break;
		case R.id.btnInstruction:
			Intent instruction = new Intent("jackie.game.pop.INSTRUCTION");
			startActivity(instruction);
			break;
		case R.id.btnQuit:
			finish();
			break;
		}
	}
}