package me.ziad_khaled.egypttour;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class FragmentAdapter extends FragmentPagerAdapter {

    private Context context;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new AboutFragment();
            case 1:
                return new PlacesFragment();
            case 2:
                return new DishesFragment();
            case 3:
                return new HelpFragment();
            default:
                return new AboutFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:
                return context.getString(R.string.about_egypt);
            case 1:
                return context.getString(R.string.touristic_places);
            case 2:
                return context.getString(R.string.dishes);
            case 3:
                return context.getString(R.string.help);
            default:
                return context.getString(R.string.about_egypt);
        }
    }
}
