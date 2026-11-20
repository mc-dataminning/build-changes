package net.minecraft.client.gui.screens.inventory;

import java.util.List;
import java.util.function.Supplier;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.GuiPipeline;
import net.minecraft.client.gui.components.AbstractScrollArea;
import net.minecraft.client.gui.components.ScrollableLayout;
import net.minecraft.client.gui.components.Tooltip;
import net.minecraft.client.gui.components.WidgetSprites;
import net.minecraft.client.gui.components.inventory.IconRadioButton;
import net.minecraft.client.gui.layouts.FrameLayout;
import net.minecraft.client.gui.layouts.GridLayout;
import net.minecraft.client.gui.layouts.Layout;
import net.minecraft.client.gui.narration.GroupNarration;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.object.banner.BannerFlagModel;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.resources.model.sprite.SpriteId;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.LoomMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.BannerItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BannerPattern;
import net.minecraft.world.level.block.entity.BannerPatternLayers;
import org.jspecify.annotations.Nullable;

public class LoomScreen extends AbstractContainerScreen<LoomMenu> {
   private static final Identifier BG_LOCATION = Identifier.withDefaultNamespace("textures/gui/container/loom.png");
   private static final WidgetSprites PATTERN_BUTTON_SPRITES = new WidgetSprites(
      Identifier.withDefaultNamespace("container/loom/pattern_selected"),
      Identifier.withDefaultNamespace("container/loom/pattern"),
      Identifier.withDefaultNamespace("container/loom/pattern_selected"),
      Identifier.withDefaultNamespace("container/loom/pattern_highlighted")
   );
   private static final Identifier BANNER_SLOT_SPRITE = Identifier.withDefaultNamespace("container/slot/banner");
   private static final Identifier DYE_SLOT_SPRITE = Identifier.withDefaultNamespace("container/slot/dye");
   private static final Identifier PATTERN_SLOT_SPRITE = Identifier.withDefaultNamespace("container/slot/banner_pattern");
   private static final Identifier ERROR_SPRITE = Identifier.withDefaultNamespace("container/loom/error");
   private static final Identifier SCROLLER_SPRITE = Identifier.withDefaultNamespace("container/loom/scroller");
   private static final Identifier SCROLLER_DISABLED_SPRITE = Identifier.withDefaultNamespace("container/loom/scroller_disabled");
   private static final int PATTERN_COLUMNS = 4;
   private static final int PATTERN_ROWS = 4;
   private static final int PATTERN_IMAGE_SIZE = 14;
   private static final int SCROLLER_WIDTH = 12;
   private static final int SCROLLER_HEIGHT = 15;
   private static final int SCROLL_AREA_WIDTH = 56;
   private static final int SCROLL_AREA_HEIGHT = 56;
   private static final int PATTERNS_START_X = 60;
   private static final int PATTERNS_START_Y = 13;
   private @Nullable BannerFlagModel flag;
   private @Nullable BannerPatternLayers resultBannerPatterns;
   private ItemStack bannerStack = ItemStack.EMPTY;
   private ItemStack dyeStack = ItemStack.EMPTY;
   private ItemStack patternStack = ItemStack.EMPTY;
   private boolean hasMaxPatterns;
   private @Nullable ScrollableLayout recipeArea;
   private boolean showingPatterns;
   private double patternScrollAmount;

   public LoomScreen(final LoomMenu menu, final Inventory inventory, final Component title) {
      super(menu, inventory, title);
      menu.registerUpdateListener(this::containerChanged);
      this.titleLabelY -= 2;
   }

   @Override
   protected void init() {
      super.init();
      ModelPart modelPart = this.minecraft.getEntityModels().bakeLayer(ModelLayers.STANDING_BANNER_FLAG);
      this.flag = new BannerFlagModel(modelPart);
      this.recipeArea = this.createScrollableLayout(new FrameLayout());
   }

   @Override
   protected void repositionElements() {
      this.leftPos = (this.width - this.imageWidth) / 2;
      this.topPos = (this.height - this.imageHeight) / 2;
      this.updateSlotWidgets();
      if (this.recipeArea != null) {
         this.recipeArea.setPosition(this.leftPos + 60, this.topPos + 13);
         this.recipeArea.arrangeElements();
      }
   }

