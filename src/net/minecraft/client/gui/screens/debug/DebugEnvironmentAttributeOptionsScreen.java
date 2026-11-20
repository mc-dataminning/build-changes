package net.minecraft.client.gui.screens.debug;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.ContainerObjectSelectionList;
import net.minecraft.client.gui.components.CycleButton;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.ObjectSelectionList;
import net.minecraft.client.gui.components.debug.DebugEntryEnvironmentAttribute;
import net.minecraft.client.gui.components.events.GuiEventListener;
import net.minecraft.client.gui.components.tabs.GridLayoutTab;
import net.minecraft.client.gui.components.tabs.MenuTabBar;
import net.minecraft.client.gui.components.tabs.TabManager;
import net.minecraft.client.gui.layouts.HeaderAndFooterLayout;
import net.minecraft.client.gui.layouts.LayoutSettings;
import net.minecraft.client.gui.narration.NarratableEntry;
import net.minecraft.client.gui.navigation.ScreenRectangle;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.attribute.EnvironmentAttribute;
import net.minecraft.world.attribute.EnvironmentAttributeDebugger;
import net.minecraft.world.attribute.EnvironmentAttributeLayerValues;
import org.jspecify.annotations.Nullable;

public class DebugEnvironmentAttributeOptionsScreen extends Screen {
   private static final Component TITLE = Component.literal("Environment Attributes");
   private static final Component ATTRIBUTES_TAB = Component.literal("Attributes");
   private static final Component LAYERS_TAB = Component.literal("Layers");
   private static final Component SEARCH_HINT = Component.literal("Search").withStyle(EditBox.SEARCH_HINT_STYLE);
   private static final Component NONE = Component.literal("(none)");
   private static final int SPACING = 3;
   private static final int SEARCH_BOX_HEIGHT = 15;
   private static final int ITEM_HEIGHT = 15;
   private static final int LAYER_ITEM_HEIGHT = 25;
   private static final int ROW_WIDTH = 310;
   private static final int ROW_PADDING = 5;
   private static final int SCROLLBAR_MARGIN = 20;
   private final HeaderAndFooterLayout layout = new HeaderAndFooterLayout(this);
   private final TabManager tabManager = new TabManager(x$0 -> this.addRenderableWidget(x$0), x$0 -> this.removeWidget(x$0));
   private final @Nullable Screen parent;
   private @Nullable MenuTabBar tabBar;

   public DebugEnvironmentAttributeOptionsScreen(final @Nullable Screen parent) {
      super(TITLE);
      this.parent = parent;
   }

   @Override
   public void onClose() {
      this.minecraft.gui.setScreen(this.parent);
   }

   @Override
   protected void init() {
      this.tabBar = this.addRenderableWidget(
         MenuTabBar.builder(this.tabManager, this.width)
            .addTab(ATTRIBUTES_TAB, new DebugEnvironmentAttributeOptionsScreen.AttributesTab())
            .addTab(LAYERS_TAB, new DebugEnvironmentAttributeOptionsScreen.LayersTab())
            .build()
      );
      this.layout.addToFooter(Button.builder(CommonComponents.GUI_DONE, var1 -> this.onClose()).build());
      this.layout.visitWidgets(x$0 -> this.addRenderableWidget(x$0));
      this.tabBar.selectTab(0, false);
      this.repositionElements();
   }

   @Override
   public void extractBlurredBackground(final GuiGraphicsExtractor graphics) {
      this.minecraft.gui.hud.extractDebugOverlay(graphics);
      super.extractBlurredBackground(graphics);
   }

   @Override
   protected void repositionElements() {
      if (this.tabBar != null) {
         this.tabBar.arrangeElements(this.width);
         this.layout.setHeaderHeight(this.tabBar.getRectangle().bottom() + 3);
         this.layout.arrangeElements();
         this.tabManager.setTabArea(new ScreenRectangle(0, this.layout.getHeaderHeight(), this.width, this.layout.getContentHeight()));
      }
   }

   @Override
   public boolean keyPressed(final KeyEvent event) {
      return this.tabBar != null && this.tabBar.keyPressed(event) || super.keyPressed(event);
   }

