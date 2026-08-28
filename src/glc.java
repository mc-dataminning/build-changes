public class glc implements gkh<dul> {
   private final gox a;
   private final azr b = azr.a();

   public glc(gki.a $$0) {
      this.a = $$0.d();
   }

   public void a(dul $$0, float $$1, fdt $$2, ghw $$3, int $$4, int $$5) {
      if (dul.a.a($$0.c())) {
         dev $$6 = $$0.i();
         if ($$6 != null) {
            cvx $$7 = $$0.c().a();
            if (!$$7.f()) {
               this.b.b((long)gov.a($$7));
               dum $$8 = $$0.d();
               a($$1, $$6, $$2, $$3, $$4, $$7, this.a, $$8.b(), $$8.a(), this.b);
            }
         }
      }
   }

   public static void a(float $$0, dev $$1, fdt $$2, ghw $$3, int $$4, cvx $$5, gox $$6, float $$7, float $$8, azr $$9) {
      $$2.a();
      $$2.a(0.5F, 0.4F, 0.5F);
      $$2.a(a.d.rotationDegrees(azj.i($$0, $$7, $$8)));
      gov.a($$6, $$2, $$3, $$4, $$5, $$9, $$1);
      $$2.b();
   }
}
