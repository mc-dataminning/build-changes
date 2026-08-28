import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fyp extends fzq {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long s = 2000L;
   public static final xg a = xg.c("connect.aborted");
   public static final xg b = xg.a("disconnect.genericReason", xg.c("disconnect.unknownHost"));
   @Nullable
   volatile vv u;
   @Nullable
   ChannelFuture v;
   volatile boolean w;
   final fzq x;
   private xg y = xg.c("connect.connecting");
   private long z = -1L;
   final xg A;

   private fyp(fzq $$0, xg $$1) {
      super(fqh.a);
      this.x = $$0;
      this.A = $$1;
   }

   public static void a(fzq $$0, fqq $$1, gng $$2, gmd $$3, boolean $$4, @Nullable gmh $$5) {
      if ($$1.z instanceof fyp) {
         d.error("Attempt to connect while already connecting");
      } else {
         xg $$6;
         if ($$5 != null) {
            $$6 = xf.q;
         } else if ($$4) {
            $$6 = gqt.a;
         } else {
            $$6 = xf.r;
         }

         fyp $$9 = new fyp($$0, $$6);
         if ($$5 != null) {
            $$9.a(xg.c("connect.transferring"));
         }

         $$1.y();
         $$1.aU();
         $$1.a(gmu.a($$3.b));
         $$1.bc().a(gqu.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final fqq $$0, final gng $$1, final gmd $$2, @Nullable final gmh $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fyp.this.w) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = gni.a.a($$1).map(gnf::d);
               if (fyp.this.w) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fyx(fyp.this.x, fyp.this.A, fyp.b)));
                  return;
               }

               $$0 = $$1.get();
               vv $$2;
               synchronized (fyp.this) {
                  if (fyp.this.w) {
                     return;
                  }

                  $$2 = new vv(zp.b);
                  $$2.a($$0.aQ().n());
                  fyp.this.v = vv.a($$0, $$0.n.aD(), $$2);
               }

               fyp.this.v.syncUninterruptibly();
               synchronized (fyp.this) {
                  if (fyp.this.w) {
                     $$2.a(fyp.a);
                     return;
                  }

                  fyp.this.u = $$2;
                  $$0.af().a($$2, a($$2.b()));
               }

               fyp.this.u
                  .a($$0.getHostName(), $$0.getPort(), ajt.b, ajt.d, new gln(fyp.this.u, $$0, $$2, fyp.this.x, false, null, fyp.this::a, $$3), $$3 != null);
               fyp.this.u.a(new ajw($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (fyp.this.w) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fyp.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fyx(fyp.this.x, fyp.this.A, xg.a("disconnect.genericReason", $$8))));
            }
         }

         private static hnt.c a(gmd.a $$0x) {
            return switch ($$0) {
               case a -> hnt.c.b;
               case b -> hnt.c.c;
               case c -> hnt.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new s(d));
      $$4.start();
   }

   private void a(xg $$0) {
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
   public boolean aD_() {
      return false;
   }

   @Override
   protected void aO_() {
      this.c(fty.a(xf.e, $$0 -> {
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
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ag.c();
      if ($$4 - this.z > 2000L) {
         this.z = $$4;
         this.m.aY().c(xg.c("narrator.joining"));
      }

      $$0.a(this.p, this.y, this.n / 2, this.o / 2 - 50, 16777215);
   }
}
