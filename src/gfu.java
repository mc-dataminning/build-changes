import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gfu {
   static final Logger a = LogUtils.getLogger();
   final ezd b;
   volatile boolean c;
   @Nullable
   tj d;

   public gfu(ezd $$0) {
      this.b = $$0;
   }

   public void a(final eno $$0, fld $$1) {
      final ero $$2 = ero.O();
      $$2.aR();
      $$2.aV().c(ui.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (gfu.this.c) {
                  return;
               }

               gfu.this.d = tj.a($$0, $$2.m.av(), $$2.aN().l());
               if (gfu.this.c) {
                  return;
               }

               fjq $$1 = new fjq(gfu.this.d, $$2, $$0.d($$3), gfu.this.b, false, null, $$0xx -> {
               });
               if ($$0.m == eno.d.b) {
                  $$1.a($$0.o);
               }

               if (gfu.this.c) {
                  return;
               }

               gfu.this.d.a($$3, $$4, $$1);
               if (gfu.this.c) {
                  return;
               }

               gfu.this.d.a(new aek($$2.V().c(), $$2.V().b()));
               $$2.a(fkr.a($$0));
               $$2.aZ().a(fok.c.c, String.valueOf($$0.a), $$0.c);
            } catch (Exception var5) {
               $$2.ac().a();
               if (gfu.this.c) {
                  return;
               }

               gfu.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               gft $$5 = new gft(gfu.this.b, uh.q, ui.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.k()) {
         this.d.a(ui.c("disconnect.genericReason"));
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
