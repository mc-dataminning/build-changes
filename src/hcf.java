public class hcf extends hcj<hfl, gil> {
   public hcf(gzs<hfl, gil> $$0) {
      super($$0);
   }

   public void a(fld $$0, grn $$1, int $$2, hfl $$3, float $$4, float $$5) {
      hhi $$6 = $$3.i;
      if (!$$6.c() && $$3.g && !$$3.f) {
         float $$7 = -0.6F;
         float $$8 = 1.4F;
         if ($$3.e) {
            $$7 -= 0.2F * azz.a($$3.v * 0.6F) + 0.2F;
            $$8 -= 0.09F * azz.a($$3.v * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$8, $$7);
         $$6.a($$0, $$1, $$2, hkg.d);
         $$0.b();
      }
   }
}