   private int rowWidth() {
      return Math.min(this.width - 20, 310);
   }

   private Component clip(final String text, final int maxWidth) {
      return this.font.width(text) <= maxWidth
         ? Component.literal(text)
         : Component.literal(this.font.plainSubstrByWidth(text, maxWidth - this.font.width(CommonComponents.ELLIPSIS)) + CommonComponents.ELLIPSIS.getString());
   }

   private static boolean matches(final String text, final String filter) {
      return filter.isEmpty() || text.toLowerCase(Locale.ROOT).contains(filter.toLowerCase(Locale.ROOT));
   }

   private class AttributeList extends ObjectSelectionList<DebugEnvironmentAttributeOptionsScreen.AttributeList.Entry> {
      private AttributeList() {
         super(
            DebugEnvironmentAttributeOptionsScreen.this.minecraft,
            DebugEnvironmentAttributeOptionsScreen.this.width,
            DebugEnvironmentAttributeOptionsScreen.this.layout.getContentHeight(),
            DebugEnvironmentAttributeOptionsScreen.this.layout.getHeaderHeight(),
            15
         );
         this.filterEntries("");
         EnvironmentAttribute<?> attribute = DebugEntryEnvironmentAttribute.getAttribute();
         this.setSelected(this.children().stream().filter(entry -> Objects.equals(entry.attribute, attribute)).findFirst().orElse(null));
      }

      @Override
      public int getRowWidth() {
         return DebugEnvironmentAttributeOptionsScreen.this.rowWidth();
      }

      private void filterEntries(final String filter) {
         List<DebugEnvironmentAttributeOptionsScreen.AttributeList.Entry> entries = new ArrayList<>();
         entries.add(new DebugEnvironmentAttributeOptionsScreen.AttributeList.Entry(null, DebugEnvironmentAttributeOptionsScreen.NONE));
         BuiltInRegistries.ENVIRONMENT_ATTRIBUTE
            .listElements()
            .map(
               holder -> new DebugEnvironmentAttributeOptionsScreen.AttributeList.Entry(holder.value(), Component.literal(holder.key().identifier().toString()))
            )
            .filter(entry -> DebugEnvironmentAttributeOptionsScreen.matches(entry.name.getString(), filter))
            .sorted(Comparator.comparing(entry -> entry.name.getString()))
            .forEach(entries::add);
         this.replaceEntries(entries);
         this.refreshScrollAmount();
      }

      public void setSelected(final DebugEnvironmentAttributeOptionsScreen.AttributeList.@Nullable Entry entry) {
         super.setSelected(entry);
         if (entry != null) {
            DebugEntryEnvironmentAttribute.setAttribute(entry.attribute);
         }
      }

      private class Entry extends ObjectSelectionList.Entry<DebugEnvironmentAttributeOptionsScreen.AttributeList.Entry> {
         private final @Nullable EnvironmentAttribute<?> attribute;
         private final Component name;

         private Entry(final @Nullable EnvironmentAttribute<?> attribute, final Component name) {
            this.attribute = attribute;
            this.name = name;
         }

         @Override
         public Component getNarration() {
            return Component.translatable("narrator.select", this.name);
         }

         @Override
         public void extractContent(final GuiGraphicsExtractor graphics, final boolean hovered) {
            graphics.text(
               DebugEnvironmentAttributeOptionsScreen.this.font,
               DebugEnvironmentAttributeOptionsScreen.this.clip(this.name.getString(), this.getContentWidth() - 10),
               this.getContentX() + 5,
               this.getContentY() + 2,
               -1
            );
         }

         @Override
         public boolean mouseClicked(final MouseButtonEvent event, final boolean doubleClick) {
            AttributeList.this.setSelected(this);
            return super.mouseClicked(event, doubleClick);
         }
      }
   }

   private class AttributesTab extends GridLayoutTab {
      private final DebugEnvironmentAttributeOptionsScreen.AttributeList list = DebugEnvironmentAttributeOptionsScreen.this.new AttributeList();
      private final EditBox search = new EditBox(DebugEnvironmentAttributeOptionsScreen.this.font, 310, 15, DebugEnvironmentAttributeOptionsScreen.SEARCH_HINT);

