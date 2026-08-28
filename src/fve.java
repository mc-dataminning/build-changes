import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fve extends fwf {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long s = 2000L;
   public static final wv a = wv.c("connect.aborted");
   public static final wv b = wv.a("disconnect.genericReason", wv.c("disconnect.unknownHost"));
   @Nullable
   volatile vo u;
   @Nullable
   ChannelFuture v;
   volatile boolean w;
   final fwf x;
   private wv y = wv.c("connect.connecting");
   private long z = -1L;
   final wv A;

   private fve(fwf $$0, wv $$1) {
      super(fmu.a);
      this.x = $$0;
      this.A = $$1;
   }

   public static void a(fwf $$0, fnd $$1, gjr $$2, gio $$3, boolean $$4, @Nullable gis $$5) {
      if ($$1.z instanceof fve) {
         d.error("Attempt to connect while already connecting");
      } else {
         wv $$6;
         if ($$5 != null) {
            $$6 = wu.q;
         } else if ($$4) {
            $$6 = gnd.a;
         } else {
            $$6 = wu.r;
         }

         fve $$9 = new fve($$0, $$6);
         if ($$5 != null) {
            $$9.a(wv.c("connect.transferring"));
         }

         $$1.y();
         $$1.aU();
         $$1.a(gjf.a($$3.b));
         $$1.bc().a(gne.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final fnd $$0, final gjr $$1, final gio $$2, @Nullable final gis $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fve.this.w) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = gjt.a.a($$1).map(gjq::d);
               if (fve.this.w) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fvm(fve.this.x, fve.this.A, fve.b)));
                  return;
               }

               $$0 = $$1.get();
               vo $$2;
               synchronized (fve.this) {
                  if (fve.this.w) {
                     return;
                  }

                  $$2 = new vo(zd.b);
                  $$2.a($$0.aQ().n());
                  fve.this.v = vo.a($$0, $$0.n.aD(), $$2);
               }

               fve.this.v.syncUninterruptibly();
               synchronized (fve.this) {
                  if (fve.this.w) {
                     $$2.a(fve.a);
                     return;
                  }

                  fve.this.u = $$2;
                  $$0.af().a($$2, a($$2.b()));
               }

               fve.this.u
                  .a($$0.getHostName(), $$0.getPort(), ajf.b, ajf.d, new ghy(fve.this.u, $$0, $$2, fve.this.x, false, null, fve.this::a, $$3), $$3 != null);
               fve.this.u.a(new aji($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (fve.this.w) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fve.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fvm(fve.this.x, fve.this.A, wv.a("disconnect.genericReason", $$8))));
            }
         }

         private static hjv.c a(gio.a $$0x) {
            return switch ($$0) {
               case a -> hjv.c.b;
               case b -> hjv.c.c;
               case c -> hjv.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(d));
      $$4.start();
   }

   private void a(wv $$0) {
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
      this.c(fqn.a(wu.e, $$0 -> {
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
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = af.c();
      if ($$4 - this.z > 2000L) {
         this.z = $$4;
         this.m.aY().c(wv.c("narrator.joining"));
      }

      $$0.a(this.p, this.y, this.n / 2, this.o / 2 - 50, 16777215);
   }
}
