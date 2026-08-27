import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gkk {
   static final Logger a = LogUtils.getLogger();
   final fcz b;
   volatile boolean c;
   @Nullable
   ug d;

   public gkk(fcz $$0) {
      this.b = $$0;
   }

   public void a(final erg $$0, fpd $$1) {
      final evg $$2 = evg.O();
      $$2.aR();
      $$2.aV().c(vf.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (gkk.this.c) {
                  return;
               }

               gkk.this.d = ug.a($$0, $$2.m.aw(), $$2.aN().l());
               if (gkk.this.c) {
                  return;
               }

               fnp $$1 = new fnp(gkk.this.d, $$2, $$0.e($$3), gkk.this.b, false, null, $$0xx -> {
               });
               if ($$0.m == erg.d.b) {
                  $$1.a($$0.o);
               }

               if (gkk.this.c) {
                  return;
               }

               gkk.this.d.a($$3, $$4, $$1);
               if (gkk.this.c) {
                  return;
               }

               gkk.this.d.a(new afu($$2.V().c(), $$2.V().b()));
               $$2.a(foq.a($$0));
               $$2.aZ().a(fsp.c.c, String.valueOf($$0.a), $$0.c);
               $$2.ac().a(gkk.this.d, ghe.c.b);
            } catch (Exception var5) {
               $$2.ac().i();
               if (gkk.this.c) {
                  return;
               }

               gkk.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               gkj $$5 = new gkj(gkk.this.b, ve.q, vf.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.k()) {
         this.d.a(vf.c("disconnect.genericReason"));
         this.d.p();
      }
   }

   public void b() {
      if (this.d != null) {
         if (this.d.k()) {
            this.d.d();
         } else {
            this.d.p();
         }
      }
   }
}
