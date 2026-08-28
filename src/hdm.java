import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hdm {
   static final Logger a = LogUtils.getLogger();
   final fqh b;
   volatile boolean c;
   @Nullable
   vy d;

   public hdm(fqh $$0) {
      this.b = $$0;
   }

   public void a(final fep $$0, gdd $$1) {
      final fip $$2 = fip.Q();
      $$2.aV();
      $$2.aZ().c(xe.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (hdm.this.c) {
                  return;
               }

               hdm.this.d = vy.a($$0, $$2.n.aC(), $$2.aR().n());
               if (hdm.this.c) {
                  return;
               }

               gbl $$1 = new gbl(hdm.this.d, $$2, $$0.e($$3), hdm.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.i()) {
                  $$1.a($$0.o);
               }

               if (hdm.this.c) {
                  return;
               }

               hdm.this.d.a($$3, $$4, $$1);
               if (hdm.this.c) {
                  return;
               }

               hdm.this.d.a(new ajj($$2.X().c(), $$2.X().b()));
               $$2.a(gcr.a($$0));
               $$2.bd().a(ggp.c.c, String.valueOf($$0.a), $$0.c);
               $$2.af().a(hdm.this.d, hag.c.b);
            } catch (Exception var5) {
               $$2.af().i();
               if (hdm.this.c) {
                  return;
               }

               hdm.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               hdl $$5 = new hdl(hdm.this.b, xd.r, xe.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.i()) {
         this.d.a(xe.c("disconnect.genericReason"));
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
