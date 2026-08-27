public class jq extends jp {
   @Override
   protected cqm a(jl $$0, cqm $$1) {
      apf $$2 = $$0.b();
      if (!$$2.x_()) {
         ib $$3 = $$0.c().a($$0.d().c(dch.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.a()) {
            $$1.a(1, $$2.E_(), null, () -> $$1.f(0));
         }
      }

      return $$1;
   }

   private static boolean a(apf $$0, ib $$1) {
      dnb $$2 = $$0.a_($$1);
      if ($$2.a(aun.aG, $$0x -> $$0x.b(czw.c) && $$0x.b() instanceof czw)) {
         int $$3 = $$2.c(czw.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, aty.bX, atz.e, 1.0F, 1.0F);
            czw.a($$0, $$1);
            ((czw)$$2.b()).a($$0, $$2, $$1, null, dkf.b.b);
            $$0.a(null, drp.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(apf $$0, ib $$1) {
      for (bpp $$3 : $$0.a(bpp.class, new epo($$1), bpc.f)) {
         if ($$3 instanceof bqf $$4 && $$4.a()) {
            $$4.a(atz.e);
            $$0.a(null, drp.M, $$1);
            return true;
         }
      }

      return false;
   }
}
