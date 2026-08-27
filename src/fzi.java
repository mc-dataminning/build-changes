public class fzi extends fzj<dla> {
   private static final ajc c = new ajc("textures/entity/end_gateway_beam.png");

   public fzi(fyr.a $$0) {
      super($$0);
   }

   public void a(dla $$0, float $$1, etd $$2, fwq $$3, int $$4, int $$5) {
      if ($$0.b() || $$0.c()) {
         float $$6 = $$0.b() ? $$0.a($$1) : $$0.b($$1);
         double $$7 = $$0.b() ? (double)$$0.i().ak() : 50.0;
         $$6 = awm.a($$6 * (float) Math.PI);
         int $$8 = awm.a((double)$$6 * $$7);
         float[] $$9 = $$0.b() ? cog.c.d() : cog.k.d();
         long $$10 = $$0.i().X();
         fym.a($$2, $$3, c, $$1, $$6, $$10, -$$8, $$8 * 2, $$9, 0.15F, 0.175F);
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
   protected fwy d() {
      return fwy.v();
   }

   @Override
   public int aS_() {
      return 256;
   }
}
