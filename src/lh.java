public class lh extends lf {
   @Override
   protected cwq a(kz $$0, cwq $$1) {
      ard $$2 = $$0.b();
      if (!$$2.B_()) {
         ji $$3 = $$0.c().a($$0.d().c(dlt.b));
         this.a(a($$2, $$3) || a($$2, $$3, $$1));
         if (this.b()) {
            $$1.a(1, $$2, null, $$0x -> {
            });
         }
      }

      return $$1;
   }

   private static boolean a(ard $$0, ji $$1) {
      dwy $$2 = $$0.a_($$1);
      if ($$2.a(awp.aJ, $$0x -> $$0x.b(djh.c) && $$0x.b() instanceof djh)) {
         int $$3 = $$2.c(djh.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, awa.bX, awb.e, 1.0F, 1.0F);
            djh.a($$0, $$1);
            ((djh)$$2.b()).a($$0, $$2, $$1, null, dtx.b.b);
            $$0.a(null, ebu.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean a(ard $$0, ji $$1, cwq $$2) {
      for (bvi $$4 : $$0.a(bvi.class, new faw($$1), bur.f)) {
         if ($$4 instanceof bvz $$5 && $$5.a()) {
            $$5.a($$0, awb.e, $$2);
            $$0.a(null, ebu.M, $$1);
            return true;
         }
      }

      return false;
   }
}
