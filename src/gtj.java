public class gtj extends gtn<gwj, fzx> {
   private final gpy a;

   public gtj(gqw<gwj, fzx> $$0, gpy $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fek $$0, gix $$1, int $$2, gwj $$3, float $$4, float $$5) {
      hav $$6 = $$3.b();
      if ($$6 != null && $$3.g && !$$3.f) {
         float $$7 = -0.6F;
         float $$8 = 1.4F;
         if ($$3.e) {
            $$7 -= 0.2F * azn.a($$3.p * 0.6F) + 0.2F;
            $$8 -= 0.09F * azn.a($$3.p * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$8, $$7);
         cwf $$9 = $$3.aX_();
         this.a.a($$9, cwd.h, false, $$0, $$1, $$2, gyk.d, $$6);
         $$0.b();
      }
   }
}
