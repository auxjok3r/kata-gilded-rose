package edu.alenasoft.gildedrose;

public class  BackstagePassesItemBehavior implements ItemBehavior {

    static final int MAX_ITEM_QUALITY = 50;
    static final int NORMAL_ITEM_UPGRADE_QUALITY = 1;
    static final int FIRST_GOAL_ITEM_UPGRADE_QUALITY = 2;
    static final int DAYS_TO_FIRST_GOAL = 10;
    static final int SECOND_GOAL_UPGRADE_QUALITY = 3;
    static final int DAYS_TO_SECOND_GOAL = 5;
    static final int VOIDED_QUALITY = 0;
    static final int SELL_IN_ENDED = 0;

    @Override
    public void updateQuality(Item item) {
        if(item.getSellIn() <= SELL_IN_ENDED){
            item.setQuality(VOIDED_QUALITY);
        }else if (item.getQuality() < MAX_ITEM_QUALITY) {
            item.setQuality(item.getQuality() + calculateItemQualityUpgrade(item.getSellIn()));
        }
        item.decreaseSellIn();
    }

    private int calculateItemQualityUpgrade(int remainingDays) {
        if(remainingDays <= DAYS_TO_SECOND_GOAL) {
            return SECOND_GOAL_UPGRADE_QUALITY;
        }
        else if (remainingDays <= DAYS_TO_FIRST_GOAL) {
            return FIRST_GOAL_ITEM_UPGRADE_QUALITY;
        }
        else {
            return NORMAL_ITEM_UPGRADE_QUALITY;
        }
    }
}
