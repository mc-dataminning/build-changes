import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import org.joml.Vector3f;

public class glw implements gll.a {
   public static final int a = 200;
   private final fip b;
   private final List<abc> c = Lists.newArrayList();

   glw(fip $$0) {
      this.b = $$0;
   }

   public void a(abc $$0) {
      this.c.add($$0);
   }

   @Override
   public void a(fdi $$0, ghl $$1, double $$2, double $$3, double $$4) {
      fdm $$5 = $$1.getBuffer(ghv.y());
      long $$6 = this.b.s.aa();
      Iterator<abc> $$7 = this.c.iterator();

      while ($$7.hasNext()) {
         abc $$8 = $$7.next();
         long $$9 = $$6 - $$8.b();
         if ($$9 > 200L) {
            $$7.remove();
         } else {
            for (abc.a $$10 : $$8.c()) {
               Vector3f $$11 = $$10.a().c().a($$2, $$3 - 0.1, $$4).k();
               esb $$12 = $$10.b();
               gif.a($$0, $$5, $$11, $$12.b().r().c(0.5), -16776961);
               gif.a($$0, $$5, $$11, $$12.c().r().c(0.4), -65536);
               gif.a($$0, $$5, $$11, $$12.d().r().c(0.3), -256);
            }
         }
      }
   }
}
