import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gjz {
   static final Logger a = LogUtils.getLogger();
   final fct b;
   volatile boolean c;
   @Nullable
   ue d;

   public gjz(fct $$0) {
      this.b = $$0;
   }

   public void a(final era $$0, fox $$1) {
      final eva $$2 = eva.N();
      $$2.aQ();
      $$2.aU().c(vd.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (gjz.this.c) {
                  return;
               }

               gjz.this.d = ue.a($$0, $$2.m.aw(), $$2.aM().l());
               if (gjz.this.c) {
                  return;
               }

               fnj $$1 = new fnj(gjz.this.d, $$2, $$0.e($$3), gjz.this.b, false, null, $$0xx -> {
               });
               if ($$0.m == era.d.b) {
                  $$1.a($$0.o);
               }

               if (gjz.this.c) {
                  return;
               }

               gjz.this.d.a($$3, $$4, $$1);
               if (gjz.this.c) {
                  return;
               }

               gjz.this.d.a(new afr($$2.U().c(), $$2.U().b()));
               $$2.a(fok.a($$0));
               $$2.aY().a(fsj.c.c, String.valueOf($$0.a), $$0.c);
            } catch (Exception var5) {
               $$2.ab().a();
               if (gjz.this.c) {
                  return;
               }

               gjz.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               gjy $$5 = new gjy(gjz.this.b, vc.q, vd.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.k()) {
         this.d.a(vd.c("disconnect.genericReason"));
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
