import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fwt extends fxu {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long s = 2000L;
   public static final wy a = wy.c("connect.aborted");
   public static final wy b = wy.a("disconnect.genericReason", wy.c("disconnect.unknownHost"));
   @Nullable
   volatile vr u;
   @Nullable
   ChannelFuture v;
   volatile boolean w;
   final fxu x;
   private wy y = wy.c("connect.connecting");
   private long z = -1L;
   final wy A;

   private fwt(fxu $$0, wy $$1) {
      super(foi.a);
      this.x = $$0;
      this.A = $$1;
   }

   public static void a(fxu $$0, fos $$1, glj $$2, gkg $$3, boolean $$4, @Nullable gkk $$5) {
      if ($$1.z instanceof fwt) {
         d.error("Attempt to connect while already connecting");
      } else {
         wy $$6;
         if ($$5 != null) {
            $$6 = wx.q;
         } else if ($$4) {
            $$6 = gow.a;
         } else {
            $$6 = wx.r;
         }

         fwt $$9 = new fwt($$0, $$6);
         if ($$5 != null) {
            $$9.a(wy.c("connect.transferring"));
         }

         $$1.y();
         $$1.aU();
         $$1.a(gkx.a($$3.b));
         $$1.bc().a(gox.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final fos $$0, final glj $$1, final gkg $$2, @Nullable final gkk $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fwt.this.w) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = gll.a.a($$1).map(gli::d);
               if (fwt.this.w) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fxb(fwt.this.x, fwt.this.A, fwt.b)));
                  return;
               }

               $$0 = $$1.get();
               vr $$2;
               synchronized (fwt.this) {
                  if (fwt.this.w) {
                     return;
                  }

                  $$2 = new vr(zg.b);
                  $$2.a($$0.aQ().n());
                  fwt.this.v = vr.a($$0, $$0.n.aD(), $$2);
               }

               fwt.this.v.syncUninterruptibly();
               synchronized (fwt.this) {
                  if (fwt.this.w) {
                     $$2.a(fwt.a);
                     return;
                  }

                  fwt.this.u = $$2;
                  $$0.af().a($$2, a($$2.b()));
               }

               fwt.this.u
                  .a($$0.getHostName(), $$0.getPort(), aji.b, aji.d, new gjq(fwt.this.u, $$0, $$2, fwt.this.x, false, null, fwt.this::a, $$3), $$3 != null);
               fwt.this.u.a(new ajl($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (fwt.this.w) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fwt.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fxb(fwt.this.x, fwt.this.A, wy.a("disconnect.genericReason", $$8))));
            }
         }

         private static hls.c a(gkg.a $$0x) {
            return switch ($$0) {
               case a -> hls.c.b;
               case b -> hls.c.c;
               case c -> hls.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(d));
      $$4.start();
   }

   private void a(wy $$0) {
      this.y = $$0;
   }

   @Override
   public void e() {
      if (this.u != null) {
         if (this.u.i()) {
            this.u.b();
         } else {
            this.u.n();
         }
      }
   }

   @Override
   public boolean aC_() {
      return false;
   }

   @Override
   protected void aN_() {
      this.c(fsc.a(wx.e, $$0 -> {
         synchronized (this) {
            this.w = true;
            if (this.v != null) {
               this.v.cancel(true);
               this.v = null;
            }

            if (this.u != null) {
               this.u.a(a);
            }
         }

         this.m.a(this.x);
      }).a(this.n / 2 - 100, this.o / 4 + 120 + 12, 200, 20).a());
   }

   @Override
   public void a(fro $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = af.c();
      if ($$4 - this.z > 2000L) {
         this.z = $$4;
         this.m.aY().c(wy.c("narrator.joining"));
      }

      $$0.a(this.p, this.y, this.n / 2, this.o / 2 - 50, 16777215);
   }
}
