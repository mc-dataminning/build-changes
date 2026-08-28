public class gwi extends gwd<gyr, gdk> {
   private final gmm a;
   private final gsm b;

   public gwi(gtl<gyr, gdk> $$0, gmm $$1, gsm $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(fgq $$0, glj $$1, int $$2, gyr $$3, float $$4, float $$5) {
      hdl $$6 = $$3.an;
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
               hdl $$12 = this.a.a($$11);
               int $$13 = gsp.a($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(glt.r(hbi.d)), $$11, $$12, 0.0F, 0.0F, 0.0F, $$2, $$13);
            } else {
               this.b.a($$9, cxm.f, false, $$0, $$1, $$2, gsp.a($$3, 0.0F), $$6);
            }

            $$0.b();
         }
      }
   }
}
