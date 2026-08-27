public class kj extends ki {
   @Override
   protected csd a(ke $$0, csd $$1) {
      aqe $$2 = $$0.b();
      if (!$$2.x_()) {
         im $$3 = $$0.c().a($$0.d().c(dfa.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.a()) {
            $$1.a(1, $$2.E_(), null, () -> $$1.e(0));
         }
      }

      return $$1;
   }

   private static boolean a(aqe $$0, im $$1) {
      dpy $$2 = $$0.a_($$1);
      if ($$2.a(avo.aG, $$0x -> $$0x.b(dcp.c) && $$0x.b() instanceof dcp)) {
         int $$3 = $$2.c(dcp.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, auz.bX, ava.e, 1.0F, 1.0F);
            dcp.a($$0, $$1);
            ((dcp)$$2.b()).a($$0, $$2, $$1, null, dna.b.b);
            $$0.a(null, dur.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(aqe $$0, im $$1) {
      for (bre $$3 : $$0.a(bre.class, new eta($$1), bqq.f)) {
         if ($$3 instanceof bru $$4 && $$4.a()) {
            $$4.a(ava.e);
            $$0.a(null, dur.M, $$1);
            return true;
         }
      }

      return false;
   }
}
