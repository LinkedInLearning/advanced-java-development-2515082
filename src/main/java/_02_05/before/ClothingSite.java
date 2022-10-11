package _02_05.before;

import java.util.ArrayList;
import java.util.List;

public class ClothingSite {

    public static void main(String[] args) {

        ShirtItem shirtItem = new ShirtItem();
        JacketItem jacketItem = new JacketItem();

        List<ClothingItem> clothingItems = new ArrayList<>();
        clothingItems.add(shirtItem);
        clothingItems.add(jacketItem);

        checkoutAllItems(clothingItems);

    }

    static void checkoutItem(ClothingItem item) {
        System.out.println("Item purchased: " + item.getName() + ", price: " + item.getPrice());
    }

    static void checkoutAllItems(List<ClothingItem> clothingItems) {

        for (ClothingItem clothingItem : clothingItems) {
            checkoutItem(clothingItem);
        }

    }

}
