public class kw extends ku {
   @Override
   protected cuk a(kq $$0, cuk $$1) {
      arb $$2 = $$0.b();
      if (!$$2.x_()) {
         iz $$3 = $$0.c().a($$0.d().c(dgz.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.b()) {
            $$1.a(1, $$2.E_(), null, () -> $$1.e(0));
         }
      }

      return $$1;
   }

   private static boolean a(arb $$0, iz $$1) {
      drx $$2 = $$0.a_($$1);
      if ($$2.a(awl.aG, $$0x -> $$0x.b(deo.c) && $$0x.b() instanceof deo)) {
         int $$3 = $$2.c(deo.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, avw.bX, avx.e, 1.0F, 1.0F);
            deo.a($$0, $$1);
            ((deo)$$2.b()).a($$0, $$2, $$1, null, doz.b.b);
            $$0.a(null, dwq.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(arb $$0, iz $$1) {
      for (btk $$3 : $$0.a(btk.class, new evh($$1), bsu.f)) {
         if ($$3 instanceof bub $$4 && $$4.a()) {
            $$4.a(avx.e);
            $$0.a(null, dwq.M, $$1);
            return true;
         }
      }

      return false;
   }
}
