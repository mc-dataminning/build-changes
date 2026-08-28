public class hcp extends hcj<hgd, gjo> {
   private final gsq a;

   public hcp(gzs<hgd, gjo> $$0, gsq $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fld $$0, grn $$1, int $$2, hgd $$3, float $$4, float $$5) {
      if ($$3.a) {
         if (!$$3.A || $$3.ar) {
            $$0.a();
            this.d().b().a($$0);
            float $$6 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            ebq $$7 = dnq.ev.m();
            gta $$8 = this.a.a($$7);
            int $$9 = gyw.a($$3, 0.0F);
            $$0.a(-0.5F, -0.5F, -0.5F);
            flg $$10 = $$3.ar && $$3.A ? $$1.getBuffer(gry.s(hkp.c)) : $$1.getBuffer(grf.c($$7));
            gss.a($$0.c(), $$10, $$8, 0.0F, 0.0F, 0.0F, $$2, $$9);
            $$0.b();
         }
      }
   }
}
