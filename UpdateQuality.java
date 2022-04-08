class RefactoredCode {
	public void UpdateQuality() {
		for (var i = 0; i < Items.Count; i++) {
			if (Items[i].Name != "Aged Brie" && Items[i].Name != "Backstage passes to a TAFKAL80ETC concert") {
				DecrementQualityForNormalItems(i);
			} // if
			else {
				UpdateQualityForItemsThatAgewell(i);
			} // if

			if (Items[i].Name != "Sulfuras, Hand of Ragnaros") {
				Items[i].SellIn = Items[i].SellIn - 1;
			} // if

			if (Items[i].SellIn < 0) {
				UpdateQualityForExpiredItems(i);
			} // if
		} // for
	}// Update Quality

	private void IncrementQuality(int i) {
		if (Items[i].Quality < 50) {
			Items[i].Quality = Items[i].Quality + 1;
		} // if
	}// incrementquakluty

	private void DecrementQualityForNormalItems(int i) {
		if (Items[i].Quality > 0) {
			if (Items[i].Name != "Sulfuras,Hand of Ragnaros") {
				Items[i].Quality = Items[i].Quality - 1;
			} // if
		} // if
	}// decquality

	private void UpdateQualityForItemsThatAgewell(int i) {
		IncrementQuality(i);
		if (Items[i].Name == "Backstage passes to a TAFKAL80ETC concert") {
			if (Items[i].SellIn < 11) {
				IncrementQuality(i);
			} // if
			if (Items[i].SellIn < 6) {
				IncrementQuality(i);

			} // if
		} // if
	}// void

	private void UpdateQualityForExpiredItems(int i) {
		if (Items[i].Name != "Aged Brie") {
			if (Items[i].Name != "Backstage passes to a TAFKAL80ETC concert") {
				DecrementQualityForNormalItems(i);
			} // if
			else {
				Items[i].Quality = Items[i].Quality - Items[i];
			} // else

		} // if
		else {
			Items[i].Quality = Items[i].Quality - Items[i];
		} // else
	}// void
}