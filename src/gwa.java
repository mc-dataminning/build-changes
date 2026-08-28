public class gwa extends gwu<gyg, gbv> {
   public gwa(guc<gyg, gbv> $$0) {
      super($$0);
   }

   public void a(ffv $$0, glz $$1, int $$2, gyg $$3, float $$4, float $$5) {
      hbp $$6 = $$3.i;
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

         $$6.a($$0, $$1, $$2, hej.d);
         $$0.b();
      }
   }
}
