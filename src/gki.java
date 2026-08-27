public class gki extends gkc<cdg, fsv<cdg>> {
   private final gbc a;
   private final ggp b;

   public gki(ghm<cdg, fsv<cdg>> $$0, gbc $$1, ggp $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(ewr $$0, gai $$1, int $$2, cdg $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.u()) {
         boolean $$10 = fby.Q().b($$3) && $$3.ce();
         if (!$$3.ce() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            crs $$12 = new crs(dcj.ee);
            if ($$10) {
               dpi $$13 = dcj.ee.n();
               gns $$14 = this.a.a($$13);
               int $$15 = ggs.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(gaq.r(glr.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, crp.f, false, $$0, $$1, $$3.dM(), $$2, ggs.c($$3, 0.0F), $$3.aj());
            }

            $$0.b();
         }
      }
   }
}
