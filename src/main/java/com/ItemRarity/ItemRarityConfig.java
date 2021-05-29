package com.ItemRarity;

import net.runelite.client.config.*;

import java.awt.*;

@ConfigGroup("itemRarity")
public interface ItemRarityConfig extends Config
{
	@ConfigItem(
			keyName = "useStoreValue",
			name = "Use Store Value",
			description = "Whether to use the Store value price",
			position = 1
	)
	default boolean getUseStoreValue()
	{
		return false;
	}

	@ConfigItem(
			keyName = "useGEValue",
			name = "Use GE Value",
			description = "Whether to use the GE value price",
			position = 2
	)
	default boolean getUseGEValue()
	{
		return true;
	}

	@ConfigItem(
			keyName = "useHAValue",
			name = "Use HA Value",
			description = "Whether to use the HA value price",
			position = 3
	)
	default boolean getUseHAValue()
	{
		return true;
	}

	// Color Section
	@ConfigSection(
			position = 4,
			name = "Values and Colors",
			description = "The color and value of each Rarity"
	)
	String colorSection = "colorSection";

	@ConfigItem(
			keyName = "commonItemValue",
			name = "Common GE Value",
			description = "Max Value of a Common Item",
			section = colorSection,
			position = 1
	)
	default int getCommonItemValue()
	{
		return 1000;
	}

	@Alpha
	@ConfigItem(
			keyName = "commonItemColor",
			name = "Common Item Color",
			description = "Color of a Common Item",
			section = colorSection,
			position = 1
	)
	default Color getCommonItemColor()
	{
		return new Color(0,0,0,0.0f);
	}

	@ConfigItem(
			keyName = "uncommonItemValue",
			name = "Uncommon GE Value",
			description = "Max Value of a Uncommon Item",
			section = colorSection,
			position = 2
	)
	default int getUncommonItemValue()
	{
		return 12500;
	}

	@Alpha
	@ConfigItem(
			keyName = "uncommonItemColor",
			name = "Uncommon Item Color",
			description = "Color of a Uncommon Item",
			section = colorSection,
			position = 2
	)
	default Color getUncommonItemColor()
	{
		return new Color(0, 240 / 255f, 0, 110 / 255f);
	}

	@ConfigItem(
			keyName = "rareItemValue",
			name = "Rare GE Value",
			description = "Max Value of a Rare Item",
			section = colorSection,
			position = 3
	)
	default int getRareItemValue()
	{
		return 125000;
	}

	@Alpha
	@ConfigItem(
			keyName = "rareItemColor",
			name = "Rare Item Color",
			description = "Color of a Rare Item",
			section = colorSection,
			position = 3
	)
	default Color getRareItemColor()
	{
		return new Color(0, 100 / 255f, 240 / 255f, 195 / 255f);
	}

	@ConfigItem(
			keyName = "epicItemValue",
			name = "Epic GE Value",
			description = "Max Value of a Epic Item",
			section = colorSection,
			position = 4
	)
	default int getEpicItemValue()
	{
		return 1800000;
	}

	@Alpha
	@ConfigItem(
			keyName = "epicItemColor",
			name = "Epic Item Color",
			description = "Color of a Epic Item",
			section = colorSection,
			position = 4
	)
	default Color getEpicItemColor()
	{
		return new Color(160 / 255f, 50 / 255f, 240 / 255f, 195 / 255f);
	}

	@ConfigItem(
			keyName = "legendaryItemValue",
			name = "Legendary GE Value",
			description = "Max Value of a Legendary Item",
			section = colorSection,
			position = 5
	)
	default int getLegendaryItemValue()
	{
		return Integer.MAX_VALUE;
	}

	@Alpha
	@ConfigItem(
			keyName = "legendaryItemColor",
			name = "Legendary Item Color",
			description = "Color of a Legendary Item",
			section = colorSection,
			position = 5
	)
	default Color getLegendaryItemColor()
	{
		return new Color(255 / 255f, 120 / 255f, 0 / 255f, 195 / 255f);
	}
}
