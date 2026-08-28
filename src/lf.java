public class lf extends ld {
   @Override
   protected cwb a(ky $$0, cwb $$1) {
      arn $$2 = $$0.b();
      if (!$$2.y_()) {
         jh $$3 = $$0.c().a($$0.d().c(dkj.b));
         this.a(a($$2, $$3) || a($$2, $$3, $$1));
         if (this.b()) {
            $$1.a(1, $$2, null, $$0x -> {
            });
         }
      }

      return $$1;
   }

   private static boolean a(arn $$0, jh $$1) {
      dvj $$2 = $$0.a_($$1);
      if ($$2.a(axa.aH, $$0x -> $$0x.b(dhy.c) && $$0x.b() instanceof dhy)) {
         int $$3 = $$2.c(dhy.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, awl.bX, awm.e, 1.0F, 1.0F);
            dhy.a($$0, $$1);
            ((dhy)$$2.b()).a($$0, $$2, $$1, null, dsj.b.b);
            $$0.a(null, eag.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean a(arn $$0, jh $$1, cwb $$2) {
      for (bva $$4 : $$0.a(bva.class, new ezi($$1), buj.f)) {
         if ($$4 instanceof bvr $$5 && $$5.a()) {
            $$5.a(awm.e, $$2);
            $$0.a(null, eag.M, $$1);
            return true;
         }
      }

      return false;
   }
}
