package uk.co.grahamcox.ezine.imaginaryrealities.ui;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import uk.co.grahamcox.ezine.imaginaryrealities.R;

/**
 * The activity that is loaded to search articles
 */
public class SearchActivity extends BaseActivity {
    /** The log tag to use */
    private static final String LOG_TAG = SearchActivity.class.getCanonicalName();
    /**
     * Handle when the activity is created for the first time
     * @param savedInstanceState The saved state of the activity
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);
        Log.i(getClass().getName(), "Created activity");

        // Get the intent, verify the action and get the query
        Intent intent = getIntent();
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            Log.i(LOG_TAG, "Searching for query: " + query);
        }
    }
}
