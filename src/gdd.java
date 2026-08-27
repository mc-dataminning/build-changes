public class gdd extends gcy<byw, flx<byw>> {
   private final fub a;
   private final fzl b;

   public gdd(gai<byw, flx<byw>> $$0, fub $$1, fzl $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(eqb $$0, fth $$1, int $$2, byw $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.w()) {
         boolean $$10 = evi.O().b($$3) && $$3.ce();
         if (!$$3.ce() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cmy $$12 = new cmy(cws.ee);
            if ($$10) {
               djh $$13 = cws.ee.o();
               ggn $$14 = this.a.a($$13);
               int $$15 = fzo.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(ftp.r(gem.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, cmv.f, false, $$0, $$1, $$3.dM(), $$2, fzo.c($$3, 0.0F), $$3.aj());
            }

            $$0.b();
         }
      }
   }
}
