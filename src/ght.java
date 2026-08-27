import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ght {
   static final Logger a = LogUtils.getLogger();
   final faz b;
   volatile boolean c;
   @Nullable
   tw d;

   public ght(faz $$0) {
      this.b = $$0;
   }

   public void a(final epi $$0, fna $$1) {
      final eti $$2 = eti.N();
      $$2.aQ();
      $$2.aU().c(uv.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (ght.this.c) {
                  return;
               }

               ght.this.d = tw.a($$0, $$2.m.aw(), $$2.aM().l());
               if (ght.this.c) {
                  return;
               }

               fln $$1 = new fln(ght.this.d, $$2, $$0.e($$3), ght.this.b, false, null, $$0xx -> {
               });
               if ($$0.m == epi.d.b) {
                  $$1.a($$0.o);
               }

               if (ght.this.c) {
                  return;
               }

               ght.this.d.a($$3, $$4, $$1);
               if (ght.this.c) {
                  return;
               }

               ght.this.d.a(new afa($$2.U().c(), $$2.U().b()));
               $$2.a(fmo.a($$0));
               $$2.aY().a(fqj.c.c, String.valueOf($$0.a), $$0.c);
            } catch (Exception var5) {
               $$2.ab().a();
               if (ght.this.c) {
                  return;
               }

               ght.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               ghs $$5 = new ghs(ght.this.b, uu.q, uv.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.k()) {
         this.d.a(uv.c("disconnect.genericReason"));
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
