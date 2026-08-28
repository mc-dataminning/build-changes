import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hnc {
   static final Logger a = LogUtils.getLogger();
   final fwf b;
   volatile boolean c;
   @Nullable
   vo d;

   public hnc(fwf $$0) {
      this.b = $$0;
   }

   public void a(final fjf $$0, gjr $$1) {
      final fnd $$2 = fnd.Q();
      $$2.aU();
      $$2.aY().c(wv.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (hnc.this.c) {
                  return;
               }

               hnc.this.d = vo.a($$0, $$2.n.aD(), $$2.aQ().n());
               if (hnc.this.c) {
                  return;
               }

               ghy $$1 = new ghy(hnc.this.d, $$2, $$0.e($$3), hnc.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.i()) {
                  $$1.a($$0.q);
               }

               if (hnc.this.c) {
                  return;
               }

               hnc.this.d.a($$3, $$4, $$1);
               if (hnc.this.c) {
                  return;
               }

               hnc.this.d.a(new aji($$2.X().c(), $$2.X().b()));
               $$2.a(gjf.a($$0));
               $$2.bc().a(gne.c.c, String.valueOf($$0.a), Objects.requireNonNullElse($$0.c, "unknown"));
               $$2.af().a(hnc.this.d, hjv.c.b);
            } catch (Exception var5) {
               $$2.af().i();
               if (hnc.this.c) {
                  return;
               }

               hnc.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               hnb $$5 = new hnb(hnc.this.b, wu.r, wv.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.i()) {
         this.d.a(wv.c("disconnect.genericReason"));
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
