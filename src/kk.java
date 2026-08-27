public class kk extends kj {
   @Override
   protected csz a(kf $$0, csz $$1) {
      aqh $$2 = $$0.b();
      if (!$$2.x_()) {
         in $$3 = $$0.c().a($$0.d().c(dfj.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.a()) {
            $$1.a(1, $$2.E_(), null, () -> $$1.e(0));
         }
      }

      return $$1;
   }

   private static boolean a(aqh $$0, in $$1) {
      dqh $$2 = $$0.a_($$1);
      if ($$2.a(avr.aG, $$0x -> $$0x.b(dcy.c) && $$0x.b() instanceof dcy)) {
         int $$3 = $$2.c(dcy.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, avc.bX, avd.e, 1.0F, 1.0F);
            dcy.a($$0, $$1);
            ((dcy)$$2.b()).a($$0, $$2, $$1, null, dnj.b.b);
            $$0.a(null, dva.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(aqh $$0, in $$1) {
      for (bsa $$3 : $$0.a(bsa.class, new etk($$1), brm.f)) {
         if ($$3 instanceof bsq $$4 && $$4.a()) {
            $$4.a(avd.e);
            $$0.a(null, dva.M, $$1);
            return true;
         }
      }

      return false;
   }
}
