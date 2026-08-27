public class jj extends ji {
   @Override
   protected cmh a(je $$0, cmh $$1) {
      amp $$2 = $$0.b();
      if (!$$2.y_()) {
         hv $$3 = $$0.c().a($$0.d().c(cye.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.a() && $$1.a(1, $$2.F_(), null)) {
            $$1.f(0);
         }
      }

      return $$1;
   }

   private static boolean a(amp $$0, hv $$1) {
      dip $$2 = $$0.a_($$1);
      if ($$2.a(arr.aF, $$0x -> $$0x.b(cvt.c) && $$0x.b() instanceof cvt)) {
         int $$3 = $$2.c(cvt.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, arc.bI, ard.e, 1.0F, 1.0F);
            cvt.a($$0, $$1);
            ((cvt)$$2.b()).a($$0, $$2, $$1, null, dga.b.b);
            $$0.a(null, dmz.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(amp $$0, hv $$1) {
      for (blv $$3 : $$0.a(blv.class, new ekw($$1), bli.f)) {
         if ($$3 instanceof bmm $$4 && $$4.a()) {
            $$4.a(ard.e);
            $$0.a(null, dmz.M, $$1);
            return true;
         }
      }

      return false;
   }
}
