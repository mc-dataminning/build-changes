public class gsi extends gsm<gvi, fyw> {
   private final gox a;

   public gsi(gpv<gvi, fyw> $$0, gox $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fdt $$0, ghw $$1, int $$2, gvi $$3, float $$4, float $$5) {
      gzu $$6 = $$3.b();
      if ($$6 != null && $$3.g && !$$3.f) {
         float $$7 = -0.6F;
         float $$8 = 1.4F;
         if ($$3.e) {
            $$7 -= 0.2F * azj.a($$3.p * 0.6F) + 0.2F;
            $$8 -= 0.09F * azj.a($$3.p * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$8, $$7);
         cvx $$9 = $$3.aX_();
         this.a.a($$9, cvv.h, false, $$0, $$1, $$2, gxj.d, $$6);
         $$0.b();
      }
   }
}
