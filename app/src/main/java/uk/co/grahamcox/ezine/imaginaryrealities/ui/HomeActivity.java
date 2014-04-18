package uk.co.grahamcox.ezine.imaginaryrealities.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
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

    /**
     * Handle when the Options Menu is created
     * @param menu the menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
