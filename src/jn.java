public class jn extends jm {
   @Override
   protected coz a(ji $$0, coz $$1) {
      aov $$2 = $$0.b();
      if (!$$2.y_()) {
         hz $$3 = $$0.c().a($$0.d().c(dat.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.a()) {
            $$1.a(1, $$2.F_(), null, () -> $$1.f(0));
         }
      }

      return $$1;
   }

   private static boolean a(aov $$0, hz $$1) {
      dlf $$2 = $$0.a_($$1);
      if ($$2.a(atz.aF, $$0x -> $$0x.b(cyi.c) && $$0x.b() instanceof cyi)) {
         int $$3 = $$2.c(cyi.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, atk.bU, atl.e, 1.0F, 1.0F);
            cyi.a($$0, $$1);
            ((cyi)$$2.b()).a($$0, $$2, $$1, null, diq.b.b);
            $$0.a(null, dpp.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(aov $$0, hz $$1) {
      for (bog $$3 : $$0.a(bog.class, new enn($$1), bnt.f)) {
         if ($$3 instanceof bow $$4 && $$4.a()) {
            $$4.a(atl.e);
            $$0.a(null, dpp.M, $$1);
            return true;
         }
      }

      return false;
   }
}
