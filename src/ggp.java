public class ggp extends ggq<drd> {
   private static final akk c = new akk("textures/entity/end_gateway_beam.png");

   public ggp(gfy.a $$0) {
      super($$0);
   }

   public void a(drd $$0, float $$1, fag $$2, gdx $$3, int $$4, int $$5) {
      if ($$0.b() || $$0.c()) {
         float $$6 = $$0.b() ? $$0.a($$1) : $$0.b($$1);
         double $$7 = $$0.b() ? (double)$$0.i().am() : 50.0;
         $$6 = aye.a($$6 * (float) Math.PI);
         int $$8 = aye.a((double)$$6 * $$7);
         float[] $$9 = $$0.b() ? cst.c.d() : cst.k.d();
         long $$10 = $$0.i().Z();
         gft.a($$2, $$3, c, $$1, $$6, $$10, -$$8, $$8 * 2, $$9, 0.15F, 0.175F);
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
   protected gef d() {
      return gef.v();
   }

   @Override
   public int aS_() {
      return 256;
   }
}
