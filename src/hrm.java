import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hrm {
   static final Logger a = LogUtils.getLogger();
   final gaf b;
   volatile boolean c;
   @Nullable
   vv d;

   public hrm(gaf $$0) {
      this.b = $$0;
   }

   public void a(final fng $$0, gnv $$1) {
      final frf $$2 = frf.Q();
      $$2.aU();
      $$2.aY().c(xc.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (hrm.this.c) {
                  return;
               }

               hrm.this.d = vv.a($$0, $$2.n.aD(), $$2.aQ().n());
               if (hrm.this.c) {
                  return;
               }

               gmc $$1 = new gmc(hrm.this.d, $$2, $$0.e($$3), hrm.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.i()) {
                  $$1.a($$0.q);
               }

               if (hrm.this.c) {
                  return;
               }

               hrm.this.d.a($$3, $$4, $$1);
               if (hrm.this.c) {
                  return;
               }

               hrm.this.d.a(new ajp($$2.X().c(), $$2.X().b()));
               $$2.a(gnj.a($$0));
               $$2.bc().a(grj.c.c, String.valueOf($$0.a), Objects.requireNonNullElse($$0.c, "unknown"));
               $$2.af().a(hrm.this.d, hof.c.b);
            } catch (Exception var5) {
               $$2.af().i();
               if (hrm.this.c) {
                  return;
               }

               hrm.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               hrl $$5 = new hrl(hrm.this.b, xb.r, xc.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.i()) {
         this.d.a(xc.c("disconnect.genericReason"));
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
