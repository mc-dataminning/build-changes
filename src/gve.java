public class gve extends gvy<gxj, gay> {
   private final gsh a;

   public gve(gtg<gxj, gay> $$0, gsh $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fgl $$0, gle $$1, int $$2, gxj $$3, float $$4, float $$5) {
      cxk $$6 = $$3.aY_();
      hdg $$7 = $$3.b();
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

         this.a.a($$6, cxi.h, false, $$0, $$1, $$2, hav.d, $$7);
         $$0.b();
      }
   }
}
