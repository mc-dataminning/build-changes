public class gmy extends gnl<cfr, fue<cfr>> {
   private final gdm a;

   public gmy(gkv<cfr, fue<cfr>> $$0, gdm $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(faa $$0, gdq $$1, int $$2, cfr $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fL();
      boolean $$11 = $$3.p_();
      $$0.a();
      if ($$11) {
         float $$12 = 0.75F;
         $$0.b(0.75F, 0.75F, 0.75F);
         $$0.a(0.0F, 0.5F, 0.209375F);
      }

      $$0.a(this.c().a.b / 16.0F, this.c().a.c / 16.0F, this.c().a.d / 16.0F);
      float $$13 = $$3.G($$6);
      $$0.a(a.f.rotation($$13));
      $$0.a(a.d.rotationDegrees($$8));
      $$0.a(a.b.rotationDegrees($$9));
      if ($$3.p_()) {
         if ($$10) {
            $$0.a(0.4F, 0.26F, 0.15F);
         } else {
            $$0.a(0.06F, 0.26F, -0.5F);
         }
      } else if ($$10) {
         $$0.a(0.46F, 0.26F, 0.22F);
      } else {
         $$0.a(0.06F, 0.27F, -0.5F);
      }

      $$0.a(a.b.rotationDegrees(90.0F));
      if ($$10) {
         $$0.a(a.f.rotationDegrees(90.0F));
      }

      cur $$14 = $$3.a(btd.a);
      this.a.a($$3, $$14, cuo.h, false, $$0, $$1, $$2);
      $$0.b();
   }
}
