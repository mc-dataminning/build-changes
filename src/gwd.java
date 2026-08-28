public class gwd extends gvy<gym, gdf> {
   private final gmh a;
   private final gsh b;

   public gwd(gtg<gym, gdf> $$0, gmh $$1, gsh $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(fgl $$0, gle $$1, int $$2, gym $$3, float $$4, float $$5) {
      hdg $$6 = $$3.an;
      if ($$6 != null) {
         boolean $$7 = $$3.aj && $$3.u;
         if (!$$3.u || $$7) {
            $$0.a();
            this.d().b().a($$0);
            float $$8 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cxk $$9 = $$3.ao;
            if ($$7 && $$9.h() instanceof cvq $$10) {
               dxn $$11 = $$10.d().m();
               hdg $$12 = this.a.a($$11);
               int $$13 = gsk.a($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(glo.r(hbd.d)), $$11, $$12, 0.0F, 0.0F, 0.0F, $$2, $$13);
            } else {
               this.b.a($$9, cxi.f, false, $$0, $$1, $$2, gsk.a($$3, 0.0F), $$6);
            }

            $$0.b();
         }
      }
   }
}
