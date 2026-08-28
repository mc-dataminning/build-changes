public class gvz extends gwd<gyz, gch> {
   private final gsm a;

   public gvz(gtl<gyz, gch> $$0, gsm $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fgq $$0, glj $$1, int $$2, gyz $$3, float $$4, float $$5) {
      hdl $$6 = $$3.b();
      if ($$6 != null && $$3.g && !$$3.f) {
         float $$7 = -0.6F;
         float $$8 = 1.4F;
         if ($$3.e) {
            $$7 -= 0.2F * bae.a($$3.p * 0.6F) + 0.2F;
            $$8 -= 0.09F * bae.a($$3.p * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$8, $$7);
         cxo $$9 = $$3.aY_();
         this.a.a($$9, cxm.h, false, $$0, $$1, $$2, hba.d, $$6);
         $$0.b();
      }
   }
}
