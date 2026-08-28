import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import org.joml.Vector3f;

public class gnr implements gng.a {
   public static final int a = 200;
   private final fke b;
   private final List<abh> c = Lists.newArrayList();

   gnr(fke $$0) {
      this.b = $$0;
   }

   public void a(abh $$0) {
      this.c.add($$0);
   }

   @Override
   public void a(fer $$0, gjg $$1, double $$2, double $$3, double $$4) {
      fev $$5 = $$1.getBuffer(gjq.y());
      long $$6 = this.b.s.ab();
      Iterator<abh> $$7 = this.c.iterator();

      while ($$7.hasNext()) {
         abh $$8 = $$7.next();
         long $$9 = $$6 - $$8.b();
         if ($$9 > 200L) {
            $$7.remove();
         } else {
            for (abh.a $$10 : $$8.c()) {
               Vector3f $$11 = $$10.a().c().a($$2, $$3 - 0.1, $$4).k();
               etd $$12 = $$10.b();
               gka.a($$0, $$5, $$11, $$12.b().r().c(0.5), -16776961);
               gka.a($$0, $$5, $$11, $$12.c().r().c(0.4), -65536);
               gka.a($$0, $$5, $$11, $$12.d().r().c(0.3), -256);
            }
         }
      }
   }
}
