public class gog extends goa<cfq, fwq<cfq>> {
   private final gez a;
   private final gkm b;

   public gog(glk<cfq, fwq<cfq>> $$0, gez $$1, gkm $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(fao $$0, gef $$1, int $$2, cfq $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.t()) {
         boolean $$10 = ffw.Q().b($$3) && $$3.cj();
         if (!$$3.cj() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cud $$12 = new cud(dfk.ee);
            if ($$10) {
               dsl $$13 = dfk.ee.o();
               grr $$14 = this.a.a($$13);
               int $$15 = gkp.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(gen.r(gpp.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, cua.f, false, $$0, $$1, $$3.dR(), $$2, gkp.c($$3, 0.0F), $$3.an());
            }

            $$0.b();
         }
      }
   }
}
