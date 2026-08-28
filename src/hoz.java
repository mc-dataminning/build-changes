import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hoz {
   static final Logger a = LogUtils.getLogger();
   final fxu b;
   volatile boolean c;
   @Nullable
   vr d;

   public hoz(fxu $$0) {
      this.b = $$0;
   }

   public void a(final fkt $$0, glj $$1) {
      final fos $$2 = fos.Q();
      $$2.aU();
      $$2.aY().c(wy.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (hoz.this.c) {
                  return;
               }

               hoz.this.d = vr.a($$0, $$2.n.aD(), $$2.aQ().n());
               if (hoz.this.c) {
                  return;
               }

               gjq $$1 = new gjq(hoz.this.d, $$2, $$0.e($$3), hoz.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.i()) {
                  $$1.a($$0.q);
               }

               if (hoz.this.c) {
                  return;
               }

               hoz.this.d.a($$3, $$4, $$1);
               if (hoz.this.c) {
                  return;
               }

               hoz.this.d.a(new ajl($$2.X().c(), $$2.X().b()));
               $$2.a(gkx.a($$0));
               $$2.bc().a(gox.c.c, String.valueOf($$0.a), Objects.requireNonNullElse($$0.c, "unknown"));
               $$2.af().a(hoz.this.d, hls.c.b);
            } catch (Exception var5) {
               $$2.af().i();
               if (hoz.this.c) {
                  return;
               }

               hoz.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               hoy $$5 = new hoy(hoz.this.b, wx.r, wy.a("disconnect.genericReason", $$3));
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
