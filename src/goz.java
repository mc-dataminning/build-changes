public class goz extends got<cgc, fxi<cgc>> {
   private final gfr a;
   private final glf b;

   public goz(gmd<cgc, fxi<cgc>> $$0, gfr $$1, glf $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(fbg $$0, gex $$1, int $$2, cgc $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.t()) {
         boolean $$10 = fgm.Q().b($$3) && $$3.ci();
         if (!$$3.ci() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cuq $$12 = new cuq(dga.ee);
            if ($$10) {
               dtc $$13 = dga.ee.o();
               gsk $$14 = this.a.a($$13);
               int $$15 = gli.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(gff.r(gqi.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, cun.f, false, $$0, $$1, $$3.dP(), $$2, gli.c($$3, 0.0F), $$3.an());
            }

            $$0.b();
         }
      }
   }
}
