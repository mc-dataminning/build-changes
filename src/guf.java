import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import org.joml.Vector3f;

public class guf implements gtu.a {
   public static final int a = 200;
   private final fos b;
   private final List<aaw> c = Lists.newArrayList();

   guf(fos $$0) {
      this.b = $$0;
   }

   public void a(aaw $$0) {
      this.c.add($$0);
   }

   @Override
   public void a(fjc $$0, gps $$1, double $$2, double $$3, double $$4) {
      fjg $$5 = $$1.getBuffer(gqc.y());
      long $$6 = this.b.s.ae();
      Iterator<aaw> $$7 = this.c.iterator();

      while ($$7.hasNext()) {
         aaw $$8 = $$7.next();
         long $$9 = $$6 - $$8.b();
         if ($$9 > 200L) {
            $$7.remove();
         } else {
            for (aaw.a $$10 : $$8.c()) {
               Vector3f $$11 = $$10.a().c().a($$2, $$3 - 0.1, $$4).k();
               exo $$12 = $$10.b();
               gqm.a($$0, $$5, $$11, $$12.b().r().c(0.5), -16776961);
               gqm.a($$0, $$5, $$11, $$12.c().r().c(0.4), -65536);
               gqm.a($$0, $$5, $$11, $$12.d().r().c(0.3), -256);
            }
         }
      }
   }
}