   @Override
   public void extractBackground(final GuiGraphicsExtractor graphics) {
      super.extractBackground(graphics);
      graphics.blit(GuiPipeline.TEXTURED, BG_LOCATION, this.leftPos, this.topPos, 0.0F, 0.0F, this.imageWidth, this.imageHeight, 256, 256);
      Slot bannerSlot = this.menu.getBannerSlot();
      Slot dyeSlot = this.menu.getDyeSlot();
      Slot patternSlot = this.menu.getPatternSlot();
      Slot resultSlot = this.menu.getResultSlot();
      if (!bannerSlot.hasItem()) {
         graphics.blitSprite(GuiPipeline.TEXTURED, BANNER_SLOT_SPRITE, this.leftPos + bannerSlot.x, this.topPos + bannerSlot.y, 16, 16);
      }

      if (!dyeSlot.hasItem()) {
         graphics.blitSprite(GuiPipeline.TEXTURED, DYE_SLOT_SPRITE, this.leftPos + dyeSlot.x, this.topPos + dyeSlot.y, 16, 16);
      }

      if (!patternSlot.hasItem()) {
         graphics.blitSprite(GuiPipeline.TEXTURED, PATTERN_SLOT_SPRITE, this.leftPos + patternSlot.x, this.topPos + patternSlot.y, 16, 16);
      }

      if (this.resultBannerPatterns != null && !this.hasMaxPatterns && this.flag != null) {
         DyeColor baseColor = ((BannerItem)resultSlot.getItem().getItem()).getColor();
         int x0 = this.leftPos + 141;
         int y0 = this.topPos + 8;
         graphics.bannerPattern(this.flag, baseColor, this.resultBannerPatterns, x0, y0, x0 + 20, y0 + 40);
      } else if (this.hasMaxPatterns) {
         graphics.blitSprite(GuiPipeline.TEXTURED, ERROR_SPRITE, this.leftPos + resultSlot.x - 5, this.topPos + resultSlot.y - 5, 26, 26);
      }
   }

   private void containerChanged() {
      ItemStack resultStack = this.menu.getResultSlot().getItem();
      if (resultStack.isEmpty()) {
         this.resultBannerPatterns = null;
      } else {
         this.resultBannerPatterns = resultStack.getOrDefault(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY);
      }

      ItemStack bannerStack = this.menu.getBannerSlot().getItem();
      ItemStack dyeStack = this.menu.getDyeSlot().getItem();
      ItemStack patternStack = this.menu.getPatternSlot().getItem();
      BannerPatternLayers patterns = bannerStack.getOrDefault(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY);
      this.hasMaxPatterns = patterns.layers().size() >= 6;
      if (this.hasMaxPatterns) {
         this.resultBannerPatterns = null;
      }

      if (!ItemStack.isSameItemSameComponents(bannerStack, this.bannerStack)
         || !ItemStack.isSameItemSameComponents(dyeStack, this.dyeStack)
         || !ItemStack.isSameItemSameComponents(patternStack, this.patternStack)) {
         boolean displayPatterns = !bannerStack.isEmpty() && !dyeStack.isEmpty() && !this.hasMaxPatterns && !this.menu.getSelectablePatterns().isEmpty();
         this.initPatterns(displayPatterns ? this.menu.getSelectablePatterns() : List.of(), dyeStack);
      }

      this.bannerStack = bannerStack.copy();
      this.dyeStack = dyeStack.copy();
      this.patternStack = patternStack.copy();
   }

   private void initPatterns(final List<Holder<BannerPattern>> patterns, final ItemStack dyeStack) {
      if (this.recipeArea != null) {
         if (this.showingPatterns) {
            this.patternScrollAmount = this.recipeArea.getScrollAmount();
         }

         LoomScreen layout = this;
         this.recipeArea.visitWidgets(x$0 -> layout.removeWidget(x$0));
      }

      GridLayout layout = new GridLayout();
      GridLayout.RowHelper rowHelper = layout.createRowHelper(4);

      for (int index = 0; index < patterns.size(); index++) {
         int currentIndex = index;
         Holder<BannerPattern> pattern = patterns.get(index);
         SpriteId sprite = Sheets.getBannerSprite(pattern);
         DyeColor patternColor = dyeStack.getOrDefault(DataComponents.DYE, DyeColor.WHITE);
         Component message = Component.translatable(pattern.value().translationKey() + "." + patternColor.getName());
         IconRadioButton patternButton = new IconRadioButton(
            14, 14, message, PATTERN_BUTTON_SPRITES, new IconRadioButton.BannerPatternIcon(sprite), SoundEvents.UI_LOOM_SELECT_PATTERN, button -> {
               if (this.menu.clickMenuButton(this.minecraft.player, currentIndex)) {
                  this.minecraft.gameMode.handleInventoryButtonClick(this.menu.containerId, currentIndex);
               }
            }, Supplier::get, () -> Tooltip.create(message), () -> this.menu.getSelectedBannerPatternIndex() == currentIndex
         );
         rowHelper.addChild(patternButton);
      }

      this.recipeArea = this.createScrollableLayout(layout);
      this.recipeArea.setScrollAmount(this.patternScrollAmount);
      this.showingPatterns = !patterns.isEmpty();
   }

   private ScrollableLayout createScrollableLayout(final Layout layout) {
      ScrollableLayout scrollableLayout = new ScrollableLayout(
         this.minecraft,
         layout,
         56,
         new AbstractScrollArea.ScrollbarSettings(SCROLLER_SPRITE, SCROLLER_DISABLED_SPRITE, null, 12, 15, 14, false),
         3,
         ScrollableLayout.ReserveStrategy.RIGHT,
         GroupNarration.grid(4, "narration.group_navigation.usage.pattern")
      );
      scrollableLayout.setPosition(this.leftPos + 60, this.topPos + 13);
      scrollableLayout.setMinWidth(56);
      scrollableLayout.setMinHeight(56);
      scrollableLayout.arrangeElements();
      scrollableLayout.visitWidgets(x$0 -> this.addRenderableWidget(x$0));
      scrollableLayout.setTabGroup(7);
      scrollableLayout.allowTabNavigationInside(false);
      return scrollableLayout;
   }
}
