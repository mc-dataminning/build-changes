public class gjj extends gkc<ccq, fqq<ccq>> {
   private final gae a;

   public gjj(ghm<ccq, fqq<ccq>> $$0, gae $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(ewr $$0, gai $$1, int $$2, ccq $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fr() == bqn.b;
      $$0.a();
      float $$11 = 1.0F;
      float $$12 = -1.0F;
      float $$13 = axm.e($$3.dE()) / 60.0F;
      if ($$3.dE() < 0.0F) {
         $$0.a(0.0F, 1.0F - $$13 * 0.5F, -1.0F + $$13 * 0.5F);
      } else {
         $$0.a(0.0F, 1.0F + $$13 * 0.8F, -1.0F + $$13 * 0.2F);
      }

      crs $$14 = $$10 ? $$3.eU() : $$3.eV();
      this.a.a($$3, $$14, crp.h, false, $$0, $$1, $$2);
      $$0.b();
   }
}
