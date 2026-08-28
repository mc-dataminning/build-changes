import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hfc {
   static final Logger a = LogUtils.getLogger();
   final frp b;
   volatile boolean c;
   @Nullable
   wf d;

   public hfc(frp $$0) {
      this.b = $$0;
   }

   public void a(final fgb $$0, gep $$1) {
      final fjx $$2 = fjx.Q();
      $$2.aV();
      $$2.aZ().c(xl.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (hfc.this.c) {
                  return;
               }

               hfc.this.d = wf.a($$0, $$2.n.aC(), $$2.aQ().n());
               if (hfc.this.c) {
                  return;
               }

               gcx $$1 = new gcx(hfc.this.d, $$2, $$0.e($$3), hfc.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.i()) {
                  $$1.a($$0.o);
               }

               if (hfc.this.c) {
                  return;
               }

               hfc.this.d.a($$3, $$4, $$1);
               if (hfc.this.c) {
                  return;
               }

               hfc.this.d.a(new ajq($$2.X().c(), $$2.X().b()));
               $$2.a(ged.a($$0));
               $$2.bd().a(gib.c.c, String.valueOf($$0.a), $$0.c);
               $$2.af().a(hfc.this.d, hbw.c.b);
            } catch (Exception var5) {
               $$2.af().i();
               if (hfc.this.c) {
                  return;
               }

               hfc.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               hfb $$5 = new hfb(hfc.this.b, xk.r, xl.a("disconnect.genericReason", $$3));
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
