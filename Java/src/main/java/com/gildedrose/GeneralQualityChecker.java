package com.gildedrose;

public class GeneralQualityChecker implements SellInAndQualityChecker {

    @Override
    public Item[] calculateQuality(Item[] roseStock) {

        for (Item item : roseStock) {
            if (item.name.equalsIgnoreCase("Aged Brie") || item.name.equalsIgnoreCase("Sulfuras, Hand of Ragnaros") || item.name.equalsIgnoreCase("Backstage passes to a TAFKAL80ETC concert")) {
                continue;
            }
            if (item.name.equalsIgnoreCase("Conjured Mana Cake")) {
                    if(item.quality !=0){
                        item.quality = item.quality - 2;
                    }
                item.sellIn = item.sellIn - 1;
            }
            else {
                if(item.quality !=0){
                    item.quality = item.quality - 1;
                }
                item.sellIn = item.sellIn - 1;
            }
        }
        return roseStock;
    }
}
