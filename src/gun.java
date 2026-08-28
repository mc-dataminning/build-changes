import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class gun implements guo.a {
   private final fpo a;
   private double b = Double.MIN_VALUE;
   private List<ffr> c = Collections.emptyList();

   public gun(fpo $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fjy $$0, gqm $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ag.d();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bwi $$6 = this.a.j.k().g();
         this.c = ImmutableList.copyOf($$6.dU().d($$6, $$6.cQ().g(6.0)));
      }

      fkc $$7 = $$1.getBuffer(gqx.y());

      for (ffr $$8 : this.c) {
         guo.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}
