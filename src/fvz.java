public class fvz extends fwa<dik> {
   private static final ahg c = new ahg("textures/entity/end_gateway_beam.png");

   public fvz(fvi.a $$0) {
      super($$0);
   }

   public void a(dik $$0, float $$1, eqb $$2, fth $$3, int $$4, int $$5) {
      if ($$0.c() || $$0.d()) {
         float $$6 = $$0.c() ? $$0.a($$1) : $$0.b($$1);
         double $$7 = $$0.c() ? (double)$$0.i().al() : 50.0;
         $$6 = auo.a($$6 * (float) Math.PI);
         int $$8 = auo.a((double)$$6 * $$7);
         float[] $$9 = $$0.c() ? clm.c.d() : clm.k.d();
         long $$10 = $$0.i().X();
         fvd.a($$2, $$3, c, $$1, $$6, $$10, -$$8, $$8 * 2, $$9, 0.15F, 0.175F);
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
   protected ftp d() {
      return ftp.v();
   }

   @Override
   public int aQ_() {
      return 256;
   }
}
