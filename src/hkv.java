import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hkv {
   static final Logger a = LogUtils.getLogger();
   final fuk b;
   volatile boolean c;
   @Nullable
   vi d;

   public hkv(fuk $$0) {
      this.b = $$0;
   }

   public void a(final fhl $$0, ghq $$1) {
      final flj $$2 = flj.Q();
      $$2.aU();
      $$2.aY().c(wo.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (hkv.this.c) {
                  return;
               }

               hkv.this.d = vi.a($$0, $$2.n.aD(), $$2.aQ().n());
               if (hkv.this.c) {
                  return;
               }

               gfx $$1 = new gfx(hkv.this.d, $$2, $$0.e($$3), hkv.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.i()) {
                  $$1.a($$0.q);
               }

               if (hkv.this.c) {
                  return;
               }

               hkv.this.d.a($$3, $$4, $$1);
               if (hkv.this.c) {
                  return;
               }

               hkv.this.d.a(new aiz($$2.X().c(), $$2.X().b()));
               $$2.a(ghe.a($$0));
               $$2.bc().a(gld.c.c, String.valueOf($$0.a), Objects.requireNonNullElse($$0.c, "unknown"));
               $$2.af().a(hkv.this.d, hho.c.b);
            } catch (Exception var5) {
               $$2.af().i();
               if (hkv.this.c) {
                  return;
               }

               hkv.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               hku $$5 = new hku(hkv.this.b, wn.r, wo.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.i()) {
         this.d.a(wo.c("disconnect.genericReason"));
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
