import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gji {
   static final Logger a = LogUtils.getLogger();
   final fcc b;
   volatile boolean c;
   @Nullable
   uc d;

   public gji(fcc $$0) {
      this.b = $$0;
   }

   public void a(final eqk $$0, fof $$1) {
      final euk $$2 = euk.N();
      $$2.aQ();
      $$2.aU().c(vb.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (gji.this.c) {
                  return;
               }

               gji.this.d = uc.a($$0, $$2.m.aw(), $$2.aM().l());
               if (gji.this.c) {
                  return;
               }

               fms $$1 = new fms(gji.this.d, $$2, $$0.e($$3), gji.this.b, false, null, $$0xx -> {
               });
               if ($$0.m == eqk.d.b) {
                  $$1.a($$0.o);
               }

               if (gji.this.c) {
                  return;
               }

               gji.this.d.a($$3, $$4, $$1);
               if (gji.this.c) {
                  return;
               }

               gji.this.d.a(new afh($$2.U().c(), $$2.U().b()));
               $$2.a(fnt.a($$0));
               $$2.aY().a(frs.c.c, String.valueOf($$0.a), $$0.c);
            } catch (Exception var5) {
               $$2.ab().a();
               if (gji.this.c) {
                  return;
               }

               gji.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               gjh $$5 = new gjh(gji.this.b, va.q, vb.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.k()) {
         this.d.a(vb.c("disconnect.genericReason"));
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
