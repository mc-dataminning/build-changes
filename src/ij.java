public class ij extends ii {
   @Override
   protected ciy a(gv $$0, ciy $$1) {
      akk $$2 = $$0.g();
      if (!$$2.r_()) {
         gu $$3 = $$0.d().a($$0.e().c(cun.a));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.a() && $$1.a(1, $$2.y_(), null)) {
            $$1.f(0);
         }
      }

      return $$1;
   }

   private static boolean a(akk $$0, gu $$1) {
      dfa $$2 = $$0.a_($$1);
      if ($$2.a(apl.aF, $$0x -> $$0x.b(csg.b) && $$0x.b() instanceof csg)) {
         int $$3 = $$2.c(csg.b);
         if ($$3 >= 5) {
            $$0.a(null, $$1, aow.bI, aox.e, 1.0F, 1.0F);
            csg.a($$0, $$1);
            ((csg)$$2.b()).a($$0, $$2, $$1, null, dcj.b.b);
            $$0.a(null, djk.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(akk $$0, gu $$1) {
      for (biy $$3 : $$0.a(biy.class, new egz($$1), bil.f)) {
         if ($$3 instanceof bjq $$4 && $$4.a()) {
            $$4.a(aox.e);
            $$0.a(null, djk.M, $$1);
            return true;
         }
      }

      return false;
   }
}
