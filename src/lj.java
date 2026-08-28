public class lj extends lh {
   @Override
   protected cxy a(lb $$0, cxy $$1) {
      arn $$2 = $$0.b();
      if (!$$2.w_()) {
         jj $$3 = $$0.c().a($$0.d().c(dna.b));
         this.a(a($$2, $$3) || a($$2, $$3, $$1));
         if (this.b()) {
            $$1.a(1, $$2, null, $$0x -> {
            });
         }
      }

      return $$1;
   }

   private static boolean a(arn $$0, jj $$1) {
      dym $$2 = $$0.a_($$1);
      if ($$2.a(awz.aJ, $$0x -> $$0x.b(dko.c) && $$0x.b() instanceof dko)) {
         int $$3 = $$2.c(dko.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, awk.bX, awl.e, 1.0F, 1.0F);
            dko.a($$0, $$1);
            ((dko)$$2.b()).a($$0, $$2, $$1, null, dvi.b.b);
            $$0.a(null, edm.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean a(arn $$0, jj $$1, cxy $$2) {
      for (bwr $$4 : $$0.a(bwr.class, new fcp($$1), bvz.f)) {
         if ($$4 instanceof bxh $$5 && $$5.a()) {
            $$5.a($$0, awl.e, $$2);
            $$0.a(null, edm.M, $$1);
            return true;
         }
      }

      return false;
   }
}
