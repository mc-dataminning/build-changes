import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gri {
   static final Logger a = LogUtils.getLogger();
   final fjo b;
   volatile boolean c;
   @Nullable
   ve d;

   public gri(fjo $$0) {
      this.b = $$0;
   }

   public void a(final exp $$0, fvy $$1) {
      final fbp $$2 = fbp.Q();
      $$2.aT();
      $$2.aY().c(wg.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (gri.this.c) {
                  return;
               }

               gri.this.d = ve.a($$0, $$2.m.az(), $$2.aP().n());
               if (gri.this.c) {
                  return;
               }

               fug $$1 = new fug(gri.this.d, $$2, $$0.e($$3), gri.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.m == exp.d.b) {
                  $$1.a($$0.o);
               }

               if (gri.this.c) {
                  return;
               }

               gri.this.d.a($$3, $$4, $$1);
               if (gri.this.c) {
                  return;
               }

               gri.this.d.a(new aia($$2.X().c(), $$2.X().b()));
               $$2.a(fvm.a($$0));
               $$2.bc().a(fzj.c.c, String.valueOf($$0.a), $$0.c);
               $$2.ae().a(gri.this.d, goc.c.b);
            } catch (Exception var5) {
               $$2.ae().i();
               if (gri.this.c) {
                  return;
               }

               gri.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               grh $$5 = new grh(gri.this.b, wf.r, wg.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.i()) {
         this.d.a(wg.c("disconnect.genericReason"));
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
