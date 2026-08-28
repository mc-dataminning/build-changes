public class goe extends gny<cfp, fwo<cfp>> {
   private final gex a;
   private final gkk b;

   public goe(gli<cfp, fwo<cfp>> $$0, gex $$1, gkk $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(fam $$0, ged $$1, int $$2, cfp $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.u()) {
         boolean $$10 = fft.Q().b($$3) && $$3.ci();
         if (!$$3.ci() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cuc $$12 = new cuc(dfj.ee);
            if ($$10) {
               dsk $$13 = dfj.ee.o();
               grp $$14 = this.a.a($$13);
               int $$15 = gkn.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(gel.r(gpn.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, ctz.f, false, $$0, $$1, $$3.dQ(), $$2, gkn.c($$3, 0.0F), $$3.am());
            }

            $$0.b();
         }
      }
   }
}
