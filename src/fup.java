import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import java.util.function.DoubleSupplier;

public class fup implements fud.a {
   private final etd a;
   private double b = Double.MIN_VALUE;
   private List<bkq> c = Collections.emptyList();

   public fup(etd $$0) {
      this.a = $$0;
   }

   @Override
   public void a(enw $$0, fqu $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ac.c();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bkq $$6 = this.a.j.m().g();
         this.c = ImmutableList.copyOf($$6.dN().a_($$6, $$6.cH().g(16.0)));
      }

      cdu $$7 = this.a.s;
      if ($$7 != null && $$7.aD.isPresent()) {
         this.a($$0, $$1, $$2, $$3, $$4, $$7, () -> 0.0, 1.0F, 0.0F, 0.0F);
      }

      for (bkq $$8 : this.c) {
         if ($$8 != $$7) {
            this.a($$0, $$1, $$2, $$3, $$4, $$8, () -> this.a($$8), 0.0F, 1.0F, 0.0F);
         }
      }
   }

   private void a(enw $$0, fqu $$1, double $$2, double $$3, double $$4, bkq $$5, DoubleSupplier $$6, float $$7, float $$8, float $$9) {
      $$5.aD.ifPresent($$10 -> {
         double $$11 = $$6.getAsDouble();
         ht $$12 = $$5.aJ();
         this.a($$12, $$0, $$2, $$3, $$4, $$1, 0.02 + $$11, $$7, $$8, $$9);
         ht $$13 = $$5.aH();
         if (!$$13.equals($$12)) {
            this.a($$13, $$0, $$2, $$3, $$4, $$1, 0.04 + $$11, 0.0F, 1.0F, 1.0F);
         }
      });
   }

   private double a(bkq $$0) {
      return 0.02 * (double)(String.valueOf((double)$$0.aj() + 0.132453657).hashCode() % 1000) / 1000.0;
   }

   private void a(ht $$0, enw $$1, double $$2, double $$3, double $$4, fqu $$5, double $$6, float $$7, float $$8, float $$9) {
      double $$10 = (double)$$0.u() - $$2 - 2.0 * $$6;
      double $$11 = (double)$$0.v() - $$3 - 2.0 * $$6;
      double $$12 = (double)$$0.w() - $$4 - 2.0 * $$6;
      double $$13 = $$10 + 1.0 + 4.0 * $$6;
      double $$14 = $$11 + 1.0 + 4.0 * $$6;
      double $$15 = $$12 + 1.0 + 4.0 * $$6;
      fqs.a($$1, $$5.getBuffer(frc.w()), $$10, $$11, $$12, $$13, $$14, $$15, $$7, $$8, $$9, 0.4F);
      fqs.a(
         $$1,
         $$5.getBuffer(frc.w()),
         this.a.r.a_($$0).b(this.a.r, $$0, ejz.a()).a((double)$$0.u(), (double)$$0.v(), (double)$$0.w()),
         -$$2,
         -$$3,
         -$$4,
         $$7,
         $$8,
         $$9,
         1.0F,
         false
      );
   }
}
