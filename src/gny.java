import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gny {
   static final Logger a = LogUtils.getLogger();
   final fgh b;
   volatile boolean c;
   @Nullable
   uq d;

   public gny(fgh $$0) {
      this.b = $$0;
   }

   public void a(final euk $$0, fsp $$1) {
      final eyk $$2 = eyk.P();
      $$2.aS();
      $$2.aX().c(vs.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (gny.this.c) {
                  return;
               }

               gny.this.d = uq.a($$0, $$2.m.aw(), $$2.aO().n());
               if (gny.this.c) {
                  return;
               }

               fqz $$1 = new fqz(gny.this.d, $$2, $$0.e($$3), gny.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.m == euk.d.b) {
                  $$1.a($$0.o);
               }

               if (gny.this.c) {
                  return;
               }

               gny.this.d.a($$3, $$4, $$1);
               if (gny.this.c) {
                  return;
               }

               gny.this.d.a(new ahk($$2.W().c(), $$2.W().b()));
               $$2.a(fsd.a($$0));
               $$2.bb().a(fwa.c.c, String.valueOf($$0.a), $$0.c);
               $$2.ad().a(gny.this.d, gks.c.b);
            } catch (Exception var5) {
               $$2.ad().i();
               if (gny.this.c) {
                  return;
               }

               gny.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               gnx $$5 = new gnx(gny.this.b, vr.r, vs.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.i()) {
         this.d.a(vs.c("disconnect.genericReason"));
         this.d.n();
      }
   }

   public void b() {
      if (this.d != null) {
         if (this.d.i()) {
            this.d.b();
         } else {
            this.d.n();
         }
      }
   }
}
