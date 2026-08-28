public class gmq extends gnj<cfn, ftv<cfn>> {
   private final gdk a;

   public gmq(gkt<cfn, ftv<cfn>> $$0, gdk $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(ezy $$0, gdo $$1, int $$2, cfn $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fu() == btj.b;
      $$0.a();
      float $$11 = 1.0F;
      float $$12 = -1.0F;
      float $$13 = ayz.e($$3.dH()) / 60.0F;
      if ($$3.dH() < 0.0F) {
         $$0.a(0.0F, 1.0F - $$13 * 0.5F, -1.0F + $$13 * 0.5F);
      } else {
         $$0.a(0.0F, 1.0F + $$13 * 0.8F, -1.0F + $$13 * 0.2F);
      }

      cup $$14 = $$10 ? $$3.eX() : $$3.eY();
      this.a.a($$3, $$14, cum.h, false, $$0, $$1, $$2);
      $$0.b();
   }
}
