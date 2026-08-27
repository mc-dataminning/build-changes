import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gsn {
   static final Logger a = LogUtils.getLogger();
   final fkt b;
   volatile boolean c;
   @Nullable
   vq d;

   public gsn(fkt $$0) {
      this.b = $$0;
   }

   public void a(final eyu $$0, fxd $$1) {
      final fcu $$2 = fcu.Q();
      $$2.aT();
      $$2.aY().c(ws.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (gsn.this.c) {
                  return;
               }

               gsn.this.d = vq.a($$0, $$2.m.az(), $$2.aP().n());
               if (gsn.this.c) {
                  return;
               }

               fvl $$1 = new fvl(gsn.this.d, $$2, $$0.e($$3), gsn.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.m == eyu.d.b) {
                  $$1.a($$0.o);
               }

               if (gsn.this.c) {
                  return;
               }

               gsn.this.d.a($$3, $$4, $$1);
               if (gsn.this.c) {
                  return;
               }

               gsn.this.d.a(new aim($$2.X().c(), $$2.X().b()));
               $$2.a(fwr.a($$0));
               $$2.bc().a(gao.c.c, String.valueOf($$0.a), $$0.c);
               $$2.ae().a(gsn.this.d, gph.c.b);
            } catch (Exception var5) {
               $$2.ae().i();
               if (gsn.this.c) {
                  return;
               }

               gsn.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               gsm $$5 = new gsm(gsn.this.b, wr.r, ws.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.i()) {
         this.d.a(ws.c("disconnect.genericReason"));
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
