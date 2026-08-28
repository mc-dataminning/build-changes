import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fwh extends fxi {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long s = 2000L;
   public static final ww a = ww.c("connect.aborted");
   public static final ww b = ww.a("disconnect.genericReason", ww.c("disconnect.unknownHost"));
   @Nullable
   volatile vp u;
   @Nullable
   ChannelFuture v;
   volatile boolean w;
   final fxi x;
   private ww y = ww.c("connect.connecting");
   private long z = -1L;
   final ww A;

   private fwh(fxi $$0, ww $$1) {
      super(fnw.a);
      this.x = $$0;
      this.A = $$1;
   }

   public static void a(fxi $$0, fof $$1, gkv $$2, gjs $$3, boolean $$4, @Nullable gjw $$5) {
      if ($$1.z instanceof fwh) {
         d.error("Attempt to connect while already connecting");
      } else {
         ww $$6;
         if ($$5 != null) {
            $$6 = wv.q;
         } else if ($$4) {
            $$6 = goh.a;
         } else {
            $$6 = wv.r;
         }

         fwh $$9 = new fwh($$0, $$6);
         if ($$5 != null) {
            $$9.a(ww.c("connect.transferring"));
         }

         $$1.y();
         $$1.aU();
         $$1.a(gkj.a($$3.b));
         $$1.bc().a(goi.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final fof $$0, final gkv $$1, final gjs $$2, @Nullable final gjw $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fwh.this.w) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = gkx.a.a($$1).map(gku::d);
               if (fwh.this.w) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fwp(fwh.this.x, fwh.this.A, fwh.b)));
                  return;
               }

               $$0 = $$1.get();
               vp $$2;
               synchronized (fwh.this) {
                  if (fwh.this.w) {
                     return;
                  }

                  $$2 = new vp(ze.b);
                  $$2.a($$0.aQ().n());
                  fwh.this.v = vp.a($$0, $$0.n.aD(), $$2);
               }

               fwh.this.v.syncUninterruptibly();
               synchronized (fwh.this) {
                  if (fwh.this.w) {
                     $$2.a(fwh.a);
                     return;
                  }

                  fwh.this.u = $$2;
                  $$0.af().a($$2, a($$2.b()));
               }

               fwh.this.u
                  .a($$0.getHostName(), $$0.getPort(), ajg.b, ajg.d, new gjc(fwh.this.u, $$0, $$2, fwh.this.x, false, null, fwh.this::a, $$3), $$3 != null);
               fwh.this.u.a(new ajj($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (fwh.this.w) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fwh.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fwp(fwh.this.x, fwh.this.A, ww.a("disconnect.genericReason", $$8))));
            }
         }

         private static hlc.c a(gjs.a $$0x) {
            return switch ($$0) {
               case a -> hlc.c.b;
               case b -> hlc.c.c;
               case c -> hlc.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(d));
      $$4.start();
   }

   private void a(ww $$0) {
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
      this.c(frq.a(wv.e, $$0 -> {
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
   public void a(frc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = af.c();
      if ($$4 - this.z > 2000L) {
         this.z = $$4;
         this.m.aY().c(ww.c("narrator.joining"));
      }

      $$0.a(this.p, this.y, this.n / 2, this.o / 2 - 50, 16777215);
   }
}
