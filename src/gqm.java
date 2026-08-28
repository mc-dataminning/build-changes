public class gqm extends grf<gsp, fwt> {
   private final gnq a;

   public gqm(goo<gsp, fwt> $$0, gnq $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fcu $$0, ggv $$1, int $$2, gsp $$3, float $$4, float $$5) {
      cvl $$6 = $$3.aY_();
      gym $$7 = $$3.b();
      if ($$7 != null) {
         $$0.a();
         float $$8 = 1.0F;
         float $$9 = -1.0F;
         float $$10 = azc.e($$3.V) / 60.0F;
         if ($$3.V < 0.0F) {
            $$0.a(0.0F, 1.0F - $$10 * 0.5F, -1.0F + $$10 * 0.5F);
         } else {
            $$0.a(0.0F, 1.0F + $$10 * 0.8F, -1.0F + $$10 * 0.2F);
         }

         this.a.a($$6, cvi.h, false, $$0, $$1, $$2, gwb.d, $$7);
         $$0.b();
      }
   }
}
