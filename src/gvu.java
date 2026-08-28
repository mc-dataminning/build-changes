public class gvu extends gvy<gyu, gcc> {
   private final gsh a;

   public gvu(gtg<gyu, gcc> $$0, gsh $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fgl $$0, gle $$1, int $$2, gyu $$3, float $$4, float $$5) {
      hdg $$6 = $$3.b();
      if ($$6 != null && $$3.g && !$$3.f) {
         float $$7 = -0.6F;
         float $$8 = 1.4F;
         if ($$3.e) {
            $$7 -= 0.2F * bae.a($$3.p * 0.6F) + 0.2F;
            $$8 -= 0.09F * bae.a($$3.p * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$8, $$7);
         cxk $$9 = $$3.aY_();
         this.a.a($$9, cxi.h, false, $$0, $$1, $$2, hav.d, $$6);
         $$0.b();
      }
   }
}
