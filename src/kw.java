public class kw extends ku {
   @Override
   protected cup a(kq $$0, cup $$1) {
      arf $$2 = $$0.b();
      if (!$$2.x_()) {
         iz $$3 = $$0.c().a($$0.d().c(dhe.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.b()) {
            $$1.a(1, $$2.E_(), null, () -> $$1.e(0));
         }
      }

      return $$1;
   }

   private static boolean a(arf $$0, iz $$1) {
      dsc $$2 = $$0.a_($$1);
      if ($$2.a(awp.aG, $$0x -> $$0x.b(det.c) && $$0x.b() instanceof det)) {
         int $$3 = $$2.c(det.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, awa.bX, awb.e, 1.0F, 1.0F);
            det.a($$0, $$1);
            ((det)$$2.b()).a($$0, $$2, $$1, null, dpe.b.b);
            $$0.a(null, dwv.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(arf $$0, iz $$1) {
      for (btp $$3 : $$0.a(btp.class, new evm($$1), bsz.f)) {
         if ($$3 instanceof bug $$4 && $$4.a()) {
            $$4.a(awb.e);
            $$0.a(null, dwv.M, $$1);
            return true;
         }
      }

      return false;
   }
}
