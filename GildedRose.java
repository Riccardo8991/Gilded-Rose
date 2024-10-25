package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }
    
    public ItemNameIs(name){
        return items[i].name.equals(name);
    }
    
    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!ItemNameIs("Aged Brie")
                    && !ItemNameIs("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].quality > 0) {
                    if (!ItemNameIs("Sulfuras, Hand of Ragnaros")) {
                        items[i].quality--;
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = ++;

                    if (ItemNameIs("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality++;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality++;
                            }
                        }
                    }
                }
            }

            if (!ItemNameIs("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn--;
            }

            if (items[i].sellIn < 0) {
                if (!ItemNameIs("Aged Brie")) {
                    if (!ItemNameIs("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality > 0) {
                            if (!ItemNameIs("Sulfuras, Hand of Ragnaros")) {
                                items[i].quality--;
                            }
                        }
                    } else {
                        items[i].quality=0;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality++;
                    }
                }
            }
        }
    }
}
