public class ij extends ii {
   @Override
   protected cix a(gv $$0, cix $$1) {
      akk $$2 = $$0.g();
      if (!$$2.r_()) {
         gu $$3 = $$0.d().a($$0.e().c(cum.a));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.a() && $$1.a(1, $$2.y_(), null)) {
            $$1.f(0);
         }
      }

      return $$1;
   }

   private static boolean a(akk $$0, gu $$1) {
      dez $$2 = $$0.a_($$1);
      if ($$2.a(apl.aF, $$0x -> $$0x.b(csf.b) && $$0x.b() instanceof csf)) {
         int $$3 = $$2.c(csf.b);
         if ($$3 >= 5) {
            $$0.a(null, $$1, aow.bI, aox.e, 1.0F, 1.0F);
            csf.a($$0, $$1);
            ((csf)$$2.b()).a($$0, $$2, $$1, null, dci.b.b);
            $$0.a(null, djj.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(akk $$0, gu $$1) {
      for (biy $$3 : $$0.a(biy.class, new egy($$1), bil.f)) {
         if ($$3 instanceof bjp $$4 && $$4.a()) {
            $$4.a(aox.e);
            $$0.a(null, djj.M, $$1);
            return true;
         }
      }

      return false;
   }
}
