package net.minecraft.util.profiling.jfr.event;

import jdk.jfr.Category;
import jdk.jfr.Enabled;
import jdk.jfr.Event;
import jdk.jfr.EventType;
import jdk.jfr.Label;
import jdk.jfr.Name;
import jdk.jfr.StackTrace;
import net.minecraft.obfuscate.DontObfuscate;

@Name("minecraft.ChunkGeneration")
@Label("Chunk Generation")
@Category({"Minecraft", "World Generation"})
@StackTrace(false)
@Enabled(false)
@DontObfuscate
public class ChunkGenerationEvent extends Event {
   public static final String EVENT_NAME = "minecraft.ChunkGeneration";
   public static final EventType TYPE = EventType.getEventType(ChunkGenerationEvent.class);
   @Name("worldPosX")
   @Label("First Block X World Position")
   public final int worldPosX;
   @Name("worldPosZ")
   @Label("First Block Z World Position")
   public final int worldPosZ;
   @Name("chunkPosX")
   @Label("Chunk X Position")
   public final int chunkPosX;
   @Name("chunkPosZ")
   @Label("Chunk Z Position")
   public final int chunkPosZ;
   @Name("status")
   @Label("Status")
   public final String targetStatus;
   @Name("level")
   @Label("Level")
   public final String level;

   public ChunkGenerationEvent(djc $$0, alh<djx> $$1, String $$2) {
      this.targetStatus = $$2;
      this.level = $$1.a().toString();
      this.chunkPosX = $$0.h;
      this.chunkPosZ = $$0.i;
      this.worldPosX = $$0.d();
      this.worldPosZ = $$0.e();
   }

   public static class a {
      public static final String a = "worldPosX";
      public static final String b = "worldPosZ";
      public static final String c = "chunkPosX";
      public static final String d = "chunkPosZ";
      public static final String e = "status";
      public static final String f = "level";

      private a() {
      }
   }
}
