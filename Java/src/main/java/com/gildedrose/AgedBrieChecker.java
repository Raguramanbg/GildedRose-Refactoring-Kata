package com.gildedrose;

public class AgedBrieChecker implements SellInAndQualityChecker {
    @Override
    public Item[] calculateQuality(Item[] roseStock) {

        for (Item item : roseStock) {
            if (item.name.equalsIgnoreCase("Aged Brie")) {
                if(item.quality<50){
                    item.quality = item.quality + 1;
                }
                item.sellIn= item.sellIn -1;
            }
            continue;
        }
        return roseStock;
    }
}
