public class gda extends gdb<doe> {
   private static final ajv c = new ajv("textures/entity/end_gateway_beam.png");

   public gda(gcj.a $$0) {
      super($$0);
   }

   public void a(doe $$0, float $$1, ewr $$2, gai $$3, int $$4, int $$5) {
      if ($$0.b() || $$0.c()) {
         float $$6 = $$0.b() ? $$0.a($$1) : $$0.b($$1);
         double $$7 = $$0.b() ? (double)$$0.i().al() : 50.0;
         $$6 = axm.a($$6 * (float) Math.PI);
         int $$8 = axm.a((double)$$6 * $$7);
         float[] $$9 = $$0.b() ? cql.c.d() : cql.k.d();
         long $$10 = $$0.i().Y();
         gce.a($$2, $$3, c, $$1, $$6, $$10, -$$8, $$8 * 2, $$9, 0.15F, 0.175F);
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
   protected gaq d() {
      return gaq.v();
   }

   @Override
   public int aP_() {
      return 256;
   }
}
