public class ggv extends ggw<drg> {
   private static final akk c = new akk("textures/entity/end_gateway_beam.png");

   public ggv(gge.a $$0) {
      super($$0);
   }

   public void a(drg $$0, float $$1, fam $$2, ged $$3, int $$4, int $$5) {
      if ($$0.b() || $$0.c()) {
         float $$6 = $$0.b() ? $$0.a($$1) : $$0.b($$1);
         double $$7 = $$0.b() ? (double)$$0.i().am() : 50.0;
         $$6 = ayg.a($$6 * (float) Math.PI);
         int $$8 = ayg.a((double)$$6 * $$7);
         float[] $$9 = $$0.b() ? csv.c.d() : csv.k.d();
         long $$10 = $$0.i().Z();
         gfz.a($$2, $$3, c, $$1, $$6, $$10, -$$8, $$8 * 2, $$9, 0.15F, 0.175F);
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
   protected gel d() {
      return gel.v();
   }

   @Override
   public int aT_() {
      return 256;
   }
}
