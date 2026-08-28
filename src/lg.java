public class lg extends le {
   @Override
   protected cxk a(ky $$0, cxk $$1) {
      ash $$2 = $$0.b();
      if (!$$2.B_()) {
         jh $$3 = $$0.c().a($$0.d().c(dml.b));
         this.a(a($$2, $$3) || a($$2, $$3, $$1));
         if (this.b()) {
            $$1.a(1, $$2, null, $$0x -> {
            });
         }
      }

      return $$1;
   }

   private static boolean a(ash $$0, jh $$1) {
      dxn $$2 = $$0.a_($$1);
      if ($$2.a(axu.aJ, $$0x -> $$0x.b(djy.c) && $$0x.b() instanceof djy)) {
         int $$3 = $$2.c(djy.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, axf.bX, axg.e, 1.0F, 1.0F);
            djy.a($$0, $$1);
            ((djy)$$2.b()).a($$0, $$2, $$1, null, dum.b.b);
            $$0.a(null, ecj.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean a(ash $$0, jh $$1, cxk $$2) {
      for (bwb $$4 : $$0.a(bwb.class, new fbn($$1), bvk.f)) {
         if ($$4 instanceof bws $$5 && $$5.a()) {
            $$5.a($$0, axg.e, $$2);
            $$0.a(null, ecj.M, $$1);
            return true;
         }
      }

      return false;
   }
}
