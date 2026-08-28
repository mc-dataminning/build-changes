public class kw extends ku {
   @Override
   protected cur a(kq $$0, cur $$1) {
      arf $$2 = $$0.b();
      if (!$$2.x_()) {
         iz $$3 = $$0.c().a($$0.d().c(dhg.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.b()) {
            $$1.a(1, $$2.E_(), null, () -> $$1.e(0));
         }
      }

      return $$1;
   }

   private static boolean a(arf $$0, iz $$1) {
      dse $$2 = $$0.a_($$1);
      if ($$2.a(awp.aG, $$0x -> $$0x.b(dev.c) && $$0x.b() instanceof dev)) {
         int $$3 = $$2.c(dev.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, awa.bX, awb.e, 1.0F, 1.0F);
            dev.a($$0, $$1);
            ((dev)$$2.b()).a($$0, $$2, $$1, null, dpg.b.b);
            $$0.a(null, dwx.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(arf $$0, iz $$1) {
      for (btr $$3 : $$0.a(btr.class, new evo($$1), btb.f)) {
         if ($$3 instanceof bui $$4 && $$4.a()) {
            $$4.a(awb.e);
            $$0.a(null, dwx.M, $$1);
            return true;
         }
      }

      return false;
   }
}
