import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class geo {
   static final Logger a = LogUtils.getLogger();
   final eya b;
   volatile boolean c;
   @Nullable
   sg d;

   public geo(eya $$0) {
      this.b = $$0;
   }

   public void a(final emm $$0, fjy $$1) {
      final eql $$2 = eql.O();
      $$2.aR();
      $$2.aV().c(tf.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               $$0 = new InetSocketAddress($$3, $$4);
               if (geo.this.c) {
                  return;
               }

               geo.this.d = sg.a($$0, $$2.m.au(), $$2.aN().l());
               if (geo.this.c) {
                  return;
               }

               fim $$1 = new fim(geo.this.d, $$2, $$0.d($$3), geo.this.b, false, null, $$0xx -> {
               });
               if ($$0.m == emm.c.b) {
                  $$1.a($$0.o);
               }

               if (geo.this.c) {
                  return;
               }

               geo.this.d.a($$3, $$4, $$1);
               if (geo.this.c) {
                  return;
               }

               geo.this.d.a(new adh($$2.V().c(), $$2.V().b()));
               $$2.a(fjm.a($$0));
               $$2.aZ().a(fne.c.c, String.valueOf($$0.a), $$0.c);
            } catch (Exception var5) {
               $$2.ac().a();
               if (geo.this.c) {
                  return;
               }

               geo.a.error("Couldn't connect to world", var5);
               String $$3 = var5.toString();
               if ($$0 != null) {
                  String $$4 = $$0 + ":" + $$4;
                  $$3 = $$3.replaceAll($$4, "");
               }

               gen $$5 = new gen(geo.this.b, te.q, tf.a("disconnect.genericReason", $$3));
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.k()) {
         this.d.a(tf.c("disconnect.genericReason"));
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
