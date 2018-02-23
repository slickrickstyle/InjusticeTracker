package android.com.injusticetracker.utils;

import android.com.injusticetracker.*;
import android.content.*;
import android.view.*;
import android.widget.*;
import java.util.*;
import android.view.View.*;

public class ImageAdapter extends BaseAdapter {
 private Context mContext;


    // Keep all Images in array
    public Integer[] mThumbIds = {
		R.drawable.aquaman,
	//	R.drawable.atom,
		R.drawable.atrocitus,
		R.drawable.bane,
		R.drawable.batman,
		R.drawable.blackadam,
		R.drawable.blackcanary,
		R.drawable.blackmanta,
		R.drawable.bluebeetle,
		R.drawable.brainiac,
		R.drawable.captaincold,
		R.drawable.catwoman,
		R.drawable.cheetah,
		R.drawable.cyborg,
		R.drawable.darkseid,
		R.drawable.deadshot,
		R.drawable.drfate,
	//	R.drawable.enchantress,
		R.drawable.firestorm,
		R.drawable.gorillagrodd,
		R.drawable.greenarrow,
		R.drawable.greenlantern,
		R.drawable.harleyquinn,
		// R.drawable.hellboy,
		R.drawable.joker,
		R.drawable.poisonivy,
		R.drawable.raiden,
		R.drawable.redhood,
		R.drawable.robin,
		R.drawable.scarecrow,
		R.drawable.starfire,
		R.drawable.subzero,
		R.drawable.supergirl,
		R.drawable.superman,
		R.drawable.swampthing,
		R.drawable.theflash,
		R.drawable.wonderwoman
    };

    // Constructor
    public ImageAdapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return imageView;
    }

}
