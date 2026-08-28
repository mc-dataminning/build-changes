import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import org.joml.Vector3f;

public class gla implements gkq.a {
   public static final int a = 200;
   private final fib b;
   private final List<abb> c = Lists.newArrayList();

   gla(fib $$0) {
      this.b = $$0;
   }

   public void a(abb $$0) {
      this.c.add($$0);
   }

   @Override
   public void a(fcu $$0, ggv $$1, double $$2, double $$3, double $$4) {
      fcy $$5 = $$1.getBuffer(ghe.z());
      long $$6 = this.b.s.aa();
      Iterator<abb> $$7 = this.c.iterator();

      while ($$7.hasNext()) {
         abb $$8 = $$7.next();
         long $$9 = $$6 - $$8.b();
         if ($$9 > 200L) {
            $$7.remove();
         } else {
            for (abb.a $$10 : $$8.c()) {
               Vector3f $$11 = $$10.a().c().a($$2, $$3 - 0.1, $$4).k();
               erj $$12 = $$10.b();
               ghl.a($$0, $$5, $$11, $$12.b().r().c(0.5), -16776961);
               ghl.a($$0, $$5, $$11, $$12.c().r().c(0.4), -65536);
               ghl.a($$0, $$5, $$11, $$12.d().r().c(0.3), -256);
            }
         }
      }
   }
}
