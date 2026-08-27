public class ggt extends ghm<cbm, fnz<cbm>> {
   private final fxo a;

   public ggt(gew<cbm, fnz<cbm>> $$0, fxo $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(eub $$0, fxs $$1, int $$2, cbm $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fr() == bpj.b;
      $$0.a();
      float $$11 = 1.0F;
      float $$12 = -1.0F;
      float $$13 = aww.e($$3.dE()) / 60.0F;
      if ($$3.dE() < 0.0F) {
         $$0.a(0.0F, 1.0F - $$13 * 0.5F, -1.0F + $$13 * 0.5F);
      } else {
         $$0.a(0.0F, 1.0F + $$13 * 0.8F, -1.0F + $$13 * 0.2F);
      }

      cqm $$14 = $$10 ? $$3.eU() : $$3.eV();
      this.a.a($$3, $$14, cqj.h, false, $$0, $$1, $$2);
      $$0.b();
   }
}
