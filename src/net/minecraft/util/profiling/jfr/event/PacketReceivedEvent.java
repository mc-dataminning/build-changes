package net.minecraft.util.profiling.jfr.event;

import java.net.SocketAddress;
import jdk.jfr.EventType;
import jdk.jfr.Label;
import jdk.jfr.Name;
import net.minecraft.obfuscate.DontObfuscate;

@Name("minecraft.PacketReceived")
@Label("Network Packet Received")
@DontObfuscate
public class PacketReceivedEvent extends bdv {
   public static final String NAME = "minecraft.PacketReceived";
   public static final EventType TYPE = EventType.getEventType(PacketReceivedEvent.class);

   public PacketReceivedEvent(String $$0, int $$1, SocketAddress $$2, int $$3) {
      super($$0, $$1, $$2, $$3);
   }
}
