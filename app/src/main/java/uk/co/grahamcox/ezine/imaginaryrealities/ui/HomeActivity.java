package uk.co.grahamcox.ezine.imaginaryrealities.ui;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;
import uk.co.grahamcox.ezine.imaginaryrealities.R;

/**
 * The home activity that is loaded when the app first starts up
 */
public class HomeActivity extends BaseActivity {
    /** The log tag to use */
    private static final String LOG_TAG = HomeActivity.class.getCanonicalName();
    /**
     * Handle when the activity is created for the first time
     * @param savedInstanceState The saved state of the activity
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.i(LOG_TAG, "Created activity");
    }
}
