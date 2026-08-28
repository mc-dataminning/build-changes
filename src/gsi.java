public class gsi extends gsj<dyj> {
   private static final ale c = ale.b("textures/entity/end_gateway_beam.png");

   public gsi(grq.a $$0) {
      super($$0);
   }

   public void a(dyj $$0, float $$1, fiq $$2, gpd $$3, int $$4, int $$5) {
      if ($$0.a() || $$0.c()) {
         float $$6 = $$0.a() ? $$0.a($$1) : $$0.b($$1);
         double $$7 = $$0.a() ? (double)$$0.i().ao() : 50.0;
         $$6 = azk.a($$6 * (float) Math.PI);
         int $$8 = azk.a((double)$$6 * $$7);
         int $$9 = $$0.a() ? cxq.c.d() : cxq.k.d();
         long $$10 = $$0.i().ae();
         grl.a($$2, $$3, c, $$1, $$6, $$10, -$$8, $$8 * 2, $$9, 0.15F, 0.175F);
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
   protected gpn d() {
      return gpn.u();
   }

   @Override
   public int aQ_() {
      return 256;
   }
}
