public class jk extends jj {
   @Override
   protected clo a(jf $$0, clo $$1) {
      ami $$2 = $$0.b();
      if (!$$2.y_()) {
         hx $$3 = $$0.c().a($$0.d().c(cxk.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.a() && $$1.a(1, $$2.F_(), null)) {
            $$1.f(0);
         }
      }

      return $$1;
   }

   private static boolean a(ami $$0, hx $$1) {
      dhn $$2 = $$0.a_($$1);
      if ($$2.a(ark.aF, $$0x -> $$0x.b(cuz.c) && $$0x.b() instanceof cuz)) {
         int $$3 = $$2.c(cuz.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, aqv.bI, aqw.e, 1.0F, 1.0F);
            cuz.a($$0, $$1);
            ((cuz)$$2.b()).a($$0, $$2, $$1, null, dff.b.b);
            $$0.a(null, dlx.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(ami $$0, hx $$1) {
      for (bll $$3 : $$0.a(bll.class, new eju($$1), bky.f)) {
         if ($$3 instanceof bmc $$4 && $$4.a()) {
            $$4.a(aqw.e);
            $$0.a(null, dlx.M, $$1);
            return true;
         }
      }

      return false;
   }
}
