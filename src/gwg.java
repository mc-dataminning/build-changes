import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gwg {
   static final Logger a = LogUtils.getLogger();
   final fnx b;
   volatile boolean c;
   @Nullable
   vs d;

   public gwg(fnx $$0) {
      this.b = $$0;
   }

   public void a(final fcj $$0, gar $$1) {
      final fgi $$2 = fgi.Q();
      $$2.aR();
      $$2.aV().c(wy.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (gwg.this.c) {
                  return;
               }

               gwg.this.d = vs.a($$0, $$2.m.az(), $$2.aN().n());
               if (gwg.this.c) {
                  return;
               }

               fyy $$1 = new fyy(gwg.this.d, $$2, $$0.e($$3), gwg.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.i()) {
                  $$1.a($$0.o);
               }

               if (gwg.this.c) {
                  return;
               }

               gwg.this.d.a($$3, $$4, $$1);
               if (gwg.this.c) {
                  return;
               }

               gwg.this.d.a(new aix($$2.X().c(), $$2.X().b()));
               $$2.a(gaf.a($$0));
               $$2.aZ().a(ged.c.c, String.valueOf($$0.a), $$0.c);
               $$2.ae().a(gwg.this.d, gsz.c.b);
            } catch (Exception var5) {
               $$2.ae().i();
               if (gwg.this.c) {
                  return;
               }

               gwg.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               gwf $$5 = new gwf(gwg.this.b, wx.r, wy.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.i()) {
         this.d.a(wy.c("disconnect.genericReason"));
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
