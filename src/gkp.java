import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class gkp implements gkq.a {
   private final fib a;
   private double b = Double.MIN_VALUE;
   private List<eyx> c = Collections.emptyList();

   public gkp(fib $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fcu $$0, ggv $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ad.d();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         btj $$6 = this.a.j.l().g();
         this.c = ImmutableList.copyOf($$6.dS().d($$6, $$6.cO().g(6.0)));
      }

      fcy $$7 = $$1.getBuffer(ghe.z());

      for (eyx $$8 : this.c) {
         gkq.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}
