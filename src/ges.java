public class ges extends gfl<caf, fmd<caf>> {
   private final fvp a;

   public ges(gcv<caf, fmd<caf>> $$0, fvp $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(esh $$0, fvt $$1, int $$2, caf $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fm() == boc.b;
      $$0.a();
      float $$11 = 1.0F;
      float $$12 = -1.0F;
      float $$13 = awi.e($$3.dE()) / 60.0F;
      if ($$3.dE() < 0.0F) {
         $$0.a(0.0F, 1.0F - $$13 * 0.5F, -1.0F + $$13 * 0.5F);
      } else {
         $$0.a(0.0F, 1.0F + $$13 * 0.8F, -1.0F + $$13 * 0.2F);
      }

      cpd $$14 = $$10 ? $$3.eT() : $$3.eU();
      this.a.a($$3, $$14, cpa.h, false, $$0, $$1, $$2);
      $$0.b();
   }
}
