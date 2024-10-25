package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public getName(i){
        return items[i].name;
    }
    
    public void updateQuality() {
        for (int item = 0; item < items.length; item++) {
            if (!getName(item).equals("Aged Brie")
                    && !getName(item).equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].quality > 0) {
                    if (!getName(item).equals("Sulfuras, Hand of Ragnaros")) {
                        items[i].quality--;
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = ++;

                    if (getName(item).equals("Backstage passes to a TAFKAL80ETC concert")) {
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

            if (!getName(item).equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn--;
            }

            if (items[i].sellIn < 0) {
                if (!getName(item).equals("Aged Brie")) {
                    if (!getName(item).equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality > 0) {
                            if (!IgetName(item).equals("Sulfuras, Hand of Ragnaros")) {
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
