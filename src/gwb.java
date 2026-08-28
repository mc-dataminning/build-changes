public class gwb extends gwf<gzb, gcj> {
   private final gso a;

   public gwb(gtn<gzb, gcj> $$0, gso $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fgs $$0, gll $$1, int $$2, gzb $$3, float $$4, float $$5) {
      hdn $$6 = $$3.b();
      if ($$6 != null && $$3.g && !$$3.f) {
         float $$7 = -0.6F;
         float $$8 = 1.4F;
         if ($$3.e) {
            $$7 -= 0.2F * bae.a($$3.p * 0.6F) + 0.2F;
            $$8 -= 0.09F * bae.a($$3.p * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$8, $$7);
         cxp $$9 = $$3.aY_();
         this.a.a($$9, cxn.h, false, $$0, $$1, $$2, hbc.d, $$6);
         $$0.b();
      }
   }
}
