import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import org.joml.Vector3f;

public class gqi implements gpx.a {
   public static final int a = 200;
   private final flj b;
   private final List<aam> c = Lists.newArrayList();

   gqi(flj $$0) {
      this.b = $$0;
   }

   public void a(aam $$0) {
      this.c.add($$0);
   }

   @Override
   public void a(ffu $$0, glx $$1, double $$2, double $$3, double $$4) {
      ffy $$5 = $$1.getBuffer(gmh.y());
      long $$6 = this.b.s.ad();
      Iterator<aam> $$7 = this.c.iterator();

      while ($$7.hasNext()) {
         aam $$8 = $$7.next();
         long $$9 = $$6 - $$8.b();
         if ($$9 > 200L) {
            $$7.remove();
         } else {
            for (aam.a $$10 : $$8.c()) {
               Vector3f $$11 = $$10.a().c().a($$2, $$3 - 0.1, $$4).k();
               euh $$12 = $$10.b();
               gmr.a($$0, $$5, $$11, $$12.b().r().c(0.5), -16776961);
               gmr.a($$0, $$5, $$11, $$12.c().r().c(0.4), -65536);
               gmr.a($$0, $$5, $$11, $$12.d().r().c(0.3), -256);
            }
         }
      }
   }
}
