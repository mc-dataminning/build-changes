import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import org.joml.Vector3f;

public class gwb implements gvq.a {
   public static final int a = 200;
   private final fqq b;
   private final List<abh> c = Lists.newArrayList();

   gwb(fqq $$0) {
      this.b = $$0;
   }

   public void a(abh $$0) {
      this.c.add($$0);
   }

   @Override
   public void a(fld $$0, grn $$1, double $$2, double $$3, double $$4) {
      flg $$5 = $$1.getBuffer(gry.w());
      long $$6 = this.b.s.ae();
      Iterator<abh> $$7 = this.c.iterator();

      while ($$7.hasNext()) {
         abh $$8 = $$7.next();
         long $$9 = $$6 - $$8.b();
         if ($$9 > 200L) {
            $$7.remove();
         } else {
            for (abh.a $$10 : $$8.c()) {
               Vector3f $$11 = $$10.a().c().a($$2, $$3 - 0.1, $$4).k();
               ezi $$12 = $$10.b();
               gsg.a($$0, $$5, $$11, $$12.b().r().c(0.5), -16776961);
               gsg.a($$0, $$5, $$11, $$12.c().r().c(0.4), -65536);
               gsg.a($$0, $$5, $$11, $$12.d().r().c(0.3), -256);
            }
         }
      }
   }
}
