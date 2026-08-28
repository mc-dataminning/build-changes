import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fzc extends gad {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long s = 2000L;
   public static final xa a = xa.c("connect.aborted");
   public static final xa b = xa.a("disconnect.genericReason", xa.c("disconnect.unknownHost"));
   @Nullable
   volatile vt u;
   @Nullable
   ChannelFuture v;
   volatile boolean w;
   final gad x;
   private xa y = xa.c("connect.connecting");
   private long z = -1L;
   final xa A;

   private fzc(gad $$0, xa $$1) {
      super(fqu.a);
      this.x = $$0;
      this.A = $$1;
   }

   public static void a(gad $$0, frd $$1, gnt $$2, gmq $$3, boolean $$4, @Nullable gmu $$5) {
      if ($$1.z instanceof fzc) {
         d.error("Attempt to connect while already connecting");
      } else {
         xa $$6;
         if ($$5 != null) {
            $$6 = wz.q;
         } else if ($$4) {
            $$6 = grg.a;
         } else {
            $$6 = wz.r;
         }

         fzc $$9 = new fzc($$0, $$6);
         if ($$5 != null) {
            $$9.a(xa.c("connect.transferring"));
         }

         $$1.y();
         $$1.aU();
         $$1.a(gnh.a($$3.b));
         $$1.bc().a(grh.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final frd $$0, final gnt $$1, final gmq $$2, @Nullable final gmu $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fzc.this.w) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = gnv.a.a($$1).map(gns::d);
               if (fzc.this.w) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fzk(fzc.this.x, fzc.this.A, fzc.b)));
                  return;
               }

               $$0 = $$1.get();
               vt $$2;
               synchronized (fzc.this) {
                  if (fzc.this.w) {
                     return;
                  }

                  $$2 = new vt(zi.b);
                  $$2.a($$0.aQ().n());
                  fzc.this.v = vt.a($$0, $$0.n.aD(), $$2);
               }

               fzc.this.v.syncUninterruptibly();
               synchronized (fzc.this) {
                  if (fzc.this.w) {
                     $$2.a(fzc.a);
                     return;
                  }

                  fzc.this.u = $$2;
                  $$0.af().a($$2, a($$2.b()));
               }

               fzc.this.u
                  .a($$0.getHostName(), $$0.getPort(), ajk.b, ajk.d, new gma(fzc.this.u, $$0, $$2, fzc.this.x, false, null, fzc.this::a, $$3), $$3 != null);
               fzc.this.u.a(new ajn($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (fzc.this.w) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fzc.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fzk(fzc.this.x, fzc.this.A, xa.a("disconnect.genericReason", $$8))));
            }
         }

         private static hod.c a(gmq.a $$0x) {
            return switch ($$0) {
               case a -> hod.c.b;
               case b -> hod.c.c;
               case c -> hod.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new s(d));
      $$4.start();
   }

   private void a(xa $$0) {
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
      this.c(ful.a(wz.e, $$0 -> {
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
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ag.c();
      if ($$4 - this.z > 2000L) {
         this.z = $$4;
         this.m.aY().c(xa.c("narrator.joining"));
      }

      $$0.a(this.p, this.y, this.n / 2, this.o / 2 - 50, 16777215);
   }
}
