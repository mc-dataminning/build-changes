import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hra {
   static final Logger a = LogUtils.getLogger();
   final fzq b;
   volatile boolean c;
   @Nullable
   vv d;

   public hra(fzq $$0) {
      this.b = $$0;
   }

   public void a(final fmr $$0, gng $$1) {
      final fqq $$2 = fqq.Q();
      $$2.aU();
      $$2.aY().c(xg.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (hra.this.c) {
                  return;
               }

               hra.this.d = vv.a($$0, $$2.n.aD(), $$2.aQ().n());
               if (hra.this.c) {
                  return;
               }

               gln $$1 = new gln(hra.this.d, $$2, $$0.e($$3), hra.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.i()) {
                  $$1.a($$0.q);
               }

               if (hra.this.c) {
                  return;
               }

               hra.this.d.a($$3, $$4, $$1);
               if (hra.this.c) {
                  return;
               }

               hra.this.d.a(new ajw($$2.X().c(), $$2.X().b()));
               $$2.a(gmu.a($$0));
               $$2.bc().a(gqu.c.c, String.valueOf($$0.a), Objects.requireNonNullElse($$0.c, "unknown"));
               $$2.af().a(hra.this.d, hnt.c.b);
            } catch (Exception var5) {
               $$2.af().i();
               if (hra.this.c) {
                  return;
               }

               hra.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               hqz $$5 = new hqz(hra.this.b, xf.r, xg.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.i()) {
         this.d.a(xg.c("disconnect.genericReason"));
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
