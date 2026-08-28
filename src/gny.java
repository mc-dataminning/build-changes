public class gny extends gns<cfm, fwi<cfm>> {
   private final ger a;
   private final gke b;

   public gny(glc<cfm, fwi<cfm>> $$0, ger $$1, gke $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(fag $$0, gdx $$1, int $$2, cfm $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.u()) {
         boolean $$10 = ffn.Q().b($$3) && $$3.ch();
         if (!$$3.ch() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cua $$12 = new cua(dfh.ee);
            if ($$10) {
               dsh $$13 = dfh.ee.o();
               grj $$14 = this.a.a($$13);
               int $$15 = gkh.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(gef.r(gph.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, ctx.f, false, $$0, $$1, $$3.dP(), $$2, gkh.c($$3, 0.0F), $$3.al());
            }

            $$0.b();
         }
      }
   }
}
