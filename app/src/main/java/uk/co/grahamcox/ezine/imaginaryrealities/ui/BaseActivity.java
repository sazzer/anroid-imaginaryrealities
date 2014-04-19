package uk.co.grahamcox.ezine.imaginaryrealities.ui;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;
import uk.co.grahamcox.ezine.imaginaryrealities.R;

/**
 * Base class for activities that give the common behaviour
 */
public class BaseActivity extends Activity {
    /** The log tag to use */
    private static final String LOG_TAG = BaseActivity.class.getCanonicalName();

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

        // Get the SearchView and set the searchable configuration
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        if (searchManager == null) {
            throw new NullPointerException("No SearchManager found");
        }

        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView)(searchItem.getActionView());
        Log.d(LOG_TAG, "Component Name: " + getComponentName());
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setIconifiedByDefault(false);
        searchView.setSubmitButtonEnabled(true);
        searchView.setQueryRefinementEnabled(true);

        return super.onCreateOptionsMenu(menu);
    }
}
