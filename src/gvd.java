import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gvd {
   static final Logger a = LogUtils.getLogger();
   final fnd b;
   volatile boolean c;
   @Nullable
   wk d;

   public gvd(fnd $$0) {
      this.b = $$0;
   }

   public void a(final fbf $$0, fzm $$1) {
      final fff $$2 = fff.Q();
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
               if (gvd.this.c) {
                  return;
               }

               gvd.this.d = wk.a($$0, $$2.m.az(), $$2.aP().n());
               if (gvd.this.c) {
                  return;
               }

               fxu $$1 = new fxu(gvd.this.d, $$2, $$0.e($$3), gvd.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.m == fbf.d.b) {
                  $$1.a($$0.o);
               }

               if (gvd.this.c) {
                  return;
               }

               gvd.this.d.a($$3, $$4, $$1);
               if (gvd.this.c) {
                  return;
               }

               gvd.this.d.a(new ajm($$2.X().c(), $$2.X().b()));
               $$2.a(fza.a($$0));
               $$2.bb().a(gcy.c.c, String.valueOf($$0.a), $$0.c);
               $$2.ae().a(gvd.this.d, grt.c.b);
            } catch (Exception var5) {
               $$2.ae().i();
               if (gvd.this.c) {
                  return;
               }

               gvd.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               gvc $$5 = new gvc(gvd.this.b, xo.r, xp.a("disconnect.genericReason", $$3));
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
