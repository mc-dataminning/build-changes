public class lb extends kz {
   @Override
   protected cvp a(kv $$0, cvp $$1) {
      arh $$2 = $$0.b();
      if (!$$2.w_()) {
         je $$3 = $$0.c().a($$0.d().c(djo.b));
         this.a(a($$2, $$3) || b($$2, $$3));
         if (this.b()) {
            $$1.a(1, $$2, null, $$0x -> {
            });
         }
      }

      return $$1;
   }

   private static boolean a(arh $$0, je $$1) {
      duo $$2 = $$0.a_($$1);
      if ($$2.a(awt.aH, $$0x -> $$0x.b(dhd.c) && $$0x.b() instanceof dhd)) {
         int $$3 = $$2.c(dhd.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, awe.bX, awf.e, 1.0F, 1.0F);
            dhd.a($$0, $$1);
            ((dhd)$$2.b()).a($$0, $$2, $$1, null, drp.b.b);
            $$0.a(null, dzl.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(arh $$0, je $$1) {
      for (buk $$3 : $$0.a(buk.class, new eyn($$1), btt.f)) {
         if ($$3 instanceof bva $$4 && $$4.a()) {
            $$4.a(awf.e);
            $$0.a(null, dzl.M, $$1);
            return true;
         }
      }

      return false;
   }
}
