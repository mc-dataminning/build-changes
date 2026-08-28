public class gvl extends gwf<gxq, gbf> {
   private final gso a;

   public gvl(gtn<gxq, gbf> $$0, gso $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fgs $$0, gll $$1, int $$2, gxq $$3, float $$4, float $$5) {
      cxp $$6 = $$3.aY_();
      hdn $$7 = $$3.b();
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

         this.a.a($$6, cxn.h, false, $$0, $$1, $$2, hbc.d, $$7);
         $$0.b();
      }
   }
}
