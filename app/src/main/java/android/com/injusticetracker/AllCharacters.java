package android.com.injusticetracker;

import android.*;
import android.app.*;
import android.os.*;
import android.widget.*;

public class AllCharacters extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character_grid_layout);

        GridView gridView = (GridView) findViewById(R.id.grid_view);

        // Instance of ImageAdapter Class
        gridView.setAdapter(new android.com.injusticetracker.utils.ImageAdapter(this));
    }
}
