package by.mkstudio.game2d;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

/*
 * MainActivity is the entry point of application
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set window size to fullscreen (hide status bar)
        Window window = getWindow(); //get window of MainActivity
        window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // Set Game object as a rendered view instead "R.layout.activity_main"
        setContentView(new Game(this));
    }
}