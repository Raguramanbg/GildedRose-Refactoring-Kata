package com.gildedrose;

public enum InventoryRoses {
     GENERALQUALITYCHECKER(new GeneralQualityChecker()),
     AGED_BRIECHECKER(new AgedBrieChecker()),
     SULFURASCHECKER(new SulfurasChecker()),
     BACKSTAGE_PASSES_CHECKER(new BackStagePassers());

    private SellInAndQualityChecker checker;

    InventoryRoses(SellInAndQualityChecker checker){
        this.checker = checker;
    }

    public SellInAndQualityChecker getRule() {
        return checker;
    }
}
