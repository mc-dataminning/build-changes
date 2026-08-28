import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class gpi implements gpj.a {
   private final fme a;
   private double b = Double.MIN_VALUE;
   private List<fcr> c = Collections.emptyList();

   public gpi(fme $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fgq $$0, glj $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ae.d();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bvj $$6 = this.a.j.k().g();
         this.c = ImmutableList.copyOf($$6.dV().d($$6, $$6.cR().g(6.0)));
      }

      fgu $$7 = $$1.getBuffer(glt.y());

      for (fcr $$8 : this.c) {
         gpj.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}
