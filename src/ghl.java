public class ghl extends ghm<drw> {
   private static final akq c = akq.b("textures/entity/end_gateway_beam.png");

   public ghl(ggu.a $$0) {
      super($$0);
   }

   public void a(drw $$0, float $$1, fbc $$2, get $$3, int $$4, int $$5) {
      if ($$0.b() || $$0.c()) {
         float $$6 = $$0.b() ? $$0.a($$1) : $$0.b($$1);
         double $$7 = $$0.b() ? (double)$$0.i().am() : 50.0;
         $$6 = ayn.a($$6 * (float) Math.PI);
         int $$8 = ayn.a((double)$$6 * $$7);
         int $$9 = $$0.b() ? ctg.c.d() : ctg.k.d();
         long $$10 = $$0.i().Z();
         ggp.a($$2, $$3, c, $$1, $$6, $$10, -$$8, $$8 * 2, $$9, 0.15F, 0.175F);
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
   protected gfb d() {
      return gfb.t();
   }

   @Override
   public int aT_() {
      return 256;
   }
}
