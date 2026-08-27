import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class get {
   static final Logger a = LogUtils.getLogger();
   final eyf b;
   volatile boolean c;
   @Nullable
   sj d;

   public get(eyf $$0) {
      this.b = $$0;
   }

   public void a(final emr $$0, fkd $$1) {
      final eqq $$2 = eqq.O();
      $$2.aR();
      $$2.aV().c(ti.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (get.this.c) {
                  return;
               }

               get.this.d = sj.a($$0, $$2.m.au(), $$2.aN().l());
               if (get.this.c) {
                  return;
               }

               fir $$1 = new fir(get.this.d, $$2, $$0.d($$3), get.this.b, false, null, $$0xx -> {
               });
               if ($$0.m == emr.c.b) {
                  $$1.a($$0.o);
               }

               if (get.this.c) {
                  return;
               }

               get.this.d.a($$3, $$4, $$1);
               if (get.this.c) {
                  return;
               }

               get.this.d.a(new adk($$2.V().c(), $$2.V().b()));
               $$2.a(fjr.a($$0));
               $$2.aZ().a(fnj.c.c, String.valueOf($$0.a), $$0.c);
            } catch (Exception var5) {
               $$2.ac().a();
               if (get.this.c) {
                  return;
               }

               get.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               ges $$5 = new ges(get.this.b, th.q, ti.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.k()) {
         this.d.a(ti.c("disconnect.genericReason"));
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
