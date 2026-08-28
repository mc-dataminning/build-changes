package net.minecraft.util.profiling.jfr.event;

import jdk.jfr.EventType;
import jdk.jfr.Label;
import jdk.jfr.Name;
import net.minecraft.obfuscate.DontObfuscate;

@Name("minecraft.ChunkRegionRead")
@Label("Region File Read")
@DontObfuscate
public class ChunkRegionReadEvent extends bor {
   public static final String EVENT_NAME = "minecraft.ChunkRegionRead";
   public static final EventType TYPE = EventType.getEventType(ChunkRegionReadEvent.class);

   public ChunkRegionReadEvent(dyh $$0, ddp $$1, dyg $$2, int $$3) {
      super($$0, $$1, $$2, $$3);
   }
}
