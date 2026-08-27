import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gey {
   static final Logger a = LogUtils.getLogger();
   final eyk b;
   volatile boolean c;
   @Nullable
   sm d;

   public gey(eyk $$0) {
      this.b = $$0;
   }

   public void a(final emw $$0, fki $$1) {
      final eqv $$2 = eqv.O();
      $$2.aR();
      $$2.aV().c(tl.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (gey.this.c) {
                  return;
               }

               gey.this.d = sm.a($$0, $$2.m.av(), $$2.aN().l());
               if (gey.this.c) {
                  return;
               }

               fiw $$1 = new fiw(gey.this.d, $$2, $$0.d($$3), gey.this.b, false, null, $$0xx -> {
               });
               if ($$0.m == emw.c.b) {
                  $$1.a($$0.o);
               }

               if (gey.this.c) {
                  return;
               }

               gey.this.d.a($$3, $$4, $$1);
               if (gey.this.c) {
                  return;
               }

               gey.this.d.a(new adm($$2.V().c(), $$2.V().b()));
               $$2.a(fjw.a($$0));
               $$2.aZ().a(fno.c.c, String.valueOf($$0.a), $$0.c);
            } catch (Exception var5) {
               $$2.ac().a();
               if (gey.this.c) {
                  return;
               }

               gey.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               gex $$5 = new gex(gey.this.b, tk.q, tl.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.k()) {
         this.d.a(tl.c("disconnect.genericReason"));
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
