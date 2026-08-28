public class lh extends lf {
   @Override
   protected cwo a(kz $$0, cwo $$1) {
      ard $$2 = $$0.b();
      if (!$$2.B_()) {
         ji $$3 = $$0.c().a($$0.d().c(dlr.b));
         this.a(a($$2, $$3) || a($$2, $$3, $$1));
         if (this.b()) {
            $$1.a(1, $$2, null, $$0x -> {
            });
         }
      }

      return $$1;
   }

   private static boolean a(ard $$0, ji $$1) {
      dww $$2 = $$0.a_($$1);
      if ($$2.a(awp.aJ, $$0x -> $$0x.b(djf.c) && $$0x.b() instanceof djf)) {
         int $$3 = $$2.c(djf.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, awa.bX, awb.e, 1.0F, 1.0F);
            djf.a($$0, $$1);
            ((djf)$$2.b()).a($$0, $$2, $$1, null, dtv.b.b);
            $$0.a(null, ebs.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean a(ard $$0, ji $$1, cwo $$2) {
      for (bvg $$4 : $$0.a(bvg.class, new fau($$1), bup.f)) {
         if ($$4 instanceof bvx $$5 && $$5.a()) {
            $$5.a($$0, awb.e, $$2);
            $$0.a(null, ebs.M, $$1);
            return true;
         }
      }

      return false;
   }
}
