import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import org.joml.Vector3f;

public class gmh implements glw.a {
   public static final int a = 200;
   private final fja b;
   private final List<abf> c = Lists.newArrayList();

   gmh(fja $$0) {
      this.b = $$0;
   }

   public void a(abf $$0) {
      this.c.add($$0);
   }

   @Override
   public void a(fdt $$0, ghw $$1, double $$2, double $$3, double $$4) {
      fdx $$5 = $$1.getBuffer(gig.y());
      long $$6 = this.b.s.aa();
      Iterator<abf> $$7 = this.c.iterator();

      while ($$7.hasNext()) {
         abf $$8 = $$7.next();
         long $$9 = $$6 - $$8.b();
         if ($$9 > 200L) {
            $$7.remove();
         } else {
            for (abf.a $$10 : $$8.c()) {
               Vector3f $$11 = $$10.a().c().a($$2, $$3 - 0.1, $$4).k();
               esm $$12 = $$10.b();
               giq.a($$0, $$5, $$11, $$12.b().r().c(0.5), -16776961);
               giq.a($$0, $$5, $$11, $$12.c().r().c(0.4), -65536);
               giq.a($$0, $$5, $$11, $$12.d().r().c(0.3), -256);
            }
         }
      }
   }
}
