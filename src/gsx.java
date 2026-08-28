public class gsx extends gsy<dyt> {
   private static final alg c = alg.b("textures/entity/end_gateway_beam.png");

   public gsx(gsf.a $$0) {
      super($$0);
   }

   public void a(dyt $$0, float $$1, fjc $$2, gps $$3, int $$4, int $$5, fei $$6) {
      if ($$0.a() || $$0.c()) {
         float $$7 = $$0.a() ? $$0.a($$1) : $$0.b($$1);
         double $$8 = $$0.a() ? (double)$$0.i().ao() : 50.0;
         $$7 = azm.a($$7 * (float) Math.PI);
         int $$9 = azm.a((double)$$7 * $$8);
         int $$10 = $$0.a() ? cxw.c.d() : cxw.k.d();
         long $$11 = $$0.i().ae();
         gsa.a($$2, $$3, c, $$1, $$7, $$11, -$$9, $$9 * 2, $$10, 0.15F, 0.175F);
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
   protected gqc d() {
      return gqc.u();
   }

   @Override
   public int aQ_() {
      return 256;
   }
}
