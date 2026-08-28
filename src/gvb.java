import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gvb {
   static final Logger a = LogUtils.getLogger();
   final fnb b;
   volatile boolean c;
   @Nullable
   wj d;

   public gvb(fnb $$0) {
      this.b = $$0;
   }

   public void a(final fbd $$0, fzk $$1) {
      final ffd $$2 = ffd.Q();
      $$2.aT();
      $$2.aX().c(xo.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (gvb.this.c) {
                  return;
               }

               gvb.this.d = wj.a($$0, $$2.m.az(), $$2.aP().n());
               if (gvb.this.c) {
                  return;
               }

               fxs $$1 = new fxs(gvb.this.d, $$2, $$0.e($$3), gvb.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.m == fbd.d.b) {
                  $$1.a($$0.o);
               }

               if (gvb.this.c) {
                  return;
               }

               gvb.this.d.a($$3, $$4, $$1);
               if (gvb.this.c) {
                  return;
               }

               gvb.this.d.a(new ajl($$2.X().c(), $$2.X().b()));
               $$2.a(fyy.a($$0));
               $$2.bb().a(gcw.c.c, String.valueOf($$0.a), $$0.c);
               $$2.ae().a(gvb.this.d, grr.c.b);
            } catch (Exception var5) {
               $$2.ae().i();
               if (gvb.this.c) {
                  return;
               }

               gvb.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               gva $$5 = new gva(gvb.this.b, xn.r, xo.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.i()) {
         this.d.a(xo.c("disconnect.genericReason"));
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
