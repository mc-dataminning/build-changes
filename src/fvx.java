public class fvx extends fvy<dij> {
   private static final ahg c = new ahg("textures/entity/end_gateway_beam.png");

   public fvx(fvg.a $$0) {
      super($$0);
   }

   public void a(dij $$0, float $$1, epz $$2, ftf $$3, int $$4, int $$5) {
      if ($$0.c() || $$0.d()) {
         float $$6 = $$0.c() ? $$0.a($$1) : $$0.b($$1);
         double $$7 = $$0.c() ? (double)$$0.i().al() : 50.0;
         $$6 = aun.a($$6 * (float) Math.PI);
         int $$8 = aun.a((double)$$6 * $$7);
         float[] $$9 = $$0.c() ? cll.c.d() : cll.k.d();
         long $$10 = $$0.i().X();
         fvb.a($$2, $$3, c, $$1, $$6, $$10, -$$8, $$8 * 2, $$9, 0.15F, 0.175F);
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
   protected ftn d() {
      return ftn.v();
   }

   @Override
   public int aQ_() {
      return 256;
   }
}
