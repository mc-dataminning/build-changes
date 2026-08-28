public class lm extends lk {
   @Override
   protected czn a(le $$0, czn $$1) {
      arq $$2 = $$0.b();
      if (!$$2.w_()) {
         iv $$3 = $$0.c().a($$0.d().c(dox.b));
         this.a(a($$2, $$3) || a($$2, $$3, $$1));
         if (this.b()) {
            $$1.a(1, $$2, null, $$0x -> {
            });
         }
      }

      return $$1;
   }

   private static boolean a(arq $$0, iv $$1) {
      eat $$2 = $$0.a_($$1);
      if ($$2.a(axc.aJ, $$0x -> $$0x.b(dml.c) && $$0x.b() instanceof dml)) {
         int $$3 = $$2.c(dml.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, awn.bX, awo.e, 1.0F, 1.0F);
            dml.a($$0, $$1);
            ((dml)$$2.b()).a($$0, $$2, $$1, null, dxo.b.b);
            $$0.a(null, eft.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean a(arq $$0, iv $$1, czn $$2) {
      for (bxj $$4 : $$0.a(bxj.class, new fex($$1), bwp.f)) {
         if ($$4 instanceof bxz $$5 && $$5.a()) {
            $$5.a($$0, awo.e, $$2);
            $$0.a(null, eft.M, $$1);
            return true;
         }
      }

      return false;
   }
}
