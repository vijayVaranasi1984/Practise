package BoxItemTest;

import java.util.ArrayList;
import java.util.List;

public class BoxTest {
    public static void main (String[] args){

        List<Item> items = new ArrayList<>();

        items.add(new Item("silver", 500, 800));
        items.add(new Item("bronze", 800, 500));
        items.add(new Item("gold", 200, 1000));

        List<Box> box = new ArrayList<>();

        items.sort((Item s1,Item s2) -> s2.getItemPrice() - s1.getItemPrice());
        //items.forEach((item) -> System.out.println(item.getItemName()));

        int maxWeight = 1000;

        System.out.println("Before adding in box \n");
        for(Item eachItem : items){
            System.out.println(eachItem.getItemName());

             if(eachItem.getItemWeight() <= maxWeight) {

                 box.add(new Box(eachItem.getItemName(), eachItem.getItemWeight()));
                 maxWeight = maxWeight - eachItem.getItemWeight();
                 System.out.println("remainingWeight " + maxWeight);
             } else {
                 System.out.println("remainingWeight " + maxWeight);
                 box.add(new Box(eachItem.getItemName(), (maxWeight)));
             }
       }

        box.forEach((b) -> System.out.println(b.getItemName() + "\n" + b.getItemWeight()));
    }
}


