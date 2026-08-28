import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hld {
   static final Logger a = LogUtils.getLogger();
   final fum b;
   volatile boolean c;
   @Nullable
   vi d;

   public hld(fum $$0) {
      this.b = $$0;
   }

   public void a(final fhm $$0, ghs $$1) {
      final flk $$2 = flk.Q();
      $$2.aU();
      $$2.aY().c(wp.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (hld.this.c) {
                  return;
               }

               hld.this.d = vi.a($$0, $$2.n.aD(), $$2.aQ().n());
               if (hld.this.c) {
                  return;
               }

               gfz $$1 = new gfz(hld.this.d, $$2, $$0.e($$3), hld.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.i()) {
                  $$1.a($$0.q);
               }

               if (hld.this.c) {
                  return;
               }

               hld.this.d.a($$3, $$4, $$1);
               if (hld.this.c) {
                  return;
               }

               hld.this.d.a(new aja($$2.X().c(), $$2.X().b()));
               $$2.a(ghg.a($$0));
               $$2.bc().a(glf.c.c, String.valueOf($$0.a), Objects.requireNonNullElse($$0.c, "unknown"));
               $$2.af().a(hld.this.d, hhw.c.b);
            } catch (Exception var5) {
               $$2.af().i();
               if (hld.this.c) {
                  return;
               }

               hld.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               hlc $$5 = new hlc(hld.this.b, wo.r, wp.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.i()) {
         this.d.a(wp.c("disconnect.genericReason"));
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
