package net.minecraft.client.gui.components.debug;

import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.LongSets;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.SectionPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.chunk.LevelChunk;
import org.jspecify.annotations.Nullable;

public class DebugEntryPosition implements DebugScreenEntry {
   @Override
   public void display(
      final DebugScreenDisplayer displayer,
      final @Nullable Level serverOrClientLevel,
      final @Nullable LevelChunk clientChunk,
      final @Nullable LevelChunk serverChunk
   ) {
      Minecraft minecraft = Minecraft.getInstance();
      Entity entity = minecraft.getCameraEntity();
      if (entity != null) {
         BlockPos feetPos = minecraft.getCameraEntity().blockPosition();
         ChunkPos chunkPos = ChunkPos.containing(feetPos);
         Direction direction = entity.getDirection();

         String faceString = switch (direction) {
            case NORTH -> "Towards negative Z";
            case SOUTH -> "Towards positive Z";
            case WEST -> "Towards negative X";
            case EAST -> "Towards positive X";
            default -> "Invalid";
         };
         LongSet chunks;
         Object var13 = chunks = (LongSet)(serverOrClientLevel instanceof ServerLevel serverLevel ? serverLevel.getForceLoadedChunks() : LongSets.EMPTY_SET);
         displayer.addFactToGroup(
            DebugGroups.POSITION,
            "XYZ",
            fact -> fact.formattedValue("%.3f", minecraft.getCameraEntity().getX())
               .text(" / ")
               .formattedValue("%.5f", minecraft.getCameraEntity().getY())
               .text(" / ")
               .formattedValue("%.3f", minecraft.getCameraEntity().getZ())
         );
         displayer.addFactToGroup(
            DebugGroups.POSITION, "Block", fact -> fact.value(feetPos.getX()).text(" ").value(feetPos.getY()).text(" ").value(feetPos.getZ())
         );
         displayer.addFactToGroup(
            DebugGroups.POSITION,
            "Chunk",
            fact -> fact.value(chunkPos.x())
               .text(" ")
               .value(SectionPos.blockToSectionCoord(feetPos.getY()))
               .text(" ")
               .value(chunkPos.z())
               .text(" [")
               .value(chunkPos.getRegionLocalX())
               .text(" ")
               .value(chunkPos.getRegionLocalZ())
               .text(" in ")
               .formattedValue("r.%d.%d.mca", chunkPos.getRegionX(), chunkPos.getRegionZ())
               .text("]")
         );
         displayer.addFactToGroup(
            DebugGroups.POSITION,
            "Facing",
            fact -> fact.value(direction.toString())
               .text(" (")
               .value(faceString)
               .text(") (")
               .formattedValue("%.1f", Mth.wrapDegrees(entity.getYRot()))
               .text(" / ")
               .formattedValue("%.1f", Mth.wrapDegrees(entity.getXRot()))
               .text(")")
         );
         displayer.addFactToGroup(DebugGroups.POSITION, "Dimension", fact -> fact.value(minecraft.level.dimension().identifier().toString()));
         if (!chunks.isEmpty()) {
            displayer.addFactToGroup(DebugGroups.POSITION, "Forced Chunks", fact -> fact.value(chunks.size()));
         }
      }
   }
}
