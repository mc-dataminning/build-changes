public class gpo extends gpi<cfc, fxs<cfc>> {
   private final gga a;
   private final glp b;

   public gpo(gmp<cfc, fxs<cfc>> $$0, gga $$1, glp $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(fbc $$0, gfg $$1, int $$2, cfc $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.t()) {
         boolean $$10 = fgj.Q().b($$3) && $$3.cm();
         if (!$$3.cm() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cuh $$12 = new cuh(dfe.eU);
            if ($$10) {
               dtc $$13 = dfe.eU.n();
               gsz $$14 = this.a.a($$13);
               int $$15 = glt.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(gfo.r(gqx.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, cue.f, false, $$0, $$1, $$3.dU(), $$2, glt.c($$3, 0.0F), $$3.al());
            }

            $$0.b();
         }
      }
   }
}
