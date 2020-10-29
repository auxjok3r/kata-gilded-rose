package edu.alenasoft.gildedrose;

public class ConjuredItemBehavior implements ItemBehavior {

    static final int ITEM_DEGRADE_QUALITY = 2;
    static final int SELL_IN_ENDED = 0;
    static final int VOIDED_QUALITY = 0;

    @Override
    public void updateQuality(Item item) {
        if (item.getSellIn() > SELL_IN_ENDED){
            item.setQuality(item.getQuality() - ITEM_DEGRADE_QUALITY);
        }
        else{
            item.setQuality(item.getQuality() - ITEM_DEGRADE_QUALITY * 2);
        }
        if (item.getQuality() < VOIDED_QUALITY) {
            item.setQuality(VOIDED_QUALITY);
        }
        item.decreaseSellIn();
    }
}
