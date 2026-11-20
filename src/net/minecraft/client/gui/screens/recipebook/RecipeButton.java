package net.minecraft.client.gui.screens.recipebook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.GuiPipeline;
import net.minecraft.client.gui.components.AbstractButton;
import net.minecraft.client.gui.components.Tooltip;
import net.minecraft.client.gui.narration.NarratedElementType;
import net.minecraft.client.gui.narration.NarrationElementOutput;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.InputWithModifiers;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.Identifier;
import net.minecraft.util.context.ContextMap;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.display.RecipeDisplayEntry;
import net.minecraft.world.item.crafting.display.RecipeDisplayId;
import org.jspecify.annotations.Nullable;

public class RecipeButton extends AbstractButton {
   private static final Identifier SLOT_MANY_CRAFTABLE_SPRITE = Identifier.withDefaultNamespace("recipe_book/slot_many_craftable");
   private static final Identifier SLOT_CRAFTABLE_SPRITE = Identifier.withDefaultNamespace("recipe_book/slot_craftable");
   private static final Identifier SLOT_MANY_UNCRAFTABLE_SPRITE = Identifier.withDefaultNamespace("recipe_book/slot_many_uncraftable");
   private static final Identifier SLOT_UNCRAFTABLE_SPRITE = Identifier.withDefaultNamespace("recipe_book/slot_uncraftable");
   private static final Identifier SLOT_HIGHLIGHT_BACK_SPRITE = Identifier.withDefaultNamespace("recipe_book/slot_highlight_back");
   private static final Identifier SLOT_HIGHLIGHT_FRONT_SPRITE = Identifier.withDefaultNamespace("recipe_book/slot_highlight_front");
   private static final float ANIMATION_TIME = 15.0F;
   public static final int SIZE = 25;
   private static final Component MORE_RECIPES_TOOLTIP_MOUSE = Component.translatable("gui.recipebook.moreRecipes");
   private static final Component MORE_RECIPES_TOOLTIP_KEYBOARD = Component.translatable("gui.recipebook.moreRecipes.keyboard");
   private RecipeCollection collection = RecipeCollection.EMPTY;
   private List<RecipeButton.ResolvedEntry> selectedEntries = List.of();
   private boolean allRecipesHaveSameResultDisplay;
   private final SlotSelectTime slotSelectTime;
   private final RecipeBookComponent.RecipePlacer recipePlacer;
   private final Predicate<RecipeButton> tryOpenOverlay;
   private float animationTime;

   public RecipeButton(final SlotSelectTime slotSelectTime, final RecipeBookComponent.RecipePlacer recipePlacer, final Predicate<RecipeButton> tryOpenOverlay) {
      super(0, 0, 25, 25, CommonComponents.EMPTY);
      this.slotSelectTime = slotSelectTime;
      this.recipePlacer = recipePlacer;
      this.tryOpenOverlay = tryOpenOverlay;
   }

   @Override
   public void onPress(final InputWithModifiers input) {
      this.recipePlacer.placeRecipe(this.collection, this.getCurrentRecipe(), input.hasShiftDown());
   }

   public void update(final RecipeCollection collection, final boolean isFiltering, final RecipeBookPage page, final ContextMap resolutionContext) {
      this.collection = collection;
      List<RecipeDisplayEntry> fittingRecipes = collection.getSelectedRecipes(
         isFiltering ? RecipeCollection.CraftableStatus.CRAFTABLE : RecipeCollection.CraftableStatus.ANY
      );
      this.selectedEntries = fittingRecipes.stream().map(entry -> new RecipeButton.ResolvedEntry(entry.id(), entry.resultItems(resolutionContext))).toList();
      this.allRecipesHaveSameResultDisplay = allRecipesHaveSameResultDisplay(this.selectedEntries);
      List<RecipeDisplayId> newlyShownRecipes = fittingRecipes.stream().map(RecipeDisplayEntry::id).filter(page.getRecipeBook()::willHighlight).toList();
      if (!newlyShownRecipes.isEmpty()) {
         newlyShownRecipes.forEach(page::recipeShown);
         this.animationTime = 15.0F;
      }
   }

   private static boolean allRecipesHaveSameResultDisplay(final List<RecipeButton.ResolvedEntry> entries) {
      Iterator<ItemStack> itemsIterator = entries.stream().flatMap(e -> e.displayItems().stream()).iterator();
      if (!itemsIterator.hasNext()) {
         return true;
      }

      ItemStack firstItem = itemsIterator.next();

      while (itemsIterator.hasNext()) {
         ItemStack nextItem = itemsIterator.next();
         if (!ItemStack.isSameItemSameComponents(firstItem, nextItem)) {
            return false;
         }
      }

      return true;
   }

   public RecipeCollection getCollection() {
      return this.collection;
   }

