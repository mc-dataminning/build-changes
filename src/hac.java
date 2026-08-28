public class hac extends hav<hci, gfr> {
   public hac(gye<hci, gfr> $$0) {
      super($$0);
   }

   public void a(fjj $$0, gqa $$1, int $$2, hci $$3, float $$4, float $$5) {
      hfq $$6 = $$3.i;
      if (!$$6.c()) {
         $$0.a();
         float $$7 = 1.0F;
         float $$8 = -1.0F;
         float $$9 = azm.e($$3.ab) / 60.0F;
         if ($$3.ab < 0.0F) {
            $$0.a(0.0F, 1.0F - $$9 * 0.5F, -1.0F + $$9 * 0.5F);
         } else {
            $$0.a(0.0F, 1.0F + $$9 * 0.8F, -1.0F + $$9 * 0.2F);
         }

         $$6.a($$0, $$1, $$2, hin.d);
         $$0.b();
      }
   }
}
