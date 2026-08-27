public class ko extends kn {
   @Override
   protected cuh a(kj $$0, cuh $$1) {
      aqt $$2 = $$0.b();
      if (!$$2.x_()) {
         ir $$3 = $$0.c().a($$0.d().c(dhi.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.a()) {
            $$1.a(1, $$2.F_(), null, () -> $$1.e(0));
         }
      }

      return $$1;
   }

   private static boolean a(aqt $$0, ir $$1) {
      dtc $$2 = $$0.a_($$1);
      if ($$2.a(awe.aH, $$0x -> $$0x.b(dev.c) && $$0x.b() instanceof dev)) {
         int $$3 = $$2.c(dev.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, avo.cc, avq.e, 1.0F, 1.0F);
            dev.a($$0, $$1);
            ((dev)$$2.b()).a($$0, $$2, $$1, null, dpy.b.b);
            $$0.a(null, dxv.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(aqt $$0, ir $$1) {
      for (bso $$3 : $$0.a(bso.class, new ewp($$1), bsa.f)) {
         if ($$3 instanceof bte $$4 && $$4.a()) {
            $$4.a(avq.e);
            $$0.a(null, dxv.M, $$1);
            return true;
         }
      }

      return false;
   }
}
