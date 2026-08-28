public class grd extends gre<dxh> {
   private static final ald c = ald.b("textures/entity/end_gateway_beam.png");

   public grd(gql.a $$0) {
      super($$0);
   }

   public void a(dxh $$0, float $$1, fho $$2, gny $$3, int $$4, int $$5) {
      if ($$0.a() || $$0.c()) {
         float $$6 = $$0.a() ? $$0.a($$1) : $$0.b($$1);
         double $$7 = $$0.a() ? (double)$$0.i().ao() : 50.0;
         $$6 = azk.a($$6 * (float) Math.PI);
         int $$8 = azk.a((double)$$6 * $$7);
         int $$9 = $$0.a() ? cwv.c.d() : cwv.k.d();
         long $$10 = $$0.i().ae();
         gqg.a($$2, $$3, c, $$1, $$6, $$10, -$$8, $$8 * 2, $$9, 0.15F, 0.175F);
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
   protected goi d() {
      return goi.u();
   }

   @Override
   public int aQ_() {
      return 256;
   }
}
