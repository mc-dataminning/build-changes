public class lh extends lf {
   @Override
   protected cwp a(kz $$0, cwp $$1) {
      ard $$2 = $$0.b();
      if (!$$2.B_()) {
         ji $$3 = $$0.c().a($$0.d().c(dls.b));
         this.a(a($$2, $$3) || a($$2, $$3, $$1));
         if (this.b()) {
            $$1.a(1, $$2, null, $$0x -> {
            });
         }
      }

      return $$1;
   }

   private static boolean a(ard $$0, ji $$1) {
      dwx $$2 = $$0.a_($$1);
      if ($$2.a(awp.aJ, $$0x -> $$0x.b(djg.c) && $$0x.b() instanceof djg)) {
         int $$3 = $$2.c(djg.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, awa.bX, awb.e, 1.0F, 1.0F);
            djg.a($$0, $$1);
            ((djg)$$2.b()).a($$0, $$2, $$1, null, dtw.b.b);
            $$0.a(null, ebt.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean a(ard $$0, ji $$1, cwp $$2) {
      for (bvh $$4 : $$0.a(bvh.class, new fav($$1), buq.f)) {
         if ($$4 instanceof bvy $$5 && $$5.a()) {
            $$5.a($$0, awb.e, $$2);
            $$0.a(null, ebt.M, $$1);
            return true;
         }
      }

      return false;
   }
}
