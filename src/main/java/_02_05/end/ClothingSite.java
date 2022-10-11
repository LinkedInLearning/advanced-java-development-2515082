package _02_05.end;

import java.util.ArrayList;
import java.util.List;

public class ClothingSite {

    public static void main(String[] args) {

        ShirtItem shirtItemOne = new ShirtItem();
        ShirtItem shirtItemTwo = new ShirtItem();

        List<ShirtItem> shirtItems = new ArrayList<>();
        shirtItems.add(shirtItemOne);
        shirtItems.add(shirtItemTwo);

        checkoutAllItems(shirtItems);


    }

    static void checkoutItem(ClothingItem item) {
        System.out.println("Item purchased: " + item.getName() + ", price: " + item.getPrice());
    }

    static void checkoutAllItems(List<? extends ClothingItem> clothingItems) {

        for (ClothingItem clothingItem : clothingItems) {
            checkoutItem(clothingItem);
        }

    }

}
