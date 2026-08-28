public class lh extends lf {
   @Override
   protected cxh a(kz $$0, cxh $$1) {
      ard $$2 = $$0.b();
      if (!$$2.w_()) {
         ji $$3 = $$0.c().a($$0.d().c(dmk.b));
         this.a(a($$2, $$3) || a($$2, $$3, $$1));
         if (this.b()) {
            $$1.a(1, $$2, null, $$0x -> {
            });
         }
      }

      return $$1;
   }

   private static boolean a(ard $$0, ji $$1) {
      dxq $$2 = $$0.a_($$1);
      if ($$2.a(awp.aJ, $$0x -> $$0x.b(djy.c) && $$0x.b() instanceof djy)) {
         int $$3 = $$2.c(djy.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, awa.bX, awb.e, 1.0F, 1.0F);
            djy.a($$0, $$1);
            ((djy)$$2.b()).a($$0, $$2, $$1, null, dup.b.b);
            $$0.a(null, ecp.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean a(ard $$0, ji $$1, cxh $$2) {
      for (bvy $$4 : $$0.a(bvy.class, new fbs($$1), bvg.f)) {
         if ($$4 instanceof bwp $$5 && $$5.a()) {
            $$5.a($$0, awb.e, $$2);
            $$0.a(null, ecp.M, $$1);
            return true;
         }
      }

      return false;
   }
}
