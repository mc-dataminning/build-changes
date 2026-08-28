public class gri extends gsb<gtl, fxh> {
   private final gom a;

   public gri(gpk<gtl, fxh> $$0, gom $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fdi $$0, ghl $$1, int $$2, gtl $$3, float $$4, float $$5) {
      cvs $$6 = $$3.aX_();
      gzi $$7 = $$3.b();
      if ($$7 != null) {
         $$0.a();
         float $$8 = 1.0F;
         float $$9 = -1.0F;
         float $$10 = azf.e($$3.V) / 60.0F;
         if ($$3.V < 0.0F) {
            $$0.a(0.0F, 1.0F - $$10 * 0.5F, -1.0F + $$10 * 0.5F);
         } else {
            $$0.a(0.0F, 1.0F + $$10 * 0.8F, -1.0F + $$10 * 0.2F);
         }

         this.a.a($$6, cvp.h, false, $$0, $$1, $$2, gwx.d, $$7);
         $$0.b();
      }
   }
}
