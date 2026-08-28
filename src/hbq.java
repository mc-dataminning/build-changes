public class hbq extends hcj<hdx, ghg> {
   public hbq(gzs<hdx, ghg> $$0) {
      super($$0);
   }

   public void a(fld $$0, grn $$1, int $$2, hdx $$3, float $$4, float $$5) {
      hhi $$6 = $$3.i;
      if (!$$6.c()) {
         $$0.a();
         float $$7 = 1.0F;
         float $$8 = -1.0F;
         float $$9 = azz.e($$3.ae) / 60.0F;
         if ($$3.ae < 0.0F) {
            $$0.a(0.0F, 1.0F - $$9 * 0.5F, -1.0F + $$9 * 0.5F);
         } else {
            $$0.a(0.0F, 1.0F + $$9 * 0.8F, -1.0F + $$9 * 0.2F);
         }

         $$6.a($$0, $$1, $$2, hkg.d);
         $$0.b();
      }
   }
}
