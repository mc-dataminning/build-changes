import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gtv {
   static final Logger a = LogUtils.getLogger();
   final fly b;
   volatile boolean c;
   @Nullable
   vv d;

   public gtv(fly $$0) {
      this.b = $$0;
   }

   public void a(final ezz $$0, fyi $$1) {
      final fdz $$2 = fdz.Q();
      $$2.aU();
      $$2.aZ().c(wx.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (gtv.this.c) {
                  return;
               }

               gtv.this.d = vv.a($$0, $$2.m.az(), $$2.aQ().n());
               if (gtv.this.c) {
                  return;
               }

               fwq $$1 = new fwq(gtv.this.d, $$2, $$0.e($$3), gtv.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.m == ezz.d.b) {
                  $$1.a($$0.o);
               }

               if (gtv.this.c) {
                  return;
               }

               gtv.this.d.a($$3, $$4, $$1);
               if (gtv.this.c) {
                  return;
               }

               gtv.this.d.a(new ait($$2.X().c(), $$2.X().b()));
               $$2.a(fxw.a($$0));
               $$2.bd().a(gbu.c.c, String.valueOf($$0.a), $$0.c);
               $$2.ae().a(gtv.this.d, gqp.c.b);
            } catch (Exception var5) {
               $$2.ae().i();
               if (gtv.this.c) {
                  return;
               }

               gtv.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               gtu $$5 = new gtu(gtv.this.b, ww.r, wx.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.i()) {
         this.d.a(wx.c("disconnect.genericReason"));
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
