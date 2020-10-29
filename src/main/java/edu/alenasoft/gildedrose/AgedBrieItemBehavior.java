package edu.alenasoft.gildedrose;

public class AgedBrieItemBehavior implements ItemBehavior {

    static final int MAX_ITEM_QUALITY = 50;
    static final int ITEM_UPGRADE_QUALITY = 1;
    static final int SELL_IN_ENDED = 0;

    @Override
    public void updateQuality(Item item) {
        if(item.getSellIn() < SELL_IN_ENDED){
            item.setQuality(item.getQuality() + ITEM_UPGRADE_QUALITY * 2);
        }
        else if(item.getQuality() < MAX_ITEM_QUALITY){
            item.setQuality(item.getQuality() + ITEM_UPGRADE_QUALITY);
        }
        item.decreaseSellIn();
    }
}
