public class gnf extends gns<cey, fuk<cey>> {
   private final gdt a;

   public gnf(glc<cey, fuk<cey>> $$0, gdt $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fag $$0, gdx $$1, int $$2, cey $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fH();
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

      cua $$14 = $$3.a(bsk.a);
      this.a.a($$3, $$14, ctx.h, false, $$0, $$1, $$2);
      $$0.b();
   }
}
