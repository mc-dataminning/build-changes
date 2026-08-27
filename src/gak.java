public class gak extends gal<dlx> {
   private static final ajh c = new ajh("textures/entity/end_gateway_beam.png");

   public gak(fzt.a $$0) {
      super($$0);
   }

   public void a(dlx $$0, float $$1, eub $$2, fxs $$3, int $$4, int $$5) {
      if ($$0.b() || $$0.c()) {
         float $$6 = $$0.b() ? $$0.a($$1) : $$0.b($$1);
         double $$7 = $$0.b() ? (double)$$0.i().ak() : 50.0;
         $$6 = aww.a($$6 * (float) Math.PI);
         int $$8 = aww.a((double)$$6 * $$7);
         float[] $$9 = $$0.b() ? cpd.c.d() : cpd.k.d();
         long $$10 = $$0.i().X();
         fzo.a($$2, $$3, c, $$1, $$6, $$10, -$$8, $$8 * 2, $$9, 0.15F, 0.175F);
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
   protected fya d() {
      return fya.v();
   }

   @Override
   public int aR_() {
      return 256;
   }
}
