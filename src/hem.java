import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hem {
   static final Logger a = LogUtils.getLogger();
   final fra b;
   volatile boolean c;
   @Nullable
   wc d;

   public hem(fra $$0) {
      this.b = $$0;
   }

   public void a(final ffi $$0, gdz $$1) {
      final fji $$2 = fji.Q();
      $$2.aV();
      $$2.aZ().c(xi.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (hem.this.c) {
                  return;
               }

               hem.this.d = wc.a($$0, $$2.n.aC(), $$2.aQ().n());
               if (hem.this.c) {
                  return;
               }

               gch $$1 = new gch(hem.this.d, $$2, $$0.e($$3), hem.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.i()) {
                  $$1.a($$0.o);
               }

               if (hem.this.c) {
                  return;
               }

               hem.this.d.a($$3, $$4, $$1);
               if (hem.this.c) {
                  return;
               }

               hem.this.d.a(new ajn($$2.X().c(), $$2.X().b()));
               $$2.a(gdn.a($$0));
               $$2.bd().a(ghl.c.c, String.valueOf($$0.a), $$0.c);
               $$2.af().a(hem.this.d, hbg.c.b);
            } catch (Exception var5) {
               $$2.af().i();
               if (hem.this.c) {
                  return;
               }

               hem.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               hel $$5 = new hel(hem.this.b, xh.r, xi.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.i()) {
         this.d.a(xi.c("disconnect.genericReason"));
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
