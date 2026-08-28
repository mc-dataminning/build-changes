public class lm extends lk {
   @Override
   protected czk a(le $$0, czk $$1) {
      arq $$2 = $$0.b();
      if (!$$2.w_()) {
         iv $$3 = $$0.c().a($$0.d().c(dos.b));
         this.a(a($$2, $$3) || a($$2, $$3, $$1));
         if (this.b()) {
            $$1.a(1, $$2, null, $$0x -> {
            });
         }
      }

      return $$1;
   }

   private static boolean a(arq $$0, iv $$1) {
      eao $$2 = $$0.a_($$1);
      if ($$2.a(axc.aJ, $$0x -> $$0x.b(dmg.c) && $$0x.b() instanceof dmg)) {
         int $$3 = $$2.c(dmg.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, awn.bX, awo.e, 1.0F, 1.0F);
            dmg.a($$0, $$1);
            ((dmg)$$2.b()).a($$0, $$2, $$1, null, dxj.b.b);
            $$0.a(null, efo.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean a(arq $$0, iv $$1, czk $$2) {
      for (bxj $$4 : $$0.a(bxj.class, new fes($$1), bwp.f)) {
         if ($$4 instanceof bxz $$5 && $$5.a()) {
            $$5.a($$0, awo.e, $$2);
            $$0.a(null, efo.M, $$1);
            return true;
         }
      }

      return false;
   }
}
