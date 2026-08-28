public class lg extends le {
   @Override
   protected cxo a(ky $$0, cxo $$1) {
      ash $$2 = $$0.b();
      if (!$$2.B_()) {
         jh $$3 = $$0.c().a($$0.d().c(dms.b));
         this.a(a($$2, $$3) || a($$2, $$3, $$1));
         if (this.b()) {
            $$1.a(1, $$2, null, $$0x -> {
            });
         }
      }

      return $$1;
   }

   private static boolean a(ash $$0, jh $$1) {
      dxu $$2 = $$0.a_($$1);
      if ($$2.a(axu.aJ, $$0x -> $$0x.b(dkf.c) && $$0x.b() instanceof dkf)) {
         int $$3 = $$2.c(dkf.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, axf.bX, axg.e, 1.0F, 1.0F);
            dkf.a($$0, $$1);
            ((dkf)$$2.b()).a($$0, $$2, $$1, null, dut.b.b);
            $$0.a(null, ecq.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean a(ash $$0, jh $$1, cxo $$2) {
      for (bwf $$4 : $$0.a(bwf.class, new fbs($$1), bvo.f)) {
         if ($$4 instanceof bww $$5 && $$5.a()) {
            $$5.a($$0, axg.e, $$2);
            $$0.a(null, ecq.M, $$1);
            return true;
         }
      }

      return false;
   }
}
