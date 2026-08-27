public class glm extends gmf<ceo, fsr<ceo>> {
   private final gcg a;

   public glm(gjp<ceo, fsr<ceo>> $$0, gcg $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(eyu $$0, gck $$1, int $$2, ceo $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fu() == bsk.b;
      $$0.a();
      float $$11 = 1.0F;
      float $$12 = -1.0F;
      float $$13 = ayf.e($$3.dH()) / 60.0F;
      if ($$3.dH() < 0.0F) {
         $$0.a(0.0F, 1.0F - $$13 * 0.5F, -1.0F + $$13 * 0.5F);
      } else {
         $$0.a(0.0F, 1.0F + $$13 * 0.8F, -1.0F + $$13 * 0.2F);
      }

      ctq $$14 = $$10 ? $$3.eX() : $$3.eY();
      this.a.a($$3, $$14, ctn.h, false, $$0, $$1, $$2);
      $$0.b();
   }
}
