import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class gif implements gig.a {
   private final fgi a;
   private double b = Double.MIN_VALUE;
   private List<exp> c = Collections.emptyList();

   public gif(fgi $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fbc $$0, get $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ad.d();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bsq $$6 = this.a.j.l().g();
         this.c = ImmutableList.copyOf($$6.dQ().d($$6, $$6.cL().g(6.0)));
      }

      fbg $$7 = $$1.getBuffer(gfb.w());

      for (exp $$8 : this.c) {
         ger.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}
