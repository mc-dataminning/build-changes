public class hbm extends hbh<hex, gil> {
   private final grp a;

   public hbm(gyq<hex, gil> $$0, grp $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fjy $$0, gqm $$1, int $$2, hex $$3, float $$4, float $$5) {
      if ($$3.a) {
         if (!$$3.z || $$3.ao) {
            $$0.a();
            this.d().b().a($$0);
            float $$6 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            eao $$7 = dmo.ev.m();
            gry $$8 = this.a.a($$7);
            int $$9 = gxu.a($$3, 0.0F);
            $$0.a(-0.5F, -0.5F, -0.5F);
            fkc $$10 = $$3.ao && $$3.z ? $$1.getBuffer(gqx.s(hjj.c)) : $$1.getBuffer(gqe.c($$7));
            this.a.b().a($$0.c(), $$10, $$7, $$8, 0.0F, 0.0F, 0.0F, $$2, $$9);
            $$0.b();
         }
      }
   }
}
