import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hhu {
   static final Logger a = LogUtils.getLogger();
   final fty b;
   volatile boolean c;
   @Nullable
   wp d;

   public hhu(fty $$0) {
      this.b = $$0;
   }

   public void a(final fij $$0, ghc $$1) {
      final fmg $$2 = fmg.Q();
      $$2.aV();
      $$2.aZ().c(xv.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (hhu.this.c) {
                  return;
               }

               hhu.this.d = wp.a($$0, $$2.n.aD(), $$2.aQ().n());
               if (hhu.this.c) {
                  return;
               }

               gfj $$1 = new gfj(hhu.this.d, $$2, $$0.e($$3), hhu.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.i()) {
                  $$1.a($$0.q);
               }

               if (hhu.this.c) {
                  return;
               }

               hhu.this.d.a($$3, $$4, $$1);
               if (hhu.this.c) {
                  return;
               }

               hhu.this.d.a(new ake($$2.X().c(), $$2.X().b()));
               $$2.a(ggq.a($$0));
               $$2.bd().a(gkp.c.c, String.valueOf($$0.a), Objects.requireNonNullElse($$0.c, "unknown"));
               $$2.af().a(hhu.this.d, heo.c.b);
            } catch (Exception var5) {
               $$2.af().i();
               if (hhu.this.c) {
                  return;
               }

               hhu.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               hht $$5 = new hht(hhu.this.b, xu.r, xv.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.i()) {
         this.d.a(xv.c("disconnect.genericReason"));
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
