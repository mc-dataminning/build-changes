import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import org.joml.Vector3f;

public class gni implements gmx.a {
   public static final int a = 200;
   private final fjx b;
   private final List<abj> c = Lists.newArrayList();

   gni(fjx $$0) {
      this.b = $$0;
   }

   public void a(abj $$0) {
      this.c.add($$0);
   }

   @Override
   public void a(fek $$0, gix $$1, double $$2, double $$3, double $$4) {
      feo $$5 = $$1.getBuffer(gjh.y());
      long $$6 = this.b.s.aa();
      Iterator<abj> $$7 = this.c.iterator();

      while ($$7.hasNext()) {
         abj $$8 = $$7.next();
         long $$9 = $$6 - $$8.b();
         if ($$9 > 200L) {
            $$7.remove();
         } else {
            for (abj.a $$10 : $$8.c()) {
               Vector3f $$11 = $$10.a().c().a($$2, $$3 - 0.1, $$4).k();
               esw $$12 = $$10.b();
               gjr.a($$0, $$5, $$11, $$12.b().r().c(0.5), -16776961);
               gjr.a($$0, $$5, $$11, $$12.c().r().c(0.4), -65536);
               gjr.a($$0, $$5, $$11, $$12.d().r().c(0.3), -256);
            }
         }
      }
   }
}
