public class gnl extends gny<cfb, fuq<cfb>> {
   private final gdz a;

   public gnl(gli<cfb, fuq<cfb>> $$0, gdz $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fam $$0, ged $$1, int $$2, cfb $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fI();
      boolean $$11 = $$3.p_();
      $$0.a();
      if ($$11) {
         float $$12 = 0.75F;
         $$0.b(0.75F, 0.75F, 0.75F);
         $$0.a(0.0F, 0.5F, 0.209375F);
      }

      $$0.a(this.c().a.b / 16.0F, this.c().a.c / 16.0F, this.c().a.d / 16.0F);
      float $$13 = $$3.H($$6);
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

      cuc $$14 = $$3.a(bsn.a);
      this.a.a($$3, $$14, ctz.h, false, $$0, $$1, $$2);
      $$0.b();
   }
}
