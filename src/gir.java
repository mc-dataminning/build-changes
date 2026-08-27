import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class gir implements gis.a {
   private final fgj a;
   private double b = Double.MIN_VALUE;
   private List<exn> c = Collections.emptyList();

   public gir(fgj $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fbc $$0, gfg $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ad.c();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         brv $$6 = this.a.j.m().g();
         this.c = ImmutableList.copyOf($$6.dU().d($$6, $$6.cP().g(6.0)));
      }

      fbg $$7 = $$1.getBuffer(gfo.z());

      for (exn $$8 : this.c) {
         gfe.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}
