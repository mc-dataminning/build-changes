public class lg extends le {
   @Override
   protected cwm a(ky $$0, cwm $$1) {
      arp $$2 = $$0.b();
      if (!$$2.A_()) {
         jh $$3 = $$0.c().a($$0.d().c(dkv.b));
         this.a(a($$2, $$3) || a($$2, $$3, $$1));
         if (this.b()) {
            $$1.a(1, $$2, null, $$0x -> {
            });
         }
      }

      return $$1;
   }

   private static boolean a(arp $$0, jh $$1) {
      dvv $$2 = $$0.a_($$1);
      if ($$2.a(axc.aI, $$0x -> $$0x.b(dik.c) && $$0x.b() instanceof dik)) {
         int $$3 = $$2.c(dik.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, awn.bX, awo.e, 1.0F, 1.0F);
            dik.a($$0, $$1);
            ((dik)$$2.b()).a($$0, $$2, $$1, null, dsv.b.b);
            $$0.a(null, ear.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean a(arp $$0, jh $$1, cwm $$2) {
      for (bvh $$4 : $$0.a(bvh.class, new ezt($$1), buq.f)) {
         if ($$4 instanceof bvy $$5 && $$5.a()) {
            $$5.a($$0, awo.e, $$2);
            $$0.a(null, ear.M, $$1);
            return true;
         }
      }

      return false;
   }
}
