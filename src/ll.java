public class ll extends lj {
   @Override
   protected czd a(ld $$0, czd $$1) {
      arq $$2 = $$0.b();
      if (!$$2.w_()) {
         iu $$3 = $$0.c().a($$0.d().c(dol.b));
         this.a(a($$2, $$3) || a($$2, $$3, $$1));
         if (this.b()) {
            $$1.a(1, $$2, null, $$0x -> {
            });
         }
      }

      return $$1;
   }

   private static boolean a(arq $$0, iu $$1) {
      eah $$2 = $$0.a_($$1);
      if ($$2.a(axc.aJ, $$0x -> $$0x.b(dlz.c) && $$0x.b() instanceof dlz)) {
         int $$3 = $$2.c(dlz.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, awn.bX, awo.e, 1.0F, 1.0F);
            dlz.a($$0, $$1);
            ((dlz)$$2.b()).a($$0, $$2, $$1, null, dxc.b.b);
            $$0.a(null, efh.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean a(arq $$0, iu $$1, czd $$2) {
      for (bxe $$4 : $$0.a(bxe.class, new fel($$1), bwm.f)) {
         if ($$4 instanceof bxu $$5 && $$5.a()) {
            $$5.a($$0, awo.e, $$2);
            $$0.a(null, efh.M, $$1);
            return true;
         }
      }

      return false;
   }
}
