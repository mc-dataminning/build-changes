import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fze extends gaf {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long s = 2000L;
   public static final xc a = xc.c("connect.aborted");
   public static final xc b = xc.a("disconnect.genericReason", xc.c("disconnect.unknownHost"));
   @Nullable
   volatile vv u;
   @Nullable
   ChannelFuture v;
   volatile boolean w;
   final gaf x;
   private xc y = xc.c("connect.connecting");
   private long z = -1L;
   final xc A;

   private fze(gaf $$0, xc $$1) {
      super(fqw.a);
      this.x = $$0;
      this.A = $$1;
   }

   public static void a(gaf $$0, frf $$1, gnv $$2, gms $$3, boolean $$4, @Nullable gmw $$5) {
      if ($$1.z instanceof fze) {
         d.error("Attempt to connect while already connecting");
      } else {
         xc $$6;
         if ($$5 != null) {
            $$6 = xb.q;
         } else if ($$4) {
            $$6 = gri.a;
         } else {
            $$6 = xb.r;
         }

         fze $$9 = new fze($$0, $$6);
         if ($$5 != null) {
            $$9.a(xc.c("connect.transferring"));
         }

         $$1.y();
         $$1.aU();
         $$1.a(gnj.a($$3.b));
         $$1.bc().a(grj.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final frf $$0, final gnv $$1, final gms $$2, @Nullable final gmw $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fze.this.w) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = gnx.a.a($$1).map(gnu::d);
               if (fze.this.w) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fzm(fze.this.x, fze.this.A, fze.b)));
                  return;
               }

               $$0 = $$1.get();
               vv $$2;
               synchronized (fze.this) {
                  if (fze.this.w) {
                     return;
                  }

                  $$2 = new vv(zk.b);
                  $$2.a($$0.aQ().n());
                  fze.this.v = vv.a($$0, $$0.n.aD(), $$2);
               }

               fze.this.v.syncUninterruptibly();
               synchronized (fze.this) {
                  if (fze.this.w) {
                     $$2.a(fze.a);
                     return;
                  }

                  fze.this.u = $$2;
                  $$0.af().a($$2, a($$2.b()));
               }

               fze.this.u
                  .a($$0.getHostName(), $$0.getPort(), ajm.b, ajm.d, new gmc(fze.this.u, $$0, $$2, fze.this.x, false, null, fze.this::a, $$3), $$3 != null);
               fze.this.u.a(new ajp($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (fze.this.w) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fze.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fzm(fze.this.x, fze.this.A, xc.a("disconnect.genericReason", $$8))));
            }
         }

         private static hof.c a(gms.a $$0x) {
            return switch ($$0) {
               case a -> hof.c.b;
               case b -> hof.c.c;
               case c -> hof.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new s(d));
      $$4.start();
   }

   private void a(xc $$0) {
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
   public boolean aH_() {
      return false;
   }

   @Override
   protected void aS_() {
      this.c(fun.a(xb.e, $$0 -> {
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
   public void a(ftz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ag.c();
      if ($$4 - this.z > 2000L) {
         this.z = $$4;
         this.m.aY().c(xc.c("narrator.joining"));
      }

      $$0.a(this.p, this.y, this.n / 2, this.o / 2 - 50, 16777215);
   }
}
