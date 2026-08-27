public class ij extends ii {
   @Override
   protected cjf a(id $$0, cjf $$1) {
      akq $$2 = $$0.b();
      if (!$$2.w_()) {
         gw $$3 = $$0.c().a($$0.d().c(cuw.a));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.a() && $$1.a(1, $$2.D_(), null)) {
            $$1.f(0);
         }
      }

      return $$1;
   }

   private static boolean a(akq $$0, gw $$1) {
      dfj $$2 = $$0.a_($$1);
      if ($$2.a(aps.aF, $$0x -> $$0x.b(csp.b) && $$0x.b() instanceof csp)) {
         int $$3 = $$2.c(csp.b);
         if ($$3 >= 5) {
            $$0.a(null, $$1, apd.bI, ape.e, 1.0F, 1.0F);
            csp.a($$0, $$1);
            ((csp)$$2.b()).a($$0, $$2, $$1, null, dcs.b.b);
            $$0.a(null, djt.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(akq $$0, gw $$1) {
      for (bjg $$3 : $$0.a(bjg.class, new ehi($$1), bit.f)) {
         if ($$3 instanceof bjx $$4 && $$4.a()) {
            $$4.a(ape.e);
            $$0.a(null, djt.M, $$1);
            return true;
         }
      }

      return false;
   }
}
