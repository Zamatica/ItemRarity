package com.ItemRarity;

import net.runelite.client.config.*;

import java.awt.*;

@ConfigGroup("itemRarity")
public interface ItemRarityConfig extends Config
{
	@ConfigItem(
			keyName = "useStorePrice",
			name = "Use Store Price",
			description = "Whether to use the Store price",
			position = 1
	)
	default boolean getUseStoreValue()
	{
		return false;
	}

	@ConfigItem(
			keyName = "useGEPrice",
			name = "Use GE Price",
			description = "Whether to use the GE price",
			position = 2
	)
	default boolean getUseGEValue()
	{
		return true;
	}

	@ConfigItem(
			keyName = "useHAPrice",
			name = "Use HA Price",
			description = "Whether to use the HA price",
			position = 3
	)
	default boolean getUseHAValue()
	{
		return true;
	}

	@ConfigItem(
			keyName = "useStackCount",
			name = "Use Stack Count",
			description = "Whether to Calculate the rarity based on the number of items in the stack",
			position = 4
	)
	default boolean getUseStackCount()
	{
		return false;
	}

	// Color Section
	@ConfigSection(
			position = 5,
			name = "Common",
			description = "The color and price of Common Rarity"
	)
	String commonSection = "commonSection";

	@ConfigItem(
			keyName = "commonItemValue",
			name = "Price",
			description = "Max Price of a Common Item",
			section = commonSection,
			position = 1
	)
	default int getCommonItemValue()
	{
		return 1000;
	}

	@Alpha
	@ConfigItem(
			keyName = "commonItemColor",
			name = "Highlight Color",
			description = "Color of a Common Item",
			section = commonSection,
			position = 2
	)
	default Color getCommonItemColor()
	{
		return new Color(0,0,0,0.0f);
	}



	// Color Section
	@ConfigSection(
			position = 6,
			name = "Uncommon",
			description = "The color and price of Uncommon Rarity"
	)
	String uncommonSection = "uncommonSection";

	@ConfigItem(
			keyName = "uncommonItemValue",
			name = "Price",
			description = "Max Price of a Uncommon Item",
			section = uncommonSection,
			position = 1
	)
	default int getUncommonItemValue()
	{
		return 12500;
	}

	@Alpha
	@ConfigItem(
			keyName = "uncommonItemColor",
			name = "Highlight Color",
			description = "Color of a Uncommon Item",
			section = uncommonSection,
			position = 2
	)
	default Color getUncommonItemColor()
	{
		return new Color(0, 240 / 255f, 0, 110 / 255f);
	}


	// Color Section
	@ConfigSection(
			position = 7,
			name = "Rare",
			description = "The color and price of Rare Rarity"
	)
	String rareSection = "rareSection";

	@ConfigItem(
			keyName = "rareItemValue",
			name = "Price",
			description = "Max Price of a Rare Item",
			section = rareSection,
			position = 1
	)
	default int getRareItemValue()
	{
		return 125000;
	}

	@Alpha
	@ConfigItem(
			keyName = "rareItemColor",
			name = "Highlight Color",
			description = "Color of a Rare Item",
			section = rareSection,
			position = 2
	)
	default Color getRareItemColor()
	{
		return new Color(0, 100 / 255f, 240 / 255f, 195 / 255f);
	}



	// Color Section
	@ConfigSection(
			position = 8,
			name = "Epic",
			description = "The color and price of Epic Rarity"
	)
	String epicSection = "epicSection";

	@ConfigItem(
			keyName = "epicItemValue",
			name = "Price",
			description = "Max Price of a Epic Item",
			section = epicSection,
			position = 1
	)
	default int getEpicItemValue()
	{
		return 1800000;
	}

	@Alpha
	@ConfigItem(
			keyName = "epicItemColor",
			name = "Highlight Color",
			description = "Color of a Epic Item",
			section = epicSection,
			position = 2
	)
	default Color getEpicItemColor()
	{
		return new Color(160 / 255f, 50 / 255f, 240 / 255f, 195 / 255f);
	}



	// Color Section
	@ConfigSection(
			position = 9,
			name = "Legendary",
			description = "The color and price of Legendary Rarity"
	)
	String legendarySection = "legendarySection";

	@ConfigItem(
			keyName = "legendaryItemValue",
			name = "Price",
			description = "Max Price of a Legendary Item",
			section = legendarySection,
			position = 1
	)
	default int getLegendaryItemValue()
	{
		return Integer.MAX_VALUE;
	}

	@Alpha
	@ConfigItem(
			keyName = "legendaryItemColor",
			name = "Highlight Color",
			description = "Color of a Legendary Item",
			section = legendarySection,
			position = 2
	)
	default Color getLegendaryItemColor()
	{
		return new Color(255 / 255f, 120 / 255f, 0 / 255f, 195 / 255f);
	}
}
