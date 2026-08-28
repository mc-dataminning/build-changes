public class grs extends grw<gur, fyh> {
   private final goh a;

   public grs(gpf<gur, fyh> $$0, goh $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fde $$0, ghg $$1, int $$2, gur $$3, float $$4, float $$5) {
      gzd $$6 = $$3.b();
      if ($$6 != null && $$3.g && !$$3.f) {
         float $$7 = -0.6F;
         float $$8 = 1.4F;
         if ($$3.e) {
            $$7 -= 0.2F * azd.a($$3.p * 0.6F) + 0.2F;
            $$8 -= 0.09F * azd.a($$3.p * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$8, $$7);
         cvp $$9 = $$3.aW_();
         this.a.a($$9, cvm.h, false, $$0, $$1, $$2, gws.d, $$6);
         $$0.b();
      }
   }
}
