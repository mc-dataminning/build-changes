import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import org.joml.Vector3f;

public class gsl implements gsa.a {
   public static final int a = 200;
   private final fnd b;
   private final List<aat> c = Lists.newArrayList();

   gsl(fnd $$0) {
      this.b = $$0;
   }

   public void a(aat $$0) {
      this.c.add($$0);
   }

   @Override
   public void a(fho $$0, gny $$1, double $$2, double $$3, double $$4) {
      fhs $$5 = $$1.getBuffer(goi.y());
      long $$6 = this.b.s.ae();
      Iterator<aat> $$7 = this.c.iterator();

      while ($$7.hasNext()) {
         aat $$8 = $$7.next();
         long $$9 = $$6 - $$8.b();
         if ($$9 > 200L) {
            $$7.remove();
         } else {
            for (aat.a $$10 : $$8.c()) {
               Vector3f $$11 = $$10.a().c().a($$2, $$3 - 0.1, $$4).k();
               ewb $$12 = $$10.b();
               gos.a($$0, $$5, $$11, $$12.b().r().c(0.5), -16776961);
               gos.a($$0, $$5, $$11, $$12.c().r().c(0.4), -65536);
               gos.a($$0, $$5, $$11, $$12.d().r().c(0.3), -256);
            }
         }
      }
   }
}
