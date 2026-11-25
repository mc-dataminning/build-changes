package net.minecraft.client.gui.components;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.events.GuiEventListener;
import net.minecraft.client.gui.layouts.Layout;
import net.minecraft.client.gui.layouts.LayoutElement;
import net.minecraft.client.gui.narration.GroupNarration;
import net.minecraft.client.gui.narration.NarratableEntry;
import net.minecraft.client.gui.narration.NarrationElementOutput;
import net.minecraft.client.gui.narration.NarrationTrigger;
import net.minecraft.client.gui.navigation.ScreenDirection;
import net.minecraft.client.gui.navigation.ScreenRectangle;
import net.minecraft.network.chat.CommonComponents;
import org.jspecify.annotations.Nullable;

public class ScrollableLayout implements Layout {
   private static final int DEFAULT_SCROLLBAR_SPACING = 4;
   private final Layout content;
   private final ScrollableLayout.Container container;
   private final ScrollableLayout.ReserveStrategy reserveStrategy;
   private final @Nullable GroupNarration groupNarration;
   private int scrollbarSpacing;
   private int minWidth;
   private int minHeight;
   private int maxHeight;
   private float yAlignment;

   public ScrollableLayout(final Minecraft minecraft, final Layout content, final int maxHeight) {
      this(minecraft, content, maxHeight, AbstractScrollArea.defaultSettings(10), 4, ScrollableLayout.ReserveStrategy.BOTH, null);
   }

   public ScrollableLayout(
      final Minecraft minecraft,
      final Layout content,
      final int maxHeight,
      final AbstractScrollArea.ScrollbarSettings scrollbarSettings,
      final int scrollbarSpacing,
      final ScrollableLayout.ReserveStrategy reserveStrategy,
      final @Nullable GroupNarration groupNarration
   ) {
      this.content = content;
      this.maxHeight = maxHeight;
      this.reserveStrategy = reserveStrategy;
      this.groupNarration = groupNarration;
      this.scrollbarSpacing = scrollbarSpacing;
      this.container = new ScrollableLayout.Container(minecraft, 0, maxHeight, scrollbarSettings);
   }

   public void setScrollbarSpacing(final int scrollbarSpacing) {
      this.scrollbarSpacing = scrollbarSpacing;
   }

   public void setMinWidth(final int minWidth) {
      this.minWidth = minWidth;
      this.container.setWidth(Math.max(this.content.getWidth(), minWidth));
   }

   public void setMinHeight(final int minHeight) {
      this.minHeight = minHeight;
      this.container.setHeight(Math.max(this.content.getHeight(), minHeight));
   }

   public void setMaxHeight(final int maxHeight) {
      this.maxHeight = maxHeight;
      this.container.setHeight(Math.min(this.content.getHeight(), maxHeight));
      this.container.refreshScrollAmount();
   }

   public void alignVertically(final float yAlignment) {
      this.yAlignment = yAlignment;
   }

   public void alignVerticallyTop() {
      this.alignVertically(0.0F);
   }

   public void alignVerticallyMiddle() {
      this.alignVertically(0.5F);
   }

   public void alignVerticallyBottom() {
      this.alignVertically(1.0F);
   }

   @Override
   public void arrangeElements() {
      this.content.arrangeElements();
      int contentWidth = this.content.getWidth();

      int scrollbarReserve = switch (this.reserveStrategy) {
         case RIGHT -> this.container.scrollbarReserve();
         case BOTH -> 2 * this.container.scrollbarReserve();
      };
      this.container.setWidth(Math.max(contentWidth, this.minWidth) + scrollbarReserve);
      this.container.setHeight(Math.clamp(this.container.getHeight(), this.minHeight, this.maxHeight));
      this.container.refreshChildren();
      this.container.refreshScrollAmount();
   }

   @Override
   public void visitChildren(final Consumer<LayoutElement> layoutElementVisitor) {
      layoutElementVisitor.accept(this.container);
   }

   @Override
   public void removeChildren() {
      this.container.children().clear();
      this.content.removeChildren();
   }

   @Override
   public void setX(final int x) {
      this.container.setX(x);
   }

   @Override
   public void setY(final int y) {
      this.container.setY(y);
   }

   @Override
   public int getX() {
      return this.container.getX();
   }

   @Override
   public int getY() {
      return this.container.getY();
   }

   @Override
   public int getWidth() {
      return this.container.getWidth();
   }

   @Override
   public int getHeight() {
      return this.container.getHeight();
   }

   public double getScrollAmount() {
      return this.container.scrollAmount();
   }

   public void setScrollAmount(final double scrollAmount) {
      this.container.setScrollAmount(scrollAmount);
   }

   public void setTabGroup(final int tabGroup) {
      this.container.setTabOrderGroup(tabGroup);
      this.container.children.forEach(child -> child.setTabOrderGroup(tabGroup));
   }

