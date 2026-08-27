import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gms {
   static final Logger a = LogUtils.getLogger();
   final ffe b;
   volatile boolean c;
   @Nullable
   uo d;

   public gms(ffe $$0) {
      this.b = $$0;
   }

   public void a(final eth $$0, frk $$1) {
      final exh $$2 = exh.O();
      $$2.aR();
      $$2.aW().c(vq.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (gms.this.c) {
                  return;
               }

               gms.this.d = uo.a($$0, $$2.m.aw(), $$2.aN().l());
               if (gms.this.c) {
                  return;
               }

               fpw $$1 = new fpw(gms.this.d, $$2, $$0.e($$3), gms.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.m == eth.d.b) {
                  $$1.a($$0.o);
               }

               if (gms.this.c) {
                  return;
               }

               gms.this.d.a($$3, $$4, $$1);
               if (gms.this.c) {
                  return;
               }

               gms.this.d.a(new ahg($$2.V().c(), $$2.V().b()));
               $$2.a(fqy.a($$0));
               $$2.ba().a(fuv.c.c, String.valueOf($$0.a), $$0.c);
               $$2.ac().a(gms.this.d, gjm.c.b);
            } catch (Exception var5) {
               $$2.ac().i();
               if (gms.this.c) {
                  return;
               }

               gms.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               gmr $$5 = new gmr(gms.this.b, vp.r, vq.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.i()) {
         this.d.a(vq.c("disconnect.genericReason"));
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
