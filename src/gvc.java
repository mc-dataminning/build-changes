import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gvc {
   static final Logger a = LogUtils.getLogger();
   final fnc b;
   volatile boolean c;
   @Nullable
   wj d;

   public gvc(fnc $$0) {
      this.b = $$0;
   }

   public void a(final fbe $$0, fzl $$1) {
      final ffe $$2 = ffe.Q();
      $$2.aT();
      $$2.aX().c(xo.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (gvc.this.c) {
                  return;
               }

               gvc.this.d = wj.a($$0, $$2.m.az(), $$2.aP().n());
               if (gvc.this.c) {
                  return;
               }

               fxt $$1 = new fxt(gvc.this.d, $$2, $$0.e($$3), gvc.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.m == fbe.d.b) {
                  $$1.a($$0.o);
               }

               if (gvc.this.c) {
                  return;
               }

               gvc.this.d.a($$3, $$4, $$1);
               if (gvc.this.c) {
                  return;
               }

               gvc.this.d.a(new ajl($$2.X().c(), $$2.X().b()));
               $$2.a(fyz.a($$0));
               $$2.bb().a(gcx.c.c, String.valueOf($$0.a), $$0.c);
               $$2.ae().a(gvc.this.d, grs.c.b);
            } catch (Exception var5) {
               $$2.ae().i();
               if (gvc.this.c) {
                  return;
               }

               gvc.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               gvb $$5 = new gvb(gvc.this.b, xn.r, xo.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.i()) {
         this.d.a(xo.c("disconnect.genericReason"));
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
