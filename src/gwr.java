import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import java.util.function.DoubleSupplier;

public class gwr implements gwd.a {
   private final frd a;
   private double b = Double.MIN_VALUE;
   private List<bwt> c = Collections.emptyList();

   public gwr(frd $$0) {
      this.a = $$0;
   }

   @Override
   public void a(flo $$0, gsa $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ag.d();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bwt $$6 = this.a.j.k().g();
         this.c = ImmutableList.copyOf($$6.dV().a_($$6, $$6.cR().g(16.0)));
      }

      crx $$7 = this.a.t;
      if ($$7 != null && $$7.ax.isPresent()) {
         this.a($$0, $$1, $$2, $$3, $$4, $$7, () -> 0.0, 1.0F, 0.0F, 0.0F);
      }

      for (bwt $$8 : this.c) {
         if ($$8 != $$7) {
            this.a($$0, $$1, $$2, $$3, $$4, $$8, () -> this.a($$8), 0.0F, 1.0F, 0.0F);
         }
      }
   }

   private void a(flo $$0, gsa $$1, double $$2, double $$3, double $$4, bwt $$5, DoubleSupplier $$6, float $$7, float $$8, float $$9) {
      $$5.ax.ifPresent($$10 -> {
         double $$11 = $$6.getAsDouble();
         iv $$12 = $$5.aQ();
         this.a($$12, $$0, $$2, $$3, $$4, $$1, 0.02 + $$11, $$7, $$8, $$9);
         iv $$13 = $$5.aO();
         if (!$$13.equals($$12)) {
            this.a($$13, $$0, $$2, $$3, $$4, $$1, 0.04 + $$11, 0.0F, 1.0F, 1.0F);
         }
      });
   }

   private double a(bwt $$0) {
      return 0.02 * (double)(String.valueOf((double)$$0.ao() + 0.132453657).hashCode() % 1000) / 1000.0;
   }

   private void a(iv $$0, flo $$1, double $$2, double $$3, double $$4, gsa $$5, double $$6, float $$7, float $$8, float $$9) {
      double $$10 = (double)$$0.u() - $$2 - 2.0 * $$6;
      double $$11 = (double)$$0.v() - $$3 - 2.0 * $$6;
      double $$12 = (double)$$0.w() - $$4 - 2.0 * $$6;
      double $$13 = $$10 + 1.0 + 4.0 * $$6;
      double $$14 = $$11 + 1.0 + 4.0 * $$6;
      double $$15 = $$12 + 1.0 + 4.0 * $$6;
      gst.a($$1, $$5.getBuffer(gsl.w()), $$10, $$11, $$12, $$13, $$14, $$15, $$7, $$8, $$9, 0.4F);
      gwd.a($$1, $$5.getBuffer(gsl.w()), this.a.s.a_($$0).b(this.a.s, $$0, ffv.a()).a($$0), -$$2, -$$3, -$$4, $$7, $$8, $$9, 1.0F, false);
   }
}
