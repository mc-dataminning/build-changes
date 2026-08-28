public class grt extends gsm<gtx, fxs> {
   private final gox a;

   public grt(gpv<gtx, fxs> $$0, gox $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fdt $$0, ghw $$1, int $$2, gtx $$3, float $$4, float $$5) {
      cvx $$6 = $$3.aX_();
      gzu $$7 = $$3.b();
      if ($$7 != null) {
         $$0.a();
         float $$8 = 1.0F;
         float $$9 = -1.0F;
         float $$10 = azj.e($$3.V) / 60.0F;
         if ($$3.V < 0.0F) {
            $$0.a(0.0F, 1.0F - $$10 * 0.5F, -1.0F + $$10 * 0.5F);
         } else {
            $$0.a(0.0F, 1.0F + $$10 * 0.8F, -1.0F + $$10 * 0.2F);
         }

         this.a.a($$6, cvv.h, false, $$0, $$1, $$2, gxj.d, $$7);
         $$0.b();
      }
   }
}
