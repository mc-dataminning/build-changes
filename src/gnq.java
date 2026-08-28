public class gnq extends gnk<cge, fwb<cge>> {
   private final gej a;
   private final gjw b;

   public gnq(gku<cge, fwb<cge>> $$0, gej $$1, gjw $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(ezz $$0, gdp $$1, int $$2, cge $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.u()) {
         boolean $$10 = ffg.Q().b($$3) && $$3.ch();
         if (!$$3.ch() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cuq $$12 = new cuq(dfc.ee);
            if ($$10) {
               dsd $$13 = dfc.ee.o();
               grb $$14 = this.a.a($$13);
               int $$15 = gjz.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(gdx.r(goz.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, cun.f, false, $$0, $$1, $$3.dP(), $$2, gjz.c($$3, 0.0F), $$3.al());
            }

            $$0.b();
         }
      }
   }
}
