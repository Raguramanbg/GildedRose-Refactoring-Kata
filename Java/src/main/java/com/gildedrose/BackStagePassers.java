package com.gildedrose;

public class BackStagePassers implements SellInAndQualityChecker {

   //Quality increases by 2 when there are 10 days or less and by 3 when there are 5 days or less but
   //	Quality drops to 0 after the concert
    @Override
    public Item[] calculateQuality(Item[] roseStock) {
        for (Item item : roseStock) {
            if(item.name.equalsIgnoreCase("Backstage passes to a TAFKAL80ETC concert")){
                if(item.sellIn <= 5){
                    item.quality=item.quality+3;
                    item.sellIn = item.sellIn - 1;
                    continue;
                }
                if(item.sellIn <= 10){
                    item.quality=item.quality+2;
                    item.sellIn = item.sellIn - 1;
                    continue;
                }
                item.sellIn = item.sellIn - 1;
            }
        }
        return roseStock;
    }
}
