public class ln extends ll {
   @Override
   protected dak a(lf $$0, dak $$1) {
      asb $$2 = $$0.b();
      if (!$$2.A_()) {
         iw $$3 = $$0.c().a($$0.d().c(dpu.b));
         this.a(a($$2, $$3) || a($$2, $$3, $$1));
         if (this.b()) {
            $$1.a(1, $$2, null, $$0x -> {
            });
         }
      }

      return $$1;
   }

   private static boolean a(asb $$0, iw $$1) {
      ebq $$2 = $$0.a_($$1);
      if ($$2.a(axn.aJ, $$0x -> $$0x.b(dni.c) && $$0x.b() instanceof dni)) {
         int $$3 = $$2.c(dni.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, awy.bX, awz.e, 1.0F, 1.0F);
            dni.a($$0, $$1);
            ((dni)$$2.b()).a($$0, $$2, $$1, null, dyl.b.b);
            $$0.a(null, egq.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean a(asb $$0, iw $$1, dak $$2) {
      for (byf $$4 : $$0.a(byf.class, new ffx($$1), bxl.f)) {
         if ($$4 instanceof byv $$5 && $$5.a()) {
            $$5.a($$0, awz.e, $$2);
            $$0.a(null, egq.M, $$1);
            return true;
         }
      }

      return false;
   }
}
