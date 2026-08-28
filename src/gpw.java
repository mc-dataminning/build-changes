import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import org.joml.Vector3f;

public class gpw implements gpl.a {
   public static final int a = 200;
   private final fmg b;
   private final List<abt> c = Lists.newArrayList();

   gpw(fmg $$0) {
      this.b = $$0;
   }

   public void a(abt $$0) {
      this.c.add($$0);
   }

   @Override
   public void a(fgs $$0, gll $$1, double $$2, double $$3, double $$4) {
      fgw $$5 = $$1.getBuffer(glv.y());
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
               evf $$12 = $$10.b();
               gmf.a($$0, $$5, $$11, $$12.b().r().c(0.5), -16776961);
               gmf.a($$0, $$5, $$11, $$12.c().r().c(0.4), -65536);
               gmf.a($$0, $$5, $$11, $$12.d().r().c(0.3), -256);
            }
         }
      }
   }
}