   public void allowTabNavigationInside(final boolean allowTabNavigationInside) {
      this.container.allowTabNavigationInside(allowTabNavigationInside);
   }

   private class Container extends AbstractContainerWidget {
      private final Minecraft minecraft;
      private final List<AbstractWidget> children = new ArrayList<>();

      public Container(final Minecraft minecraft, final int width, final int height, final AbstractScrollArea.ScrollbarSettings scrollbarSettings) {
         super(0, 0, width, height, CommonComponents.EMPTY, scrollbarSettings);
         this.minecraft = minecraft;
         this.refreshChildren();
      }

      public void refreshChildren() {
         this.children.clear();
         ScrollableLayout.this.content.visitWidgets(this.children::add);
      }

      @Override
      protected int contentHeight() {
         return ScrollableLayout.this.content.getHeight();
      }

      @Override
      protected void extractWidgetRenderState(final GuiGraphicsExtractor graphics) {
         graphics.enableScissor(this.getX(), this.getY(), this.getX() + this.width, this.getY() + this.height);

         for (AbstractWidget child : this.children) {
            if (child.getBottom() >= this.getY() && child.getY() <= this.getBottom()) {
               child.extractRenderState(graphics);
            }
         }

         graphics.disableScissor();
         this.extractScrollbar(graphics);
      }

      @Override
      public NarratableEntry.NarrationPriority narrationPriority(final NarrationTrigger narrationTrigger) {
         return NarratableEntry.NarrationPriority.of(this.isFocused(), this.getHoveredChild() != null, narrationTrigger);
      }

      @Override
      protected void updateWidgetNarration(final NarrationElementOutput output) {
         if (ScrollableLayout.this.groupNarration != null) {
            List<AbstractWidget> visibleChildren = this.children.stream().filter(AbstractWidget::isVisible).toList();
            AbstractWidget narrated = getNarratedChild(output.narrationTrigger(), this.getHoveredChild(), this.getFocusedChild());
            if (narrated != null) {
               narrated.updateNarration(output.nest());
               ScrollableLayout.this.groupNarration.narratePosition(output, visibleChildren, narrated);
            }

            if (this.isFocused()) {
               ScrollableLayout.this.groupNarration.narrateUsage(output, visibleChildren);
            }
         }
      }

      private @Nullable AbstractWidget getHoveredChild() {
         for (AbstractWidget child : this.children) {
            if (child.isHovered()) {
               return child;
            }
         }

         return null;
      }

      private @Nullable AbstractWidget getFocusedChild() {
         return this.getFocused() instanceof AbstractWidget widget ? widget : null;
      }

      @Override
      public ScreenRectangle getBorderForArrowNavigation(final ScreenDirection opposite) {
         GuiEventListener focused = this.getFocused();
         return focused != null
            ? focused.getBorderForArrowNavigation(opposite)
            : new ScreenRectangle(this.getX(), this.getY(), this.width, this.contentHeight()).getBorder(opposite);
      }

      @Override
      public void setFocused(final @Nullable GuiEventListener focused) {
         super.setFocused(focused);
         if (focused != null && this.minecraft.getLastInputType().isKeyboard()) {
            ScreenRectangle area = this.getRectangle();
            ScreenRectangle focusedRect = focused.getRectangle();
            int topDelta = focusedRect.top() - area.top();
            int bottomDelta = focusedRect.bottom() - area.bottom();
            double scrollRate = this.scrollRate();
            if (topDelta < 0) {
               this.setScrollAmount(this.scrollAmount() + topDelta - scrollRate);
            } else if (bottomDelta > 0) {
               this.setScrollAmount(this.scrollAmount() + bottomDelta + scrollRate);
            }
         }
      }

      @Override
      public void setX(final int x) {
         super.setX(x);
         ScrollableLayout.this.content.setX(x + (ScrollableLayout.this.reserveStrategy == ScrollableLayout.ReserveStrategy.BOTH ? this.scrollbarReserve() : 0));
      }

      private int verticalOffset() {
         int remainingHeight = this.height - this.contentHeight();
         return Math.round(ScrollableLayout.this.yAlignment * remainingHeight) - (int)this.scrollAmount();
      }

      @Override
      public void setY(final int y) {
         super.setY(y);
         ScrollableLayout.this.content.setY(y + this.verticalOffset());
      }

      private int scrollbarReserve() {
         return ScrollableLayout.this.scrollbarSpacing + this.scrollbarWidth();
      }

      @Override
      public void setScrollAmount(final double scrollAmount) {
         super.setScrollAmount(scrollAmount);
         ScrollableLayout.this.content.setY(this.getRectangle().top() + this.verticalOffset());
      }

      @Override
      public List<? extends GuiEventListener> children() {
         return this.children;
      }

      @Override
      public Collection<? extends NarratableEntry> getNarratables() {
         return ScrollableLayout.this.groupNarration != null ? List.of(this) : this.children;
      }
   }

   public enum ReserveStrategy {
      RIGHT,
      BOTH;
   }
}
