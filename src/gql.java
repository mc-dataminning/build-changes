import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import org.joml.Vector3f;

public class gql implements gqa.a {
   public static final int a = 200;
   private final flk b;
   private final List<aan> c = Lists.newArrayList();

   gql(flk $$0) {
      this.b = $$0;
   }

   public void a(aan $$0) {
      this.c.add($$0);
   }

   @Override
   public void a(ffv $$0, glz $$1, double $$2, double $$3, double $$4) {
      ffz $$5 = $$1.getBuffer(gmj.y());
      long $$6 = this.b.s.ad();
      Iterator<aan> $$7 = this.c.iterator();

      while ($$7.hasNext()) {
         aan $$8 = $$7.next();
         long $$9 = $$6 - $$8.b();
         if ($$9 > 200L) {
            $$7.remove();
         } else {
            for (aan.a $$10 : $$8.c()) {
               Vector3f $$11 = $$10.a().c().a($$2, $$3 - 0.1, $$4).k();
               eui $$12 = $$10.b();
               gmt.a($$0, $$5, $$11, $$12.b().r().c(0.5), -16776961);
               gmt.a($$0, $$5, $$11, $$12.c().r().c(0.4), -65536);
               gmt.a($$0, $$5, $$11, $$12.d().r().c(0.3), -256);
            }
         }
      }
   }
}
