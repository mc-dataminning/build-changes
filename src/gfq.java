public class gfq extends gfl<cav, foi<cav>> {
   private final fwn a;
   private final gby b;

   public gfq(gcv<cav, foi<cav>> $$0, fwn $$1, gby $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(esh $$0, fvt $$1, int $$2, cav $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.w()) {
         boolean $$10 = exo.P().b($$3) && $$3.ce();
         if (!$$3.ce() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cpd $$12 = new cpd(cyu.ee);
            if ($$10) {
               dlj $$13 = cyu.ee.o();
               gjb $$14 = this.a.a($$13);
               int $$15 = gcb.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(fwb.r(gha.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, cpa.f, false, $$0, $$1, $$3.dM(), $$2, gcb.c($$3, 0.0F), $$3.aj());
            }

            $$0.b();
         }
      }
   }
}
