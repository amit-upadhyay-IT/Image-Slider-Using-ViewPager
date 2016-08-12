package com.amitupadhyay.imageslider;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by aupadhyay on 8/12/16.
 */

public class CustomAdapter extends PagerAdapter {


    private int []imgs = {R.drawable.educational, R.drawable.hospitality, R.drawable.media, R.drawable.medicine, R.drawable.real_estate, R.drawable.serviceapps};

    private LayoutInflater inflater;

    private Context ctx;

    public CustomAdapter(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return imgs.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.swipe, container, false);
        ImageView img = (ImageView) v.findViewById(R.id.imageView);

        img.setImageResource(imgs[position]);

        container.addView(v);

        return v;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.invalidate();

    }
}
