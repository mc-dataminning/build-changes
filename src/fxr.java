import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fxr extends fys {
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
   final fys x;
   private wy y = wy.c("connect.connecting");
   private long z = -1L;
   final wy A;

   private fxr(fys $$0, wy $$1) {
      super(fpk.a);
      this.x = $$0;
      this.A = $$1;
   }

   public static void a(fys $$0, fpt $$1, gmi $$2, glf $$3, boolean $$4, @Nullable glj $$5) {
      if ($$1.z instanceof fxr) {
         d.error("Attempt to connect while already connecting");
      } else {
         wy $$6;
         if ($$5 != null) {
            $$6 = wx.q;
         } else if ($$4) {
            $$6 = gpv.a;
         } else {
            $$6 = wx.r;
         }

         fxr $$9 = new fxr($$0, $$6);
         if ($$5 != null) {
            $$9.a(wy.c("connect.transferring"));
         }

         $$1.y();
         $$1.aU();
         $$1.a(glw.a($$3.b));
         $$1.bc().a(gpw.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final fpt $$0, final gmi $$1, final glf $$2, @Nullable final glj $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fxr.this.w) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = gmk.a.a($$1).map(gmh::d);
               if (fxr.this.w) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fxz(fxr.this.x, fxr.this.A, fxr.b)));
                  return;
               }

               $$0 = $$1.get();
               vr $$2;
               synchronized (fxr.this) {
                  if (fxr.this.w) {
                     return;
                  }

                  $$2 = new vr(zg.b);
                  $$2.a($$0.aQ().n());
                  fxr.this.v = vr.a($$0, $$0.n.aD(), $$2);
               }

               fxr.this.v.syncUninterruptibly();
               synchronized (fxr.this) {
                  if (fxr.this.w) {
                     $$2.a(fxr.a);
                     return;
                  }

                  fxr.this.u = $$2;
                  $$0.af().a($$2, a($$2.b()));
               }

               fxr.this.u
                  .a($$0.getHostName(), $$0.getPort(), aji.b, aji.d, new gkp(fxr.this.u, $$0, $$2, fxr.this.x, false, null, fxr.this::a, $$3), $$3 != null);
               fxr.this.u.a(new ajl($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (fxr.this.w) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fxr.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fxz(fxr.this.x, fxr.this.A, wy.a("disconnect.genericReason", $$8))));
            }
         }

         private static hmu.c a(glf.a $$0x) {
            return switch ($$0) {
               case a -> hmu.c.b;
               case b -> hmu.c.c;
               case c -> hmu.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new s(d));
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
   public boolean aD_() {
      return false;
   }

   @Override
   protected void aO_() {
      this.c(fta.a(wx.e, $$0 -> {
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
   public void a(fsm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ag.c();
      if ($$4 - this.z > 2000L) {
         this.z = $$4;
         this.m.aY().c(wy.c("narrator.joining"));
      }

      $$0.a(this.p, this.y, this.n / 2, this.o / 2 - 50, 16777215);
   }
}
