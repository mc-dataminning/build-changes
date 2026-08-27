public class kb extends ka {
   @Override
   protected crs a(jw $$0, crs $$1) {
      apu $$2 = $$0.b();
      if (!$$2.x_()) {
         id $$3 = $$0.c().a($$0.d().c(dem.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.a()) {
            $$1.a(1, $$2.E_(), null, () -> $$1.e(0));
         }
      }

      return $$1;
   }

   private static boolean a(apu $$0, id $$1) {
      dpi $$2 = $$0.a_($$1);
      if ($$2.a(ave.aG, $$0x -> $$0x.b(dcb.c) && $$0x.b() instanceof dcb)) {
         int $$3 = $$2.c(dcb.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, auo.bX, aup.e, 1.0F, 1.0F);
            dcb.a($$0, $$1);
            ((dcb)$$2.b()).a($$0, $$2, $$1, null, dml.b.b);
            $$0.a(null, dub.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(apu $$0, id $$1) {
      for (bqt $$3 : $$0.a(bqt.class, new ese($$1), bqf.f)) {
         if ($$3 instanceof brj $$4 && $$4.a()) {
            $$4.a(aup.e);
            $$0.a(null, dub.M, $$1);
            return true;
         }
      }

      return false;
   }
}
