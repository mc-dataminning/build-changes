public class jn extends jm {
   @Override
   protected cpd a(ji $$0, cpd $$1) {
      aow $$2 = $$0.b();
      if (!$$2.y_()) {
         hz $$3 = $$0.c().a($$0.d().c(dax.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.a()) {
            $$1.a(1, $$2.F_(), null, () -> $$1.f(0));
         }
      }

      return $$1;
   }

   private static boolean a(aow $$0, hz $$1) {
      dlj $$2 = $$0.a_($$1);
      if ($$2.a(aua.aF, $$0x -> $$0x.b(cym.c) && $$0x.b() instanceof cym)) {
         int $$3 = $$2.c(cym.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, atl.bV, atm.e, 1.0F, 1.0F);
            cym.a($$0, $$1);
            ((cym)$$2.b()).a($$0, $$2, $$1, null, diu.b.b);
            $$0.a(null, dpw.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(aow $$0, hz $$1) {
      for (boi $$3 : $$0.a(boi.class, new enu($$1), bnv.f)) {
         if ($$3 instanceof boy $$4 && $$4.a()) {
            $$4.a(atm.e);
            $$0.a(null, dpw.M, $$1);
            return true;
         }
      }

      return false;
   }
}
