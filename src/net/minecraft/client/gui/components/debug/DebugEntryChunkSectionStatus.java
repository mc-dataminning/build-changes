package net.minecraft.client.gui.components.debug;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.RotatingSectionStorage;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.ViewArea;
import net.minecraft.client.renderer.chunk.SectionRenderDispatcher;
import net.minecraft.core.SectionPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.chunk.LevelChunk;
import org.jspecify.annotations.Nullable;

public class DebugEntryChunkSectionStatus implements DebugScreenEntry, DebugCustomRenderer {
   private final int CHUNK_SECTION_SIZE_PX = 3;
   private final int CHUNK_SECTION_MARGIN_PX = 2;

   @Override
   public void display(
      final DebugScreenDisplayer displayer,
      final @Nullable Level serverOrClientLevel,
      final @Nullable LevelChunk clientChunk,
      final @Nullable LevelChunk serverChunk
   ) {
      if (serverOrClientLevel != null) {
         displayer.addToGroup(DebugGroups.CHUNK_RENDERING, this);
      }
   }

   @Override
   public void extract(final GuiGraphicsExtractor graphics, final int left, final int top, final DebugColumn.Side side) {
      ViewArea viewArea = Minecraft.getInstance().levelRenderer.viewArea();
      if (viewArea != null) {
         RotatingSectionStorage<SectionRenderDispatcher.RenderSection> sections = viewArea.getSections();
         int xo = sections.centerSectionPos().x();
         int zo = sections.centerSectionPos().z();
         int radius = sections.radius();
         LongSet visibleSections = new LongOpenHashSet();
         ObjectListIterator x = Minecraft.getInstance().levelRenderer.visibleSections().iterator();

         while (x.hasNext()) {
            SectionRenderDispatcher.RenderSection section = (SectionRenderDispatcher.RenderSection)x.next();
            visibleSections.add(SectionPos.getZeroNode(section.getSectionNode()));
         }

         for (int xx = -radius; xx <= radius; xx++) {
            for (int z = -radius; z <= radius; z++) {
               int color = this.getColorForSection(sections, xx + xo, z + zo);
               int x0 = left + (radius + xx) * 5;
               int y0 = top + (radius + z) * 5;
               if (visibleSections.contains(SectionPos.getZeroNode(xx + xo, z + zo))) {
                  graphics.fill(x0 - 1, y0 - 1, x0 + 3 + 1, y0 + 3 + 1, -1);
               }

               graphics.fill(x0, y0, x0 + 3, y0 + 3, color);
            }
         }
      }
   }

   private int getColorForSection(final RotatingSectionStorage<SectionRenderDispatcher.RenderSection> sections, final int x, final int z) {
      boolean hasPendingCompile = false;

      for (int y = sections.maxY(); y >= sections.minY(); y--) {
         SectionRenderDispatcher.RenderSection section = sections.getValue(x, y, z);
         if (section != null) {
            if (section.hasCompileTaskScheduled()) {
               hasPendingCompile = true;
            }

            if (section.getSectionMesh().hasRenderableLayers()) {
               return -16711936;
            }
         }
      }

      if (hasPendingCompile) {
         return -256;
      } else {
         ClientLevel level = Minecraft.getInstance().level;
         if (level == null || level.getChunk(x, z).isEmpty()) {
            return -65536;
         } else {
            return !level.getLightEngine().lightOnInColumn(SectionPos.getZeroNode(x, z)) ? -13108 : -16777216;
         }
      }
   }

   @Override
   public int height() {
      ViewArea viewArea = Minecraft.getInstance().levelRenderer.viewArea();
      return viewArea == null ? 0 : (viewArea.getSections().radius() * 2 + 1) * 5 - 2;
   }

   @Override
   public int width(final int groupWidth) {
      return this.height();
   }
}
