import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gna {
   static final Logger a = LogUtils.getLogger();
   final ffl b;
   volatile boolean c;
   @Nullable
   uo d;

   public gna(ffl $$0) {
      this.b = $$0;
   }

   public void a(final eto $$0, frs $$1) {
      final exo $$2 = exo.P();
      $$2.aS();
      $$2.aX().c(vq.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (gna.this.c) {
                  return;
               }

               gna.this.d = uo.a($$0, $$2.m.aw(), $$2.aO().m());
               if (gna.this.c) {
                  return;
               }

               fqd $$1 = new fqd(gna.this.d, $$2, $$0.e($$3), gna.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.m == eto.d.b) {
                  $$1.a($$0.o);
               }

               if (gna.this.c) {
                  return;
               }

               gna.this.d.a($$3, $$4, $$1);
               if (gna.this.c) {
                  return;
               }

               gna.this.d.a(new ahg($$2.W().c(), $$2.W().b()));
               $$2.a(frg.a($$0));
               $$2.bb().a(fvd.c.c, String.valueOf($$0.a), $$0.c);
               $$2.ad().a(gna.this.d, gju.c.b);
            } catch (Exception var5) {
               $$2.ad().i();
               if (gna.this.c) {
                  return;
               }

               gna.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               gmz $$5 = new gmz(gna.this.b, vp.r, vq.a("disconnect.genericReason", $$3));
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
