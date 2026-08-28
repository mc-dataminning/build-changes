import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hhq {
   static final Logger a = LogUtils.getLogger();
   final ftr b;
   volatile boolean c;
   @Nullable
   we d;

   public hhq(ftr $$0) {
      this.b = $$0;
   }

   public void a(final fic $$0, ggx $$1) {
      final flz $$2 = flz.Q();
      $$2.aV();
      $$2.aZ().c(xk.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (hhq.this.c) {
                  return;
               }

               hhq.this.d = we.a($$0, $$2.n.aD(), $$2.aQ().n());
               if (hhq.this.c) {
                  return;
               }

               gfe $$1 = new gfe(hhq.this.d, $$2, $$0.e($$3), hhq.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.i()) {
                  $$1.a($$0.q);
               }

               if (hhq.this.c) {
                  return;
               }

               hhq.this.d.a($$3, $$4, $$1);
               if (hhq.this.c) {
                  return;
               }

               hhq.this.d.a(new aju($$2.X().c(), $$2.X().b()));
               $$2.a(ggl.a($$0));
               $$2.bd().a(gkk.c.c, String.valueOf($$0.a), Objects.requireNonNullElse($$0.c, "unknown"));
               $$2.af().a(hhq.this.d, hej.c.b);
            } catch (Exception var5) {
               $$2.af().i();
               if (hhq.this.c) {
                  return;
               }

               hhq.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               hhp $$5 = new hhp(hhq.this.b, xj.r, xk.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.i()) {
         this.d.a(xk.c("disconnect.genericReason"));
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
