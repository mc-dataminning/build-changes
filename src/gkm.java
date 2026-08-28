public class gkm implements gkh<dsm> {
   private static final float a = 0.375F;
   private final gox b;

   public gkm(gki.a $$0) {
      this.b = $$0.d();
   }

   public void a(dsm $$0, float $$1, fdt $$2, ghw $$3, int $$4, int $$5) {
      jl $$6 = $$0.m().c(dim.f);
      jy<cvx> $$7 = $$0.b();
      int $$8 = (int)$$0.aC_().a();

      for (int $$9 = 0; $$9 < $$7.size(); $$9++) {
         cvx $$10 = $$7.get($$9);
         if ($$10 != cvx.k) {
            $$2.a();
            $$2.a(0.5F, 0.44921875F, 0.5F);
            jl $$11 = jl.b(($$9 + $$6.e()) % 4);
            float $$12 = -$$11.p();
            $$2.a(a.d.rotationDegrees($$12));
            $$2.a(a.b.rotationDegrees(90.0F));
            $$2.a(-0.3125F, -0.3125F, 0.0F);
            $$2.b(0.375F, 0.375F, 0.375F);
            this.b.a($$10, cvv.i, $$4, $$5, $$2, $$3, $$0.i(), $$8 + $$9);
            $$2.b();
         }
      }
   }
}
