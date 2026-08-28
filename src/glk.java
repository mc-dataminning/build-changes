public class glk extends gll<due> {
   private static final ali c = ali.b("textures/entity/end_gateway_beam.png");

   public glk(gkt.a $$0) {
      super($$0);
   }

   public void a(due $$0, float $$1, feb $$2, gih $$3, int $$4, int $$5) {
      if ($$0.b() || $$0.c()) {
         float $$6 = $$0.b() ? $$0.a($$1) : $$0.b($$1);
         double $$7 = $$0.b() ? (double)$$0.i().al() : 50.0;
         $$6 = azk.a($$6 * (float) Math.PI);
         int $$8 = azk.a((double)$$6 * $$7);
         int $$9 = $$0.b() ? cuy.c.d() : cuy.k.d();
         long $$10 = $$0.i().aa();
         gko.a($$2, $$3, c, $$1, $$6, $$10, -$$8, $$8 * 2, $$9, 0.15F, 0.175F);
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
   protected gir d() {
      return gir.u();
   }

   @Override
   public int aU_() {
      return 256;
   }
}
