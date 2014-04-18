package uk.co.grahamcox.ezine.imaginaryrealities.ui;

import android.app.Activity;
import android.os.Bundle;
import uk.co.grahamcox.ezine.imaginaryrealities.R;

/**
 * The home activity that is loaded when the app first starts up
 */
public class HomeActivity extends Activity {
    /**
     * Handle when the activity is created for the first time
     * @param savedInstanceState The saved state of the activity
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
