public class le extends lc {
   @Override
   protected cvx a(kx $$0, cvx $$1) {
      arm $$2 = $$0.b();
      if (!$$2.y_()) {
         jg $$3 = $$0.c().a($$0.d().c(dkd.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.b()) {
            $$1.a(1, $$2, null, $$0x -> {
            });
         }
      }

      return $$1;
   }

   private static boolean a(arm $$0, jg $$1) {
      dvd $$2 = $$0.a_($$1);
      if ($$2.a(awz.aH, $$0x -> $$0x.b(dhs.c) && $$0x.b() instanceof dhs)) {
         int $$3 = $$2.c(dhs.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, awk.bX, awl.e, 1.0F, 1.0F);
            dhs.a($$0, $$1);
            ((dhs)$$2.b()).a($$0, $$2, $$1, null, dsd.b.b);
            $$0.a(null, eaa.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(arm $$0, jg $$1) {
      for (buv $$3 : $$0.a(buv.class, new ezc($$1), bue.f)) {
         if ($$3 instanceof bvm $$4 && $$4.a()) {
            $$4.a(awl.e);
            $$0.a(null, eaa.M, $$1);
            return true;
         }
      }

      return false;
   }
}
