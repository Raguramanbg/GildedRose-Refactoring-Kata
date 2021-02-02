package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }
    public void updateQuality() {
    this.items = InventoryRoses.GENERALQUALITYCHECKER.getRule().calculateQuality(items);
    this.items = InventoryRoses.AGED_BRIECHECKER.getRule().calculateQuality(items);
    this.items = InventoryRoses.BACKSTAGE_PASSES_CHECKER.getRule().calculateQuality(items);
    }
}
