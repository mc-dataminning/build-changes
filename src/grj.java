import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import org.joml.Vector3f;

public class grj implements gqy.a {
   public static final int a = 200;
   private final fmg b;
   private final List<aan> c = Lists.newArrayList();

   grj(fmg $$0) {
      this.b = $$0;
   }

   public void a(aan $$0) {
      this.c.add($$0);
   }

   @Override
   public void a(fgr $$0, gmx $$1, double $$2, double $$3, double $$4) {
      fgv $$5 = $$1.getBuffer(gnh.y());
      long $$6 = this.b.s.ae();
      Iterator<aan> $$7 = this.c.iterator();

      while ($$7.hasNext()) {
         aan $$8 = $$7.next();
         long $$9 = $$6 - $$8.b();
         if ($$9 > 200L) {
            $$7.remove();
         } else {
            for (aan.a $$10 : $$8.c()) {
               Vector3f $$11 = $$10.a().c().a($$2, $$3 - 0.1, $$4).k();
               eve $$12 = $$10.b();
               gnr.a($$0, $$5, $$11, $$12.b().r().c(0.5), -16776961);
               gnr.a($$0, $$5, $$11, $$12.c().r().c(0.4), -65536);
               gnr.a($$0, $$5, $$11, $$12.d().r().c(0.3), -256);
            }
         }
      }
   }
}
