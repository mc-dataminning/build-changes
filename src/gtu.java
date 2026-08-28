public class gtu extends gty<gwu, gag> {
   private final gqi a;

   public gtu(grh<gwu, gag> $$0, gqi $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fer $$0, gjg $$1, int $$2, gwu $$3, float $$4, float $$5) {
      hbg $$6 = $$3.b();
      if ($$6 != null && $$3.g && !$$3.f) {
         float $$7 = -0.6F;
         float $$8 = 1.4F;
         if ($$3.e) {
            $$7 -= 0.2F * azm.a($$3.p * 0.6F) + 0.2F;
            $$8 -= 0.09F * azm.a($$3.p * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$8, $$7);
         cwm $$9 = $$3.aW_();
         this.a.a($$9, cwk.h, false, $$0, $$1, $$2, gyv.d, $$6);
         $$0.b();
      }
   }
}
