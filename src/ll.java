public class ll extends lj {
   @Override
   protected cys a(ld $$0, cys $$1) {
      aro $$2 = $$0.b();
      if (!$$2.w_()) {
         iu $$3 = $$0.c().a($$0.d().c(doa.b));
         this.a(a($$2, $$3) || a($$2, $$3, $$1));
         if (this.b()) {
            $$1.a(1, $$2, null, $$0x -> {
            });
         }
      }

      return $$1;
   }

   private static boolean a(aro $$0, iu $$1) {
      dzo $$2 = $$0.a_($$1);
      if ($$2.a(axa.aJ, $$0x -> $$0x.b(dlo.c) && $$0x.b() instanceof dlo)) {
         int $$3 = $$2.c(dlo.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, awl.bX, awm.e, 1.0F, 1.0F);
            dlo.a($$0, $$1);
            ((dlo)$$2.b()).a($$0, $$2, $$1, null, dwk.b.b);
            $$0.a(null, eeo.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean a(aro $$0, iu $$1, cys $$2) {
      for (bwz $$4 : $$0.a(bwz.class, new fdr($$1), bwh.f)) {
         if ($$4 instanceof bxp $$5 && $$5.a()) {
            $$5.a($$0, awm.e, $$2);
            $$0.a(null, eeo.M, $$1);
            return true;
         }
      }

      return false;
   }
}
