import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class heb {
   static final Logger a = LogUtils.getLogger();
   final fqs b;
   volatile boolean c;
   @Nullable
   wb d;

   public heb(fqs $$0) {
      this.b = $$0;
   }

   public void a(final ffa $$0, gdo $$1) {
      final fja $$2 = fja.Q();
      $$2.aW();
      $$2.ba().c(xh.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (heb.this.c) {
                  return;
               }

               heb.this.d = wb.a($$0, $$2.n.aC(), $$2.aR().n());
               if (heb.this.c) {
                  return;
               }

               gbw $$1 = new gbw(heb.this.d, $$2, $$0.e($$3), heb.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.i()) {
                  $$1.a($$0.o);
               }

               if (heb.this.c) {
                  return;
               }

               heb.this.d.a($$3, $$4, $$1);
               if (heb.this.c) {
                  return;
               }

               heb.this.d.a(new ajm($$2.X().c(), $$2.X().b()));
               $$2.a(gdc.a($$0));
               $$2.be().a(gha.c.c, String.valueOf($$0.a), $$0.c);
               $$2.af().a(heb.this.d, hav.c.b);
            } catch (Exception var5) {
               $$2.af().i();
               if (heb.this.c) {
                  return;
               }

               heb.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               hea $$5 = new hea(heb.this.b, xg.r, xh.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.i()) {
         this.d.a(xh.c("disconnect.genericReason"));
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
