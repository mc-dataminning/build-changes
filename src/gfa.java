import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gfa {
   static final Logger a = LogUtils.getLogger();
   final eym b;
   volatile boolean c;
   @Nullable
   so d;

   public gfa(eym $$0) {
      this.b = $$0;
   }

   public void a(final emy $$0, fkk $$1) {
      final eqx $$2 = eqx.O();
      $$2.aR();
      $$2.aV().c(tn.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (gfa.this.c) {
                  return;
               }

               gfa.this.d = so.a($$0, $$2.m.av(), $$2.aN().l());
               if (gfa.this.c) {
                  return;
               }

               fiy $$1 = new fiy(gfa.this.d, $$2, $$0.d($$3), gfa.this.b, false, null, $$0xx -> {
               });
               if ($$0.m == emy.c.b) {
                  $$1.a($$0.o);
               }

               if (gfa.this.c) {
                  return;
               }

               gfa.this.d.a($$3, $$4, $$1);
               if (gfa.this.c) {
                  return;
               }

               gfa.this.d.a(new ado($$2.V().c(), $$2.V().b()));
               $$2.a(fjy.a($$0));
               $$2.aZ().a(fnq.c.c, String.valueOf($$0.a), $$0.c);
            } catch (Exception var5) {
               $$2.ac().a();
               if (gfa.this.c) {
                  return;
               }

               gfa.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               gez $$5 = new gez(gfa.this.b, tm.q, tn.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.k()) {
         this.d.a(tn.c("disconnect.genericReason"));
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
