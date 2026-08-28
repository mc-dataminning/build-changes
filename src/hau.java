import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hau {
   static final AtomicInteger a = new AtomicInteger(0);
   static final Logger b = LogUtils.getLogger();

   public static class a extends Thread {
      private final hau.b a;
      private final InetAddress b;
      private final MulticastSocket c;

      public a(hau.b $$0) throws IOException {
         super("LanServerDetector #" + hau.a.incrementAndGet());
         this.a = $$0;
         this.setDaemon(true);
         this.setUncaughtExceptionHandler(new r(hau.b));
         this.c = new MulticastSocket(4445);
         this.b = InetAddress.getByName("224.0.2.60");
         this.c.setSoTimeout(5000);
         this.c.joinGroup(this.b);
      }

      @Override
      public void run() {
         byte[] $$0 = new byte[1024];

         while (!this.isInterrupted()) {
            DatagramPacket $$1 = new DatagramPacket($$0, $$0.length);

            try {
               this.c.receive($$1);
            } catch (SocketTimeoutException var5) {
               continue;
            } catch (IOException var6) {
               hau.b.error("Couldn't ping server", var6);
               break;
            }

            String $$4 = new String($$1.getData(), $$1.getOffset(), $$1.getLength(), StandardCharsets.UTF_8);
            hau.b.debug("{}: {}", $$1.getAddress(), $$4);
            this.a.a($$4, $$1.getAddress());
         }

         try {
            this.c.leaveGroup(this.b);
         } catch (IOException var4) {
         }

         this.c.close();
      }
   }

   public static class b {
      private final List<hat> a = Lists.newArrayList();
      private boolean b;

      @Nullable
      public synchronized List<hat> a() {
         if (this.b) {
            List<hat> $$0 = List.copyOf(this.a);
            this.b = false;
            return $$0;
         } else {
            return null;
         }
      }

      public synchronized void a(String $$0, InetAddress $$1) {
         String $$2 = hav.a($$0);
         String $$3 = hav.b($$0);
         if ($$3 != null) {
            $$3 = $$1.getHostAddress() + ":" + $$3;
            boolean $$4 = false;

            for (hat $$5 : this.a) {
               if ($$5.b().equals($$3)) {
                  $$5.c();
                  $$4 = true;
                  break;
               }
            }

            if (!$$4) {
               this.a.add(new hat($$2, $$3));
               this.b = true;
            }
         }
      }
   }
}