   @Override
   protected void extractContents(final GuiGraphicsExtractor graphics) {
      Identifier sprite;
      if (this.collection.hasCraftable()) {
         if (this.hasMultipleRecipes()) {
            sprite = SLOT_MANY_CRAFTABLE_SPRITE;
         } else {
            sprite = SLOT_CRAFTABLE_SPRITE;
         }
      } else if (this.hasMultipleRecipes()) {
         sprite = SLOT_MANY_UNCRAFTABLE_SPRITE;
      } else {
         sprite = SLOT_UNCRAFTABLE_SPRITE;
      }

      boolean shouldAnimate = this.animationTime > 0.0F;
      if (shouldAnimate) {
         float squeeze = 1.0F + 0.1F * (float)Math.sin(this.animationTime / 15.0F * (float) Math.PI);
         graphics.pose().pushMatrix();
         graphics.pose().translate(this.getX() + 8, this.getY() + 12);
         graphics.pose().scale(squeeze, squeeze);
         graphics.pose().translate(-(this.getX() + 8), -(this.getY() + 12));
         this.animationTime = this.animationTime - graphics.partialTicks();
      }

      graphics.blitSprite(GuiPipeline.TEXTURED, sprite, this.getX(), this.getY(), this.width, this.height);
      if (this.isHighlighted()) {
         this.extractHighlight(graphics, SLOT_HIGHLIGHT_BACK_SPRITE);
      }

      ItemStack currentItemStack = this.getDisplayStack();
      int offset = 4;
      if (this.hasMultipleRecipes() && this.allRecipesHaveSameResultDisplay) {
         graphics.item(currentItemStack, this.getX() + offset + 1, this.getY() + offset + 1, 0);
         offset--;
      }

      graphics.fakeItem(currentItemStack, this.getX() + offset, this.getY() + offset);
      if (this.isHighlighted()) {
         this.extractHighlight(graphics, SLOT_HIGHLIGHT_FRONT_SPRITE);
      }

      if (shouldAnimate) {
         graphics.pose().popMatrix();
      }
   }

   private void extractHighlight(final GuiGraphicsExtractor graphics, final Identifier sprite) {
      graphics.blitSprite(GuiPipeline.TEXTURED, sprite, this.getX(), this.getY(), this.width, this.height);
   }

   @Override
   protected void extractTooltipForNextRenderPass(final GuiGraphicsExtractor graphics) {
      this.setTooltip(
         this.isHighlighted()
            ? this.createTooltip(this.getDisplayStack(), this.isHovered() ? MORE_RECIPES_TOOLTIP_MOUSE : MORE_RECIPES_TOOLTIP_KEYBOARD)
            : null
      );
      super.extractTooltipForNextRenderPass(graphics);
   }

   @Override
   public boolean mouseClicked(final MouseButtonEvent event, final boolean doubleClick) {
      return event.isRightMouse() && this.openOverlay() ? true : super.mouseClicked(event, doubleClick);
   }

   @Override
   public boolean keyPressed(final KeyEvent event) {
      return event.hasControlDown() && event.isSelection() ? this.openOverlay() : super.keyPressed(event);
   }

   private boolean openOverlay() {
      if (!this.tryOpenOverlay.test(this)) {
         return false;
      }

      this.playDownSound(Minecraft.getInstance().getSoundManager());
      return true;
   }

   private boolean hasMultipleRecipes() {
      return this.selectedEntries.size() > 1;
   }

   public boolean isOnlyOption() {
      return this.selectedEntries.size() == 1;
   }

   public RecipeDisplayId getCurrentRecipe() {
      int index = this.slotSelectTime.currentIndex() % this.selectedEntries.size();
      return this.selectedEntries.get(index).id;
   }

   public ItemStack getDisplayStack() {
      if (this.selectedEntries.isEmpty()) {
         return ItemStack.EMPTY;
      }

      int currentIndex = this.slotSelectTime.currentIndex();
      int entryCount = this.selectedEntries.size();
      int offsetIndex = currentIndex / entryCount;
      int entryIndex = currentIndex - entryCount * offsetIndex;
      return this.selectedEntries.get(entryIndex).selectItem(offsetIndex);
   }

   private @Nullable Tooltip createTooltip(final ItemStack displayStack, final Component moreRecipesTooltip) {
      if (displayStack.isEmpty()) {
         return null;
      }

      List<Component> itemLines = Screen.getTooltipFromItem(Minecraft.getInstance(), displayStack);
      Component narration = itemLines.size() > 1 ? CommonComponents.joinLines(itemLines.subList(1, itemLines.size())) : null;
      List<Component> texts = new ArrayList<>(itemLines);
      if (this.hasMultipleRecipes()) {
         texts.add(moreRecipesTooltip);
      }

      return Tooltip.createForItem(texts, narration, displayStack);
   }

   @Override
   protected MutableComponent createNarrationMessage() {
      return Component.translatable("narration.recipe", this.getDisplayStack().getHoverName());
   }

   @Override
   public void updateWidgetNarration(final NarrationElementOutput output) {
      output.add(NarratedElementType.TITLE, this.createNarrationMessage());
      if (this.active) {
         Component usage = Component.translatable(this.isFocused() ? "narration.button.usage.focused" : "narration.button.usage.hovered");
         if (this.hasMultipleRecipes()) {
            output.add(
               NarratedElementType.USAGE,
               usage,
               Component.translatable(this.isFocused() ? "narration.recipe.usage.more.keyboard" : "narration.recipe.usage.more")
            );
         } else {
            output.add(NarratedElementType.USAGE, usage);
         }
      }
   }

   @Override
   public int getWidth() {
      return 25;
   }

   private record ResolvedEntry(RecipeDisplayId id, List<ItemStack> displayItems) {
      public ItemStack selectItem(final int index) {
         if (this.displayItems.isEmpty()) {
            return ItemStack.EMPTY;
         }

         int offset = index % this.displayItems.size();
         return this.displayItems.get(offset);
      }
   }
}
