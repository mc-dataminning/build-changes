public class gnh extends goa<cfa, ful<cfa>> {
   private final geb a;

   public gnh(glk<cfa, ful<cfa>> $$0, geb $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fao $$0, gef $$1, int $$2, cfa $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fs() == bsw.b;
      $$0.a();
      float $$11 = 1.0F;
      float $$12 = -1.0F;
      float $$13 = ayg.e($$3.dJ()) / 60.0F;
      if ($$3.dJ() < 0.0F) {
         $$0.a(0.0F, 1.0F - $$13 * 0.5F, -1.0F + $$13 * 0.5F);
      } else {
         $$0.a(0.0F, 1.0F + $$13 * 0.8F, -1.0F + $$13 * 0.2F);
      }

      cud $$14 = $$10 ? $$3.eV() : $$3.eW();
      this.a.a($$3, $$14, cua.h, false, $$0, $$1, $$2);
      $$0.b();
   }
}
