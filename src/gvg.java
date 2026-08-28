public class gvg extends gvh<dzy> {
   private static final ali c = ali.b("textures/entity/end_gateway_beam.png");

   public gvg(guo.a $$0) {
      super($$0);
   }

   public void a(dzy $$0, float $$1, flo $$2, gsa $$3, int $$4, int $$5, ffq $$6) {
      if ($$0.a() || $$0.c()) {
         float $$7 = $$0.a() ? $$0.a($$1) : $$0.b($$1);
         double $$8 = $$0.a() ? (double)$$0.i().ao() : 50.0;
         $$7 = azo.a($$7 * (float) Math.PI);
         int $$9 = azo.a((double)$$7 * $$8);
         int $$10 = $$0.a() ? cyw.c.d() : cyw.k.d();
         long $$11 = $$0.i().ae();
         guj.a($$2, $$3, c, $$1, $$7, $$11, -$$9, $$9 * 2, $$10, 0.15F, 0.175F);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
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
   protected gsl d() {
      return gsl.v();
   }

   @Override
   public int aV_() {
      return 256;
   }
}
