public class lg extends le {
   @Override
   protected cwf a(ky $$0, cwf $$1) {
      arq $$2 = $$0.b();
      if (!$$2.y_()) {
         jh $$3 = $$0.c().a($$0.d().c(dko.b));
         this.a(a($$2, $$3) || a($$2, $$3, $$1));
         if (this.b()) {
            $$1.a(1, $$2, null, $$0x -> {
            });
         }
      }

      return $$1;
   }

   private static boolean a(arq $$0, jh $$1) {
      dvo $$2 = $$0.a_($$1);
      if ($$2.a(axd.aI, $$0x -> $$0x.b(did.c) && $$0x.b() instanceof did)) {
         int $$3 = $$2.c(did.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, awo.bX, awp.e, 1.0F, 1.0F);
            did.a($$0, $$1);
            ((did)$$2.b()).a($$0, $$2, $$1, null, dso.b.b);
            $$0.a(null, eak.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean a(arq $$0, jh $$1, cwf $$2) {
      for (bve $$4 : $$0.a(bve.class, new ezm($$1), bun.f)) {
         if ($$4 instanceof bvv $$5 && $$5.a()) {
            $$5.a(awp.e, $$2);
            $$0.a(null, eak.M, $$1);
            return true;
         }
      }

      return false;
   }
}
