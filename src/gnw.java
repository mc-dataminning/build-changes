public class gnw extends gop<cfk, fuz<cfk>> {
   private final gep a;

   public gnw(glz<cfk, fuz<cfk>> $$0, gep $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fbc $$0, get $$1, int $$2, cfk $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fr() == btf.b;
      $$0.a();
      float $$11 = 1.0F;
      float $$12 = -1.0F;
      float $$13 = ayn.e($$3.dI()) / 60.0F;
      if ($$3.dI() < 0.0F) {
         $$0.a(0.0F, 1.0F - $$13 * 0.5F, -1.0F + $$13 * 0.5F);
      } else {
         $$0.a(0.0F, 1.0F + $$13 * 0.8F, -1.0F + $$13 * 0.2F);
      }

      cuo $$14 = $$10 ? $$3.eU() : $$3.eV();
      this.a.a($$3, $$14, cul.h, false, $$0, $$1, $$2);
      $$0.b();
   }
}
