public class gjz extends gjt<cdb, fsm<cdb>> {
   private final gat a;
   private final ggg b;

   public gjz(ghd<cdb, fsm<cdb>> $$0, gat $$1, ggg $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(ewi $$0, fzz $$1, int $$2, cdb $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.u()) {
         boolean $$10 = fbp.Q().b($$3) && $$3.ce();
         if (!$$3.ce() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            crj $$12 = new crj(dca.ee);
            if ($$10) {
               doz $$13 = dca.ee.n();
               gnj $$14 = this.a.a($$13);
               int $$15 = ggj.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(gah.r(gli.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, crg.f, false, $$0, $$1, $$3.dM(), $$2, ggj.c($$3, 0.0F), $$3.aj());
            }

            $$0.b();
         }
      }
   }
}
