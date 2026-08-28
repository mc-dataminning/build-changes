import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hdh {
   static final Logger a = LogUtils.getLogger();
   final fqd b;
   volatile boolean c;
   @Nullable
   vx d;

   public hdh(fqd $$0) {
      this.b = $$0;
   }

   public void a(final fel $$0, gcy $$1) {
      final fil $$2 = fil.Q();
      $$2.aV();
      $$2.aZ().c(xd.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (hdh.this.c) {
                  return;
               }

               hdh.this.d = vx.a($$0, $$2.n.aC(), $$2.aR().n());
               if (hdh.this.c) {
                  return;
               }

               gbg $$1 = new gbg(hdh.this.d, $$2, $$0.e($$3), hdh.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.i()) {
                  $$1.a($$0.o);
               }

               if (hdh.this.c) {
                  return;
               }

               hdh.this.d.a($$3, $$4, $$1);
               if (hdh.this.c) {
                  return;
               }

               hdh.this.d.a(new aji($$2.X().c(), $$2.X().b()));
               $$2.a(gcm.a($$0));
               $$2.bd().a(ggk.c.c, String.valueOf($$0.a), $$0.c);
               $$2.af().a(hdh.this.d, hab.c.b);
            } catch (Exception var5) {
               $$2.af().i();
               if (hdh.this.c) {
                  return;
               }

               hdh.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               hdg $$5 = new hdg(hdh.this.b, xc.r, xd.a("disconnect.genericReason", $$3));
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
