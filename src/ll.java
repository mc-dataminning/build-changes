public class ll extends lj {
   @Override
   protected cyy a(ld $$0, cyy $$1) {
      arq $$2 = $$0.b();
      if (!$$2.w_()) {
         iu $$3 = $$0.c().a($$0.d().c(dog.b));
         this.a(a($$2, $$3) || a($$2, $$3, $$1));
         if (this.b()) {
            $$1.a(1, $$2, null, $$0x -> {
            });
         }
      }

      return $$1;
   }

   private static boolean a(arq $$0, iu $$1) {
      dzz $$2 = $$0.a_($$1);
      if ($$2.a(axc.aJ, $$0x -> $$0x.b(dlu.c) && $$0x.b() instanceof dlu)) {
         int $$3 = $$2.c(dlu.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, awn.bX, awo.e, 1.0F, 1.0F);
            dlu.a($$0, $$1);
            ((dlu)$$2.b()).a($$0, $$2, $$1, null, dwu.b.b);
            $$0.a(null, eez.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean a(arq $$0, iu $$1, cyy $$2) {
      for (bxc $$4 : $$0.a(bxc.class, new fed($$1), bwk.f)) {
         if ($$4 instanceof bxs $$5 && $$5.a()) {
            $$5.a($$0, awo.e, $$2);
            $$0.a(null, eez.M, $$1);
            return true;
         }
      }

      return false;
   }
}
