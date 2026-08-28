public class gov extends gop<cga, fxe<cga>> {
   private final gfn a;
   private final glb b;

   public gov(glz<cga, fxe<cga>> $$0, gfn $$1, glb $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(fbc $$0, get $$1, int $$2, cga $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.t()) {
         boolean $$10 = fgi.Q().b($$3) && $$3.ci();
         if (!$$3.ci() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cuo $$12 = new cuo(dfy.ee);
            if ($$10) {
               dta $$13 = dfy.ee.o();
               gsg $$14 = this.a.a($$13);
               int $$15 = gle.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(gfb.r(gqe.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, cul.f, false, $$0, $$1, $$3.dQ(), $$2, gle.c($$3, 0.0F), $$3.an());
            }

            $$0.b();
         }
      }
   }
}
