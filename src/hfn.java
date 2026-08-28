import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hfn {
   static final Logger a = LogUtils.getLogger();
   final frw b;
   volatile boolean c;
   @Nullable
   wd d;

   public hfn(frw $$0) {
      this.b = $$0;
   }

   public void a(final fgi $$0, gey $$1) {
      final fke $$2 = fke.Q();
      $$2.aV();
      $$2.aZ().c(xj.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (hfn.this.c) {
                  return;
               }

               hfn.this.d = wd.a($$0, $$2.n.aC(), $$2.aQ().n());
               if (hfn.this.c) {
                  return;
               }

               gdg $$1 = new gdg(hfn.this.d, $$2, $$0.e($$3), hfn.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.i()) {
                  $$1.a($$0.o);
               }

               if (hfn.this.c) {
                  return;
               }

               hfn.this.d.a($$3, $$4, $$1);
               if (hfn.this.c) {
                  return;
               }

               hfn.this.d.a(new ajo($$2.X().c(), $$2.X().b()));
               $$2.a(gem.a($$0));
               $$2.bd().a(gik.c.c, String.valueOf($$0.a), $$0.c);
               $$2.af().a(hfn.this.d, hch.c.b);
            } catch (Exception var5) {
               $$2.af().i();
               if (hfn.this.c) {
                  return;
               }

               hfn.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               hfm $$5 = new hfm(hfn.this.b, xi.r, xj.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.i()) {
         this.d.a(xj.c("disconnect.genericReason"));
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
