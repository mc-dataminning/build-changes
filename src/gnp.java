public class gnp extends gnj<cgd, fwa<cgd>> {
   private final gei a;
   private final gjv b;

   public gnp(gkt<cgd, fwa<cgd>> $$0, gei $$1, gjv $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(ezy $$0, gdo $$1, int $$2, cgd $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.u()) {
         boolean $$10 = fff.Q().b($$3) && $$3.ch();
         if (!$$3.ch() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cup $$12 = new cup(dfb.ee);
            if ($$10) {
               dsc $$13 = dfb.ee.o();
               gra $$14 = this.a.a($$13);
               int $$15 = gjy.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(gdw.r(goy.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, cum.f, false, $$0, $$1, $$3.dP(), $$2, gjy.c($$3, 0.0F), $$3.al());
            }

            $$0.b();
         }
      }
   }
}
