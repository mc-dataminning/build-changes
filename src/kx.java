public class kx extends kv {
   @Override
   protected cud a(kr $$0, cud $$1) {
      aqm $$2 = $$0.b();
      if (!$$2.x_()) {
         ja $$3 = $$0.c().a($$0.d().c(dhn.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.b()) {
            $$1.a(1, $$2, null, $$0x -> {
            });
         }
      }

      return $$1;
   }

   private static boolean a(aqm $$0, ja $$1) {
      dsl $$2 = $$0.a_($$1);
      if ($$2.a(avw.aG, $$0x -> $$0x.b(dfc.c) && $$0x.b() instanceof dfc)) {
         int $$3 = $$2.c(dfc.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, avh.bX, avi.e, 1.0F, 1.0F);
            dfc.a($$0, $$1);
            ((dfc)$$2.b()).a($$0, $$2, $$1, null, dpn.b.b);
            $$0.a(null, dxh.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(aqm $$0, ja $$1) {
      for (btc $$3 : $$0.a(btc.class, new ewc($$1), bsm.f)) {
         if ($$3 instanceof btt $$4 && $$4.a()) {
            $$4.a(avi.e);
            $$0.a(null, dxh.M, $$1);
            return true;
         }
      }

      return false;
   }
}
