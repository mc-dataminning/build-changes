package net.minecraft.util.profiling.jfr.event;

import java.net.SocketAddress;
import jdk.jfr.EventType;
import jdk.jfr.Label;
import jdk.jfr.Name;
import net.minecraft.obfuscate.DontObfuscate;

@Name("minecraft.PacketSent")
@Label("Network Packet Sent")
@DontObfuscate
public class PacketSentEvent extends bgx {
   public static final String NAME = "minecraft.PacketSent";
   public static final EventType TYPE = EventType.getEventType(PacketSentEvent.class);

   public PacketSentEvent(String $$0, int $$1, SocketAddress $$2, int $$3) {
      super($$0, $$1, $$2, $$3);
   }
}
