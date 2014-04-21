package uk.co.grahamcox.ezine.imaginaryrealities.ui;

import android.content.Context;
import android.widget.ArrayAdapter;
import uk.co.grahamcox.ezine.imaginaryrealities.R;

/**
 * Adapter that will provide the options in the Action Bar dropdown
 */
public class ActionBarListAdapter extends ArrayAdapter<String> {
    /**
     * The enumeration of the entries that we want to list
     */
    public static enum Entries {
        ISSUE(R.string.actionbar_navigation_ISSUE),
        AUTHOR(R.string.actionbar_navigation_AUTHOR),
        ALL(R.string.actionbar_navigation_ALL);

        /** The label of the entry */
        private int label;

        /**
         * Set the label to use
         * @param label the label to use
         */
        Entries(int label) {
            this.label = label;
        }

        /**
         * Get the String ID of the label
         * @return the String ID of the label
         */
        public int getLabel() {
            return label;
        }
    }

    /**
     * Construct the adapter with the hard-coded list of entries
     * @param context the context we are working in
     */
    public ActionBarListAdapter(Context context) {
        super(context, android.R.layout.simple_list_item_1);
        for (Entries entry : Entries.values()) {
            add(context.getResources().getString(entry.getLabel()));
        }
    }

    /**
     * Get the entry at the given position
     * @param itemPosition the position of the entry
     * @return the entry
     */
    public Entries getEntry(int itemPosition) {
        return Entries.values()[itemPosition];
    }
}
