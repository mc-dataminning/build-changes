public class hbs extends hbm<hfd, giq> {
   private final gru a;

   public hbs(gyv<hfd, giq> $$0, gru $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fkd $$0, gqr $$1, int $$2, hfd $$3, float $$4, float $$5) {
      if ($$3.a) {
         if (!$$3.z || $$3.ao) {
            $$0.a();
            this.d().b().a($$0);
            float $$6 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            eat $$7 = dmt.ev.m();
            gsd $$8 = this.a.a($$7);
            int $$9 = gxz.a($$3, 0.0F);
            $$0.a(-0.5F, -0.5F, -0.5F);
            fkh $$10 = $$3.ao && $$3.z ? $$1.getBuffer(grc.s(hjp.c)) : $$1.getBuffer(gqj.c($$7));
            this.a.b().a($$0.c(), $$10, $$7, $$8, 0.0F, 0.0F, 0.0F, $$2, $$9);
            $$0.b();
         }
      }
   }
}
