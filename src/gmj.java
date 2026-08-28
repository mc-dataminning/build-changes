public class gmj extends gmk<duq> {
   private static final alj c = alj.b("textures/entity/end_gateway_beam.png");

   public gmj(gls.a $$0) {
      super($$0);
   }

   public void a(duq $$0, float $$1, fer $$2, gjg $$3, int $$4, int $$5) {
      if ($$0.b() || $$0.c()) {
         float $$6 = $$0.b() ? $$0.a($$1) : $$0.b($$1);
         double $$7 = $$0.b() ? (double)$$0.i().al() : 50.0;
         $$6 = azm.a($$6 * (float) Math.PI);
         int $$8 = azm.a((double)$$6 * $$7);
         int $$9 = $$0.b() ? cvj.c.d() : cvj.k.d();
         long $$10 = $$0.i().ab();
         gln.a($$2, $$3, c, $$1, $$6, $$10, -$$8, $$8 * 2, $$9, 0.15F, 0.175F);
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
   protected gjq d() {
      return gjq.u();
   }

   @Override
   public int aU_() {
      return 256;
   }
}
