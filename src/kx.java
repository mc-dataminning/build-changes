public class kx extends kv {
   @Override
   protected cua a(kr $$0, cua $$1) {
      aqk $$2 = $$0.b();
      if (!$$2.x_()) {
         ja $$3 = $$0.c().a($$0.d().c(dhk.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.b()) {
            $$1.a(1, $$2, null, () -> $$1.e(0));
         }
      }

      return $$1;
   }

   private static boolean a(aqk $$0, ja $$1) {
      dsh $$2 = $$0.a_($$1);
      if ($$2.a(avu.aG, $$0x -> $$0x.b(dez.c) && $$0x.b() instanceof dez)) {
         int $$3 = $$2.c(dez.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, avf.bX, avg.e, 1.0F, 1.0F);
            dez.a($$0, $$1);
            ((dez)$$2.b()).a($$0, $$2, $$1, null, dpk.b.b);
            $$0.a(null, dxa.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(aqk $$0, ja $$1) {
      for (bsy $$3 : $$0.a(bsy.class, new evu($$1), bsi.f)) {
         if ($$3 instanceof btp $$4 && $$4.a()) {
            $$4.a(avg.e);
            $$0.a(null, dxa.M, $$1);
            return true;
         }
      }

      return false;
   }
}
