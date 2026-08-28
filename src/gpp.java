import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import org.joml.Vector3f;

public class gpp implements gpe.a {
   public static final int a = 200;
   private final flz b;
   private final List<abt> c = Lists.newArrayList();

   gpp(flz $$0) {
      this.b = $$0;
   }

   public void a(abt $$0) {
      this.c.add($$0);
   }

   @Override
   public void a(fgl $$0, gle $$1, double $$2, double $$3, double $$4) {
      fgp $$5 = $$1.getBuffer(glo.y());
      long $$6 = this.b.s.ac();
      Iterator<abt> $$7 = this.c.iterator();

      while ($$7.hasNext()) {
         abt $$8 = $$7.next();
         long $$9 = $$6 - $$8.b();
         if ($$9 > 200L) {
            $$7.remove();
         } else {
            for (abt.a $$10 : $$8.c()) {
               Vector3f $$11 = $$10.a().c().a($$2, $$3 - 0.1, $$4).k();
               eux $$12 = $$10.b();
               gly.a($$0, $$5, $$11, $$12.b().r().c(0.5), -16776961);
               gly.a($$0, $$5, $$11, $$12.c().r().c(0.4), -65536);
               gly.a($$0, $$5, $$11, $$12.d().r().c(0.3), -256);
            }
         }
      }
   }
}
