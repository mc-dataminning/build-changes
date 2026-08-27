public class fzx extends fzs<bxh, fjc<bxh>> {
   private final frb a;
   private final fwi b;

   public fzx(fxf<bxh, fjc<bxh>> $$0, frb $$1, fwi $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(enk $$0, fqh $$1, int $$2, bxh $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.t()) {
         boolean $$10 = esr.N().b($$3) && $$3.cd();
         if (!$$3.cd() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            clb $$12 = new clb(cuv.ee);
            if ($$10) {
               dgw $$13 = cuv.ee.o();
               gdi $$14 = this.a.a($$13);
               int $$15 = fwl.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(fqp.q(gbg.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, cky.f, false, $$0, $$1, $$3.dL(), $$2, fwl.c($$3, 0.0F), $$3.ah());
            }

            $$0.b();
         }
      }
   }
}
