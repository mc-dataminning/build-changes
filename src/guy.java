import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class guy {
   static final Logger a = LogUtils.getLogger();
   final fmy b;
   volatile boolean c;
   @Nullable
   wj d;

   public guy(fmy $$0) {
      this.b = $$0;
   }

   public void a(final fba $$0, fzh $$1) {
      final ffa $$2 = ffa.Q();
      $$2.aT();
      $$2.aX().c(xl.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (guy.this.c) {
                  return;
               }

               guy.this.d = wj.a($$0, $$2.m.az(), $$2.aP().n());
               if (guy.this.c) {
                  return;
               }

               fxp $$1 = new fxp(guy.this.d, $$2, $$0.e($$3), guy.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.m == fba.d.b) {
                  $$1.a($$0.o);
               }

               if (guy.this.c) {
                  return;
               }

               guy.this.d.a($$3, $$4, $$1);
               if (guy.this.c) {
                  return;
               }

               guy.this.d.a(new aji($$2.X().c(), $$2.X().b()));
               $$2.a(fyv.a($$0));
               $$2.bb().a(gct.c.c, String.valueOf($$0.a), $$0.c);
               $$2.ae().a(guy.this.d, gro.c.b);
            } catch (Exception var5) {
               $$2.ae().i();
               if (guy.this.c) {
                  return;
               }

               guy.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               gux $$5 = new gux(guy.this.b, xk.r, xl.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.i()) {
         this.d.a(xl.c("disconnect.genericReason"));
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
