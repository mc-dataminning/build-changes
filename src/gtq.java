import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import org.joml.Vector3f;

public class gtq implements gtf.a {
   public static final int a = 200;
   private final fof b;
   private final List<aau> c = Lists.newArrayList();

   gtq(fof $$0) {
      this.b = $$0;
   }

   public void a(aau $$0) {
      this.c.add($$0);
   }

   @Override
   public void a(fiq $$0, gpd $$1, double $$2, double $$3, double $$4) {
      fiu $$5 = $$1.getBuffer(gpn.y());
      long $$6 = this.b.s.ae();
      Iterator<aau> $$7 = this.c.iterator();

      while ($$7.hasNext()) {
         aau $$8 = $$7.next();
         long $$9 = $$6 - $$8.b();
         if ($$9 > 200L) {
            $$7.remove();
         } else {
            for (aau.a $$10 : $$8.c()) {
               Vector3f $$11 = $$10.a().c().a($$2, $$3 - 0.1, $$4).k();
               exd $$12 = $$10.b();
               gpx.a($$0, $$5, $$11, $$12.b().r().c(0.5), -16776961);
               gpx.a($$0, $$5, $$11, $$12.c().r().c(0.4), -65536);
               gpx.a($$0, $$5, $$11, $$12.d().r().c(0.3), -256);
            }
         }
      }
   }
}
