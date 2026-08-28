public class gvx extends gwr<gyd, gbt> {
   public gvx(gtz<gyd, gbt> $$0) {
      super($$0);
   }

   public void a(ffu $$0, glx $$1, int $$2, gyd $$3, float $$4, float $$5) {
      hbl $$6 = $$3.i;
      if (!$$6.c()) {
         $$0.a();
         float $$7 = 1.0F;
         float $$8 = -1.0F;
         float $$9 = ayz.e($$3.ab) / 60.0F;
         if ($$3.ab < 0.0F) {
            $$0.a(0.0F, 1.0F - $$9 * 0.5F, -1.0F + $$9 * 0.5F);
         } else {
            $$0.a(0.0F, 1.0F + $$9 * 0.8F, -1.0F + $$9 * 0.2F);
         }

         $$6.a($$0, $$1, $$2, hea.d);
         $$0.b();
      }
   }
}
