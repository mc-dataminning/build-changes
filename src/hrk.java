import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hrk {
   static final Logger a = LogUtils.getLogger();
   final gad b;
   volatile boolean c;
   @Nullable
   vt d;

   public hrk(gad $$0) {
      this.b = $$0;
   }

   public void a(final fne $$0, gnt $$1) {
      final frd $$2 = frd.Q();
      $$2.aU();
      $$2.aY().c(xa.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (hrk.this.c) {
                  return;
               }

               hrk.this.d = vt.a($$0, $$2.n.aD(), $$2.aQ().n());
               if (hrk.this.c) {
                  return;
               }

               gma $$1 = new gma(hrk.this.d, $$2, $$0.e($$3), hrk.this.b, false, null, $$0xx -> {
               }, null);
               if ($$0.i()) {
                  $$1.a($$0.q);
               }

               if (hrk.this.c) {
                  return;
               }

               hrk.this.d.a($$3, $$4, $$1);
               if (hrk.this.c) {
                  return;
               }

               hrk.this.d.a(new ajn($$2.X().c(), $$2.X().b()));
               $$2.a(gnh.a($$0));
               $$2.bc().a(grh.c.c, String.valueOf($$0.a), Objects.requireNonNullElse($$0.c, "unknown"));
               $$2.af().a(hrk.this.d, hod.c.b);
            } catch (Exception var5) {
               $$2.af().i();
               if (hrk.this.c) {
                  return;
               }

               hrk.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               hrj $$5 = new hrj(hrk.this.b, wz.r, xa.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.i()) {
         this.d.a(xa.c("disconnect.genericReason"));
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
