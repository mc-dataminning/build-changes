package net.minecraft.client.gui.screens;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.ActiveTextCollector;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.TextAlignment;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.reporting.DraftIconButton;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.chat.report.Report;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.ClickEvent;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import org.jspecify.annotations.Nullable;

public class DeathScreen extends Screen {
   private static final int TITLE_SCALE = 2;
   private int delayTicker;
   private final @Nullable Component causeOfDeath;
   private final boolean hardcore;
   private final LocalPlayer player;
   private final Component deathScore;
   private final List<Button> exitButtons = new ArrayList<>();
   private @Nullable Button exitToTitleButton;

   public DeathScreen(final @Nullable Component causeOfDeath, final boolean hardcore, final LocalPlayer player) {
      super(Component.translatable(hardcore ? "deathScreen.title.hardcore" : "deathScreen.title"));
      this.causeOfDeath = causeOfDeath;
      this.hardcore = hardcore;
      this.player = player;
      Component scoreValue = Component.literal(Integer.toString(player.getScore())).withStyle(ChatFormatting.YELLOW);
      this.deathScore = Component.translatable("deathScreen.score.value", scoreValue);
   }

   @Override
   protected void init() {
      this.delayTicker = 0;
      this.exitButtons.clear();
      Component message = this.hardcore ? Component.translatable("deathScreen.spectate") : Component.translatable("deathScreen.respawn");
      this.exitButtons.add(this.addRenderableWidget(Button.builder(message, button -> {
         this.player.respawn();
         button.active = false;
      }).bounds(this.width / 2 - 100, this.height / 4 + 72, 200, 20).build()));
      this.exitToTitleButton = this.addRenderableWidget(
         new DraftIconButton(
            this.width / 2 - 100,
            this.height / 4 + 96,
            200,
            20,
            Component.translatable("deathScreen.titleScreen"),
            var1x -> this.minecraft
               .getReportingContext()
               .draftReportHandled(this.minecraft, this, this::handleExitToTitleScreen, true, Report::isUnreportableLater),
            PauseScreen.DRAFT_REPORT_TOOLTIP,
            Report::isUnreportableLater
         )
      );
      this.exitButtons.add(this.exitToTitleButton);
      this.setButtonsActive(false);
   }

   @Override
   public boolean shouldCloseOnEsc() {
      return false;
   }

   private void handleExitToTitleScreen() {
      if (this.hardcore) {
         this.exitToTitleScreen();
      } else {
         ConfirmScreen confirm = new DeathScreen.TitleConfirmScreen(
            this,
            result -> {
               if (result) {
                  this.exitToTitleScreen();
               } else {
                  this.player.respawn();
                  this.minecraft.gui.setScreen(null);
               }
            },
            Component.translatable("deathScreen.quit.confirm"),
            CommonComponents.EMPTY,
            Component.translatable("deathScreen.titleScreen"),
            Component.translatable("deathScreen.respawn")
         );
         this.minecraft.gui.setScreen(confirm);
         confirm.setDelay(20);
      }
   }

   private void exitToTitleScreen() {
      if (this.minecraft.level != null) {
         this.minecraft.level.disconnect(ClientLevel.DEFAULT_QUIT_MESSAGE);
      }

      this.minecraft.disconnectWithSavingScreen();
      this.minecraft.gui.setScreen(new TitleScreen());
   }

   @Override
   public void extractRenderState(final GuiGraphicsExtractor graphics) {
      super.extractRenderState(graphics);
      this.visitText(graphics.textRenderer(GuiGraphicsExtractor.HoveredTextEffects.TOOLTIP_AND_CURSOR));
   }

   private void visitText(final ActiveTextCollector output) {
      ActiveTextCollector.Parameters normalParameters = output.defaultParameters();
      int middleLine = this.width / 2;
      output.defaultParameters(normalParameters.withScale(2.0F));
      output.accept(TextAlignment.CENTER, middleLine / 2, 30, this.title);
      output.defaultParameters(normalParameters);
      if (this.causeOfDeath != null) {
         output.accept(TextAlignment.CENTER, middleLine, 85, this.causeOfDeath);
      }

      output.accept(TextAlignment.CENTER, middleLine, 100, this.deathScore);
   }

   @Override
   public void extractBackground(final GuiGraphicsExtractor graphics) {
      extractDeathBackground(graphics, this.width, this.height);
   }

   private static void extractDeathBackground(final GuiGraphicsExtractor graphics, final int width, final int height) {
      graphics.fillGradient(0, 0, width, height, 1615855616, -1602211792);
   }

   @Override
   public boolean mouseClicked(final MouseButtonEvent event, final boolean doubleClick) {
      if (event.isLeftMouse()) {
         ActiveTextCollector.ClickableStyleFinder finder = new ActiveTextCollector.ClickableStyleFinder(this.getFont(), (int)event.x(), (int)event.y());
         this.visitText(finder);
         Style clickedStyle = finder.result();
         if (clickedStyle != null && clickedStyle.getClickEvent() instanceof ClickEvent.OpenUrl openUrl) {
            return clickUrlAction(this.minecraft, this, openUrl.uri());
         }
      }

      return super.mouseClicked(event, doubleClick);
   }

   @Override
   public boolean isPauseScreen() {
      return false;
   }

   @Override
   public boolean isAllowedInPortal() {
      return true;
   }

   @Override
   public void tick() {
      super.tick();
      this.delayTicker++;
      if (this.delayTicker == 20) {
         this.setButtonsActive(true);
      }
   }

   private void setButtonsActive(final boolean isActive) {
      for (Button button : this.exitButtons) {
         button.active = isActive;
      }
   }

   public static class TitleConfirmScreen extends ConfirmScreen {
      private final Screen previousScreen;

      public TitleConfirmScreen(
         final Screen previousScreen,
         final BooleanConsumer callback,
         final Component title,
         final Component message,
         final Component yesButton,
         final Component noButton
      ) {
         super(callback, title, message, yesButton, noButton);
         this.previousScreen = previousScreen;
      }

      @Override
      public void extractBackground(final GuiGraphicsExtractor graphics) {
         DeathScreen.extractDeathBackground(graphics, this.width, this.height);
      }

      @Override
      public boolean keyPressed(final KeyEvent event) {
         if (this.hasPressedEscape(event)) {
            this.minecraft.setScreenAndShow(this.previousScreen);
            return true;
         } else {
            return super.keyPressed(event);
         }
      }
   }
}
