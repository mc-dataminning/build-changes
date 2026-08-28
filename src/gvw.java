public class gvw extends gwa<gyw, gce> {
   private final gsj a;

   public gvw(gti<gyw, gce> $$0, gsj $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fgl $$0, glg $$1, int $$2, gyw $$3, float $$4, float $$5) {
      hdi $$6 = $$3.b();
      if ($$6 != null && $$3.g && !$$3.f) {
         float $$7 = -0.6F;
         float $$8 = 1.4F;
         if ($$3.e) {
            $$7 -= 0.2F * azu.a($$3.p * 0.6F) + 0.2F;
            $$8 -= 0.09F * azu.a($$3.p * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$8, $$7);
         cxg $$9 = $$3.aX_();
         this.a.a($$9, cxe.h, false, $$0, $$1, $$2, hax.d, $$6);
         $$0.b();
      }
   }
}
