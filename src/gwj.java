public class gwj extends gwe<gys, gdl> {
   private final gmn a;
   private final gsn b;

   public gwj(gtm<gys, gdl> $$0, gmn $$1, gsn $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(fgr $$0, glk $$1, int $$2, gys $$3, float $$4, float $$5) {
      hdm $$6 = $$3.an;
      if ($$6 != null) {
         boolean $$7 = $$3.aj && $$3.u;
         if (!$$3.u || $$7) {
            $$0.a();
            this.d().b().a($$0);
            float $$8 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cxo $$9 = $$3.ao;
            if ($$7 && $$9.h() instanceof cvu $$10) {
               dxu $$11 = $$10.d().m();
               hdm $$12 = this.a.a($$11);
               int $$13 = gsq.a($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(glu.s(hbj.d)), $$11, $$12, 0.0F, 0.0F, 0.0F, $$2, $$13);
            } else {
               this.b.a($$9, cxm.f, false, $$0, $$1, $$2, gsq.a($$3, 0.0F), $$6);
            }

            $$0.b();
         }
      }
   }
}
