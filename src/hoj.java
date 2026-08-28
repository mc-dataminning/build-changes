import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hoj {
   static final Logger a = LogUtils.getLogger();
   final fxi b;
   volatile boolean c;
   @Nullable
   vp d;

   public hoj(fxi $$0) {
      this.b = $$0;
   }

   public void a(final fkh $$0, gkv $$1) {
      final fof $$2 = fof.Q();
      $$2.aU();
      $$2.aY().c(ww.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (hoj.this.c) {
                  return;
               }

               hoj.this.d = vp.a($$0, $$2.n.aD(), $$2.aQ().n());
               if (hoj.this.c) {
                  return;
               }

               gjc $$1 = new gjc(hoj.this.d, $$2, $$0.e($$3), hoj.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.i()) {
                  $$1.a($$0.q);
               }

               if (hoj.this.c) {
                  return;
               }

               hoj.this.d.a($$3, $$4, $$1);
               if (hoj.this.c) {
                  return;
               }

               hoj.this.d.a(new ajj($$2.X().c(), $$2.X().b()));
               $$2.a(gkj.a($$0));
               $$2.bc().a(goi.c.c, String.valueOf($$0.a), Objects.requireNonNullElse($$0.c, "unknown"));
               $$2.af().a(hoj.this.d, hlc.c.b);
            } catch (Exception var5) {
               $$2.af().i();
               if (hoj.this.c) {
                  return;
               }

               hoj.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               hoi $$5 = new hoi(hoj.this.b, wv.r, ww.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.i()) {
         this.d.a(ww.c("disconnect.genericReason"));
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
