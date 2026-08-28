import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gve {
   static final Logger a = LogUtils.getLogger();
   final fne b;
   volatile boolean c;
   @Nullable
   wk d;

   public gve(fne $$0) {
      this.b = $$0;
   }

   public void a(final fbg $$0, fzn $$1) {
      final ffg $$2 = ffg.Q();
      $$2.aT();
      $$2.aX().c(xp.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (gve.this.c) {
                  return;
               }

               gve.this.d = wk.a($$0, $$2.m.az(), $$2.aP().n());
               if (gve.this.c) {
                  return;
               }

               fxv $$1 = new fxv(gve.this.d, $$2, $$0.e($$3), gve.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.m == fbg.d.b) {
                  $$1.a($$0.o);
               }

               if (gve.this.c) {
                  return;
               }

               gve.this.d.a($$3, $$4, $$1);
               if (gve.this.c) {
                  return;
               }

               gve.this.d.a(new ajm($$2.X().c(), $$2.X().b()));
               $$2.a(fzb.a($$0));
               $$2.bb().a(gcz.c.c, String.valueOf($$0.a), $$0.c);
               $$2.ae().a(gve.this.d, gru.c.b);
            } catch (Exception var5) {
               $$2.ae().i();
               if (gve.this.c) {
                  return;
               }

               gve.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               gvd $$5 = new gvd(gve.this.b, xo.r, xp.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.i()) {
         this.d.a(xp.c("disconnect.genericReason"));
         this.d.n();
      }
   }

   public void b() {
      if (this.d != null) {
         if (this.d.i()) {
            this.d.b();
         } else {
            this.d.n();
         }
      }
   }
}
