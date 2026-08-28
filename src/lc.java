public class lc extends la {
   @Override
   protected cvs a(kw $$0, cvs $$1) {
      arj $$2 = $$0.b();
      if (!$$2.x_()) {
         jf $$3 = $$0.c().a($$0.d().c(djr.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.b()) {
            $$1.a(1, $$2, null, $$0x -> {
            });
         }
      }

      return $$1;
   }

   private static boolean a(arj $$0, jf $$1) {
      dus $$2 = $$0.a_($$1);
      if ($$2.a(awv.aH, $$0x -> $$0x.b(dhg.c) && $$0x.b() instanceof dhg)) {
         int $$3 = $$2.c(dhg.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, awg.bX, awh.e, 1.0F, 1.0F);
            dhg.a($$0, $$1);
            ((dhg)$$2.b()).a($$0, $$2, $$1, null, drs.b.b);
            $$0.a(null, dzp.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(arj $$0, jf $$1) {
      for (bun $$3 : $$0.a(bun.class, new eyr($$1), btw.f)) {
         if ($$3 instanceof bvd $$4 && $$4.a()) {
            $$4.a(awh.e);
            $$0.a(null, dzp.M, $$1);
            return true;
         }
      }

      return false;
   }
}
