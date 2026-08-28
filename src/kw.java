public class kw extends ku {
   @Override
   protected cuq a(kq $$0, cuq $$1) {
      arf $$2 = $$0.b();
      if (!$$2.x_()) {
         iz $$3 = $$0.c().a($$0.d().c(dhf.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.b()) {
            $$1.a(1, $$2.E_(), null, () -> $$1.e(0));
         }
      }

      return $$1;
   }

   private static boolean a(arf $$0, iz $$1) {
      dsd $$2 = $$0.a_($$1);
      if ($$2.a(awp.aG, $$0x -> $$0x.b(deu.c) && $$0x.b() instanceof deu)) {
         int $$3 = $$2.c(deu.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, awa.bX, awb.e, 1.0F, 1.0F);
            deu.a($$0, $$1);
            ((deu)$$2.b()).a($$0, $$2, $$1, null, dpf.b.b);
            $$0.a(null, dww.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(arf $$0, iz $$1) {
      for (btq $$3 : $$0.a(btq.class, new evn($$1), bta.f)) {
         if ($$3 instanceof buh $$4 && $$4.a()) {
            $$4.a(awb.e);
            $$0.a(null, dww.M, $$1);
            return true;
         }
      }

      return false;
   }
}
