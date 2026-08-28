package net.minecraft.util.profiling.jfr.event;

import jdk.jfr.EventType;
import jdk.jfr.Label;
import jdk.jfr.Name;
import net.minecraft.obfuscate.DontObfuscate;

@Name("minecraft.ChunkRegionRead")
@Label("Region File Read")
@DontObfuscate
public class ChunkRegionReadEvent extends bro {
   public static final String EVENT_NAME = "minecraft.ChunkRegionRead";
   public static final EventType TYPE = EventType.getEventType(ChunkRegionReadEvent.class);

   public ChunkRegionReadEvent(eeu $$0, djc $$1, eet $$2, int $$3) {
      super($$0, $$1, $$2, $$3);
   }
}
