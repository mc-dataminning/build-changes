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

public class gtf {
   static final AtomicInteger a = new AtomicInteger(0);
   static final Logger b = LogUtils.getLogger();

   public static class a extends Thread {
      private final gtf.b a;
      private final InetAddress b;
      private final MulticastSocket c;

      public a(gtf.b $$0) throws IOException {
         super("LanServerDetector #" + gtf.a.incrementAndGet());
         this.a = $$0;
         this.setDaemon(true);
         this.setUncaughtExceptionHandler(new r(gtf.b));
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
               gtf.b.error("Couldn't ping server", var6);
               break;
            }

            String $$4 = new String($$1.getData(), $$1.getOffset(), $$1.getLength(), StandardCharsets.UTF_8);
            gtf.b.debug("{}: {}", $$1.getAddress(), $$4);
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
      private final List<gte> a = Lists.newArrayList();
      private boolean b;

      @Nullable
      public synchronized List<gte> a() {
         if (this.b) {
            List<gte> $$0 = List.copyOf(this.a);
            this.b = false;
            return $$0;
         } else {
            return null;
         }
      }

      public synchronized void a(String $$0, InetAddress $$1) {
         String $$2 = gtg.a($$0);
         String $$3 = gtg.b($$0);
         if ($$3 != null) {
            $$3 = $$1.getHostAddress() + ":" + $$3;
            boolean $$4 = false;

            for (gte $$5 : this.a) {
               if ($$5.b().equals($$3)) {
                  $$5.c();
                  $$4 = true;
                  break;
               }
            }

            if (!$$4) {
               this.a.add(new gte($$2, $$3));
               this.b = true;
            }
         }
      }
   }
}
