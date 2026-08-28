import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class gwc implements gwd.a {
   private final frd a;
   private double b = Double.MIN_VALUE;
   private List<fgk> c = Collections.emptyList();

   public gwc(frd $$0) {
      this.a = $$0;
   }

   @Override
   public void a(flo $$0, gsa $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ag.d();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bwt $$6 = this.a.j.k().g();
         this.c = ImmutableList.copyOf($$6.dV().d($$6, $$6.cR().g(6.0)));
      }

      flr $$7 = $$1.getBuffer(gsl.w());

      for (fgk $$8 : this.c) {
         gwd.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}
