import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ghb {
   static final Logger a = LogUtils.getLogger();
   final fah b;
   volatile boolean c;
   @Nullable
   ts d;

   public ghb(fah $$0) {
      this.b = $$0;
   }

   public void a(final eor $$0, fmi $$1) {
      final esr $$2 = esr.N();
      $$2.aQ();
      $$2.aU().c(ur.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (ghb.this.c) {
                  return;
               }

               ghb.this.d = ts.a($$0, $$2.m.aw(), $$2.aM().l());
               if (ghb.this.c) {
                  return;
               }

               fkv $$1 = new fkv(ghb.this.d, $$2, $$0.e($$3), ghb.this.b, false, null, $$0xx -> {
               });
               if ($$0.m == eor.d.b) {
                  $$1.a($$0.o);
               }

               if (ghb.this.c) {
                  return;
               }

               ghb.this.d.a($$3, $$4, $$1);
               if (ghb.this.c) {
                  return;
               }

               ghb.this.d.a(new aeu($$2.U().c(), $$2.U().b()));
               $$2.a(flw.a($$0));
               $$2.aY().a(fpr.c.c, String.valueOf($$0.a), $$0.c);
            } catch (Exception var5) {
               $$2.ab().a();
               if (ghb.this.c) {
                  return;
               }

               ghb.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               gha $$5 = new gha(ghb.this.b, uq.q, ur.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.k()) {
         this.d.a(ur.c("disconnect.genericReason"));
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
