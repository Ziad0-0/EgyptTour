package me.ziad_khaled.egypttour;

import android.content.Context;

import java.util.ArrayList;

public class DataStorage {
        private static ArrayList<Dish> dishesList;
        private static ArrayList<Place> touristicPlacesList;
        private static ArrayList<App> appsList;
        private static ArrayList<Contact> contactsList;

        public static void init(Context context) {
            //initialize the dishes list
            dishesList = new ArrayList<>();
            dishesList.add(new Dish(R.drawable.falafel, "https://www.allrecipes.com/recipe/254743/taameya-egyptian-falafel/", context.getString(R.string.falafel), context.getString(R.string.falafel_description)));
            dishesList.add(new Dish(R.drawable.foul, "https://www.carolinescooking.com/ful-medames/", context.getString(R.string.foul), context.getString(R.string.foul_description)));
            dishesList.add(new Dish(R.drawable.koshari, "https://www.themediterraneandish.com/egyptian-koshari-recipe/", context.getString(R.string.koshari), context.getString(R.string.koshari_description)));
            dishesList.add(new Dish(R.drawable.om_aly, "https://cleobuttera.com/middle-eastern/best-ever-om-ali-egyptian-bread-pudding/", context.getString(R.string.om_aly),context.getString(R.string.om_aly_description)));
            dishesList.add(new Dish(R.drawable.kahk, "https://cleobuttera.com/middle-eastern/fabulous-kahk-eid-cookies/", context.getString(R.string.kahk),context.getString(R.string.kahk_description)));
            dishesList.add(new Dish(R.drawable.qasab, "https://egyptianstreets.com/2014/06/30/the-drink-that-unites-all-egyptians/", context.getString(R.string.qasab),context.getString(R.string.qasab_description)));

            //initialize the touristic places list
            touristicPlacesList = new ArrayList<>();
            touristicPlacesList.add(new Place(R.drawable.pyramids,  context.getString(R.string.pyramids),  context.getString(R.string.pyramids_description), "geo:0,0?q=egypt+giza+pyramids"));
            touristicPlacesList.add(new Place(R.drawable.bibliotheca,  context.getString(R.string.bibliotheca),  context.getString(R.string.bibliotheca_description), "geo:0,0?q=egypt+alexandria+bibliotheca"));
            touristicPlacesList.add(new Place(R.drawable.nuba,  context.getString(R.string.nuba), context.getString(R.string.nuba_description), "geo:0,0?q=egypt+aswan+nubia"));

            //initialize the apps list
            appsList = new ArrayList<>();
            appsList.add(new App(R.drawable.egypt_travel_guide, context.getString(R.string.egypt_travel_guide), context.getString(R.string.egypt_travel_guide_description), "https://play.google.com/store/apps/details?id=com.triposo.droidguide.egypt"));
            appsList.add(new App(R.drawable.vezeeta, context.getString(R.string.vezeeta), context.getString(R.string.vezeeta_description), "https://play.google.com/store/apps/details?id=com.ionicframework.vezeetapatientsmobile694843"));
            appsList.add(new App(R.drawable.swvl_uber_careem, context.getString(R.string.swvl_uber_careem), context.getString(R.string.swvl_uber_careem_description), "https://play.google.com/store/search?q=swvl%20uber%20careem&c=apps&authuser"));
            appsList.add(new App(R.drawable.bey2olak, context.getString(R.string.bey2olak), context.getString(R.string.bey2olak_description), "https://play.google.com/store/apps/details?id=com.bey2ollak&hl=en"));
            appsList.add(new App(R.drawable.otlob, context.getString(R.string.otlob), context.getString(R.string.otlob_description), "https://play.google.com/store/apps/details?id=otlob.UI"));
            appsList.add(new App(R.drawable.elmenus, context.getString(R.string.elmenus), context.getString(R.string.elmenus_description), "https://play.google.com/store/apps/details?id=com.elmenus.app"));

            //initialize the contacts list
            contactsList = new ArrayList<>();
            contactsList.add(new Contact(context.getString(R.string.tourist_police),"tel: 126"));
            contactsList.add(new Contact(context.getString(R.string.emergency_police),"tel: 122"));
            contactsList.add(new Contact(context.getString(R.string.ambulance),"tel: 123"));
            contactsList.add(new Contact(context.getString(R.string.traffic_police),"tel: 128"));
            contactsList.add(new Contact(context.getString(R.string.telephone_guide),"tel: 180"));
            contactsList.add(new Contact(context.getString(R.string.embassy),"https://www.embassypages.com/egypt"));
        }

    public static ArrayList<Dish> getDishesList() {
            return dishesList;
    }

    public static ArrayList<Place> getTouristicPlacesList() {
            return touristicPlacesList;
    }

    public static ArrayList<App> getAppsList() {
            return appsList;
    }

    public static ArrayList<Contact> getContactsList() {
            return contactsList;
    }
}
