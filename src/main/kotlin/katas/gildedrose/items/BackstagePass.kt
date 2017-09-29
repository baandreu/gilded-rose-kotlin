package katas.gildedrose.items

import katas.gildedrose.Item
import katas.gildedrose.PerishableItem

class BackstagePass(item: Item) : PerishableItem(item) {

    override fun update() {
        if (item.quality < 50) {
            item.quality = item.quality + 1

            if (item.sellIn < 11) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1
                }
            }

            if (item.sellIn < 6) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1
                }
            }
        }

        item.sellIn = item.sellIn - 1

        if (item.sellIn < 0) {
            item.quality = item.quality - item.quality
        }
    }
}