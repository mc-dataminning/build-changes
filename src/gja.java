public class gja extends gjt<ccl, fqh<ccl>> {
   private final fzv a;

   public gja(ghd<ccl, fqh<ccl>> $$0, fzv $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(ewi $$0, fzz $$1, int $$2, ccl $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fr() == bqi.b;
      $$0.a();
      float $$11 = 1.0F;
      float $$12 = -1.0F;
      float $$13 = axk.e($$3.dE()) / 60.0F;
      if ($$3.dE() < 0.0F) {
         $$0.a(0.0F, 1.0F - $$13 * 0.5F, -1.0F + $$13 * 0.5F);
      } else {
         $$0.a(0.0F, 1.0F + $$13 * 0.8F, -1.0F + $$13 * 0.2F);
      }

      crj $$14 = $$10 ? $$3.eU() : $$3.eV();
      this.a.a($$3, $$14, crg.h, false, $$0, $$1, $$2);
      $$0.b();
   }
}
