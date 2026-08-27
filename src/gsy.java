import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gsy {
   static final Logger a = LogUtils.getLogger();
   final fld b;
   volatile boolean c;
   @Nullable
   vs d;

   public gsy(fld $$0) {
      this.b = $$0;
   }

   public void a(final eze $$0, fxn $$1) {
      final fde $$2 = fde.Q();
      $$2.aU();
      $$2.aZ().c(wu.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (gsy.this.c) {
                  return;
               }

               gsy.this.d = vs.a($$0, $$2.m.az(), $$2.aQ().n());
               if (gsy.this.c) {
                  return;
               }

               fvv $$1 = new fvv(gsy.this.d, $$2, $$0.e($$3), gsy.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.m == eze.d.b) {
                  $$1.a($$0.o);
               }

               if (gsy.this.c) {
                  return;
               }

               gsy.this.d.a($$3, $$4, $$1);
               if (gsy.this.c) {
                  return;
               }

               gsy.this.d.a(new aio($$2.X().c(), $$2.X().b()));
               $$2.a(fxb.a($$0));
               $$2.bd().a(gay.c.c, String.valueOf($$0.a), $$0.c);
               $$2.ae().a(gsy.this.d, gps.c.b);
            } catch (Exception var5) {
               $$2.ae().i();
               if (gsy.this.c) {
                  return;
               }

               gsy.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               gsx $$5 = new gsx(gsy.this.b, wt.r, wu.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.i()) {
         this.d.a(wu.c("disconnect.genericReason"));
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
