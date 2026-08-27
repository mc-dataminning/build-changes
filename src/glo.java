public class glo extends gli<cen, fub<cen>> {
   private final gci a;
   private final ghv b;

   public glo(gis<cen, fub<cen>> $$0, gci $$1, ghv $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(exx $$0, gbo $$1, int $$2, cen $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.u()) {
         boolean $$10 = fde.Q().b($$3) && $$3.cf();
         if (!$$3.cf() || $$10) {
            $$0.a();
            this.c().c().a($$0);
            float $$11 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            csz $$12 = new csz(ddg.ee);
            if ($$10) {
               dqh $$13 = ddg.ee.n();
               goz $$14 = this.a.a($$13);
               int $$15 = ghy.c($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(gbw.r(gmx.e)), $$13, $$14, 0.0F, 0.0F, 0.0F, $$2, $$15);
            } else {
               this.b.a($$3, $$12, csw.f, false, $$0, $$1, $$3.dN(), $$2, ghy.c($$3, 0.0F), $$3.aj());
            }

            $$0.b();
         }
      }
   }
}
