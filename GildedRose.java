package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public getName(item){
        return items[item].name;
    }

    public getSellIn(item) {
        return items[item].sellIn;
    }
    private DecrementSellIn(item){
        items[item].sellIn--;
    }
    
    public getQuality(item){
        return items[item].quality;
    }
    private IncrementQuality(item){
        items[item].quality++;
    }
    private DecrementQuality(item){
        int decrementXtimes=1;
        if (getSellIn(item) < 0){
            decrementXtimes*=2;
        }
        if(getName(item).contains("Conjured") {
            decrementXtimes*=2;
        }
        for(int i=0;i<decrementXtimes;i++)
            if (getQuality(item) > 0) {
                  items[item].quality--;
            }
    }
    private setQualityToZero(item){
        items[item].quality=0;+
    }
        

    //if item is conjured, degrades in quality twice as fast
    public void updateQuality() {
        for (int item = 0; item < items.length; item++) {
            if (!getName("Sulfuras, Hand of Ragnaros")) {
                DecrementSellIn(item);
                if (!getName(item).equals("Aged Brie") && !getName(item).equals("Backstage passes to a TAFKAL80ETC concert")) {
                    DecrementQuality(item);
                else
                    {}
                
               
                
                    
                               
                    } else {
                        if (getQuality(item) < 50) {
                            IncrementQuality(item);
        
                            if (getName(item).equals("Backstage passes to a TAFKAL80ETC concert")) {
                                if (getSellIn(item) < 11) {
                                    if (getQuality(item) < 50) {
                                        IncrementQuality(item);
                                    }
                                }
        
                                if (getSellIn(item) < 6) {
                                    if (getQuality(item) < 50) {
                                        IncrementQuality(item);
                                    }
                                }
                            }
                        }
                    }
                    if (getSellIn(item) < 0) {
                        if (!getName(item).equals("Aged Brie")) {
                            if (!getName(item).equals("Backstage passes to a TAFKAL80ETC concert")) {
                  
                            } else {
                                setQualityToZero(item);
                            }
                        } else {
                            if (getQuality(item) < 50) {
                                IncrementQuality(item);
                            }
                        }
                    }
                }

        }
    }
}
