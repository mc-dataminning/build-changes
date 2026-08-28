public class gms extends gnl<cfp, ftx<cfp>> {
   private final gdm a;

   public gms(gkv<cfp, ftx<cfp>> $$0, gdm $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(faa $$0, gdq $$1, int $$2, cfp $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fu() == btl.b;
      $$0.a();
      float $$11 = 1.0F;
      float $$12 = -1.0F;
      float $$13 = ayz.e($$3.dH()) / 60.0F;
      if ($$3.dH() < 0.0F) {
         $$0.a(0.0F, 1.0F - $$13 * 0.5F, -1.0F + $$13 * 0.5F);
      } else {
         $$0.a(0.0F, 1.0F + $$13 * 0.8F, -1.0F + $$13 * 0.2F);
      }

      cur $$14 = $$10 ? $$3.eX() : $$3.eY();
      this.a.a($$3, $$14, cuo.h, false, $$0, $$1, $$2);
      $$0.b();
   }
}
