public class jy implements jz {
   @Override
   public final crs dispense(jw $$0, crs $$1) {
      crs $$2 = this.a($$0, $$1);
      this.a($$0);
      this.a($$0, $$0.d().c(dem.b));
      return $$2;
   }

   protected crs a(jw $$0, crs $$1) {
      ij $$2 = $$0.d().c(dem.b);
      ix $$3 = dem.a($$0);
      crs $$4 = $$1.a(1);
      a($$0.b(), $$4, 6, $$2, $$3);
      return $$1;
   }

   public static void a(czg $$0, crs $$1, int $$2, ij $$3, ix $$4) {
      double $$5 = $$4.a();
      double $$6 = $$4.b();
      double $$7 = $$4.c();
      if ($$3.o() == ij.a.b) {
         $$6 -= 0.125;
      } else {
         $$6 -= 0.15625;
      }

      cgk $$8 = new cgk($$0, $$5, $$6, $$7, $$1);
      double $$9 = $$0.z.j() * 0.1 + 0.2;
      $$8.o(
         $$0.z.a((double)$$3.j() * $$9, 0.0172275 * (double)$$2),
         $$0.z.a(0.2, 0.0172275 * (double)$$2),
         $$0.z.a((double)$$3.l() * $$9, 0.0172275 * (double)$$2)
      );
      $$0.b($$8);
   }

   protected void a(jw $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }

   protected void a(jw $$0, ij $$1) {
      $$0.b().c(2000, $$0.c(), $$1.d());
   }
}
