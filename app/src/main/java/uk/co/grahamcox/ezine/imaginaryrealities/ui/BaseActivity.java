package uk.co.grahamcox.ezine.imaginaryrealities.ui;

import android.app.ActionBar;
import android.app.Activity;
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
 * Base class for activities that give the common behaviour
 */
public class BaseActivity extends Activity implements ActionBar.OnNavigationListener {
    /** The log tag to use */
    private static final String LOG_TAG = BaseActivity.class.getCanonicalName();

    /** The adapter to use for the action bar navigation */
    private ActionBarListAdapter actionBarListAdapter;
    /**
     * Handle when the activity is created for the first time
     * @param savedInstanceState The saved state of the activity
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionBar = getActionBar();
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
        actionBarListAdapter = new ActionBarListAdapter(this);
        actionBar.setListNavigationCallbacks(actionBarListAdapter, this);
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

    /**
     * Handler for when a navigation item is selected
     * @param itemPosition the position of the item that was selected
     * @param itemId the ID of the item that was selected
     * @return false
     */
    @Override
    public boolean onNavigationItemSelected(int itemPosition, long itemId) {
        Log.d(LOG_TAG, "Select item with ID " + itemId + " at position " + itemPosition);
        ActionBarListAdapter.Entries item = actionBarListAdapter.getEntry(itemPosition);
        Log.d(LOG_TAG, "Selected item: " + item);

        return false;
    }
}
