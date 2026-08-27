public class fxu extends fxp<bvp, fhd<bvp>> {
   private final foy a;
   private final fuf b;

   public fxu(fvc<bvp, fhd<bvp>> $$0, foy $$1, fuf $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(elp $$0, foe $$1, int $$2, bvp $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.t()) {
         boolean $$10 = eqv.O().b($$3) && $$3.cd();
         if (!$$3.cd() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cjf $$12 = new cjf(csw.ef);
            if ($$10) {
               dfj $$13 = csw.ef.n();
               gbf $$14 = this.a.a($$13);
               int $$15 = fui.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(fom.q(fzd.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, cjc.f, false, $$0, $$1, $$3.dL(), $$2, fui.c($$3, 0.0F), $$3.ah());
            }

            $$0.b();
         }
      }
   }
}
