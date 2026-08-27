public class gjp extends gjt<ccs, frl<ccs>> {
   private final fzv a;

   public gjp(ghd<ccs, frl<ccs>> $$0, fzv $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(ewi $$0, fzz $$1, int $$2, ccs $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      crj $$10 = $$3.d(bqc.a);
      if ($$3.y() && !$$3.gF()) {
         float $$11 = -0.6F;
         float $$12 = 1.4F;
         if ($$3.gt()) {
            $$11 -= 0.2F * axk.a($$7 * 0.6F) + 0.2F;
            $$12 -= 0.09F * axk.a($$7 * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$12, $$11);
         this.a.a($$3, $$10, crg.h, false, $$0, $$1, $$2);
         $$0.b();
      }
   }
}
