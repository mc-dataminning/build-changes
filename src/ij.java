public class ij extends ii {
   @Override
   protected cfz a(gv $$0, cfz $$1) {
      aif $$2 = $$0.g();
      if (!$$2.r_()) {
         gu $$3 = $$0.d().a($$0.e().c(cro.a));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.a() && $$1.a(1, $$2.y_(), null)) {
            $$1.f(0);
         }
      }

      return $$1;
   }

   private static boolean a(aif $$0, gu $$1) {
      dcb $$2 = $$0.a_($$1);
      if ($$2.a(amw.aE, $$0x -> $$0x.b(cph.b) && $$0x.b() instanceof cph)) {
         int $$3 = $$2.c(cph.b);
         if ($$3 >= 5) {
            $$0.a(null, $$1, amh.bI, ami.e, 1.0F, 1.0F);
            cph.a($$0, $$1);
            ((cph)$$2.b()).a($$0, $$2, $$1, null, czk.b.b);
            $$0.a(null, dgl.N, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(aif $$0, gu $$1) {
      for (bfz $$3 : $$0.a(bfz.class, new eed($$1), bfm.f)) {
         if ($$3 instanceof bgr $$4 && $$4.a()) {
            $$4.a(ami.e);
            $$0.a(null, dgl.N, $$1);
            return true;
         }
      }

      return false;
   }
}
