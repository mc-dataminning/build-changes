public class gsb extends grw<guj, fzk> {
   private final gij a;
   private final goh b;

   public gsb(gpf<guj, fzk> $$0, gij $$1, goh $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(fde $$0, ghg $$1, int $$2, guj $$3, float $$4, float $$5) {
      gzd $$6 = $$3.an;
      if ($$6 != null) {
         boolean $$7 = $$3.aj && $$3.u;
         if (!$$3.u || $$7) {
            $$0.a();
            this.d().c().a($$0);
            float $$8 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cvp $$9 = $$3.ao;
            if ($$7 && $$9.h() instanceof ctr $$10) {
               duo $$11 = $$10.d().o();
               gzd $$12 = this.a.a($$11);
               int $$13 = gok.a($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(ghq.r(gxa.d)), $$11, $$12, 0.0F, 0.0F, 0.0F, $$2, $$13);
            } else {
               this.b.a($$9, cvm.f, false, $$0, $$1, $$2, gok.a($$3, 0.0F), $$6);
            }

            $$0.b();
         }
      }
   }
}
