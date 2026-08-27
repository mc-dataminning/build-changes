import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gwy {
   static final Logger a = LogUtils.getLogger();
   final fon b;
   volatile boolean c;
   @Nullable
   wc d;

   public gwy(fon $$0) {
      this.b = $$0;
   }

   public void a(final fcj $$0, gbe $$1) {
      final fgj $$2 = fgj.Q();
      $$2.aU();
      $$2.aZ().c(xe.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (gwy.this.c) {
                  return;
               }

               gwy.this.d = wc.a($$0, $$2.m.az(), $$2.aQ().n());
               if (gwy.this.c) {
                  return;
               }

               fzm $$1 = new fzm(gwy.this.d, $$2, $$0.e($$3), gwy.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.m == fcj.d.b) {
                  $$1.a($$0.o);
               }

               if (gwy.this.c) {
                  return;
               }

               gwy.this.d.a($$3, $$4, $$1);
               if (gwy.this.c) {
                  return;
               }

               gwy.this.d.a(new aja($$2.X().c(), $$2.X().b()));
               $$2.a(gas.a($$0));
               $$2.bd().a(geq.c.c, String.valueOf($$0.a), $$0.c);
               $$2.ae().a(gwy.this.d, gts.c.b);
            } catch (Exception var5) {
               $$2.ae().i();
               if (gwy.this.c) {
                  return;
               }

               gwy.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               gwx $$5 = new gwx(gwy.this.b, xd.r, xe.a("disconnect.genericReason", $$3));
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
