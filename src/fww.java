public class fww extends fwr<bvg, fgk<bvg>> {
   private final fnz a;
   private final fth b;

   public fww(fue<bvg, fgk<bvg>> $$0, fnz $$1, fth $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(elh $$0, fng $$1, int $$2, bvg $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.q()) {
         boolean $$10 = eqn.N().b($$3) && $$3.cd();
         if (!$$3.cd() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            ciw $$12 = new ciw(csl.ef);
            if ($$10) {
               dey $$13 = csl.ef.n();
               gah $$14 = this.a.a($$13);
               int $$15 = ftk.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(fno.p(fyf.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, cit.f, false, $$0, $$1, $$3.dK(), $$2, ftk.c($$3, 0.0F), $$3.ah());
            }

            $$0.b();
         }
      }
   }
}
