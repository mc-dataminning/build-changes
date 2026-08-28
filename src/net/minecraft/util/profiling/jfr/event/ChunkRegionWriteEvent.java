package net.minecraft.util.profiling.jfr.event;

import jdk.jfr.EventType;
import jdk.jfr.Label;
import jdk.jfr.Name;
import net.minecraft.obfuscate.DontObfuscate;

@Name("minecraft.ChunkRegionWrite")
@Label("Region File Write")
@DontObfuscate
public class ChunkRegionWriteEvent extends bns {
   public static final String EVENT_NAME = "minecraft.ChunkRegionWrite";
   public static final EventType TYPE = EventType.getEventType(ChunkRegionWriteEvent.class);

   public ChunkRegionWriteEvent(dvn $$0, dbe $$1, dvm $$2, int $$3) {
      super($$0, $$1, $$2, $$3);
   }
}
