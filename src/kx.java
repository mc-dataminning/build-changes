public class kx extends kv {
   @Override
   protected cuc a(kr $$0, cuc $$1) {
      aqm $$2 = $$0.b();
      if (!$$2.x_()) {
         ja $$3 = $$0.c().a($$0.d().c(dhm.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.b()) {
            $$1.a(1, $$2, null, () -> $$1.e(0));
         }
      }

      return $$1;
   }

   private static boolean a(aqm $$0, ja $$1) {
      dsk $$2 = $$0.a_($$1);
      if ($$2.a(avw.aG, $$0x -> $$0x.b(dfb.c) && $$0x.b() instanceof dfb)) {
         int $$3 = $$2.c(dfb.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, avh.bX, avi.e, 1.0F, 1.0F);
            dfb.a($$0, $$1);
            ((dfb)$$2.b()).a($$0, $$2, $$1, null, dpm.b.b);
            $$0.a(null, dxg.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(aqm $$0, ja $$1) {
      for (btb $$3 : $$0.a(btb.class, new ewa($$1), bsl.f)) {
         if ($$3 instanceof bts $$4 && $$4.a()) {
            $$4.a(avi.e);
            $$0.a(null, dxg.M, $$1);
            return true;
         }
      }

      return false;
   }
}
