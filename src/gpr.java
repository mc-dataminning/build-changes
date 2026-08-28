import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import org.joml.Vector3f;

public class gpr implements gpg.a {
   public static final int a = 200;
   private final flz b;
   private final List<abi> c = Lists.newArrayList();

   gpr(flz $$0) {
      this.b = $$0;
   }

   public void a(abi $$0) {
      this.c.add($$0);
   }

   @Override
   public void a(fgl $$0, glg $$1, double $$2, double $$3, double $$4) {
      fgp $$5 = $$1.getBuffer(glq.y());
      long $$6 = this.b.s.ad();
      Iterator<abi> $$7 = this.c.iterator();

      while ($$7.hasNext()) {
         abi $$8 = $$7.next();
         long $$9 = $$6 - $$8.b();
         if ($$9 > 200L) {
            $$7.remove();
         } else {
            for (abi.a $$10 : $$8.c()) {
               Vector3f $$11 = $$10.a().c().a($$2, $$3 - 0.1, $$4).k();
               euy $$12 = $$10.b();
               gma.a($$0, $$5, $$11, $$12.b().r().c(0.5), -16776961);
               gma.a($$0, $$5, $$11, $$12.c().r().c(0.4), -65536);
               gma.a($$0, $$5, $$11, $$12.d().r().c(0.3), -256);
            }
         }
      }
   }
}
