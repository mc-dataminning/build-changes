public class grx extends gsb<guw, fyl> {
   private final gom a;

   public grx(gpk<guw, fyl> $$0, gom $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fdi $$0, ghl $$1, int $$2, guw $$3, float $$4, float $$5) {
      gzi $$6 = $$3.b();
      if ($$6 != null && $$3.g && !$$3.f) {
         float $$7 = -0.6F;
         float $$8 = 1.4F;
         if ($$3.e) {
            $$7 -= 0.2F * azf.a($$3.p * 0.6F) + 0.2F;
            $$8 -= 0.09F * azf.a($$3.p * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$8, $$7);
         cvs $$9 = $$3.aX_();
         this.a.a($$9, cvp.h, false, $$0, $$1, $$2, gwx.d, $$6);
         $$0.b();
      }
   }
}
