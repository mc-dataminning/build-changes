public class ik extends ij {
   @Override
   protected ciw a(gw $$0, ciw $$1) {
      aki $$2 = $$0.g();
      if (!$$2.r_()) {
         gv $$3 = $$0.d().a($$0.e().c(cul.a));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.a() && $$1.a(1, $$2.y_(), null)) {
            $$1.f(0);
         }
      }

      return $$1;
   }

   private static boolean a(aki $$0, gv $$1) {
      dey $$2 = $$0.a_($$1);
      if ($$2.a(apj.aF, $$0x -> $$0x.b(cse.b) && $$0x.b() instanceof cse)) {
         int $$3 = $$2.c(cse.b);
         if ($$3 >= 5) {
            $$0.a(null, $$1, aou.bI, aov.e, 1.0F, 1.0F);
            cse.a($$0, $$1);
            ((cse)$$2.b()).a($$0, $$2, $$1, null, dch.b.b);
            $$0.a(null, dji.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(aki $$0, gv $$1) {
      for (biw $$3 : $$0.a(biw.class, new eha($$1), bij.f)) {
         if ($$3 instanceof bjo $$4 && $$4.a()) {
            $$4.a(aov.e);
            $$0.a(null, dji.M, $$1);
            return true;
         }
      }

      return false;
   }
}
