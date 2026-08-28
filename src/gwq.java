import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import org.joml.Vector3f;

public class gwq implements gwf.a {
   public static final int a = 200;
   private final frf b;
   private final List<aba> c = Lists.newArrayList();

   gwq(frf $$0) {
      this.b = $$0;
   }

   public void a(aba $$0) {
      this.c.add($$0);
   }

   @Override
   public void a(flq $$0, gsc $$1, double $$2, double $$3, double $$4) {
      flt $$5 = $$1.getBuffer(gsn.w());
      long $$6 = this.b.s.ae();
      Iterator<aba> $$7 = this.c.iterator();

      while ($$7.hasNext()) {
         aba $$8 = $$7.next();
         long $$9 = $$6 - $$8.b();
         if ($$9 > 200L) {
            $$7.remove();
         } else {
            for (aba.a $$10 : $$8.c()) {
               Vector3f $$11 = $$10.a().c().a($$2, $$3 - 0.1, $$4).k();
               eyy $$12 = $$10.b();
               gsv.a($$0, $$5, $$11, $$12.b().r().c(0.5), -16776961);
               gsv.a($$0, $$5, $$11, $$12.c().r().c(0.4), -65536);
               gsv.a($$0, $$5, $$11, $$12.d().r().c(0.3), -256);
            }
         }
      }
   }
}
