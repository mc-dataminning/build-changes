public class lm extends lk {
   @Override
   protected czy a(le $$0, czy $$1) {
      ars $$2 = $$0.b();
      if (!$$2.A_()) {
         iv $$3 = $$0.c().a($$0.d().c(dpi.b));
         this.a(a($$2, $$3) || a($$2, $$3, $$1));
         if (this.b()) {
            $$1.a(1, $$2, null, $$0x -> {
            });
         }
      }

      return $$1;
   }

   private static boolean a(ars $$0, iv $$1) {
      ebe $$2 = $$0.a_($$1);
      if ($$2.a(axe.aJ, $$0x -> $$0x.b(dmw.c) && $$0x.b() instanceof dmw)) {
         int $$3 = $$2.c(dmw.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, awp.bX, awq.e, 1.0F, 1.0F);
            dmw.a($$0, $$1);
            ((dmw)$$2.b()).a($$0, $$2, $$1, null, dxz.b.b);
            $$0.a(null, ege.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean a(ars $$0, iv $$1, czy $$2) {
      for (bxu $$4 : $$0.a(bxu.class, new ffl($$1), bxa.f)) {
         if ($$4 instanceof byk $$5 && $$5.a()) {
            $$5.a($$0, awq.e, $$2);
            $$0.a(null, ege.M, $$1);
            return true;
         }
      }

      return false;
   }
}
