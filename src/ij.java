public class ij extends ii {
   @Override
   protected cjl a(id $$0, cjl $$1) {
      akt $$2 = $$0.b();
      if (!$$2.w_()) {
         gw $$3 = $$0.c().a($$0.d().c(cvf.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.a() && $$1.a(1, $$2.D_(), null)) {
            $$1.f(0);
         }
      }

      return $$1;
   }

   private static boolean a(akt $$0, gw $$1) {
      dfd $$2 = $$0.a_($$1);
      if ($$2.a(apv.aF, $$0x -> $$0x.b(csw.c) && $$0x.b() instanceof csw)) {
         int $$3 = $$2.c(csw.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, apg.bI, aph.e, 1.0F, 1.0F);
            csw.a($$0, $$1);
            ((csw)$$2.b()).a($$0, $$2, $$1, null, dcw.b.b);
            $$0.a(null, djn.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(akt $$0, gw $$1) {
      for (bjm $$3 : $$0.a(bjm.class, new ehc($$1), biz.f)) {
         if ($$3 instanceof bkd $$4 && $$4.a()) {
            $$4.a(aph.e);
            $$0.a(null, djn.M, $$1);
            return true;
         }
      }

      return false;
   }
}
