public class goc extends gov<cfm, fvf<cfm>> {
   private final gev a;

   public goc(gmf<cfm, fvf<cfm>> $$0, gev $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fbi $$0, gez $$1, int $$2, cfm $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fq() == btg.b;
      $$0.a();
      float $$11 = 1.0F;
      float $$12 = -1.0F;
      float $$13 = ayo.e($$3.dG()) / 60.0F;
      if ($$3.dG() < 0.0F) {
         $$0.a(0.0F, 1.0F - $$13 * 0.5F, -1.0F + $$13 * 0.5F);
      } else {
         $$0.a(0.0F, 1.0F + $$13 * 0.8F, -1.0F + $$13 * 0.2F);
      }

      cuq $$14 = $$10 ? $$3.eT() : $$3.eU();
      this.a.a($$3, $$14, cun.h, false, $$0, $$1, $$2);
      $$0.b();
   }
}
