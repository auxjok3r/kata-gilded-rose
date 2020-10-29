package edu.alenasoft.gildedrose;

public class ItemBehaviorFactory {

    public ItemBehavior getItemBehavior(String itemName){
        if (itemName.contains("Sulfuras"))
        {
            return new SulfurasItemBehavior();
        }
        else if (itemName.contains("Aged Brie"))
        {
            return new AgedBrieItemBehavior();
        }
        else if (itemName.contains("Backstage pass"))
        {
            return new BackstagePassesItemBehavior();
        }
        else if (itemName.contains("Conjured"))
        {
            return new ConjuredItemBehavior();
        }
        else
        {
            return new DefaultItemBehavior();
        }
    }

}
