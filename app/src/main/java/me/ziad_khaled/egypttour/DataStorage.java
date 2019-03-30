package me.ziad_khaled.egypttour;

import android.content.Context;

import java.util.ArrayList;

public class DataStorage {


    public static ArrayList<Dish> getDishesList() {
        ArrayList<Dish> dishes = new ArrayList<>();
        dishes.add(new Dish(R.drawable.falafel, "https://www.allrecipes.com/recipe/254743/taameya-egyptian-falafel/", "Falafel", "Falafel, or ta'ameya as we call it in Egypt, is an all-time favorite street food. In most parts of the Middle East, falafel is made with ground chickpeas. However, in Egypt, we make it with dried fava beans. They are best served with pita bread, tomato, onions, and tahini sauce."));
        dishes.add(new Dish(R.drawable.foul, "https://www.carolinescooking.com/ful-medames/", "Foul", "Ful medames is a classic Egyptian dish that you will also see on the tables in other countries in the region. It’s an incredibly simple dish of warm, seasoned fava beans, but also so comforting. And if you start with canned beans, it only takes a couple of minutes to make."));
        dishes.add(new Dish(R.drawable.koshari, "https://www.themediterraneandish.com/egyptian-koshari-recipe/", "Koshari", "Koshri is another one of those genius solutions to using up pantry staples. It is a cousin to the Middle Eastern Mujadara. In a nutshell, it is a comforting bowl of simple pantry staples: spiced lentils and rice, combined with chickpeas and small pasta.  All smothered in a tomato sauce that’s been spiked with vinegar (out-of-this-world tasty, by the way!) Then…wait for it…it’s topped with savory, crispy thin fried onion rings."));
        dishes.add(new Dish(R.drawable.om_aly, "https://cleobuttera.com/middle-eastern/best-ever-om-ali-egyptian-bread-pudding/", "Om Aly","An Egyptian classic as old as time, gets an upgrade with the use of delightfully delicious PALMIERS (lunettes) instead of regular ‘ol puff pastry or roaa (Egyptian flat bread).  Oodles of crushed palmiers get mixed with nuts, sweetened hot milk, topped with whipped cream and broiled to perfection.  The result…crunchy and caramelized on top, deliciously creamy and silky in the bottom."));
        dishes.add(new Dish(R.drawable.kahk, "https://cleobuttera.com/middle-eastern/fabulous-kahk-eid-cookies/", "Kahek Eleid","Kahk are lightly spiced crumbly cookies stuffed with sweet surprises and buried under copious amounts of powdered sugar."));
        dishes.add(new Dish(R.drawable.qasab, "https://egyptianstreets.com/2014/06/30/the-drink-that-unites-all-egyptians/", "Qasab Juice","Qasab juice is the liquid extracted from pressed sugarcane."));
        return dishes;
    }

    public static ArrayList<Place> getTouristicPlacesList() {
        ArrayList<Place> touristicPlaces = new ArrayList<>();
        touristicPlaces.add(new Place(R.drawable.pyramids, "The Pyramids of Giza", "The pyramids, which have historically been common as emblems of ancient Egypt in the Western imagination, were popularised in Hellenistic times, when the Great Pyramid was listed by Antipater of Sidon as one of the Seven Wonders of the World. It is by far the oldest of the ancient Wonders and the only one still in existence. ", "geo:29.977594, 31.132463"));
        touristicPlaces.add(new Place(R.drawable.bibliotheca, "Bibliotheca Alexandrina", "The Bibliotheca Alexandrina is a major library and cultural center located on the shore of the Mediterranean Sea in the Egyptian city of Alexandria. It is both a commemoration of the Library of Alexandria that was lost in antiquity, and an attempt to rekindle something of the brilliance that this earlier center of study and erudition represented. ", "geo:31.209036, 29.909362"));
        touristicPlaces.add(new Place(R.drawable.nuba, "The Nuba", "In the very south of Aswan, right along the border with Sudan, lies a land of secrets; a land that bears the charm of the past with a slight modern touch. A land whose people are a constant reminder of legend of the past, stories of our ancestors, their traditions, their modest lives and their welcoming hearts. A land that will enchant you and intrigue you at the same time. This is El Nuba (Nubia).", "geo:24.079422, 32.889165"));
        return touristicPlaces;
    }
}
