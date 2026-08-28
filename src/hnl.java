import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.Logger;

public class hnl extends Thread {
   private static final AtomicInteger c = new AtomicInteger(0);
   private static final Logger d = LogUtils.getLogger();
   public static final String a = "224.0.2.60";
   public static final int b = 4445;
   private static final long e = 1500L;
   private final String f;
   private final DatagramSocket g;
   private boolean h = true;
   private final String i;

   public hnl(String $$0, String $$1) throws IOException {
      super("LanServerPinger #" + c.incrementAndGet());
      this.f = $$0;
      this.i = $$1;
      this.setDaemon(true);
      this.setUncaughtExceptionHandler(new r(d));
      this.g = new DatagramSocket();
   }

   @Override
   public void run() {
      String $$0 = a(this.f, this.i);
      byte[] $$1 = $$0.getBytes(StandardCharsets.UTF_8);

      while (!this.isInterrupted() && this.h) {
         try {
            InetAddress $$2 = InetAddress.getByName("224.0.2.60");
            DatagramPacket $$3 = new DatagramPacket($$1, $$1.length, $$2, 4445);
            this.g.send($$3);
         } catch (IOException var6) {
            d.warn("LanServerPinger: {}", var6.getMessage());
            break;
         }

         try {
            sleep(1500L);
         } catch (InterruptedException var5) {
         }
      }
   }

   @Override
   public void interrupt() {
      super.interrupt();
      this.h = false;
   }

   public static String a(String $$0, String $$1) {
      return "[MOTD]" + $$0 + "[/MOTD][AD]" + $$1 + "[/AD]";
   }

   public static String a(String $$0) {
      int $$1 = $$0.indexOf("[MOTD]");
      if ($$1 < 0) {
         return "missing no";
      } else {
         int $$2 = $$0.indexOf("[/MOTD]", $$1 + "[MOTD]".length());
         return $$2 < $$1 ? "missing no" : $$0.substring($$1 + "[MOTD]".length(), $$2);
      }
   }

   public static String b(String $$0) {
      int $$1 = $$0.indexOf("[/MOTD]");
      if ($$1 < 0) {
         return null;
      } else {
         int $$2 = $$0.indexOf("[/MOTD]", $$1 + "[/MOTD]".length());
         if ($$2 >= 0) {
            return null;
         } else {
            int $$3 = $$0.indexOf("[AD]", $$1 + "[/MOTD]".length());
            if ($$3 < 0) {
               return null;
            } else {
               int $$4 = $$0.indexOf("[/AD]", $$3 + "[AD]".length());
               return $$4 < $$3 ? null : $$0.substring($$3 + "[AD]".length(), $$4);
            }
         }
      }
   }
}
