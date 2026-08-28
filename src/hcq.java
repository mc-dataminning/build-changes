import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hcq {
   static final Logger a = LogUtils.getLogger();
   final fpt b;
   volatile boolean c;
   @Nullable
   vx d;

   public hcq(fpt $$0) {
      this.b = $$0;
   }

   public void a(final feb $$0, gco $$1) {
      final fib $$2 = fib.Q();
      $$2.aU();
      $$2.aY().c(xd.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (hcq.this.c) {
                  return;
               }

               hcq.this.d = vx.a($$0, $$2.n.aC(), $$2.aQ().n());
               if (hcq.this.c) {
                  return;
               }

               gaw $$1 = new gaw(hcq.this.d, $$2, $$0.e($$3), hcq.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.i()) {
                  $$1.a($$0.o);
               }

               if (hcq.this.c) {
                  return;
               }

               hcq.this.d.a($$3, $$4, $$1);
               if (hcq.this.c) {
                  return;
               }

               hcq.this.d.a(new aji($$2.X().c(), $$2.X().b()));
               $$2.a(gcc.a($$0));
               $$2.bc().a(gga.c.c, String.valueOf($$0.a), $$0.c);
               $$2.ae().a(hcq.this.d, gzk.c.b);
            } catch (Exception var5) {
               $$2.ae().i();
               if (hcq.this.c) {
                  return;
               }

               hcq.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               hcp $$5 = new hcp(hcq.this.b, xc.r, xd.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.i()) {
         this.d.a(xd.c("disconnect.genericReason"));
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
