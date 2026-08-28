public class lg extends le {
   @Override
   protected cxg a(ky $$0, cxg $$1) {
      arx $$2 = $$0.b();
      if (!$$2.B_()) {
         jh $$3 = $$0.c().a($$0.d().c(dmj.b));
         this.a(a($$2, $$3) || a($$2, $$3, $$1));
         if (this.b()) {
            $$1.a(1, $$2, null, $$0x -> {
            });
         }
      }

      return $$1;
   }

   private static boolean a(arx $$0, jh $$1) {
      dxo $$2 = $$0.a_($$1);
      if ($$2.a(axk.aJ, $$0x -> $$0x.b(djx.c) && $$0x.b() instanceof djx)) {
         int $$3 = $$2.c(djx.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, awv.bX, aww.e, 1.0F, 1.0F);
            djx.a($$0, $$1);
            ((djx)$$2.b()).a($$0, $$2, $$1, null, dun.b.b);
            $$0.a(null, eck.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean a(arx $$0, jh $$1, cxg $$2) {
      for (bvx $$4 : $$0.a(bvx.class, new fbm($$1), bvg.f)) {
         if ($$4 instanceof bwo $$5 && $$5.a()) {
            $$5.a($$0, aww.e, $$2);
            $$0.a(null, eck.M, $$1);
            return true;
         }
      }

      return false;
   }
}
