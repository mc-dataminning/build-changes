import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gak {
   static final Logger a = LogUtils.getLogger();
   final euq b;
   volatile boolean c;
   @Nullable
   sd d;

   public gak(euq $$0) {
      this.b = $$0;
   }

   public void a(final ejq $$0, fga $$1) {
      final enn $$2 = enn.N();
      $$2.d(true);
      $$2.aQ();
      $$2.aU().c(sw.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (gak.this.c) {
                  return;
               }

               gak.this.d = sd.a($$0, $$2.m.at());
               if (gak.this.c) {
                  return;
               }

               fev $$1 = new fev(gak.this.d, $$2, $$0.d($$3), gak.this.b, false, null, $$0xx -> {
               });
               if ($$0.m == ejq.c.b) {
                  $$1.a($$0.o);
               }

               gak.this.d.a($$1);
               if (gak.this.c) {
                  return;
               }

               gak.this.d.a(new abb($$3, $$4, se.d));
               if (gak.this.c) {
                  return;
               }

               String $$2 = $$2.U().c();
               UUID $$3 = $$2.U().g();
               gak.this.d.a(new abm($$2, Optional.ofNullable($$3)));
               $$2.a(ffq.a($$0));
               $$2.aY().a(fjg.c.c, String.valueOf($$0.a), $$0.c);
            } catch (Exception var5) {
               $$2.ab().a();
               if (gak.this.c) {
                  return;
               }

               gak.a.error("Couldn't connect to world", var5);
               String $$5 = var5.toString();
               if ($$0 != null) {
                  String $$6 = $$0 + ":" + $$4;
                  $$5 = $$5.replaceAll($$6, "");
               }

               gaj $$7 = new gaj(gak.this.b, sv.p, sw.a("disconnect.genericReason", $$5));
               $$2.execute(() -> $$2.a($$7));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.h()) {
         this.d.a(sw.c("disconnect.genericReason"));
         this.d.m();
      }
   }

   public void b() {
      if (this.d != null) {
         if (this.d.h()) {
            this.d.a();
         } else {
            this.d.m();
         }
      }
   }
}
