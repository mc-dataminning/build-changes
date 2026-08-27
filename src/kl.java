public class kl extends kj {
   @Override
   protected ctq a(kf $$0, ctq $$1) {
      aqn $$2 = $$0.b();
      if (!$$2.x_()) {
         io $$3 = $$0.c().a($$0.d().c(dgf.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.b()) {
            $$1.a(1, $$2.E_(), null, () -> $$1.e(0));
         }
      }

      return $$1;
   }

   private static boolean a(aqn $$0, io $$1) {
      drd $$2 = $$0.a_($$1);
      if ($$2.a(avx.aG, $$0x -> $$0x.b(ddu.c) && $$0x.b() instanceof ddu)) {
         int $$3 = $$2.c(ddu.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, avi.bX, avj.e, 1.0F, 1.0F);
            ddu.a($$0, $$1);
            ((ddu)$$2.b()).a($$0, $$2, $$1, null, dof.b.b);
            $$0.a(null, dvw.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(aqn $$0, io $$1) {
      for (bsq $$3 : $$0.a(bsq.class, new euh($$1), bsb.f)) {
         if ($$3 instanceof bth $$4 && $$4.a()) {
            $$4.a(avj.e);
            $$0.a(null, dvw.M, $$1);
            return true;
         }
      }

      return false;
   }
}
