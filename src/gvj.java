public class gvj extends gwd<gxo, gbd> {
   private final gsm a;

   public gvj(gtl<gxo, gbd> $$0, gsm $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fgq $$0, glj $$1, int $$2, gxo $$3, float $$4, float $$5) {
      cxo $$6 = $$3.aY_();
      hdl $$7 = $$3.b();
      if ($$7 != null) {
         $$0.a();
         float $$8 = 1.0F;
         float $$9 = -1.0F;
         float $$10 = bae.e($$3.V) / 60.0F;
         if ($$3.V < 0.0F) {
            $$0.a(0.0F, 1.0F - $$10 * 0.5F, -1.0F + $$10 * 0.5F);
         } else {
            $$0.a(0.0F, 1.0F + $$10 * 0.8F, -1.0F + $$10 * 0.2F);
         }

         this.a.a($$6, cxm.h, false, $$0, $$1, $$2, hba.d, $$7);
         $$0.b();
      }
   }
}
