import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gea {
   static final Logger a = LogUtils.getLogger();
   final exv b;
   volatile boolean c;
   @Nullable
   sf d;

   public gea(exv $$0) {
      this.b = $$0;
   }

   public void a(final emo $$0, fjk $$1) {
      final eqn $$2 = eqn.N();
      $$2.aQ();
      $$2.aU().c(te.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (gea.this.c) {
                  return;
               }

               gea.this.d = sf.a($$0, $$2.m.at());
               if (gea.this.c) {
                  return;
               }

               fid $$1 = new fid(gea.this.d, $$2, $$0.d($$3), gea.this.b, false, null, $$0xx -> {
               });
               if ($$0.m == emo.c.b) {
                  $$1.a($$0.o);
               }

               if (gea.this.c) {
                  return;
               }

               gea.this.d.a($$3, $$4, $$1);
               if (gea.this.c) {
                  return;
               }

               gea.this.d.a(new adf($$2.U().c(), $$2.U().b()));
               $$2.a(fja.a($$0));
               $$2.aY().a(fmq.c.c, String.valueOf($$0.a), $$0.c);
            } catch (Exception var5) {
               $$2.ab().a();
               if (gea.this.c) {
                  return;
               }

               gea.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               gdz $$5 = new gdz(gea.this.b, td.q, te.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.k()) {
         this.d.a(te.c("disconnect.genericReason"));
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
