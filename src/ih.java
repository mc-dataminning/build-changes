public class ih implements ii {
   @Override
   public final ciw dispense(gw $$0, ciw $$1) {
      ciw $$2 = this.a($$0, $$1);
      this.a($$0);
      this.a($$0, $$0.e().c(cul.a));
      return $$2;
   }

   protected ciw a(gw $$0, ciw $$1) {
      hb $$2 = $$0.e().c(cul.a);
      hp $$3 = cul.a($$0);
      ciw $$4 = $$1.a(1);
      a($$0.g(), $$4, 6, $$2, $$3);
      return $$1;
   }

   public static void a(cpk $$0, ciw $$1, int $$2, hb $$3, hp $$4) {
      double $$5 = $$4.a();
      double $$6 = $$4.b();
      double $$7 = $$4.c();
      if ($$3.o() == hb.a.b) {
         $$6 -= 0.125;
      } else {
         $$6 -= 0.15625;
      }

      bye $$8 = new bye($$0, $$5, $$6, $$7, $$1);
      double $$9 = $$0.z.j() * 0.1 + 0.2;
      $$8.o(
         $$0.z.a((double)$$3.j() * $$9, 0.0172275 * (double)$$2),
         $$0.z.a(0.2, 0.0172275 * (double)$$2),
         $$0.z.a((double)$$3.l() * $$9, 0.0172275 * (double)$$2)
      );
      $$0.b($$8);
   }

   protected void a(gw $$0) {
      $$0.g().c(1000, $$0.d(), 0);
   }

   protected void a(gw $$0, hb $$1) {
      $$0.g().c(2000, $$0.d(), $$1.d());
   }
}
