package net.minecraft.util.profiling.jfr.event;

import jdk.jfr.Category;
import jdk.jfr.Enabled;
import jdk.jfr.Event;
import jdk.jfr.EventType;
import jdk.jfr.Label;
import jdk.jfr.Name;
import jdk.jfr.StackTrace;
import net.minecraft.obfuscate.DontObfuscate;

@Name("minecraft.StructureGeneration")
@Label("Structure Generation")
@Category({"Minecraft", "World Generation"})
@StackTrace(false)
@Enabled(false)
@DontObfuscate
public class StructureGenerationEvent extends Event {
   public static final String EVENT_NAME = "minecraft.StructureGeneration";
   public static final EventType TYPE = EventType.getEventType(StructureGenerationEvent.class);
   @Name("chunkPosX")
   @Label("Chunk X Position")
   public final int chunkPosX;
   @Name("chunkPosZ")
   @Label("Chunk Z Position")
   public final int chunkPosZ;
   @Name("structure")
   @Label("Structure")
   public final String structure;
   @Name("level")
   @Label("Level")
   public final String level;
   @Name("success")
   @Label("Success")
   public boolean success;

   public StructureGenerationEvent(djc $$0, jf<esb> $$1, alh<djx> $$2) {
      this.chunkPosX = $$0.h;
      this.chunkPosZ = $$0.i;
      this.structure = $$1.g();
      this.level = $$2.a().toString();
   }

   public interface a {
      String a = "chunkPosX";
      String b = "chunkPosZ";
      String c = "structure";
      String d = "level";
      String e = "success";
   }
}
