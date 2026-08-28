import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gwl {
   static final Logger a = LogUtils.getLogger();
   final fob b;
   volatile boolean c;
   @Nullable
   vt d;

   public gwl(fob $$0) {
      this.b = $$0;
   }

   public void a(final fcn $$0, gav $$1) {
      final fgm $$2 = fgm.Q();
      $$2.aR();
      $$2.aV().c(wz.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (gwl.this.c) {
                  return;
               }

               gwl.this.d = vt.a($$0, $$2.m.az(), $$2.aN().n());
               if (gwl.this.c) {
                  return;
               }

               fzc $$1 = new fzc(gwl.this.d, $$2, $$0.e($$3), gwl.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.i()) {
                  $$1.a($$0.o);
               }

               if (gwl.this.c) {
                  return;
               }

               gwl.this.d.a($$3, $$4, $$1);
               if (gwl.this.c) {
                  return;
               }

               gwl.this.d.a(new aiy($$2.X().c(), $$2.X().b()));
               $$2.a(gaj.a($$0));
               $$2.aZ().a(geh.c.c, String.valueOf($$0.a), $$0.c);
               $$2.ae().a(gwl.this.d, gte.c.b);
            } catch (Exception var5) {
               $$2.ae().i();
               if (gwl.this.c) {
                  return;
               }

               gwl.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               gwk $$5 = new gwk(gwl.this.b, wy.r, wz.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.i()) {
         this.d.a(wz.c("disconnect.genericReason"));
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
