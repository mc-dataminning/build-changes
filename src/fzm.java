public class fzm extends gaf<bwz, fhk<bwz>> {
   private final fqq a;

   public fzm(fxs<bwz, fhk<bwz>> $$0, fqq $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(enw $$0, fqu $$1, int $$2, bwz $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fn() == bla.b;
      $$0.a();
      float $$11 = 1.0F;
      float $$12 = -1.0F;
      float $$13 = atm.e($$3.dF()) / 60.0F;
      if ($$3.dF() < 0.0F) {
         $$0.a(0.0F, 1.0F - $$13 * 0.5F, -1.0F + $$13 * 0.5F);
      } else {
         $$0.a(0.0F, 1.0F + $$13 * 0.8F, -1.0F + $$13 * 0.2F);
      }

      clj $$14 = $$10 ? $$3.eU() : $$3.eV();
      this.a.a($$3, $$14, clg.h, false, $$0, $$1, $$2);
      $$0.b();
   }
}
