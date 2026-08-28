public class lg extends le {
   @Override
   protected cxp a(ky $$0, cxp $$1) {
      ash $$2 = $$0.b();
      if (!$$2.B_()) {
         jh $$3 = $$0.c().a($$0.d().c(dmt.b));
         this.a(a($$2, $$3) || a($$2, $$3, $$1));
         if (this.b()) {
            $$1.a(1, $$2, null, $$0x -> {
            });
         }
      }

      return $$1;
   }

   private static boolean a(ash $$0, jh $$1) {
      dxv $$2 = $$0.a_($$1);
      if ($$2.a(axu.aJ, $$0x -> $$0x.b(dkg.c) && $$0x.b() instanceof dkg)) {
         int $$3 = $$2.c(dkg.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, axf.bX, axg.e, 1.0F, 1.0F);
            dkg.a($$0, $$1);
            ((dkg)$$2.b()).a($$0, $$2, $$1, null, duu.b.b);
            $$0.a(null, ecr.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean a(ash $$0, jh $$1, cxp $$2) {
      for (bwg $$4 : $$0.a(bwg.class, new fbt($$1), bvp.f)) {
         if ($$4 instanceof bwx $$5 && $$5.a()) {
            $$5.a($$0, axg.e, $$2);
            $$0.a(null, ecr.M, $$1);
            return true;
         }
      }

      return false;
   }
}