      private AttributesTab() {
         this.search.setHint(DebugEnvironmentAttributeOptionsScreen.SEARCH_HINT);
         this.search.setResponder(this.list::filterEntries);
         this.layout.rowSpacing(3);
         this.layout.addChild(this.search, 0, 0, LayoutSettings::alignHorizontallyCenter);
         this.layout.addChild(this.list, 1, 0);
      }

      @Override
      public void doLayout(final ScreenRectangle area) {
         this.search.setWidth(DebugEnvironmentAttributeOptionsScreen.this.rowWidth());
         int listTop = area.top() + 15 + 3;
         this.list.updateSizeAndPosition(area.width(), area.height() - 15 - 3, listTop);
         super.doLayout(area);
      }
   }

   private class LayerList extends ContainerObjectSelectionList<DebugEnvironmentAttributeOptionsScreen.LayerList.Entry> {
      private LayerList() {
         super(
            DebugEnvironmentAttributeOptionsScreen.this.minecraft,
            DebugEnvironmentAttributeOptionsScreen.this.width,
            DebugEnvironmentAttributeOptionsScreen.this.layout.getContentHeight(),
            DebugEnvironmentAttributeOptionsScreen.this.layout.getHeaderHeight(),
            25
         );
      }

      @Override
      public int getRowWidth() {
         return DebugEnvironmentAttributeOptionsScreen.this.rowWidth();
      }

      private void refreshEntries() {
         List<DebugEnvironmentAttributeOptionsScreen.LayerList.Entry> entries = new ArrayList<>();
         EnvironmentAttribute<?> environmentAttribute = DebugEntryEnvironmentAttribute.getAttribute();
         if (this.minecraft.level != null && environmentAttribute != null) {
            EnvironmentAttributeLayerValues layerValues = EnvironmentAttributeDebugger.getValuePerLayer(
               this.minecraft.level, environmentAttribute, this.minecraft.gameRenderer.mainCamera().position()
            );

            for (EnvironmentAttributeLayerValues.LayerValue layer : layerValues.layers()) {
               if (layer.layerIndex() >= 0) {
                  entries.add(new DebugEnvironmentAttributeOptionsScreen.LayerList.Entry(environmentAttribute, layer));
               }
            }
         }

         this.replaceEntries(entries);
         this.refreshScrollAmount();
      }

      private class Entry extends ContainerObjectSelectionList.Entry<DebugEnvironmentAttributeOptionsScreen.LayerList.Entry> {
         private final CycleButton<Boolean> toggle;

         private Entry(final EnvironmentAttribute<?> attribute, final EnvironmentAttributeLayerValues.LayerValue layer) {
            this.toggle = CycleButton.onOffBuilder(!layer.disabled())
               .create(
                  0,
                  0,
                  310,
                  20,
                  Component.literal(layer.layerIndex() + ". " + layer.kind()),
                  (var3, enabled) -> EnvironmentAttributeDebugger.setLayerDisabled(
                     Objects.requireNonNull(LayerList.this.minecraft.level), attribute, layer.layerIndex(), !enabled
                  )
               );
         }

         @Override
         public void extractContent(final GuiGraphicsExtractor graphics, final boolean hovered) {
            this.toggle.setRectangle(this.getContentWidth(), 20, this.getContentX(), this.getContentY());
            this.toggle.extractRenderState(graphics);
         }

         @Override
         public List<? extends GuiEventListener> children() {
            return List.of(this.toggle);
         }

         @Override
         public List<? extends NarratableEntry> narratables() {
            return List.of(this.toggle);
         }
      }
   }

   private class LayersTab extends GridLayoutTab {
      private final DebugEnvironmentAttributeOptionsScreen.LayerList list = DebugEnvironmentAttributeOptionsScreen.this.new LayerList();

      private LayersTab() {
         this.layout.addChild(this.list, 0, 0);
      }

      @Override
      public void doLayout(final ScreenRectangle area) {
         this.list.refreshEntries();
         this.list.updateSizeAndPosition(DebugEnvironmentAttributeOptionsScreen.this.width, area.height(), area.top());
         super.doLayout(area);
      }
   }
}
