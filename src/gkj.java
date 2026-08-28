public class gkj extends gkk<dtk> {
   private static final alc c = alc.b("textures/entity/end_gateway_beam.png");

   public gkj(gjs.a $$0) {
      super($$0);
   }

   public void a(dtk $$0, float $$1, fde $$2, ghg $$3, int $$4, int $$5) {
      if ($$0.b() || $$0.c()) {
         float $$6 = $$0.b() ? $$0.a($$1) : $$0.b($$1);
         double $$7 = $$0.b() ? (double)$$0.i().an() : 50.0;
         $$6 = azd.a($$6 * (float) Math.PI);
         int $$8 = azd.a((double)$$6 * $$7);
         int $$9 = $$0.b() ? cuj.c.d() : cuj.k.d();
         long $$10 = $$0.i().aa();
         gjn.a($$2, $$3, c, $$1, $$6, $$10, -$$8, $$8 * 2, $$9, 0.15F, 0.175F);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected float b() {
      return 1.0F;
   }

   @Override
   protected float c() {
      return 0.0F;
   }

   @Override
   protected ghq d() {
      return ghq.u();
   }

   @Override
   public int aU_() {
      return 256;
   }
}
