public class kw extends ku {
   @Override
   protected cuo a(kq $$0, cuo $$1) {
      are $$2 = $$0.b();
      if (!$$2.x_()) {
         iz $$3 = $$0.c().a($$0.d().c(dhd.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.b()) {
            $$1.a(1, $$2.E_(), null, () -> $$1.e(0));
         }
      }

      return $$1;
   }

   private static boolean a(are $$0, iz $$1) {
      dsb $$2 = $$0.a_($$1);
      if ($$2.a(awo.aG, $$0x -> $$0x.b(des.c) && $$0x.b() instanceof des)) {
         int $$3 = $$2.c(des.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, avz.bX, awa.e, 1.0F, 1.0F);
            des.a($$0, $$1);
            ((des)$$2.b()).a($$0, $$2, $$1, null, dpd.b.b);
            $$0.a(null, dwu.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(are $$0, iz $$1) {
      for (bto $$3 : $$0.a(bto.class, new evl($$1), bsy.f)) {
         if ($$3 instanceof buf $$4 && $$4.a()) {
            $$4.a(awa.e);
            $$0.a(null, dwu.M, $$1);
            return true;
         }
      }

      return false;
   }
}
