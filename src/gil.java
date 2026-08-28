import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class gil implements gim.a {
   private final fgo a;
   private double b = Double.MIN_VALUE;
   private List<exv> c = Collections.emptyList();

   public gil(fgo $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fbi $$0, gez $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ad.d();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bsr $$6 = this.a.j.l().g();
         this.c = ImmutableList.copyOf($$6.dO().d($$6, $$6.cK().g(6.0)));
      }

      fbm $$7 = $$1.getBuffer(gfh.y());

      for (exv $$8 : this.c) {
         gex.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}
