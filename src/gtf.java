public class gtf extends gty<gvj, fzc> {
   private final gqi a;

   public gtf(grh<gvj, fzc> $$0, gqi $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fer $$0, gjg $$1, int $$2, gvj $$3, float $$4, float $$5) {
      cwm $$6 = $$3.aW_();
      hbg $$7 = $$3.b();
      if ($$7 != null) {
         $$0.a();
         float $$8 = 1.0F;
         float $$9 = -1.0F;
         float $$10 = azm.e($$3.V) / 60.0F;
         if ($$3.V < 0.0F) {
            $$0.a(0.0F, 1.0F - $$10 * 0.5F, -1.0F + $$10 * 0.5F);
         } else {
            $$0.a(0.0F, 1.0F + $$10 * 0.8F, -1.0F + $$10 * 0.2F);
         }

         this.a.a($$6, cwk.h, false, $$0, $$1, $$2, gyv.d, $$7);
         $$0.b();
      }
   }
}
