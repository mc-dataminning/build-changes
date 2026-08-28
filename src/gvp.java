import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gvp {
   static final Logger a = LogUtils.getLogger();
   final fnj b;
   volatile boolean c;
   @Nullable
   vp d;

   public gvp(fnj $$0) {
      this.b = $$0;
   }

   public void a(final fbt $$0, gab $$1) {
      final fft $$2 = fft.Q();
      $$2.aT();
      $$2.aX().c(wu.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (gvp.this.c) {
                  return;
               }

               gvp.this.d = vp.a($$0, $$2.m.az(), $$2.aP().n());
               if (gvp.this.c) {
                  return;
               }

               fyi $$1 = new fyi(gvp.this.d, $$2, $$0.e($$3), gvp.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.i()) {
                  $$1.a($$0.o);
               }

               if (gvp.this.c) {
                  return;
               }

               gvp.this.d.a($$3, $$4, $$1);
               if (gvp.this.c) {
                  return;
               }

               gvp.this.d.a(new air($$2.X().c(), $$2.X().b()));
               $$2.a(fzp.a($$0));
               $$2.bb().a(gdn.c.c, String.valueOf($$0.a), $$0.c);
               $$2.ae().a(gvp.this.d, gsi.c.b);
            } catch (Exception var5) {
               $$2.ae().i();
               if (gvp.this.c) {
                  return;
               }

               gvp.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               gvo $$5 = new gvo(gvp.this.b, wt.r, wu.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.i()) {
         this.d.a(wu.c("disconnect.genericReason"));
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
