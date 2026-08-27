public class ji implements jj {
   @Override
   public final cmx dispense(jg $$0, cmx $$1) {
      cmx $$2 = this.a($$0, $$1);
      this.a($$0);
      this.a($$0, $$0.d().c(cyu.b));
      return $$2;
   }

   protected cmx a(jg $$0, cmx $$1) {
      ic $$2 = $$0.d().c(cyu.b);
      ir $$3 = cyu.a($$0);
      cmx $$4 = $$1.a(1);
      a($$0.b(), $$4, 6, $$2, $$3);
      return $$1;
   }

   public static void a(cto $$0, cmx $$1, int $$2, ic $$3, ir $$4) {
      double $$5 = $$4.a();
      double $$6 = $$4.b();
      double $$7 = $$4.c();
      if ($$3.o() == ic.a.b) {
         $$6 -= 0.125;
      } else {
         $$6 -= 0.15625;
      }

      cbt $$8 = new cbt($$0, $$5, $$6, $$7, $$1);
      double $$9 = $$0.z.j() * 0.1 + 0.2;
      $$8.o(
         $$0.z.a((double)$$3.j() * $$9, 0.0172275 * (double)$$2),
         $$0.z.a(0.2, 0.0172275 * (double)$$2),
         $$0.z.a((double)$$3.l() * $$9, 0.0172275 * (double)$$2)
      );
      $$0.b($$8);
   }

   protected void a(jg $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }

   protected void a(jg $$0, ic $$1) {
      $$0.b().c(2000, $$0.c(), $$1.d());
   }
}
